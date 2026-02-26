<%@page import="com.nit.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Dashboard — ElectroHub</title>
  <link href="https://fonts.googleapis.com/css2?family=Syne:wght@400;500;600;700;800&family=DM+Mono:wght@300;400;500&family=DM+Sans:ital,wght@0,300;0,400;0,500;1,400&display=swap" rel="stylesheet">
  <style>
    *, *::before, *::after { margin: 0; padding: 0; box-sizing: border-box; }

    :root {
      --bg:       #060810;
      --bg2:      #0b0e1a;
      --surface:  rgba(255,255,255,0.035);
      --surface2: rgba(255,255,255,0.06);
      --border:   rgba(255,255,255,0.08);
      --border2:  rgba(255,255,255,0.14);
      --text:     #eef0fb;
      --muted:    #3d4468;
      --muted2:   #6b759e;
      --cyan:     #00e5ff;
      --violet:   #7c5cfc;
      --pink:     #ff3d9a;
      --gold:     #ffb700;
      --green:    #00e5a0;
    }

    html, body {
      height: 100%;
      font-family: 'DM Sans', sans-serif;
      background: var(--bg);
      color: var(--text);
      overflow-x: hidden;
    }

    /* ═══ CANVAS BG ═══ */
    #bg-canvas { position: fixed; inset: 0; z-index: 0; pointer-events: none; }

    /* ═══ NOISE OVERLAY ═══ */
    body::after {
      content: '';
      position: fixed; inset: 0; z-index: 1; pointer-events: none;
      background-image: url("data:image/svg+xml,%3Csvg viewBox='0 0 256 256' xmlns='http://www.w3.org/2000/svg'%3E%3Cfilter id='noise'%3E%3CfeTurbulence type='fractalNoise' baseFrequency='0.9' numOctaves='4' stitchTiles='stitch'/%3E%3C/filter%3E%3Crect width='100%25' height='100%25' filter='url(%23noise)' opacity='0.05'/%3E%3C/svg%3E");
      opacity: 0.4;
    }

    /* ═══ LAYOUT ═══ */
    .layout {
      position: relative; z-index: 2;
      display: grid;
      grid-template-columns: 260px 1fr;
      grid-template-rows: 64px 1fr;
      min-height: 100vh;
    }

    /* ═══ TOPBAR ═══ */
    .topbar {
      grid-column: 1 / -1;
      display: flex; align-items: center; justify-content: space-between;
      padding: 0 28px 0 0;
      background: rgba(6,8,16,0.6);
      border-bottom: 1px solid var(--border);
      backdrop-filter: blur(24px);
      -webkit-backdrop-filter: blur(24px);
      animation: fadeDown 0.5s ease both;
      position: sticky; top: 0; z-index: 50;
    }
    .topbar-brand {
      display: flex; align-items: center; gap: 0;
      height: 64px; padding: 0 24px;
      font-family: 'Syne', sans-serif;
      font-weight: 800; font-size: 17px;
      letter-spacing: -0.03em;
      border-right: 1px solid var(--border);
      min-width: 260px;
    }
    .topbar-brand .bolt {
      width: 32px; height: 32px; border-radius: 10px;
      background: linear-gradient(135deg, var(--cyan), var(--violet));
      display: flex; align-items: center; justify-content: center;
      font-size: 15px; margin-right: 10px;
      box-shadow: 0 0 20px rgba(0,229,255,0.35);
    }
    .topbar-brand .brand-name { color: var(--text); }
    .topbar-brand .brand-name em { font-style: normal; color: var(--cyan); }

    .topbar-right { display: flex; align-items: center; gap: 10px; }

    .search-box {
      display: flex; align-items: center; gap: 8px;
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 10px; padding: 8px 14px;
      font-family: 'DM Sans', sans-serif; font-size: 13px; color: var(--muted2);
      width: 220px;
      transition: border-color 0.2s, box-shadow 0.2s;
    }
    .search-box:focus-within { border-color: rgba(0,229,255,0.35); box-shadow: 0 0 0 3px rgba(0,229,255,0.07); }
    .search-box input { background: none; border: none; outline: none; color: var(--text); font-size: 13px; font-family: inherit; width: 100%; }
    .search-box input::placeholder { color: var(--muted2); }

    .topbar-notif {
      width: 38px; height: 38px; border-radius: 10px;
      background: var(--surface); border: 1px solid var(--border);
      display: flex; align-items: center; justify-content: center;
      font-size: 16px; cursor: pointer; position: relative;
      transition: border-color 0.2s;
    }
    .topbar-notif:hover { border-color: var(--border2); }
    .notif-dot {
      position: absolute; top: 8px; right: 8px;
      width: 7px; height: 7px; border-radius: 50%;
      background: var(--pink); border: 2px solid var(--bg);
    }

    .topbar-avatar {
      width: 38px; height: 38px; border-radius: 10px;
      background: linear-gradient(135deg, rgba(0,229,255,0.2), rgba(124,92,252,0.2));
      border: 1px solid rgba(0,229,255,0.25);
      display: flex; align-items: center; justify-content: center;
      font-size: 18px; cursor: pointer;
    }

    .status-pill {
      display: flex; align-items: center; gap: 6px;
      background: rgba(0,229,160,0.08); border: 1px solid rgba(0,229,160,0.2);
      padding: 5px 12px; border-radius: 999px;
      font-size: 11px; font-weight: 600; letter-spacing: 0.08em; text-transform: uppercase; color: var(--green);
    }
    .status-pill::before { content: ''; width: 5px; height: 5px; border-radius: 50%; background: var(--green); animation: pulse 2s infinite; }
    @keyframes pulse { 0%,100%{opacity:1;transform:scale(1)} 50%{opacity:0.5;transform:scale(0.8)} }

    /* ═══ SIDEBAR ═══ */
    .sidebar {
      background: var(--bg2);
      border-right: 1px solid var(--border);
      padding: 28px 16px;
      display: flex; flex-direction: column; gap: 4px;
      animation: fadeRight 0.5s 0.1s ease both;
      overflow-y: auto;
    }

    .sidebar-section-label {
      font-size: 10px; font-weight: 600; letter-spacing: 0.14em; text-transform: uppercase;
      color: var(--muted); padding: 10px 12px 6px;
    }

    .nav-item {
      display: flex; align-items: center; gap: 12px;
      padding: 11px 14px; border-radius: 12px;
      text-decoration: none; color: var(--muted2);
      font-size: 14px; font-weight: 500;
      position: relative; cursor: pointer;
      transition: background 0.2s, color 0.2s;
      border: 1px solid transparent;
    }
    .nav-item:hover { background: var(--surface); color: var(--text); }
    .nav-item.active {
      background: rgba(0,229,255,0.08);
      border-color: rgba(0,229,255,0.15);
      color: var(--cyan);
    }
    .nav-item.active .nav-ico { color: var(--cyan); }
    .nav-ico { font-size: 17px; flex-shrink: 0; width: 22px; text-align: center; }
    .nav-badge {
      margin-left: auto; font-size: 10px; font-weight: 700;
      background: rgba(255,61,154,0.15); color: var(--pink);
      padding: 2px 7px; border-radius: 999px;
    }
    .nav-badge.gold { background: rgba(255,183,0,0.15); color: var(--gold); }

    .sidebar-divider { height: 1px; background: var(--border); margin: 12px 4px; }

    .sidebar-footer {
      margin-top: auto; padding-top: 16px;
      border-top: 1px solid var(--border);
    }
    .admin-card {
      display: flex; align-items: center; gap: 11px;
      padding: 12px 13px; border-radius: 12px;
      background: var(--surface); border: 1px solid var(--border);
    }
    .admin-ava {
      width: 36px; height: 36px; border-radius: 10px;
      background: linear-gradient(135deg, rgba(0,229,255,0.2), rgba(124,92,252,0.25));
      display: flex; align-items: center; justify-content: center; font-size: 18px; flex-shrink: 0;
    }
    .admin-info .admin-name { font-size: 13px; font-weight: 600; color: var(--text); }
    .admin-info .admin-role { font-size: 11px; color: var(--muted2); margin-top: 1px; }

    /* ═══ MAIN ═══ */
    .main {
      overflow-y: auto;
      padding: 36px 36px 60px;
      animation: fadeUp 0.6s 0.15s ease both;
    }

    /* ═══ PAGE HEADER ═══ */
    .page-header {
      display: flex; align-items: flex-end; justify-content: space-between;
      margin-bottom: 32px;
    }
    .page-header h1 {
      font-family: 'Syne', sans-serif;
      font-size: clamp(1.6rem, 3vw, 2.2rem);
      font-weight: 800; letter-spacing: -0.04em; line-height: 1;
    }
    .page-header h1 .name-highlight {
      background: linear-gradient(90deg, var(--cyan) 0%, var(--violet) 100%);
      -webkit-background-clip: text; -webkit-text-fill-color: transparent; background-clip: text;
    }
    .page-header .sub {
      font-size: 13px; color: var(--muted2); margin-top: 7px; font-weight: 400;
    }
    .date-chip {
      display: flex; align-items: center; gap: 6px;
      background: var(--surface); border: 1px solid var(--border);
      padding: 8px 14px; border-radius: 10px;
      font-size: 12px; color: var(--muted2);
      font-family: 'DM Mono', monospace;
    }

    /* ═══ KPI CARDS ═══ */
    .kpi-grid {
      display: grid;
      grid-template-columns: repeat(4, 1fr);
      gap: 14px;
      margin-bottom: 28px;
    }
    .kpi-card {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 18px;
      padding: 20px 22px;
      position: relative; overflow: hidden;
      transition: transform 0.25s, border-color 0.25s, box-shadow 0.25s;
    }
    .kpi-card:hover { transform: translateY(-3px); }
    .kpi-card::before {
      content: ''; position: absolute; inset: 0; border-radius: 18px; opacity: 0; transition: opacity 0.3s;
    }
    .kpi-card:hover::before { opacity: 1; }

    .kpi-cyan   { border-color: rgba(0,229,255,0.1); }
    .kpi-cyan::before { background: linear-gradient(135deg, rgba(0,229,255,0.06), transparent); }
    .kpi-cyan:hover { border-color: rgba(0,229,255,0.3); box-shadow: 0 8px 32px rgba(0,229,255,0.08); }

    .kpi-violet { border-color: rgba(124,92,252,0.1); }
    .kpi-violet::before { background: linear-gradient(135deg, rgba(124,92,252,0.06), transparent); }
    .kpi-violet:hover { border-color: rgba(124,92,252,0.3); box-shadow: 0 8px 32px rgba(124,92,252,0.08); }

    .kpi-pink   { border-color: rgba(255,61,154,0.1); }
    .kpi-pink::before { background: linear-gradient(135deg, rgba(255,61,154,0.06), transparent); }
    .kpi-pink:hover { border-color: rgba(255,61,154,0.3); box-shadow: 0 8px 32px rgba(255,61,154,0.08); }

    .kpi-gold   { border-color: rgba(255,183,0,0.1); }
    .kpi-gold::before { background: linear-gradient(135deg, rgba(255,183,0,0.06), transparent); }
    .kpi-gold:hover { border-color: rgba(255,183,0,0.3); box-shadow: 0 8px 32px rgba(255,183,0,0.08); }

    .kpi-top { display: flex; align-items: center; justify-content: space-between; margin-bottom: 14px; }
    .kpi-label { font-size: 11px; font-weight: 600; letter-spacing: 0.1em; text-transform: uppercase; color: var(--muted2); }
    .kpi-icon {
      width: 36px; height: 36px; border-radius: 10px;
      display: flex; align-items: center; justify-content: center; font-size: 17px;
    }
    .kpi-cyan   .kpi-icon { background: rgba(0,229,255,0.1); }
    .kpi-violet .kpi-icon { background: rgba(124,92,252,0.1); }
    .kpi-pink   .kpi-icon { background: rgba(255,61,154,0.1); }
    .kpi-gold   .kpi-icon { background: rgba(255,183,0,0.1); }

    .kpi-value {
      font-family: 'Syne', sans-serif;
      font-size: 28px; font-weight: 800; letter-spacing: -0.04em; line-height: 1;
    }
    .kpi-cyan   .kpi-value { color: var(--cyan); }
    .kpi-violet .kpi-value { color: var(--violet); }
    .kpi-pink   .kpi-value { color: var(--pink); }
    .kpi-gold   .kpi-value { color: var(--gold); }

    .kpi-delta {
      margin-top: 8px; font-size: 12px; color: var(--green);
      display: flex; align-items: center; gap: 4px;
    }
    .kpi-delta.down { color: var(--pink); }

    /* ═══ BOTTOM GRID ═══ */
    .bottom-grid {
      display: grid;
      grid-template-columns: 1fr 340px;
      gap: 16px;
    }

    /* ═══ ACTION CARDS ═══ */
    .section-title {
      font-family: 'Syne', sans-serif;
      font-size: 14px; font-weight: 700; letter-spacing: -0.01em;
      margin-bottom: 14px; color: var(--text);
      display: flex; align-items: center; gap: 8px;
    }
    .section-title::after { content: ''; flex: 1; height: 1px; background: var(--border); }

    .action-grid {
      display: grid;
      grid-template-columns: 1fr 1fr;
      gap: 12px;
      margin-bottom: 16px;
    }

    .action-card {
      display: flex; flex-direction: column;
      padding: 22px 20px 20px;
      border-radius: 18px; text-decoration: none; color: var(--text);
      border: 1px solid var(--border);
      background: var(--surface);
      position: relative; overflow: hidden;
      transition: transform 0.3s cubic-bezier(0.16,1,0.3,1), box-shadow 0.3s, border-color 0.3s;
    }
    .action-card:hover { transform: translateY(-4px) scale(1.015); }
    .action-card::before { content: ''; position: absolute; inset: 0; opacity: 0; transition: opacity 0.3s; border-radius: 18px; }
    .action-card:hover::before { opacity: 1; }

    .ac-add  { border-color: rgba(0,229,255,0.12); }
    .ac-add::before  { background: linear-gradient(135deg, rgba(0,229,255,0.08) 0%, transparent 60%); }
    .ac-add:hover  { border-color: rgba(0,229,255,0.4); box-shadow: 0 16px 48px rgba(0,229,255,0.1); }

    .ac-view { border-color: rgba(124,92,252,0.12); }
    .ac-view::before { background: linear-gradient(135deg, rgba(124,92,252,0.08) 0%, transparent 60%); }
    .ac-view:hover { border-color: rgba(124,92,252,0.4); box-shadow: 0 16px 48px rgba(124,92,252,0.1); }

    .ac-orders { border-color: rgba(255,183,0,0.12); }
    .ac-orders::before { background: linear-gradient(135deg, rgba(255,183,0,0.08) 0%, transparent 60%); }
    .ac-orders:hover { border-color: rgba(255,183,0,0.4); box-shadow: 0 16px 48px rgba(255,183,0,0.1); }

    .ac-users { border-color: rgba(0,229,160,0.12); }
    .ac-users::before { background: linear-gradient(135deg, rgba(0,229,160,0.08) 0%, transparent 60%); }
    .ac-users:hover { border-color: rgba(0,229,160,0.4); box-shadow: 0 16px 48px rgba(0,229,160,0.1); }

    .ac-ico {
      width: 46px; height: 46px; border-radius: 13px;
      display: flex; align-items: center; justify-content: center; font-size: 21px;
      margin-bottom: 16px; position: relative; z-index: 1; flex-shrink: 0;
    }
    .ac-add    .ac-ico { background: rgba(0,229,255,0.1); box-shadow: 0 4px 16px rgba(0,229,255,0.15); }
    .ac-view   .ac-ico { background: rgba(124,92,252,0.1); box-shadow: 0 4px 16px rgba(124,92,252,0.15); }
    .ac-orders .ac-ico { background: rgba(255,183,0,0.1); box-shadow: 0 4px 16px rgba(255,183,0,0.15); }
    .ac-users  .ac-ico { background: rgba(0,229,160,0.1); box-shadow: 0 4px 16px rgba(0,229,160,0.15); }

    .ac-body { position: relative; z-index: 1; flex: 1; }
    .ac-title { font-size: 15px; font-weight: 700; letter-spacing: -0.01em; margin-bottom: 5px; }
    .ac-desc { font-size: 12px; color: var(--muted2); line-height: 1.5; }

    .ac-footer {
      margin-top: 16px; display: flex; align-items: center; justify-content: space-between;
      position: relative; z-index: 1;
    }
    .ac-tag {
      font-size: 10px; font-weight: 700; letter-spacing: 0.08em; text-transform: uppercase;
      padding: 3px 9px; border-radius: 6px;
    }
    .ac-add    .ac-tag { background: rgba(0,229,255,0.1); color: var(--cyan); }
    .ac-view   .ac-tag { background: rgba(124,92,252,0.1); color: var(--violet); }
    .ac-orders .ac-tag { background: rgba(255,183,0,0.1); color: var(--gold); }
    .ac-users  .ac-tag { background: rgba(0,229,160,0.1); color: var(--green); }

    .ac-arrow {
      width: 28px; height: 28px; border-radius: 8px;
      display: flex; align-items: center; justify-content: center; font-size: 13px;
      transition: transform 0.25s;
    }
    .action-card:hover .ac-arrow { transform: translateX(4px); }
    .ac-add    .ac-arrow { background: rgba(0,229,255,0.1); color: var(--cyan); }
    .ac-view   .ac-arrow { background: rgba(124,92,252,0.1); color: var(--violet); }
    .ac-orders .ac-arrow { background: rgba(255,183,0,0.1); color: var(--gold); }
    .ac-users  .ac-arrow { background: rgba(0,229,160,0.1); color: var(--green); }

    /* Logout full-width */
    .logout-card {
      display: flex; align-items: center; gap: 16px;
      padding: 18px 20px; border-radius: 18px;
      text-decoration: none; color: var(--text);
      border: 1px solid rgba(255,61,154,0.12);
      background: var(--surface);
      position: relative; overflow: hidden;
      transition: transform 0.3s cubic-bezier(0.16,1,0.3,1), box-shadow 0.3s, border-color 0.3s;
    }
    .logout-card::before {
      content: ''; position: absolute; inset: 0; opacity: 0;
      transition: opacity 0.3s; border-radius: 18px;
      background: linear-gradient(90deg, rgba(255,61,154,0.06) 0%, transparent);
    }
    .logout-card:hover { transform: translateY(-2px); border-color: rgba(255,61,154,0.4); box-shadow: 0 12px 40px rgba(255,61,154,0.1); }
    .logout-card:hover::before { opacity: 1; }
    .logout-ico {
      width: 42px; height: 42px; border-radius: 12px; flex-shrink: 0;
      background: rgba(255,61,154,0.1); display: flex; align-items: center; justify-content: center; font-size: 20px;
      position: relative; z-index: 1;
    }
    .logout-info { flex: 1; position: relative; z-index: 1; }
    .logout-title { font-size: 14px; font-weight: 700; }
    .logout-sub { font-size: 12px; color: var(--muted2); margin-top: 3px; }
    .logout-arrow {
      width: 32px; height: 32px; border-radius: 9px;
      background: rgba(255,61,154,0.1); color: var(--pink);
      display: flex; align-items: center; justify-content: center; font-size: 14px;
      position: relative; z-index: 1;
      transition: transform 0.25s;
    }
    .logout-card:hover .logout-arrow { transform: translateX(4px); }

    /* ═══ SIDEBAR PANEL (right) ═══ */
    .right-panel { display: flex; flex-direction: column; gap: 14px; }

    /* Activity feed */
    .panel-card {
      background: var(--surface);
      border: 1px solid var(--border);
      border-radius: 18px; padding: 20px;
    }
    .activity-list { display: flex; flex-direction: column; gap: 14px; margin-top: 14px; }
    .activity-item {
      display: flex; align-items: flex-start; gap: 12px;
    }
    .act-dot {
      width: 34px; height: 34px; border-radius: 10px; flex-shrink: 0;
      display: flex; align-items: center; justify-content: center; font-size: 15px;
    }
    .act-cyan   { background: rgba(0,229,255,0.1); }
    .act-pink   { background: rgba(255,61,154,0.1); }
    .act-gold   { background: rgba(255,183,0,0.1); }
    .act-violet { background: rgba(124,92,252,0.1); }

    .act-text { font-size: 12.5px; line-height: 1.5; color: var(--muted2); }
    .act-text strong { color: var(--text); font-weight: 600; }
    .act-time { margin-top: 3px; font-size: 11px; font-family: 'DM Mono', monospace; color: var(--muted); }

    /* Mini bar chart */
    .chart-container { margin-top: 16px; }
    .chart-row {
      display: flex; align-items: center; gap: 10px;
      margin-bottom: 9px;
    }
    .chart-label { font-size: 11px; color: var(--muted2); width: 52px; flex-shrink: 0; }
    .chart-track { flex: 1; height: 6px; background: rgba(255,255,255,0.05); border-radius: 99px; overflow: hidden; }
    .chart-fill {
      height: 100%; border-radius: 99px;
      animation: expandBar 1s 0.5s cubic-bezier(0.16,1,0.3,1) both;
      transform-origin: left;
    }
    @keyframes expandBar { from { transform: scaleX(0); } to { transform: scaleX(1); } }
    .chart-val { font-size: 11px; font-family: 'DM Mono', monospace; color: var(--muted2); width: 32px; text-align: right; flex-shrink: 0; }

    /* ═══ ANIMATIONS ═══ */
    @keyframes fadeDown  { from{opacity:0;transform:translateY(-16px)} to{opacity:1;transform:translateY(0)} }
    @keyframes fadeUp    { from{opacity:0;transform:translateY(24px)}  to{opacity:1;transform:translateY(0)} }
    @keyframes fadeRight { from{opacity:0;transform:translateX(-16px)} to{opacity:1;transform:translateX(0)} }

    /* ═══ RESPONSIVE ═══ */
    @media (max-width: 1100px) {
      .layout { grid-template-columns: 220px 1fr; }
      .kpi-grid { grid-template-columns: repeat(2,1fr); }
      .bottom-grid { grid-template-columns: 1fr; }
      .right-panel { display: grid; grid-template-columns: 1fr 1fr; }
    }
    @media (max-width: 768px) {
      .layout { grid-template-columns: 1fr; }
      .sidebar { display: none; }
      .topbar-brand { min-width: unset; border-right: none; }
      .kpi-grid { grid-template-columns: 1fr 1fr; }
      .main { padding: 24px 20px 40px; }
    }
    @media (max-width: 480px) {
      .kpi-grid { grid-template-columns: 1fr; }
      .action-grid { grid-template-columns: 1fr; }
    }
  </style>
</head>
<body>
<canvas id="bg-canvas"></canvas>

<div class="layout">

  <!-- ═══ TOPBAR ═══ -->
  <header class="topbar">
    <div class="topbar-brand">
      <div class="bolt">⚡</div>
      <span class="brand-name">Electro<em>Hub</em></span>
    </div>
    <div class="topbar-right">
      <div class="search-box">
        <span style="color:var(--muted2);font-size:14px;">🔍</span>
        <input type="text" placeholder="Search products, orders…">
        <span style="font-size:10px;color:var(--muted);font-family:'DM Mono',monospace;background:var(--surface);padding:2px 6px;border-radius:5px;border:1px solid var(--border);">⌘K</span>
      </div>
      <div class="topbar-notif">🔔<span class="notif-dot"></span></div>
      <div class="status-pill">Live</div>
      <div class="topbar-avatar">👨‍💼</div>
    </div>
  </header>

  <!-- ═══ SIDEBAR ═══ -->
  <nav class="sidebar">
    <div class="sidebar-section-label">Navigation</div>

    <a href="#" class="nav-item active">
      <span class="nav-ico">⊞</span> Dashboard
    </a>
    <a href="AddProduct.html" class="nav-item">
      <span class="nav-ico">➕</span> Add Product
      <span class="nav-badge gold">New</span>
    </a>
    <a href="View1" class="nav-item">
      <span class="nav-ico">📦</span> Products
      <span class="nav-badge">10K</span>
    </a>
    <a href="#" class="nav-item">
      <span class="nav-ico">🛒</span> Orders
      <span class="nav-badge">24</span>
    </a>
    <a href="#" class="nav-item">
      <span class="nav-ico">👥</span> Customers
    </a>

    <div class="sidebar-divider"></div>
    <div class="sidebar-section-label">Settings</div>

    <a href="#" class="nav-item">
      <span class="nav-ico">⚙️</span> Settings
    </a>
    <a href="#" class="nav-item">
      <span class="nav-ico">📊</span> Analytics
    </a>

    <div class="sidebar-footer">
      <div class="admin-card">
        <div class="admin-ava">👨‍💼</div>
        <div class="admin-info">
          <div class="admin-name">
            <%
              AdminBean abean = (AdminBean) session.getAttribute("abean");
              out.print(abean.getA_fname());
            %>
          </div>
          <div class="admin-role">Super Admin</div>
        </div>
      </div>
    </div>
  </nav>

  <!-- ═══ MAIN ═══ -->
  <main class="main">

    <!-- Page Header -->
    <div class="page-header">
      <div>
        <h1>
          Hello, <span class="name-highlight">
            <%
              AdminBean ab = (AdminBean) session.getAttribute("abean");
              out.print(ab.getA_fname());
            %>!
          </span>
        </h1>
        <p class="sub">Here's your store overview for today</p>
      </div>
      <div class="date-chip">
        📅 <span id="date-str">—</span>
      </div>
    </div>

    <!-- KPI Row -->
    <div class="kpi-grid">
      <div class="kpi-card kpi-cyan">
        <div class="kpi-top">
          <span class="kpi-label">Products</span>
          <div class="kpi-icon">📦</div>
        </div>
        <div class="kpi-value">10,420</div>
        <div class="kpi-delta">↑ 8.2% this month</div>
      </div>
      <div class="kpi-card kpi-violet">
        <div class="kpi-top">
          <span class="kpi-label">Brands</span>
          <div class="kpi-icon">🏷️</div>
        </div>
        <div class="kpi-value">528</div>
        <div class="kpi-delta">↑ 12 new brands</div>
      </div>
      <div class="kpi-card kpi-pink">
        <div class="kpi-top">
          <span class="kpi-label">Orders Today</span>
          <div class="kpi-icon">🛒</div>
        </div>
        <div class="kpi-value">247</div>
        <div class="kpi-delta down">↓ 3.1% vs yesterday</div>
      </div>
      <div class="kpi-card kpi-gold">
        <div class="kpi-top">
          <span class="kpi-label">Revenue</span>
          <div class="kpi-icon">💰</div>
        </div>
        <div class="kpi-value">₹4.8L</div>
        <div class="kpi-delta">↑ 18.5% this week</div>
      </div>
    </div>

    <!-- Bottom Grid -->
    <div class="bottom-grid">
      <div>
        <div class="section-title">Quick Actions</div>

        <div class="action-grid">
          <a href="AddProduct.html" class="action-card ac-add">
            <div class="ac-ico">➕</div>
            <div class="ac-body">
              <div class="ac-title">Add Product</div>
              <div class="ac-desc">List new items and update your store catalog instantly</div>
            </div>
            <div class="ac-footer">
              <span class="ac-tag">Catalog</span>
              <div class="ac-arrow">→</div>
            </div>
          </a>

          <a href="View1" class="action-card ac-view">
            <div class="ac-ico">📦</div>
            <div class="ac-body">
              <div class="ac-title">View Products</div>
              <div class="ac-desc">Browse, edit, and manage your entire product inventory</div>
            </div>
            <div class="ac-footer">
              <span class="ac-tag">Inventory</span>
              <div class="ac-arrow">→</div>
            </div>
          </a>

          <a href="#" class="action-card ac-orders">
            <div class="ac-ico">🛒</div>
            <div class="ac-body">
              <div class="ac-title">Manage Orders</div>
              <div class="ac-desc">Track, process, and fulfill customer orders in real time</div>
            </div>
            <div class="ac-footer">
              <span class="ac-tag">Orders</span>
              <div class="ac-arrow">→</div>
            </div>
          </a>

          <a href="#" class="action-card ac-users">
            <div class="ac-ico">👥</div>
            <div class="ac-body">
              <div class="ac-title">Customers</div>
              <div class="ac-desc">View accounts, purchase history, and customer insights</div>
            </div>
            <div class="ac-footer">
              <span class="ac-tag">Users</span>
              <div class="ac-arrow">→</div>
            </div>
          </a>
        </div>

        <a href="Logout" class="logout-card">
          <div class="logout-ico">🚪</div>
          <div class="logout-info">
            <div class="logout-title">Sign Out</div>
            <div class="logout-sub">End your admin session securely</div>
          </div>
          <div class="logout-arrow">→</div>
        </a>
      </div>

      <!-- Right Panel -->
      <div class="right-panel">

        <!-- Activity Feed -->
        <div class="panel-card">
          <div class="section-title" style="margin-bottom:0">Recent Activity</div>
          <div class="activity-list">
            <div class="activity-item">
              <div class="act-dot act-cyan">📦</div>
              <div>
                <div class="act-text"><strong>Sony WH-1000XM5</strong> was added to catalog</div>
                <div class="act-time">2 mins ago</div>
              </div>
            </div>
            <div class="activity-item">
              <div class="act-dot act-pink">🛒</div>
              <div>
                <div class="act-text"><strong>Order #4821</strong> placed by Priya S.</div>
                <div class="act-time">11 mins ago</div>
              </div>
            </div>
            <div class="activity-item">
              <div class="act-dot act-gold">⚡</div>
              <div>
                <div class="act-text">Stock alert: <strong>Samsung S24</strong> running low</div>
                <div class="act-time">34 mins ago</div>
              </div>
            </div>
            <div class="activity-item">
              <div class="act-dot act-violet">💰</div>
              <div>
                <div class="act-text">Payment of <strong>₹12,400</strong> confirmed</div>
                <div class="act-time">1 hr ago</div>
              </div>
            </div>
          </div>
        </div>

        <!-- Mini Chart -->
        <div class="panel-card">
          <div class="section-title" style="margin-bottom:0">Top Categories</div>
          <div class="chart-container">
            <div class="chart-row">
              <span class="chart-label">Phones</span>
              <div class="chart-track"><div class="chart-fill" style="width:88%;background:linear-gradient(90deg,var(--cyan),var(--violet))"></div></div>
              <span class="chart-val">88%</span>
            </div>
            <div class="chart-row">
              <span class="chart-label">Laptops</span>
              <div class="chart-track"><div class="chart-fill" style="width:72%;background:linear-gradient(90deg,var(--violet),var(--pink))"></div></div>
              <span class="chart-val">72%</span>
            </div>
            <div class="chart-row">
              <span class="chart-label">Tablets</span>
              <div class="chart-track"><div class="chart-fill" style="width:54%;background:linear-gradient(90deg,var(--pink),var(--gold))"></div></div>
              <span class="chart-val">54%</span>
            </div>
            <div class="chart-row">
              <span class="chart-label">Audio</span>
              <div class="chart-track"><div class="chart-fill" style="width:43%;background:linear-gradient(90deg,var(--gold),var(--green))"></div></div>
              <span class="chart-val">43%</span>
            </div>
            <div class="chart-row">
              <span class="chart-label">Wearables</span>
              <div class="chart-track"><div class="chart-fill" style="width:29%;background:linear-gradient(90deg,var(--green),var(--cyan))"></div></div>
              <span class="chart-val">29%</span>
            </div>
          </div>
        </div>

      </div>
    </div>

  </main>
</div>

<script>
  /* ─── Canvas Background ─── */
  const canvas = document.getElementById('bg-canvas');
  const ctx = canvas.getContext('2d');
  let W, H, t = 0;

  const blobs = [
    { x: 0.82, y: 0.08, r: 0.55, color: '#00e5ff', s: 0.00035 },
    { x: 0.12, y: 0.88, r: 0.5,  color: '#7c5cfc', s: 0.00045 },
    { x: 0.55, y: 0.5,  r: 0.35, color: '#00e5a0', s: 0.00025 },
  ];

  const stars = Array.from({length:70}, () => ({
    x: Math.random(), y: Math.random(),
    r: Math.random() * 1.2 + 0.2,
    sp: Math.random() * 0.00015 + 0.00004,
    o: Math.random() * 0.35 + 0.05,
    d: (Math.random() - 0.5) * 0.0001,
  }));

  function resize() { W = canvas.width = innerWidth; H = canvas.height = innerHeight; }
  resize(); window.addEventListener('resize', resize);

  function draw() {
    ctx.clearRect(0, 0, W, H);
    ctx.fillStyle = '#060810'; ctx.fillRect(0,0,W,H);

    blobs.forEach(b => {
      const ox = Math.sin(t * b.s * 1.4 + b.x * 9) * 0.13;
      const oy = Math.cos(t * b.s + b.y * 7) * 0.11;
      const g = ctx.createRadialGradient((b.x+ox)*W,(b.y+oy)*H,0,(b.x+ox)*W,(b.y+oy)*H,b.r*Math.max(W,H));
      g.addColorStop(0, b.color + '22');
      g.addColorStop(0.55, b.color + '08');
      g.addColorStop(1, 'transparent');
      ctx.fillStyle = g; ctx.fillRect(0,0,W,H);
    });

    /* grid */
    ctx.strokeStyle = 'rgba(0,229,255,0.018)'; ctx.lineWidth = 1;
    for (let x=0;x<W;x+=80){ctx.beginPath();ctx.moveTo(x,0);ctx.lineTo(x,H);ctx.stroke();}
    for (let y=0;y<H;y+=80){ctx.beginPath();ctx.moveTo(0,y);ctx.lineTo(W,y);ctx.stroke();}

    stars.forEach(p => {
      p.y -= p.sp; p.x += p.d;
      if (p.y < -0.01) { p.y = 1.01; p.x = Math.random(); }
      if (p.x < 0 || p.x > 1) p.d *= -1;
      ctx.beginPath(); ctx.arc(p.x*W, p.y*H, p.r, 0, Math.PI*2);
      ctx.fillStyle = `rgba(160,200,255,${p.o})`; ctx.fill();
    });

    t++; requestAnimationFrame(draw);
  }
  draw();

  /* ─── Date chip ─── */
  const d = new Date();
  document.getElementById('date-str').textContent =
    d.toLocaleDateString('en-IN', {weekday:'short', day:'numeric', month:'short', year:'numeric'});
</script>
</body>
</html>
