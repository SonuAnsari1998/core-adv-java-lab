<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Dashboard</title>
<link href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;500;600;700;800&family=JetBrains+Mono:wght@400;500;600&display=swap" rel="stylesheet">
<style>
*, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

:root {
  --bg:        #111827;
  --card:      #1f2937;
  --card2:     #374151;
  --border:    #374151;
  --border2:   #4b5563;
  --cyan:      #22d3ee;
  --cyan-dim:  rgba(34,211,238,0.12);
  --cyan-glow: rgba(34,211,238,0.25);
  --amber:     #fbbf24;
  --amber-dim: rgba(251,191,36,0.12);
  --violet:    #a78bfa;
  --violet-dim:rgba(167,139,250,0.12);
  --rose:      #fb7185;
  --rose-dim:  rgba(251,113,133,0.12);
  --green:     #34d399;
  --text:      #f9fafb;
  --text2:     #e5e7eb;
  --sub:       #9ca3af;
  --muted:     #6b7280;
  --font:      'Plus Jakarta Sans', sans-serif;
  --mono:      'JetBrains Mono', monospace;
}

body {
  background: var(--bg);
  color: var(--text);
  font-family: var(--font);
  min-height: 100vh;
  line-height: 1.6;
  overflow-x: hidden;
}

/* Subtle grid texture */
body::before {
  content: '';
  position: fixed; inset: 0;
  background-image:
    linear-gradient(rgba(34,211,238,0.03) 1px, transparent 1px),
    linear-gradient(90deg, rgba(34,211,238,0.03) 1px, transparent 1px);
  background-size: 48px 48px;
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
  display: grid; place-items: center;
  font-size: 15px;
  box-shadow: 0 0 18px var(--cyan-glow);
}
.brand span { color: var(--cyan); }

.admin-badge {
  display: flex; align-items: center; gap: 10px;
  background: var(--card);
  border: 1px solid var(--border2);
  border-radius: 12px;
  padding: 8px 16px 8px 10px;
}
.ava {
  width: 34px; height: 34px; border-radius: 10px;
  background: linear-gradient(135deg, var(--cyan), #6366f1);
  display: grid; place-items: center;
  font-size: 15px; font-weight: 800; color: #fff;
}
.ava-info .lbl  { font-size: 10px; color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em; }
.ava-info .name { font-size: 14px; font-weight: 700; color: var(--text); }

/* ─── PAGE BODY ─── */
.page {
  position: relative; z-index: 1;
  max-width: 960px;
  margin: 0 auto;
  padding: 60px 32px 80px;
}

/* ─── WELCOME HERO ─── */
.hero {
  text-align: center;
  margin-bottom: 56px;
  animation: fadeUp 0.6s 0.1s ease both;
}

.welcome-tag {
  display: inline-flex; align-items: center; gap: 8px;
  font-size: 12px; font-weight: 700;
  letter-spacing: 0.14em; text-transform: uppercase;
  color: var(--cyan);
  background: var(--cyan-dim);
  border: 1px solid rgba(34,211,238,0.25);
  border-radius: 99px; padding: 5px 16px;
  margin-bottom: 24px;
}

.welcome-tag::before {
  content: '';
  width: 6px; height: 6px; border-radius: 50%;
  background: var(--cyan);
  box-shadow: 0 0 6px var(--cyan);
  animation: blink 2s ease infinite;
}

.hero h1 {
  font-size: clamp(28px, 4vw, 46px);
  font-weight: 800; letter-spacing: -0.04em;
  line-height: 1.1; color: var(--text);
  margin-bottom: 14px;
}

.hero h1 .highlight {
  color: var(--cyan);
}

.hero-msg {
  display: inline-block;
  font-size: 15px; color: var(--sub);
  font-weight: 400;
  max-width: 480px;
}

/* ─── QUICK ACTIONS ─── */
.section-label {
  font-size: 11px; font-weight: 700;
  letter-spacing: 0.14em; text-transform: uppercase;
  color: var(--muted); margin-bottom: 16px;
  display: flex; align-items: center; gap: 10px;
}
.section-label::after {
  content: ''; flex: 1; height: 1px; background: var(--border);
}

.actions-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 16px;
  margin-bottom: 40px;
  animation: fadeUp 0.6s 0.2s ease both;
}

.action-card {
  display: flex; flex-direction: column;
  align-items: flex-start; gap: 16px;
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 18px;
  padding: 24px;
  text-decoration: none;
  transition: all 0.22s cubic-bezier(.34,1.56,.64,1);
  position: relative; overflow: hidden;
  cursor: pointer;
}

.action-card::after {
  content: '';
  position: absolute; inset: 0;
  border-radius: inherit;
  opacity: 0;
  transition: opacity 0.2s;
}

.action-card:hover {
  transform: translateY(-5px);
}

/* Per-card colors */
.action-card.add { --c: var(--cyan); --cd: var(--cyan-dim); --cg: var(--cyan-glow); }
.action-card.view { --c: var(--violet); --cd: var(--violet-dim); --cg: rgba(167,139,250,0.25); }
.action-card.logout { --c: var(--rose); --cd: var(--rose-dim); --cg: rgba(251,113,133,0.25); }

.action-card:hover {
  border-color: var(--c);
  box-shadow: 0 12px 40px rgba(0,0,0,0.3), 0 0 0 1px rgba(255,255,255,0.04);
}

.action-icon {
  width: 48px; height: 48px; border-radius: 14px;
  background: var(--cd);
  display: grid; place-items: center;
  font-size: 22px;
  transition: transform 0.2s, box-shadow 0.2s;
}

.action-card:hover .action-icon {
  transform: scale(1.1);
  box-shadow: 0 0 20px var(--cg);
}

.action-label {
  font-size: 16px; font-weight: 700;
  color: var(--text); line-height: 1.2;
}

.action-desc {
  font-size: 12px; color: var(--sub);
  font-weight: 400; margin-top: 2px;
}

.action-arrow {
  margin-top: auto;
  align-self: flex-end;
  width: 32px; height: 32px; border-radius: 99px;
  background: var(--cd);
  border: 1px solid rgba(255,255,255,0.06);
  display: grid; place-items: center;
  color: var(--c);
  font-size: 16px; font-weight: 700;
  transition: background 0.2s, transform 0.2s;
}

.action-card:hover .action-arrow {
  background: var(--c);
  color: #111827;
  transform: translateX(3px);
}

/* ─── INFO STRIP ─── */
.info-strip {
  background: var(--card);
  border: 1px solid var(--border);
  border-left: 3px solid var(--cyan);
  border-radius: 14px;
  padding: 18px 24px;
  display: flex; align-items: center; gap: 14px;
  animation: fadeUp 0.6s 0.3s ease both;
}

.info-icon { font-size: 22px; flex-shrink: 0; }

.info-text .info-title {
  font-size: 13px; font-weight: 700; color: var(--text2);
  margin-bottom: 2px;
}
.info-text .info-sub {
  font-size: 12px; color: var(--sub); font-weight: 400;
}

/* ─── ANIMATIONS ─── */
@keyframes slideDown { from{opacity:0;transform:translateY(-12px)} to{opacity:1;transform:translateY(0)} }
@keyframes fadeUp    { from{opacity:0;transform:translateY(20px)}  to{opacity:1;transform:translateY(0)} }
@keyframes blink     { 0%,100%{opacity:1} 50%{opacity:0.3} }

/* ─── SCROLLBAR ─── */
::-webkit-scrollbar { width: 6px; }
::-webkit-scrollbar-track { background: var(--bg); }
::-webkit-scrollbar-thumb { background: var(--card2); border-radius: 3px; }

/* ─── RESPONSIVE ─── */
@media (max-width: 680px) {
  .topbar { padding: 0 16px; }
  .page   { padding: 40px 16px 60px; }
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
  if (msg == null) msg = "Welcome back,";
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

  <!-- HERO -->
  <div class="hero">
    <div class="welcome-tag">Admin Panel</div>
    <h1><%=msg%> <span class="highlight"><%=fname%></span> 👋</h1>
    <span class="hero-msg">Manage your inventory, track products, and keep your stock up to date — all in one place.</span>
  </div>

  <!-- QUICK ACTIONS -->
  <div class="section-label">Quick Actions</div>

  <div class="actions-grid">

    <!-- Add Product -->
    <a class="action-card add" href="AddProduct.html">
      <div class="action-icon">➕</div>
      <div>
        <div class="action-label">Add Product</div>
        <div class="action-desc">Register a new item to your inventory catalog</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

    <!-- View Products -->
    <a class="action-card view" href="View1">
      <div class="action-icon">📦</div>
      <div>
        <div class="action-label">View Products</div>
        <div class="action-desc">Browse, edit, and manage all existing stock</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

    <!-- Logout -->
    <a class="action-card logout" href="Logout">
      <div class="action-icon">🚪</div>
      <div>
        <div class="action-label">Logout</div>
        <div class="action-desc">End your session and return to the login page</div>
      </div>
      <div class="action-arrow">→</div>
    </a>

  </div>

  <!-- INFO STRIP -->
  <div class="info-strip">
    <div class="info-icon">🔒</div>
    <div class="info-text">
      <div class="info-title">Secure Admin Session</div>
      <div class="info-sub">You're logged in as <strong style="color:var(--text2)"><%=fname%></strong>. All actions are logged and monitored for security.</div>
    </div>
  </div>

</div>
</body>
</html>
