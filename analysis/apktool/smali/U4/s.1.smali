.class public final LU4/s;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;

.field public final synthetic t:Landroid/content/Context;

.field public final synthetic u:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;LP/W;Landroid/content/Context;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/s;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LU4/s;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU4/s;->s:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, LU4/s;->t:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p5, p0, LU4/s;->u:LP/W;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, LU4/s;

    .line 2
    .line 3
    iget-object v4, p0, LU4/s;->t:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v5, p0, LU4/s;->u:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, LU4/s;->q:LR4/k1;

    .line 8
    .line 9
    iget-object v2, p0, LU4/s;->r:LP/W;

    .line 10
    .line 11
    iget-object v3, p0, LU4/s;->s:LP/W;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LU4/s;-><init>(LR4/k1;LP/W;LP/W;Landroid/content/Context;LP/W;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/s;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/s;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/s;->r:LP/W;

    .line 5
    .line 6
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    const v0, 0x7f0900ca

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Landroid/webkit/WebView;

    .line 20
    .line 21
    iget-object v0, p0, LU4/s;->s:LP/W;

    .line 22
    .line 23
    invoke-interface {v0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroid/webkit/WebView;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, LU4/s;->q:LR4/k1;

    .line 36
    .line 37
    iget-object v2, v1, LR4/k1;->A:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/webkit/WebView;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v2, "getSettings(...)"

    .line 60
    .line 61
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Landroid/webkit/WebView;

    .line 76
    .line 77
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setScrollBarStyle(I)V

    .line 82
    .line 83
    .line 84
    const-string v3, "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0 Mobile Safari/537.36"

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Landroid/webkit/WebView;

    .line 94
    .line 95
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v5, LU4/q;

    .line 99
    .line 100
    iget-object v6, p0, LU4/s;->t:Landroid/content/Context;

    .line 101
    .line 102
    invoke-direct {v5, v1, v6, v0}, LU4/q;-><init>(LR4/k1;Landroid/content/Context;LP/W;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Landroid/webkit/WebView;

    .line 113
    .line 114
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance v5, LU4/r;

    .line 118
    .line 119
    invoke-direct {v5, v0, v1}, LU4/r;-><init>(LP/W;LR4/k1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v5}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Landroid/webkit/WebView;

    .line 137
    .line 138
    invoke-virtual {p1, v0, v2}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, LU4/s;->u:LP/W;

    .line 142
    .line 143
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-interface {p1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 149
    .line 150
    return-object p1
.end method
