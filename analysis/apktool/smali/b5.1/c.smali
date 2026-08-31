.class public final Lb5/c;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb5/c;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lb5/c;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, Lb5/c;->s:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, Lb5/c;->t:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lb5/c;

    .line 2
    .line 3
    iget-object v3, p0, Lb5/c;->s:LP/W;

    .line 4
    .line 5
    iget-object v4, p0, Lb5/c;->t:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, Lb5/c;->q:LR4/k1;

    .line 8
    .line 9
    iget-object v2, p0, Lb5/c;->r:LP/W;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lb5/c;-><init>(LR4/k1;LP/W;LP/W;LP/W;Lq5/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lb5/c;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb5/c;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lb5/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p1, p0, Lb5/c;->r:LP/W;

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
    iget-object v0, p0, Lb5/c;->q:LR4/k1;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lb5/c;->s:LP/W;

    .line 27
    .line 28
    invoke-interface {v1, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/webkit/WebView;

    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "getSettings(...)"

    .line 45
    .line 46
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v3}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearFormData()V

    .line 72
    .line 73
    .line 74
    const/4 v4, 0x2

    .line 75
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 76
    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 80
    .line 81
    .line 82
    sget-object v5, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    .line 83
    .line 84
    invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v5, Lk5/b;

    .line 97
    .line 98
    invoke-direct {v5}, Lk5/b;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v6, LU4/q;

    .line 102
    .line 103
    invoke-direct {v6, p1, v0}, LU4/q;-><init>(Landroid/webkit/WebView;LR4/k1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v6}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 107
    .line 108
    .line 109
    new-instance v6, LU4/r;

    .line 110
    .line 111
    invoke-direct {v6, v0, v5}, LU4/r;-><init>(LR4/k1;Lk5/b;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v6}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 115
    .line 116
    .line 117
    iput-object v5, v0, LR4/k1;->l:Lk5/b;

    .line 118
    .line 119
    const-string v5, "Mozilla/5.0 (Linux; Android 12) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0 Mobile Safari/537.36"

    .line 120
    .line 121
    invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5, v3}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2, p1, v3}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 139
    .line 140
    .line 141
    new-instance v2, Lb5/a;

    .line 142
    .line 143
    invoke-direct {v2, v0, v4}, Lb5/a;-><init>(LR4/k1;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, v0, LR4/k1;->A:Ljava/lang/String;

    .line 150
    .line 151
    if-eqz p1, :cond_0

    .line 152
    .line 153
    const-string v2, "gsi"

    .line 154
    .line 155
    invoke-static {p1, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-ne p1, v3, :cond_0

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_0
    iget-object p1, v0, LR4/k1;->A:Ljava/lang/String;

    .line 163
    .line 164
    if-eqz p1, :cond_1

    .line 165
    .line 166
    const-string v2, "gis_transform"

    .line 167
    .line 168
    invoke-static {p1, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-ne p1, v3, :cond_1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_1
    iget-object p1, v0, LR4/k1;->A:Ljava/lang/String;

    .line 176
    .line 177
    if-eqz p1, :cond_2

    .line 178
    .line 179
    const-string v2, "gis"

    .line 180
    .line 181
    invoke-static {p1, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-ne p1, v3, :cond_2

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_2
    iget-object p1, v0, LR4/k1;->A:Ljava/lang/String;

    .line 189
    .line 190
    if-eqz p1, :cond_3

    .line 191
    .line 192
    const-string v2, "__/auth/handler"

    .line 193
    .line 194
    invoke-static {p1, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-ne p1, v3, :cond_3

    .line 199
    .line 200
    :goto_0
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    check-cast p1, Landroid/webkit/WebView;

    .line 205
    .line 206
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object v0, v0, LR4/k1;->A:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_3
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, Landroid/webkit/WebView;

    .line 224
    .line 225
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, LR4/k1;->A:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_1
    iget-object p1, p0, Lb5/c;->t:LP/W;

    .line 238
    .line 239
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-interface {p1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 245
    .line 246
    return-object p1
.end method
