<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard — StockFlow</title>
<link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;500;600;700;800&family=JetBrains+Mono:wght@400;500;600&display=swap" rel="stylesheet">
<style>
*, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

:root {
  --bg:         #111827;
  --card:       #1f2937;
  --card2:      #374151;
  --border:     #374151;
  --border2:    #4b5563;
  --cyan:       #22d3ee;
  --cyan-dim:   rgba(34,211,238,0.12);
  --cyan-glow:  rgba(34,211,238,0.25);
  --amber:      #fbbf24;
  --amber-dim:  rgba(251,191,36,0.12);
  --violet:     #a78bfa;
  --violet-dim: rgba(167,139,250,0.12);
  --rose:       #fb7185;
  --rose-dim:   rgba(251,113,133,0.12);
  --green:      #34d399;
  --green-dim:  rgba(52,211,153,0.12);
  --green-glow: rgba(52,211,153,0.25);
  --text:       #f9fafb;
  --text2:      #e5e7eb;
  --sub:        #9ca3af;
  --muted:      #6b7280;
  --font:       'Plus Jakarta Sans', sans-serif;
  --mono:       'JetBrains Mono', monospace;
}

body {
  background: var(--bg);
  color: var(--text);
  font-family: var(--font);
  min-height: 100vh;
  line-height: 1.6;
}

body::before {
  content: '';
  position: fixed; inset: 0;
  background-image:
    linear-gradient(rgba(34,211,238,0.03) 1px, transparent 1px),
    linear-gradient(90deg, rgba(34,211,238,0.03) 1px, transparent 1px);
  background-size: 48px 48px;
  pointer-events: none; z-index: 0;
}

/* Ambient glow top-right */
body::after {
  content: '';
  position: fixed;
  top: -120px; right: -120px;
  width: 480px; height: 480px; border-radius: 50%;
  background: radial-gradient(circle, rgba(52,211,153,0.07) 0%, transparent 70%);
  pointer-events: none; z-index: 0;
}

/* ─── TOPBAR ─── */
.topbar {
  position: sticky; top: 0; z-index: 50;
  background: #0f172a;
  border-bottom: 1px solid var(--border);
  padding: 0 40px;
  display: flex; align-items: center; justify-content: space-between;
  height: 64px;
  animation: slideDown 0.5s ease both;
}

.brand {
  display: flex; align-items: center; gap: 10px;
  font-size: 18px; font-weight: 800;
  letter-spacing: -0.03em; color: var(--text);
  text-decoration: none;
}
.brand-icon {
  width: 32px; height: 32px; border-radius: 9px;
  background: var(--cyan);
  display: grid; place-items: center; font-size: 15px;
  box-shadow: 0 0 18px var(--cyan-glow);
}
.brand span { color: var(--cyan); }

.admin-badge {
  display: flex; align-items: center; gap: 10px;
  background: var(--card); border: 1px solid var(--border2);
  border-radius: 12px; padding: 8px 16px 8px 10px;
}
.ava {
  width: 34px; height: 34px; border-radius: 10px;
  background: linear-gradient(135deg, var(--cyan), #6366f1);
  display: grid; place-items: center;
  font-size: 15px; font-weight: 800; color: #fff;
}
.ava-info .lbl  { font-size: 10px; color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em; }
.ava-info .name { font-size: 14px; font-weight: 700; color: var(--text); }

/* ─── PAGE ─── */
.page {
  position: relative; z-index: 1;
  max-width: 780px; margin: 0 auto;
  padding: 56px 24px 80px;
}

/* ─── GREETING ─── */
.greeting {
  margin-bottom: 32px;
  animation: fadeUp 0.5s 0.05s ease both;
}

.breadcrumb {
  display: flex; align-items: center; gap: 6px;
  font-size: 12px; font-weight: 600;
  color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em;
  margin-bottom: 16px;
}
.breadcrumb .sep { color: var(--border2); }
.breadcrumb .cur { color: var(--cyan); }

.greeting-row {
  display: flex; align-items: center; gap: 14px; flex-wrap: wrap;
}

.greeting-text h1 {
  font-size: clamp(22px, 3vw, 32px);
  font-weight: 800; letter-spacing: -0.03em;
  color: var(--text); line-height: 1.1;
}

.greeting-text h1 span { color: var(--cyan); }

.time-chip {
  font-size: 12px; font-weight: 600; font-family: var(--mono);
  background: var(--card); border: 1px solid var(--border2);
  border-radius: 8px; padding: 5px 12px;
  color: var(--sub);
}

/* ─── MESSAGE BANNER ─── */
.msg-banner {
  background: var(--green-dim);
  border: 1px solid rgba(52,211,153,0.3);
  border-left: 4px solid var(--green);
  border-radius: 16px;
  padding: 20px 24px;
  display: flex; align-items: flex-start; gap: 16px;
  margin-bottom: 36px;
  animation: fadeUp 0.5s 0.1s ease both;
  position: relative; overflow: hidden;
}

.msg-banner::after {
  content: '';
  position: absolute; top: -30px; right: -30px;
  width: 120px; height: 120px; border-radius: 50%;
  background: radial-gradient(circle, rgba(52,211,153,0.12), transparent 70%);
  pointer-events: none;
}

.msg-icon-wrap {
  width: 44px; height: 44px; border-radius: 12px;
  background: rgba(52,211,153,0.2);
  display: grid; place-items: center;
  font-size: 20px; flex-shrink: 0;
}

.msg-content .msg-label {
  font-size: 11px; font-weight: 700; letter-spacing: 0.12em;
  text-transform: uppercase; color: var(--green);
  margin-bottom: 4px;
}
.msg-content .msg-text {
  font-size: 15px; font-weight: 600; color: var(--text2);
}

.msg-close {
  margin-left: auto; flex-shrink: 0;
  width: 28px; height: 28px; border-radius: 8px;
  background: rgba(52,211,153,0.1);
  border: 1px solid rgba(52,211,153,0.2);
  color: var(--green); cursor: pointer;
  display: grid; place-items: center;
  font-size: 14px; font-weight: 700;
  transition: background 0.2s;
}
.msg-close:hover { background: rgba(52,211,153,0.2); }

/* ─── SECTION LABEL ─── */
.section-lbl {
  font-size: 11px; font-weight: 700;
  letter-spacing: 0.14em; text-transform: uppercase;
  color: var(--muted); margin-bottom: 16px;
  display: flex; align-items: center; gap: 10px;
}
.section-lbl::after {
  content: ''; flex: 1; height: 1px; background: var(--border);
}

/* ─── ACTION CARDS ─── */
.actions-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 14px;
  animation: fadeUp 0.5s 0.2s ease both;
}

.action-card {
  display: flex; flex-direction: column;
  align-items: flex-start; gap: 14px;
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 18px; padding: 22px;
  text-decoration: none;
  transition: all 0.22s cubic-bezier(.34,1.56,.64,1);
  position: relative; overflow: hidden;
}

.action-card.add    { --c: var(--cyan);   --cd: var(--cyan-dim);   --cg: var(--cyan-glow); }
.action-card.view   { --c: var(--violet); --cd: var(--violet-dim); --cg: rgba(167,139,250,0.25); }
.action-card.logout { --c: var(--rose);   --cd: var(--rose-dim);   --cg: rgba(251,113,133,0.25); }

.action-card:hover {
  border-color: var(--c);
  transform: translateY(-5px);
  box-shadow: 0 16px 40px rgba(0,0,0,0.35), 0 0 0 1px rgba(255,255,255,0.03);
}

.action-icon {
  width: 46px; height: 46px; border-radius: 13px;
  background: var(--cd);
  display: grid; place-items: center; font-size: 20px;
  transition: transform 0.2s, box-shadow 0.2s;
}
.action-card:hover .action-icon {
  transform: scale(1.1);
  box-shadow: 0 0 20px var(--cg);
}

.action-label { font-size: 15px; font-weight: 700; color: var(--text); }
.action-desc  { font-size: 12px; color: var(--sub); margin-top: 2px; line-height: 1.4; }

.action-arrow {
  margin-top: auto; align-self: flex-end;
  width: 30px; height: 30px; border-radius: 99px;
  background: var(--cd);
  border: 1px solid rgba(255,255,255,0.05);
  display: grid; place-items: center;
  color: var(--c); font-size: 15px; font-weight: 700;
  transition: background 0.2s, transform 0.2s;
}
.action-card:hover .action-arrow {
  background: var(--c); color: #111827;
  transform: translateX(3px);
}

/* ─── INFO STRIP ─── */
.info-strip {
  margin-top: 28px;
  background: var(--card);
  border: 1px solid var(--border);
  border-left: 3px solid var(--cyan);
  border-radius: 14px;
  padding: 16px 22px;
  display: flex; align-items: center; gap: 14px;
  animation: fadeUp 0.5s 0.3s ease both;
}
.info-icon { font-size: 20px; flex-shrink: 0; }
.info-text .info-title { font-size: 13px; font-weight: 700; color: var(--text2); margin-bottom: 2px; }
.info-text .info-sub   { font-size: 12px; color: var(--sub); }
.info-text .info-sub strong { color: var(--cyan); }

/* ─── ANIMATIONS ─── */
@keyframes slideDown { from{opacity:0;transform:translateY(-12px)} to{opacity:1;transform:translateY(0)} }
@keyframes fadeUp    { from{opacity:0;transform:translateY(20px)}  to{opacity:1;transform:translateY(0)} }

/* ─── SCROLLBAR ─── */
::-webkit-scrollbar { width: 6px; }
::-webkit-scrollbar-track { background: var(--bg); }
::-webkit-scrollbar-thumb { background: var(--card2); border-radius: 3px; }

/* ─── RESPONSIVE ─── */
@media (max-width: 640px) {
  .topbar { padding: 0 16px; }
  .page   { padding: 36px 16px 60px; }
  .actions-grid { grid-template-columns: 1fr; }
}
</style>
</head>
<body>

<%
  AdminBean abean  = (AdminBean) session.getAttribute("abean");
  String    msg    = (String) request.getAttribute("msg");
  String    fname  = (abean != null && abean.getA_fname() != null) ? abean.getA_fname() : "Admin";
  char      initial = fname.isEmpty() ? 'A' : Character.toUpperCase(fname.charAt(0));
  if (msg == null || msg.trim().isEmpty()) msg = null;
%>

<!-- TOPBAR -->
<div class="topbar">
  <div class="brand">
    <div class="brand-icon">⚡</div>
    Stock<span>Flow</span>
  </div>
  <div class="admin-badge">
    <div class="ava"><%=initial%></div>
    <div class="ava-info">
      <div class="lbl">Admin</div>
      <div class="name"><%=fname%></div>
    </div>
  </div>
</div>

<!-- PAGE -->
<div class="page">

  <!-- GREETING -->
  <div class="greeting">
    <div class="breadcrumb">
      <span class="cur">Dashboard</span>
    </div>
    <div class="greeting-row">
      <div class="greeting-text">
        <h1>Hello, <span><%=fname%></span> 👋</h1>
      </div>
      <div class="time-chip" id="timeChip">Loading...</div>
    </div>
  </div>

  <!-- MESSAGE BANNER (only shown if msg exists) -->
  <% if (msg != null) { %>
  <div class="msg-banner" id="msgBanner">
    <div class="msg-icon-wrap">✅</div>
    <div class="msg-content">
      <div class="msg-label">System Message</div>
      <div class="msg-text"><%=msg%></div>
    </div>
    <button class="msg-close" onclick="document.getElementById('msgBanner').style.display='none'">✕</button>
  </div>
  <% } %>

  <!-- QUICK ACTIONS -->
  <div class="section-lbl">Quick Actions</div>

  <div class="actions-grid">

    <a class="action-card add" href="AddProduct.html">
      <div class="action-icon">➕</div>
      <div>
        <div class="action-label">Add Product</div>
        <div class="action-desc">Register a new item to your inventory</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

    <a class="action-card view" href="View1">
      <div class="action-icon">📦</div>
      <div>
        <div class="action-label">View Inventory</div>
        <div class="action-desc">Browse and manage all stock items</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

    <a class="action-card logout" href="logout">
      <div class="action-icon">🚪</div>
      <div>
        <div class="action-label">Logout</div>
        <div class="action-desc">End your session securely</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

  </div>

  <!-- INFO STRIP -->
  <div class="info-strip">
    <div class="info-icon">🔒</div>
    <div class="info-text">
      <div class="info-title">Secure Admin Session Active</div>
      <div class="info-sub">Logged in as <strong><%=fname%></strong> — all changes are tracked and saved in real time.</div>
    </div>
  </div>

</div>

<script>
  // Live clock
  function updateClock() {
    const now = new Date();
    const opts = { weekday:'short', hour:'2-digit', minute:'2-digit', hour12:true };
    document.getElementById('timeChip').textContent = now.toLocaleString('en-IN', opts);
  }
  updateClock();
  setInterval(updateClock, 1000);
</script>

</body>
</html>
