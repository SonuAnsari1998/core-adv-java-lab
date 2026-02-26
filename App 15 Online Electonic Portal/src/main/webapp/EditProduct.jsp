<%@page import="com.nit.pack1.ProductBean"%>
<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Edit Product — StockFlow</title>
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
  --green:      #34d399;
  --green-dim:  rgba(52,211,153,0.12);
  --rose:       #fb7185;
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

.topbar-right { display: flex; align-items: center; gap: 12px; }

.back-btn {
  display: inline-flex; align-items: center; gap: 7px;
  font-size: 13px; font-weight: 600;
  color: var(--sub); text-decoration: none;
  background: var(--card); border: 1px solid var(--border2);
  border-radius: 10px; padding: 8px 16px;
  transition: all 0.2s ease;
}
.back-btn:hover { color: var(--text); border-color: var(--cyan); background: var(--cyan-dim); }

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

/* ─── LAYOUT ─── */
.page {
  position: relative; z-index: 1;
  max-width: 680px; margin: 0 auto;
  padding: 52px 24px 80px;
}

/* ─── BREADCRUMB ─── */
.breadcrumb {
  display: flex; align-items: center; gap: 6px;
  font-size: 12px; font-weight: 600;
  color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em;
  margin-bottom: 28px;
  animation: fadeUp 0.5s 0.05s ease both;
}
.breadcrumb a { color: var(--muted); text-decoration: none; }
.breadcrumb a:hover { color: var(--cyan); }
.breadcrumb .sep { color: var(--border2); }
.breadcrumb .cur { color: var(--amber); }

/* ─── PRODUCT META CARD ─── */
.meta-card {
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 18px;
  padding: 22px 24px;
  display: flex; align-items: center; gap: 16px;
  margin-bottom: 24px;
  animation: fadeUp 0.5s 0.1s ease both;
}

.meta-icon {
  width: 52px; height: 52px; border-radius: 14px;
  background: var(--amber-dim);
  display: grid; place-items: center;
  font-size: 24px; flex-shrink: 0;
}

.meta-info .meta-label {
  font-size: 11px; font-weight: 700; letter-spacing: 0.12em;
  text-transform: uppercase; color: var(--muted); margin-bottom: 4px;
}
.meta-info .meta-title {
  font-size: 18px; font-weight: 800; color: var(--text); letter-spacing: -0.02em;
}
.meta-info .meta-sub { font-size: 13px; color: var(--sub); margin-top: 2px; }

.meta-code {
  margin-left: auto;
  font-family: var(--mono);
  font-size: 12px; font-weight: 600;
  background: var(--cyan-dim);
  color: var(--cyan);
  border: 1px solid rgba(34,211,238,0.25);
  border-radius: 8px; padding: 5px 12px;
  flex-shrink: 0;
}

/* ─── FORM CARD ─── */
.form-card {
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 20px;
  overflow: hidden;
  animation: fadeUp 0.5s 0.15s ease both;
}

.form-header {
  padding: 22px 28px 20px;
  border-bottom: 1px solid var(--border);
  display: flex; align-items: center; gap: 12px;
}

.form-header-icon {
  width: 36px; height: 36px; border-radius: 10px;
  background: var(--amber-dim);
  display: grid; place-items: center; font-size: 16px;
}

.form-header-text .title { font-size: 15px; font-weight: 700; color: var(--text); }
.form-header-text .sub   { font-size: 12px; color: var(--sub); font-weight: 400; }

.form-body { padding: 28px; display: flex; flex-direction: column; gap: 22px; }

/* ─── FIELD ─── */
.field { display: flex; flex-direction: column; gap: 8px; }

.field-label {
  font-size: 13px; font-weight: 700;
  color: var(--text2);
  display: flex; align-items: center; gap: 8px;
}

.field-badge {
  font-size: 10px; font-weight: 600; font-family: var(--mono);
  background: var(--cyan-dim); color: var(--cyan);
  border: 1px solid rgba(34,211,238,0.2);
  border-radius: 4px; padding: 1px 7px; letter-spacing: 0.05em;
}

.field-badge.amber { background: var(--amber-dim); color: var(--amber); border-color: rgba(251,191,36,0.2); }

.input-wrap { position: relative; }

.input-prefix {
  position: absolute; left: 16px; top: 50%; transform: translateY(-50%);
  font-size: 15px; font-weight: 700;
  color: var(--muted); pointer-events: none;
  font-family: var(--mono);
}

input[type="text"] {
  width: 100%;
  background: #0f172a;
  border: 1.5px solid var(--border2);
  border-radius: 12px;
  padding: 14px 16px 14px 42px;
  font-family: var(--mono);
  font-size: 15px; font-weight: 600;
  color: var(--text);
  outline: none;
  transition: border-color 0.2s, box-shadow 0.2s, background 0.2s;
  -webkit-appearance: none;
}

input[type="text"]:focus {
  border-color: var(--cyan);
  box-shadow: 0 0 0 3px var(--cyan-dim);
  background: #0c1320;
}

input[type="text"]:hover:not(:focus) {
  border-color: var(--border2);
  background: #131f35;
}

.input-no-prefix { padding-left: 16px !important; }

.field-hint { font-size: 12px; color: var(--muted); }

.field-divider { height: 1px; background: var(--border); }

/* ─── CURRENT VALUES ─── */
.current-vals {
  display: grid; grid-template-columns: 1fr 1fr;
  gap: 12px;
}

.val-chip {
  background: #0f172a;
  border: 1px solid var(--border);
  border-radius: 12px; padding: 14px 16px;
}

.val-chip .vc-lbl {
  font-size: 10px; font-weight: 700; letter-spacing: 0.1em;
  text-transform: uppercase; color: var(--muted); margin-bottom: 6px;
}
.val-chip .vc-val {
  font-size: 15px; font-weight: 700; font-family: var(--mono);
}
.val-chip.price .vc-val { color: var(--amber); }
.val-chip.qty .vc-val   { color: var(--cyan); }

/* ─── FORM FOOTER ─── */
.form-footer {
  padding: 20px 28px;
  border-top: 1px solid var(--border);
  display: flex; align-items: center; justify-content: space-between;
  gap: 12px; flex-wrap: wrap;
}

.footer-note {
  font-size: 12px; color: var(--muted);
  display: flex; align-items: center; gap: 6px;
}

.footer-note span { color: var(--cyan); }

.btn-group { display: flex; gap: 10px; }

.btn {
  display: inline-flex; align-items: center; gap: 7px;
  font-family: var(--font);
  font-size: 13px; font-weight: 700;
  border: none; cursor: pointer;
  border-radius: 12px; padding: 12px 24px;
  text-decoration: none;
  transition: all 0.2s cubic-bezier(.34,1.56,.64,1);
  white-space: nowrap; line-height: 1;
}

.btn-cancel {
  background: transparent;
  color: var(--sub);
  border: 1.5px solid var(--border2);
}
.btn-cancel:hover {
  background: var(--card2); color: var(--text);
  border-color: var(--border2);
  transform: translateY(-1px);
}

.btn-update {
  background: var(--cyan);
  color: #0f172a;
  box-shadow: 0 4px 18px var(--cyan-glow);
}
.btn-update:hover {
  background: #67e8f9;
  transform: translateY(-2px) scale(1.03);
  box-shadow: 0 8px 28px var(--cyan-glow);
}
.btn-update:active { transform: translateY(0) scale(0.98); }

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
  .page   { padding: 32px 16px 60px; }
  .meta-card { flex-wrap: wrap; }
  .meta-code { margin-left: 0; }
  .form-footer { flex-direction: column; align-items: stretch; }
  .btn-group { flex-direction: column; }
  .btn { justify-content: center; }
}
</style>
</head>
<body>

<%
  AdminBean   abean = (AdminBean) session.getAttribute("abean");
  ProductBean pb    = (ProductBean) request.getAttribute("p_bean");
  String fname  = (abean != null && abean.getA_fname() != null) ? abean.getA_fname() : "Admin";
  char   initial = fname.isEmpty() ? 'A' : Character.toUpperCase(fname.charAt(0));
%>

<!-- TOPBAR -->
<div class="topbar">
  <div class="brand">
    <div class="brand-icon">⚡</div>
    Stock<span>Flow</span>
  </div>
  <div class="topbar-right">
    <a class="back-btn" href="View1">← Back to Inventory</a>
    <div class="admin-badge">
      <div class="ava"><%=initial%></div>
      <div class="ava-info">
        <div class="lbl">Admin</div>
        <div class="name"><%=fname%></div>
      </div>
    </div>
  </div>
</div>

<!-- PAGE -->
<div class="page">

  <!-- BREADCRUMB -->
  <div class="breadcrumb">
    <a href="AdminHome.jsp">Dashboard</a>
    <span class="sep">›</span>
    <a href="View1">Inventory</a>
    <span class="sep">›</span>
    <span class="cur">Edit Product</span>
  </div>

  <!-- PRODUCT META -->
  <div class="meta-card">
    <div class="meta-icon">📦</div>
    <div class="meta-info">
      <div class="meta-label">Editing Product</div>
      <div class="meta-title"><%=pb.getP_name()%></div>
      <div class="meta-sub"><%=pb.getP_company()%> &nbsp;·&nbsp; Ready to update</div>
    </div>
    <div class="meta-code">ID: <%=pb.getP_code()%></div>
  </div>

  <!-- FORM CARD -->
  <div class="form-card">

    <div class="form-header">
      <div class="form-header-icon">✏️</div>
      <div class="form-header-text">
        <div class="title">Update Product Details</div>
        <div class="sub">Hey <%=fname%> — modify the fields below and save your changes</div>
      </div>
    </div>

    <!-- Current values preview -->
    <div style="padding: 20px 28px 0;">
      <div style="font-size:11px;font-weight:700;letter-spacing:0.12em;text-transform:uppercase;color:var(--muted);margin-bottom:12px;">Current Values</div>
      <div class="current-vals">
        <div class="val-chip price">
          <div class="vc-lbl">Current Price</div>
          <div class="vc-val">₹<%=pb.getP_price()%></div>
        </div>
        <div class="val-chip qty">
          <div class="vc-lbl">Current Stock</div>
          <div class="vc-val"><%=pb.getP_qty()%> units</div>
        </div>
      </div>
    </div>

    <form action="update" method="post">
      <input type="hidden" name="pcode" value="<%=pb.getP_code()%>">

      <div class="form-body">

        <div class="field-divider"></div>

        <!-- Price Field -->
        <div class="field">
          <label class="field-label" for="pprice">
            Unit Price
            <span class="field-badge amber">₹ INR</span>
          </label>
          <div class="input-wrap">
            <span class="input-prefix">₹</span>
            <input type="text" id="pprice" name="pprice"
                   value="<%=pb.getP_price()%>"
                   placeholder="Enter new price">
          </div>
          <div class="field-hint">Enter the updated price per unit in Indian Rupees</div>
        </div>

        <!-- Quantity Field -->
        <div class="field">
          <label class="field-label" for="pqty">
            Stock Quantity
            <span class="field-badge">Units</span>
          </label>
          <div class="input-wrap">
            <span class="input-prefix">#</span>
            <input type="text" id="pqty" name="pqty"
                   value="<%=pb.getP_qty()%>"
                   placeholder="Enter new quantity">
          </div>
          <div class="field-hint">Total number of units available in inventory</div>
        </div>

      </div>

      <!-- Footer -->
      <div class="form-footer">
        <div class="footer-note">
          <span>⚠</span> Changes will update inventory immediately
        </div>
        <div class="btn-group">
          <a class="btn btn-cancel" href="View1">Cancel</a>
          <button type="submit" class="btn btn-update">
            <svg width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round">
              <polyline points="20 6 9 17 4 12"/>
            </svg>
            Save Changes
          </button>
        </div>
      </div>

    </form>
  </div>

</div>
</body>
</html>
