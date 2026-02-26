<%@page import="com.nit.pack1.ProductBean"%>
<%@page import="java.util.*"%>
<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inventory Dashboard</title>
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
  --cyan-dim:  rgba(34,211,238,0.15);
  --cyan-glow: rgba(34,211,238,0.25);
  --amber:     #fbbf24;
  --amber-dim: rgba(251,191,36,0.15);
  --rose:      #fb7185;
  --rose-dim:  rgba(251,113,133,0.15);
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
}

/* ─── TOPBAR ─── */
.topbar {
  background: #0f172a;
  border-bottom: 1px solid var(--border);
  padding: 0 40px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 64px;
  position: sticky; top: 0; z-index: 50;
  animation: slideDown 0.5s ease both;
}

.brand {
  display: flex; align-items: center; gap: 10px;
  font-size: 18px; font-weight: 800; letter-spacing: -0.03em;
  color: var(--text);
}

.brand-dot {
  width: 28px; height: 28px; border-radius: 8px;
  background: var(--cyan);
  display: grid; place-items: center;
  font-size: 14px;
  box-shadow: 0 0 16px var(--cyan-glow);
}

.brand span { color: var(--cyan); }

.topbar-right { display: flex; align-items: center; gap: 12px; }

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
  font-size: 15px; font-weight: 800;
  color: #fff;
  text-transform: uppercase;
}

.ava-info .lbl  { font-size: 10px; color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em; }
.ava-info .name { font-size: 14px; font-weight: 700; color: var(--text); line-height: 1.3; }

/* ─── MAIN ─── */
.main {
  max-width: 1300px;
  margin: 0 auto;
  padding: 40px 40px 80px;
}

/* ─── PAGE HEADER ─── */
.page-header {
  display: flex; align-items: flex-start; justify-content: space-between;
  margin-bottom: 36px;
  animation: fadeUp 0.5s 0.1s ease both;
  flex-wrap: wrap; gap: 16px;
}

.page-title-wrap .breadcrumb {
  display: flex; align-items: center; gap: 6px;
  font-size: 12px; font-weight: 600;
  color: var(--muted); text-transform: uppercase; letter-spacing: 0.1em;
  margin-bottom: 8px;
}

.breadcrumb .sep { color: var(--border2); }
.breadcrumb .cur { color: var(--cyan); }

.page-title {
  font-size: clamp(24px, 3.5vw, 38px);
  font-weight: 800;
  letter-spacing: -0.03em;
  color: var(--text);
  line-height: 1.1;
}

.page-title span { color: var(--cyan); }

.page-sub {
  margin-top: 6px;
  font-size: 14px; color: var(--sub); font-weight: 400;
}

/* ─── STATS ─── */
.stats {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20px;
  margin-bottom: 36px;
  animation: fadeUp 0.5s 0.15s ease both;
}

.stat {
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 16px;
  padding: 24px;
  display: flex; flex-direction: column;
  gap: 12px;
  transition: border-color 0.2s, transform 0.2s, box-shadow 0.2s;
  position: relative; overflow: hidden;
}

.stat:hover {
  transform: translateY(-3px);
}

.stat:nth-child(1):hover { border-color: var(--cyan); box-shadow: 0 8px 32px rgba(34,211,238,0.12); }
.stat:nth-child(2):hover { border-color: var(--amber); box-shadow: 0 8px 32px rgba(251,191,36,0.12); }
.stat:nth-child(3):hover { border-color: var(--green); box-shadow: 0 8px 32px rgba(52,211,153,0.12); }

.stat-top {
  display: flex; align-items: center; justify-content: space-between;
}

.stat-icon-wrap {
  width: 44px; height: 44px; border-radius: 12px;
  display: grid; place-items: center; font-size: 20px;
}

.stat:nth-child(1) .stat-icon-wrap { background: var(--cyan-dim); }
.stat:nth-child(2) .stat-icon-wrap { background: var(--amber-dim); }
.stat:nth-child(3) .stat-icon-wrap { background: rgba(52,211,153,0.15); }

.stat-trend {
  font-size: 11px; font-weight: 600;
  background: rgba(52,211,153,0.15);
  color: var(--green);
  border-radius: 6px; padding: 3px 8px;
}

.stat-lbl {
  font-size: 11px; font-weight: 700;
  letter-spacing: 0.12em; text-transform: uppercase;
  color: var(--muted);
}

.stat-val {
  font-size: clamp(26px, 3vw, 38px);
  font-weight: 800; letter-spacing: -0.04em;
  line-height: 1;
}

.stat:nth-child(1) .stat-val { color: var(--cyan); }
.stat:nth-child(2) .stat-val { color: var(--amber); }
.stat:nth-child(3) .stat-val { color: var(--green); }

.stat-divider { height: 1px; background: var(--border); }

.stat-foot {
  font-size: 12px; color: var(--sub); font-weight: 400;
}

/* ─── TABLE SECTION ─── */
.table-section {
  background: var(--card);
  border: 1px solid var(--border);
  border-radius: 20px;
  overflow: hidden;
  animation: fadeUp 0.5s 0.2s ease both;
}

.table-toolbar {
  display: flex; align-items: center; justify-content: space-between;
  padding: 20px 28px;
  border-bottom: 1px solid var(--border);
  flex-wrap: wrap; gap: 12px;
}

.toolbar-left {
  display: flex; align-items: center; gap: 12px;
}

.pulse-dot {
  position: relative; width: 10px; height: 10px;
  flex-shrink: 0;
}
.pulse-dot::before {
  content: '';
  position: absolute; inset: -3px;
  border-radius: 50%; background: rgba(34,211,238,0.25);
  animation: ripple 2s ease infinite;
}
.pulse-dot::after {
  content: '';
  position: absolute; inset: 1px;
  border-radius: 50%; background: var(--cyan);
  box-shadow: 0 0 8px var(--cyan);
}

.toolbar-title {
  font-size: 16px; font-weight: 700; color: var(--text);
}

.toolbar-sub {
  font-size: 12px; color: var(--muted);
}

.count-pill {
  font-size: 12px; font-weight: 700;
  font-family: var(--mono);
  background: var(--cyan-dim);
  color: var(--cyan);
  border: 1px solid rgba(34,211,238,0.3);
  border-radius: 20px; padding: 4px 14px;
}

/* ─── TABLE ─── */
table { width: 100%; border-collapse: collapse; }

thead {
  background: #0f172a;
}

thead th {
  padding: 14px 18px;
  font-size: 11px; font-weight: 700;
  letter-spacing: 0.12em; text-transform: uppercase;
  color: var(--sub);
  text-align: left; white-space: nowrap;
  border-bottom: 1px solid var(--border);
}

thead th:first-child { padding-left: 28px; }
thead th:last-child  { padding-right: 28px; text-align: right; }

tbody tr {
  border-bottom: 1px solid var(--border);
  transition: background 0.15s;
  animation: rowIn 0.4s ease both;
}
tbody tr:last-child { border-bottom: none; }
tbody tr:hover { background: rgba(255,255,255,0.03); }
tbody tr:hover .row-num { color: var(--cyan); }

tbody tr:nth-child(1) { animation-delay: .22s; }
tbody tr:nth-child(2) { animation-delay: .30s; }
tbody tr:nth-child(3) { animation-delay: .38s; }
tbody tr:nth-child(4) { animation-delay: .46s; }
tbody tr:nth-child(n+5){ animation-delay: .54s; }

td { padding: 18px 18px; vertical-align: middle; }
td:first-child { padding-left: 28px; }
td:last-child  { padding-right: 28px; }

.row-num {
  font-family: var(--mono);
  font-size: 12px; font-weight: 600;
  color: var(--muted);
  transition: color 0.2s;
}

.code-pill {
  display: inline-flex; align-items: center; gap: 5px;
  font-family: var(--mono);
  font-size: 12px; font-weight: 600;
  background: var(--cyan-dim);
  color: var(--cyan);
  border: 1px solid rgba(34,211,238,0.25);
  border-radius: 8px; padding: 5px 11px;
  white-space: nowrap;
}

.prod-wrap .pname {
  font-size: 15px; font-weight: 700;
  color: var(--text); letter-spacing: -0.01em;
}

.company-name {
  font-size: 13px; color: var(--sub); font-weight: 400;
}

.price-cell {
  font-family: var(--mono);
  font-size: 15px; font-weight: 700;
  color: var(--amber);
  letter-spacing: -0.02em;
}

.stock-cell { display: flex; flex-direction: column; gap: 7px; }

.stock-row {
  display: flex; align-items: center; gap: 10px;
}

.stock-num {
  font-size: 14px; font-weight: 700;
  color: var(--text2); min-width: 60px;
  font-family: var(--mono);
}

.stock-bar {
  flex: 1; max-width: 80px;
  height: 5px; background: var(--card2);
  border-radius: 99px; overflow: hidden;
}

.stock-fill {
  height: 100%; border-radius: 99px;
  background: linear-gradient(90deg, #0891b2, var(--cyan));
  box-shadow: 0 0 6px var(--cyan-glow);
}

.actions-cell {
  display: flex; align-items: center; gap: 8px; justify-content: flex-end;
}

/* ─── BUTTONS ─── */
.btn {
  display: inline-flex; align-items: center; gap: 7px;
  font-family: var(--font);
  font-size: 13px; font-weight: 600;
  text-decoration: none; cursor: pointer;
  border-radius: 10px; padding: 9px 18px;
  transition: all 0.18s cubic-bezier(.34,1.56,.64,1);
  white-space: nowrap;
  line-height: 1;
}

.btn-edit {
  background: rgba(255,255,255,0.07);
  color: var(--text2);
  border: 1px solid var(--border2);
}
.btn-edit:hover {
  background: var(--cyan);
  color: #0f172a;
  border-color: var(--cyan);
  box-shadow: 0 4px 18px var(--cyan-glow);
  transform: translateY(-2px) scale(1.04);
}

.btn-del {
  background: var(--rose-dim);
  color: var(--rose);
  border: 1px solid rgba(251,113,133,0.25);
}
.btn-del:hover {
  background: var(--rose);
  color: #fff;
  border-color: var(--rose);
  box-shadow: 0 4px 18px rgba(251,113,133,0.3);
  transform: translateY(-2px) scale(1.04);
}

/* ─── EMPTY STATE ─── */
.empty {
  display: flex; flex-direction: column;
  align-items: center; text-align: center;
  padding: 90px 40px;
  animation: fadeUp 0.5s ease both;
}
.empty-icon {
  width: 90px; height: 90px; border-radius: 24px;
  background: var(--card);
  border: 1px solid var(--border2);
  display: grid; place-items: center;
  font-size: 40px; margin-bottom: 20px;
}
.empty h2 { font-size: 22px; font-weight: 800; color: var(--text2); margin-bottom: 8px; }
.empty p  { font-size: 14px; color: var(--sub); max-width: 340px; }

/* ─── ANIMATIONS ─── */
@keyframes slideDown { from{opacity:0;transform:translateY(-12px)} to{opacity:1;transform:translateY(0)} }
@keyframes fadeUp    { from{opacity:0;transform:translateY(20px)}  to{opacity:1;transform:translateY(0)} }
@keyframes rowIn     { from{opacity:0;transform:translateX(-10px)} to{opacity:1;transform:translateX(0)} }
@keyframes ripple    { 0%{transform:scale(1);opacity:.8} 100%{transform:scale(2.5);opacity:0} }

/* ─── SCROLLBAR ─── */
::-webkit-scrollbar { width: 6px; height: 6px; }
::-webkit-scrollbar-track { background: var(--bg); }
::-webkit-scrollbar-thumb { background: var(--card2); border-radius: 3px; }
::-webkit-scrollbar-thumb:hover { background: var(--border2); }

/* ─── RESPONSIVE ─── */
@media (max-width: 960px) {
  .stats { grid-template-columns: 1fr 1fr; }
  .stats .stat:last-child { grid-column: 1/-1; }
}
@media (max-width: 640px) {
  .topbar, .main { padding-left: 16px; padding-right: 16px; }
  .stats { grid-template-columns: 1fr; }
  table { display: block; overflow-x: auto; }
  td, th { white-space: nowrap; }
}
</style>
</head>
<body>

<%
  AdminBean abean    = (AdminBean) session.getAttribute("abean");
  ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("productList");
  String adminName   = (abean != null && abean.getA_fname() != null) ? abean.getA_fname() : "Admin";
  char   initial     = adminName.isEmpty() ? 'A' : Character.toUpperCase(adminName.charAt(0));
  int    totalProds  = (al != null) ? al.size() : 0;

  double totalValue = 0;
  int    totalQty   = 0;
  if (al != null) {
    for (ProductBean pb : al) {
      try {
        totalValue += Double.parseDouble(String.valueOf(pb.getP_price()))
                    * Integer.parseInt(String.valueOf(pb.getP_qty()));
        totalQty   += Integer.parseInt(String.valueOf(pb.getP_qty()));
      } catch (NumberFormatException ignored) {}
    }
  }
%>

<!-- ─── TOPBAR ─── -->
<div class="topbar">
  <div class="brand">
    <div class="brand-dot">⚡</div>
    Stock<span>Flow</span>
  </div>
  <div class="topbar-right">
    <div class="admin-badge">
      <div class="ava"><%=initial%></div>
      <div class="ava-info">
        <div class="lbl">Admin</div>
        <div class="name"><%=adminName%></div>
      </div>
    </div>
  </div>
</div>

<!-- ─── MAIN ─── -->
<div class="main">

  <!-- PAGE HEADER -->
  <div class="page-header">
    <div class="page-title-wrap">
      <div class="breadcrumb">
        Dashboard <span class="sep">›</span>
        <span class="cur">Inventory</span>
      </div>
      <div class="page-title">Product <span>Inventory</span></div>
      <div class="page-sub">Real-time stock tracking and product management</div>
    </div>
  </div>

<%
if (al == null || al.size() == 0) {
%>
  <div class="empty">
    <div class="empty-icon">📦</div>
    <h2>No Products Found</h2>
    <p>Your inventory is currently empty. Add products to get started.</p>
  </div>
<%
} else {
%>

  <!-- STATS -->
  <div class="stats">
    <div class="stat">
      <div class="stat-top">
        <div class="stat-icon-wrap">📦</div>
        <span class="stat-trend">Active</span>
      </div>
      <div class="stat-lbl">Total Products</div>
      <div class="stat-val"><%=totalProds%></div>
      <div class="stat-divider"></div>
      <div class="stat-foot">Unique SKUs in your catalog</div>
    </div>

    <div class="stat">
      <div class="stat-top">
        <div class="stat-icon-wrap">📊</div>
        <span class="stat-trend">In Stock</span>
      </div>
      <div class="stat-lbl">Total Units</div>
      <div class="stat-val"><%=totalQty%></div>
      <div class="stat-divider"></div>
      <div class="stat-foot">Units across all products</div>
    </div>

    <div class="stat">
      <div class="stat-top">
        <div class="stat-icon-wrap">💰</div>
        <span class="stat-trend">Value</span>
      </div>
      <div class="stat-lbl">Inventory Value</div>
      <div class="stat-val">₹<%=String.format("%,.0f", totalValue)%></div>
      <div class="stat-divider"></div>
      <div class="stat-foot">Combined stock valuation</div>
    </div>
  </div>

  <!-- TABLE -->
  <div class="table-section">
    <div class="table-toolbar">
      <div class="toolbar-left">
        <div class="pulse-dot"></div>
        <div>
          <div class="toolbar-title">All Products</div>
          <div class="toolbar-sub">Showing all inventory items</div>
        </div>
      </div>
      <span class="count-pill"><%=totalProds%> item<%= totalProds != 1 ? "s" : "" %></span>
    </div>

    <table>
      <thead>
        <tr>
          <th>#</th>
          <th>Product Code</th>
          <th>Name</th>
          <th>Company</th>
          <th>Unit Price</th>
          <th>Stock</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <%
          int row = 1;
          for (ProductBean pb : al) {
            int qty = 0;
            try { qty = Integer.parseInt(String.valueOf(pb.getP_qty())); } catch (NumberFormatException e) {}
            int barW = Math.min(100, qty * 5);
        %>
        <tr>
          <td><span class="row-num"><%=String.format("%02d", row++)%></span></td>

          <td><span class="code-pill"><%=pb.getP_code()%></span></td>

          <td>
            <div class="prod-wrap">
              <div class="pname"><%=pb.getP_name()%></div>
            </div>
          </td>

          <td><span class="company-name"><%=pb.getP_company()%></span></td>

          <td><span class="price-cell">₹<%=pb.getP_price()%></span></td>

          <td>
            <div class="stock-cell">
              <div class="stock-row">
                <span class="stock-num"><%=qty%> units</span>
                <div class="stock-bar">
                  <div class="stock-fill" style="width:<%=barW%>%"></div>
                </div>
              </div>
            </div>
          </td>

          <td>
            <div class="actions-cell">
              <a class="btn btn-edit" href="edit?pcode=<%=pb.getP_code()%>">
                <svg width="13" height="13" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round">
                  <path d="M11 4H4a2 2 0 00-2 2v14a2 2 0 002 2h14a2 2 0 002-2v-7"/>
                  <path d="M18.5 2.5a2.121 2.121 0 013 3L12 15l-4 1 1-4 9.5-9.5z"/>
                </svg>
                Edit
              </a>
              <a class="btn btn-del" href="delete?pcode=<%=pb.getP_code()%>"
                 onclick="return confirm('Delete \'<%=pb.getP_name()%>\' from inventory?')">
                <svg width="13" height="13" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round" stroke-linejoin="round">
                  <polyline points="3 6 5 6 21 6"/>
                  <path d="M19 6l-1 14H6L5 6"/>
                  <path d="M10 11v6M14 11v6"/>
                  <path d="M9 6V4h6v2"/>
                </svg>
                Delete
              </a>
            </div>
          </td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>

<% } %>
</div>
</body>
</html>
