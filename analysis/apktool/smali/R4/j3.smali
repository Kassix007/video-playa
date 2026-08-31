.class public final synthetic LR4/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/l3;


# direct methods
.method public synthetic constructor <init>(LR4/l3;I)V
    .locals 0

    .line 1
    iput p2, p0, LR4/j3;->q:I

    iput-object p1, p0, LR4/j3;->r:LR4/l3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LR4/l3;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p3, p0, LR4/j3;->q:I

    iput-object p1, p0, LR4/j3;->r:LR4/l3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LR4/l3;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 3
    const/4 p2, 0x5

    iput p2, p0, LR4/j3;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/j3;->r:LR4/l3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LR4/j3;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 7
    .line 8
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 9
    .line 10
    iget-object v0, v0, LR4/k1;->D:LR4/V;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 14
    .line 15
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 16
    .line 17
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 18
    .line 19
    iget-object v0, v0, Lj5/d;->f:LP5/S;

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v2, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 32
    .line 33
    iget-object v1, v0, LR4/l3;->a:LR4/k1;

    .line 34
    .line 35
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 41
    .line 42
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_2
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 59
    .line 60
    iget-object v1, v0, LR4/l3;->d:LR4/s0;

    .line 61
    .line 62
    if-nez v1, :cond_0

    .line 63
    .line 64
    new-instance v1, LR4/s0;

    .line 65
    .line 66
    iget-object v2, v0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 67
    .line 68
    iget-object v3, v0, LR4/l3;->a:LR4/k1;

    .line 69
    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-direct {v1, v2, v3, v4}, LR4/s0;-><init>(Lcom/web2native/MainActivity;LR4/k1;I)V

    .line 72
    .line 73
    .line 74
    iput-object v1, v0, LR4/l3;->d:LR4/s0;

    .line 75
    .line 76
    :cond_0
    iget-object v0, v0, LR4/l3;->d:LR4/s0;

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, LR4/s0;->c()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_3
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 86
    .line 87
    iget-object v1, v0, LR4/l3;->a:LR4/k1;

    .line 88
    .line 89
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 90
    .line 91
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, LR4/l3;->h:LR4/r;

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_4
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 108
    .line 109
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 110
    .line 111
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_5
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 118
    .line 119
    iget-object v1, v0, LR4/l3;->a:LR4/k1;

    .line 120
    .line 121
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 122
    .line 123
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, LR4/l3;->h:LR4/r;

    .line 134
    .line 135
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_6
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 140
    .line 141
    iget-object v0, v0, LR4/l3;->g:LR4/u0;

    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :try_start_0
    iget-object v0, v0, LR4/u0;->a:Lcom/web2native/MainActivity;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const/16 v1, 0x80

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :catch_0
    move-exception v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 160
    .line 161
    .line 162
    :goto_0
    return-void

    .line 163
    :pswitch_7
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 164
    .line 165
    iget-object v1, v0, LR4/l3;->d:LR4/s0;

    .line 166
    .line 167
    if-nez v1, :cond_1

    .line 168
    .line 169
    new-instance v1, LR4/s0;

    .line 170
    .line 171
    iget-object v2, v0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 172
    .line 173
    iget-object v3, v0, LR4/l3;->a:LR4/k1;

    .line 174
    .line 175
    const/4 v4, 0x1

    .line 176
    invoke-direct {v1, v2, v3, v4}, LR4/s0;-><init>(Lcom/web2native/MainActivity;LR4/k1;I)V

    .line 177
    .line 178
    .line 179
    iput-object v1, v0, LR4/l3;->d:LR4/s0;

    .line 180
    .line 181
    :cond_1
    iget-object v0, v0, LR4/l3;->d:LR4/s0;

    .line 182
    .line 183
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v0, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 187
    .line 188
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 189
    .line 190
    const/16 v3, 0x1e

    .line 191
    .line 192
    if-lt v2, v3, :cond_3

    .line 193
    .line 194
    iget-object v0, v0, LR4/s0;->b:LR4/k1;

    .line 195
    .line 196
    iget-object v1, v0, LR4/k1;->Y:Li1/a;

    .line 197
    .line 198
    if-eqz v1, :cond_2

    .line 199
    .line 200
    invoke-static {}, Lw1/V;->m()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    iget-object v1, v1, Li1/a;->r:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, LC3/a;

    .line 207
    .line 208
    invoke-virtual {v1, v2}, LC3/a;->S(I)V

    .line 209
    .line 210
    .line 211
    :cond_2
    iget-object v0, v0, LR4/k1;->Y:Li1/a;

    .line 212
    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    invoke-static {}, Lw1/V;->b()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, LC3/a;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, LC3/a;->S(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_3
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const/16 v2, 0x400

    .line 232
    .line 233
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const/4 v2, 0x0

    .line 245
    invoke-virtual {v0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    const-string v2, "#ffffff"

    .line 253
    .line 254
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v1, "#000000"

    .line 266
    .line 267
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 272
    .line 273
    .line 274
    :cond_4
    :goto_1
    return-void

    .line 275
    :pswitch_8
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 276
    .line 277
    iget-object v1, v0, LR4/l3;->h:LR4/r;

    .line 278
    .line 279
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    new-instance v1, Lorg/json/JSONObject;

    .line 283
    .line 284
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 285
    .line 286
    .line 287
    :try_start_1
    const-string v2, "isSuccess"

    .line 288
    .line 289
    const/4 v3, 0x0

    .line 290
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 291
    .line 292
    .line 293
    const-string v2, "value"

    .line 294
    .line 295
    const-string v3, "Domain is not in whitelisted"

    .line 296
    .line 297
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v1}, LR4/l3;->a(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :catch_1
    move-exception v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 306
    .line 307
    .line 308
    :goto_2
    return-void

    .line 309
    :pswitch_9
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 310
    .line 311
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 312
    .line 313
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 314
    .line 315
    const/4 v1, -0x1

    .line 316
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_a
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 321
    .line 322
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 323
    .line 324
    iget-object v0, v0, LR4/k1;->D:LR4/V;

    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_b
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 328
    .line 329
    iget-object v0, v0, LR4/l3;->g:LR4/u0;

    .line 330
    .line 331
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :try_start_2
    iget-object v0, v0, LR4/u0;->a:Lcom/web2native/MainActivity;

    .line 335
    .line 336
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const/16 v1, 0x80

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :catch_2
    move-exception v0

    .line 347
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 348
    .line 349
    .line 350
    :goto_3
    return-void

    .line 351
    :pswitch_c
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 352
    .line 353
    iget-object v1, v0, LR4/l3;->a:LR4/k1;

    .line 354
    .line 355
    iget-object v2, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 356
    .line 357
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    const-string v3, "javascript:(function() {var style = document.createElement(\'style\');style.type = \'text/css\';style.innerHTML = \'@media print { body { background-color: #FFFFFF; } }\';document.head.appendChild(style);})()"

    .line 361
    .line 362
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v0, LR4/l3;->k:Lcom/web2native/MainActivity;

    .line 366
    .line 367
    const-string v3, "print"

    .line 368
    .line 369
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    const-string v4, "null cannot be cast to non-null type android.print.PrintManager"

    .line 374
    .line 375
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    check-cast v3, Landroid/print/PrintManager;

    .line 379
    .line 380
    iget-object v1, v1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 381
    .line 382
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Landroid/webkit/WebView;->createPrintDocumentAdapter()Landroid/print/PrintDocumentAdapter;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    new-instance v4, Landroid/print/PrintAttributes$Builder;

    .line 390
    .line 391
    invoke-direct {v4}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 392
    .line 393
    .line 394
    iget-object v0, v0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 395
    .line 396
    const/4 v5, 0x0

    .line 397
    invoke-virtual {v0, v5}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const-string v5, "printId"

    .line 402
    .line 403
    const/4 v6, 0x0

    .line 404
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    const-string v7, "printLabel"

    .line 409
    .line 410
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    const-string v8, "printSize"

    .line 415
    .line 416
    invoke-interface {v0, v8, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    if-eqz v5, :cond_5

    .line 421
    .line 422
    if-eqz v7, :cond_5

    .line 423
    .line 424
    if-eqz v0, :cond_5

    .line 425
    .line 426
    invoke-static {v0}, LC3/a;->B(Ljava/lang/String;)Landroid/print/PrintAttributes$MediaSize;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    goto :goto_4

    .line 431
    :cond_5
    const-string v0, "ISO_A4"

    .line 432
    .line 433
    invoke-static {v0}, LC3/a;->B(Ljava/lang/String;)Landroid/print/PrintAttributes$MediaSize;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    :goto_4
    invoke-virtual {v4, v0}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    const-string v4, "W2N_DOC Document"

    .line 445
    .line 446
    invoke-virtual {v3, v4, v1, v0}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v1, "print(...)"

    .line 451
    .line 452
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Landroid/print/PrintJob;->isCompleted()Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    const/4 v3, 0x1

    .line 460
    if-eqz v1, :cond_6

    .line 461
    .line 462
    const-string v0, "Printing Success"

    .line 463
    .line 464
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 469
    .line 470
    .line 471
    goto :goto_5

    .line 472
    :cond_6
    invoke-virtual {v0}, Landroid/print/PrintJob;->isFailed()Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_7

    .line 477
    .line 478
    const-string v0, "Printing Failed"

    .line 479
    .line 480
    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 485
    .line 486
    .line 487
    :cond_7
    :goto_5
    return-void

    .line 488
    :pswitch_d
    iget-object v0, p0, LR4/j3;->r:LR4/l3;

    .line 489
    .line 490
    iget-object v0, v0, LR4/l3;->a:LR4/k1;

    .line 491
    .line 492
    iget-object v0, v0, LR4/k1;->D:LR4/V;

    .line 493
    .line 494
    return-void

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
