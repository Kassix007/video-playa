.class public final LR4/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/String;

.field public B:LR4/V;

.field public C:Lk3/c;

.field public D:LR4/V;

.field public E:LR4/V;

.field public F:LR4/V;

.field public G:LR4/V;

.field public H:LR4/l3;

.field public I:LB0/o;

.field public J:LB0/o;

.field public K:LB0/o;

.field public L:Lcom/web2native/OrufyConnectHandlerUtil;

.field public final M:LO3/e0;

.field public N:LO3/D;

.field public final O:Ljava/lang/Integer;

.field public P:LR4/V;

.field public final Q:LR4/X1;

.field public R:LR4/V;

.field public final S:Lg5/h;

.field public T:LO3/Y;

.field public final U:Lp3/z0;

.field public final V:Lj5/b;

.field public W:Z

.field public X:Z

.field public Y:Li1/a;

.field public Z:I

.field public final a:Lcom/web2native/MainActivity;

.field public a0:Z

.field public final b:Lcom/web2native/MainActivity;

.field public final b0:I

.field public final c:Lcom/web2native/MainActivity;

.field public final c0:I

.field public final d:LR4/i;

.field public final d0:I

.field public e:LT1/u;

.field public final e0:I

.field public f:I

.field public final f0:I

.field public g:Z

.field public final g0:I

.field public h:Ljava/lang/String;

.field public final h0:I

.field public i:Ljava/lang/String;

.field public i0:LR4/V;

.field public j:Ljava/lang/String;

.field public j0:LR4/V;

.field public final k:Landroid/webkit/WebView;

.field public final k0:Le/g;

.field public l:Lk5/b;

.field public l0:LR4/V;

.field public final m:LE1/u;

.field public final m0:LR4/k;

.field public final n:Lj5/a;

.field public n0:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public o0:LR4/V;

.field public p:Ljava/lang/Boolean;

.field public q:LR4/V;

.field public r:Landroid/os/Bundle;

.field public s:Lj5/c;

.field public final t:Lj5/d;

.field public u:Landroid/widget/RelativeLayout;

.field public v:Landroid/widget/RelativeLayout;

.field public w:Lb4/e;

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:LR4/V;


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;Lcom/web2native/MainActivity;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 5
    .line 6
    iput-object p2, p0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    iput-object p1, p0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, LR4/k1;->f:I

    .line 12
    .line 13
    const-string v1, "splashScreen"

    .line 14
    .line 15
    iput-object v1, p0, LR4/k1;->h:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, ""

    .line 18
    .line 19
    iput-object v1, p0, LR4/k1;->i:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "https://www.smspariaz.com"

    .line 22
    .line 23
    iput-object v1, p0, LR4/k1;->j:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Lj5/a;

    .line 26
    .line 27
    invoke-direct {v1}, Lj5/a;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LR4/k1;->n:Lj5/a;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iput-boolean v1, p0, LR4/k1;->y:Z

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    new-instance v2, LR4/j1;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-direct {v2, p0, v3}, LR4/j1;-><init>(LR4/k1;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 57
    .line 58
    .line 59
    iput-boolean v1, p0, LR4/k1;->W:Z

    .line 60
    .line 61
    iput-boolean v1, p0, LR4/k1;->X:Z

    .line 62
    .line 63
    iput-boolean v1, p0, LR4/k1;->a0:Z

    .line 64
    .line 65
    const/16 v2, 0x65

    .line 66
    .line 67
    iput v2, p0, LR4/k1;->b0:I

    .line 68
    .line 69
    const/16 v2, 0x66

    .line 70
    .line 71
    iput v2, p0, LR4/k1;->c0:I

    .line 72
    .line 73
    iput v2, p0, LR4/k1;->d0:I

    .line 74
    .line 75
    const/16 v2, 0x67

    .line 76
    .line 77
    iput v2, p0, LR4/k1;->e0:I

    .line 78
    .line 79
    const/16 v2, 0x79

    .line 80
    .line 81
    iput v2, p0, LR4/k1;->f0:I

    .line 82
    .line 83
    const/16 v2, 0xc8

    .line 84
    .line 85
    iput v2, p0, LR4/k1;->g0:I

    .line 86
    .line 87
    const/16 v2, 0x3eb

    .line 88
    .line 89
    iput v2, p0, LR4/k1;->h0:I

    .line 90
    .line 91
    invoke-static {p1}, Ly4/b;->v(Lcom/web2native/MainActivity;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const/4 v3, 0x0

    .line 96
    if-nez v2, :cond_0

    .line 97
    .line 98
    move-object v2, v3

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    new-instance v4, LI5/m;

    .line 101
    .line 102
    const/16 v5, 0x9

    .line 103
    .line 104
    invoke-direct {v4, v5}, LI5/m;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, LE3/h;->d(LB5/c;)La6/q;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    sget-object v5, LR4/i;->Companion:LR4/h;

    .line 112
    .line 113
    invoke-virtual {v5}, LR4/h;->serializer()LV5/a;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v4, v5, v2}, La6/c;->a(LV5/a;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, LR4/i;

    .line 122
    .line 123
    :goto_0
    iput-object v2, p0, LR4/k1;->d:LR4/i;

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    if-eqz v2, :cond_1

    .line 127
    .line 128
    iget-object v5, v2, LR4/i;->E:Ljava/lang/Boolean;

    .line 129
    .line 130
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move v5, v4

    .line 138
    :goto_1
    if-nez v5, :cond_2

    .line 139
    .line 140
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v6, 0x1e

    .line 143
    .line 144
    if-lt v5, v6, :cond_2

    .line 145
    .line 146
    const v5, 0x7f050317

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v5}, Landroid/content/Context;->getColor(I)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    const v7, 0xffffff

    .line 154
    .line 155
    .line 156
    and-int/2addr v6, v7

    .line 157
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    const-string v8, "#%06X"

    .line 170
    .line 171
    invoke-static {v8, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {p1, v5}, Landroid/content/Context;->getColor(I)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    and-int/2addr v5, v7

    .line 180
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-static {v8, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v5, v6, p2, v1}, Lcom/google/android/gms/internal/measurement/P1;->X(Ljava/lang/String;Ljava/lang/String;Lh/h;Z)V

    .line 197
    .line 198
    .line 199
    :cond_2
    new-instance v5, LO3/e0;

    .line 200
    .line 201
    invoke-direct {v5, p0}, LO3/e0;-><init>(LR4/k1;)V

    .line 202
    .line 203
    .line 204
    iput-object v5, p0, LR4/k1;->M:LO3/e0;

    .line 205
    .line 206
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    const v6, 0x7f0c0070

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v6, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    const v6, 0x7f090214

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    check-cast v6, Landroid/webkit/WebView;

    .line 225
    .line 226
    iput-object v6, p0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 227
    .line 228
    invoke-static {v6}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    const-string v8, "getSettings(...)"

    .line 236
    .line 237
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v6}, Landroid/webkit/WebView;->clearHistory()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v6}, Landroid/webkit/WebView;->clearFormData()V

    .line 262
    .line 263
    .line 264
    const/4 v8, 0x2

    .line 265
    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 269
    .line 270
    .line 271
    sget-object v8, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    .line 272
    .line 273
    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7, v4}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 283
    .line 284
    .line 285
    new-instance v8, Lk5/b;

    .line 286
    .line 287
    invoke-direct {v8}, Lk5/b;-><init>()V

    .line 288
    .line 289
    .line 290
    new-instance v9, LU4/q;

    .line 291
    .line 292
    invoke-direct {v9, p0, v8}, LU4/q;-><init>(LR4/k1;Lk5/b;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, v9}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 296
    .line 297
    .line 298
    new-instance v9, LU4/r;

    .line 299
    .line 300
    invoke-direct {v9, p0, v8}, LU4/r;-><init>(LR4/k1;Lk5/b;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6, v9}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 304
    .line 305
    .line 306
    iput-object v8, p0, LR4/k1;->l:Lk5/b;

    .line 307
    .line 308
    const-string v8, "SMSPARIAZAPP001"

    .line 309
    .line 310
    invoke-virtual {v7, v8}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-virtual {v8, v1}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 318
    .line 319
    .line 320
    if-eqz v2, :cond_3

    .line 321
    .line 322
    iget-object v3, v2, LR4/i;->r:Ljava/lang/Boolean;

    .line 323
    .line 324
    :cond_3
    if-eqz v3, :cond_5

    .line 325
    .line 326
    if-eqz v2, :cond_4

    .line 327
    .line 328
    iget-object v3, v2, LR4/i;->r:Ljava/lang/Boolean;

    .line 329
    .line 330
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-static {v3, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    goto :goto_2

    .line 337
    :cond_4
    move v3, v4

    .line 338
    :goto_2
    if-eqz v3, :cond_5

    .line 339
    .line 340
    invoke-virtual {v8}, Landroid/webkit/CookieManager;->acceptCookie()Z

    .line 341
    .line 342
    .line 343
    :cond_5
    invoke-virtual {v7, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 344
    .line 345
    .line 346
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v3, v6, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7, v4}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 357
    .line 358
    .line 359
    new-instance v1, Lb5/a;

    .line 360
    .line 361
    const/4 v3, 0x1

    .line 362
    invoke-direct {v1, p0, v3}, Lb5/a;-><init>(LR4/k1;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 366
    .line 367
    .line 368
    new-instance v1, Lg5/h;

    .line 369
    .line 370
    invoke-direct {v1, p2, p0}, Lg5/h;-><init>(Lcom/web2native/MainActivity;LR4/k1;)V

    .line 371
    .line 372
    .line 373
    iput-object v1, p0, LR4/k1;->S:Lg5/h;

    .line 374
    .line 375
    new-instance v1, Lj5/b;

    .line 376
    .line 377
    invoke-direct {v1}, Lj5/b;-><init>()V

    .line 378
    .line 379
    .line 380
    iput-object v1, p0, LR4/k1;->V:Lj5/b;

    .line 381
    .line 382
    new-instance v1, Lp3/z0;

    .line 383
    .line 384
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 385
    .line 386
    .line 387
    iput-object p0, v1, Lp3/z0;->a:Ljava/lang/Object;

    .line 388
    .line 389
    iget-object v3, p0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 390
    .line 391
    iput-object v3, v1, Lp3/z0;->b:Ljava/lang/Object;

    .line 392
    .line 393
    iget-object v3, p0, LR4/k1;->S:Lg5/h;

    .line 394
    .line 395
    iget-object v7, v3, Lg5/h;->h:Le/g;

    .line 396
    .line 397
    iput-object v7, v1, Lp3/z0;->c:Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v7, v3, Lg5/h;->j:Le/g;

    .line 400
    .line 401
    iput-object v7, v1, Lp3/z0;->d:Ljava/lang/Object;

    .line 402
    .line 403
    iget-object v7, v3, Lg5/h;->k:Le/g;

    .line 404
    .line 405
    iput-object v7, v1, Lp3/z0;->e:Ljava/lang/Object;

    .line 406
    .line 407
    iget-object v3, v3, Lg5/h;->l:Le/g;

    .line 408
    .line 409
    iput-object v3, v1, Lp3/z0;->f:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v1, p0, LR4/k1;->U:Lp3/z0;

    .line 412
    .line 413
    new-instance v1, LE1/u;

    .line 414
    .line 415
    invoke-direct {v1, p0}, LE1/u;-><init>(LR4/k1;)V

    .line 416
    .line 417
    .line 418
    iput-object v1, p0, LR4/k1;->m:LE1/u;

    .line 419
    .line 420
    new-instance v1, LW1/l;

    .line 421
    .line 422
    invoke-direct {v1, p0}, LW1/l;-><init>(LR4/k1;)V

    .line 423
    .line 424
    .line 425
    new-instance v1, Lj5/d;

    .line 426
    .line 427
    invoke-direct {v1}, Lj5/d;-><init>()V

    .line 428
    .line 429
    .line 430
    iput-object v1, p0, LR4/k1;->t:Lj5/d;

    .line 431
    .line 432
    if-eqz v2, :cond_6

    .line 433
    .line 434
    iget-object v1, v2, LR4/i;->v:Ljava/lang/Boolean;

    .line 435
    .line 436
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    :cond_6
    iput-boolean v4, p0, LR4/k1;->g:Z

    .line 443
    .line 444
    new-instance v1, LR4/X1;

    .line 445
    .line 446
    invoke-direct {v1, p1}, Lo2/m;-><init>(Lcom/web2native/MainActivity;)V

    .line 447
    .line 448
    .line 449
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    iput-object v2, p0, LR4/k1;->O:Ljava/lang/Integer;

    .line 465
    .line 466
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 467
    .line 468
    invoke-direct {v2, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 472
    .line 473
    .line 474
    iput-object v1, p0, LR4/k1;->Q:LR4/X1;

    .line 475
    .line 476
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 477
    .line 478
    .line 479
    new-instance v0, LJ1/D;

    .line 480
    .line 481
    const/16 v1, 0x8

    .line 482
    .line 483
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 484
    .line 485
    .line 486
    new-instance v1, LR4/L0;

    .line 487
    .line 488
    const/4 v2, 0x1

    .line 489
    invoke-direct {v1, v2, p0}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {p2, v0, v1}, Lb/l;->k(Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    iput-object p2, p0, LR4/k1;->k0:Le/g;

    .line 497
    .line 498
    new-instance p2, LR4/k;

    .line 499
    .line 500
    invoke-direct {p2, p1, v6}, LR4/k;-><init>(Lcom/web2native/MainActivity;Landroid/webkit/WebView;)V

    .line 501
    .line 502
    .line 503
    iput-object p2, p0, LR4/k1;->m0:LR4/k;

    .line 504
    .line 505
    return-void
.end method


# virtual methods
.method public final a()LO3/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LR4/k1;->T:LO3/Y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "locationManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method
