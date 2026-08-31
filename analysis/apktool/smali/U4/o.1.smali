.class public final synthetic LU4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;


# direct methods
.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 0

    .line 1
    iput p2, p0, LU4/o;->q:I

    iput-object p1, p0, LU4/o;->r:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LU4/o;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 9
    .line 10
    iget-object p1, p1, LR4/k1;->M:LO3/e0;

    .line 11
    .line 12
    invoke-virtual {p1}, LO3/e0;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-boolean v0, p1, LO3/e0;->b:Z

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, LO3/e0;->c()V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v0, p0, LU4/o;->r:LR4/k1;

    .line 31
    .line 32
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 33
    .line 34
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    iget-object v1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v3, v2

    .line 53
    :goto_0
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {v0}, Ly4/b;->g(LR4/k1;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iget-object p1, v0, LR4/k1;->N:LO3/D;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const-string p1, "inAppPurchaseUtil"

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v2

    .line 81
    :cond_4
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 82
    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    const-string v0, "mainScreen"

    .line 86
    .line 87
    invoke-static {p1, v0}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1
    check-cast p1, Landroid/content/res/Configuration;

    .line 94
    .line 95
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 96
    .line 97
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 102
    .line 103
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    const/4 v0, 0x0

    .line 111
    :goto_2
    const-string v1, "#ffffff"

    .line 112
    .line 113
    const-string v2, "#000000"

    .line 114
    .line 115
    if-nez v0, :cond_7

    .line 116
    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    const/16 v3, 0x1e

    .line 120
    .line 121
    if-lt v0, v3, :cond_7

    .line 122
    .line 123
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 124
    .line 125
    const/16 v0, 0x8

    .line 126
    .line 127
    invoke-static {v2, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 132
    .line 133
    const/4 v0, 0x1

    .line 134
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 138
    .line 139
    return-object p1

    .line 140
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 141
    .line 142
    const-string v0, "context"

    .line 143
    .line 144
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, LU4/o;->r:LR4/k1;

    .line 148
    .line 149
    iget-object v1, v0, LR4/k1;->w:Lb4/e;

    .line 150
    .line 151
    if-nez v1, :cond_9

    .line 152
    .line 153
    new-instance v1, Lb4/e;

    .line 154
    .line 155
    invoke-direct {v1, p1}, Ln4/k;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/4 v8, 0x0

    .line 163
    new-array v7, v8, [I

    .line 164
    .line 165
    const/4 v3, 0x0

    .line 166
    sget-object v4, LV3/a;->b:[I

    .line 167
    .line 168
    const v5, 0x7f03007c

    .line 169
    .line 170
    .line 171
    const v6, 0x7f12034d

    .line 172
    .line 173
    .line 174
    invoke-static/range {v2 .. v7}, Ll4/m;->h(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)LB0/G0;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    iget-object v3, v2, LB0/G0;->s:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v3, Landroid/content/res/TypedArray;

    .line 181
    .line 182
    const/4 v4, 0x2

    .line 183
    const/4 v5, 0x1

    .line 184
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-virtual {v1, v4}, Lb4/e;->setItemHorizontalTranslationEnabled(Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_8

    .line 196
    .line 197
    invoke-virtual {v3, v8, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-virtual {v1, v4}, Landroid/view/View;->setMinimumHeight(I)V

    .line 202
    .line 203
    .line 204
    :cond_8
    invoke-virtual {v3, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, LB0/G0;->R()V

    .line 208
    .line 209
    .line 210
    new-instance v2, LO3/B;

    .line 211
    .line 212
    const/16 v3, 0x12

    .line 213
    .line 214
    invoke-direct {v2, v3}, LO3/B;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v2}, Ll4/m;->d(Landroid/view/View;Ll4/p;)V

    .line 218
    .line 219
    .line 220
    const/16 v2, 0x402

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 223
    .line 224
    .line 225
    const-string v2, "#ffffff"

    .line 226
    .line 227
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 232
    .line 233
    .line 234
    const/16 v2, 0x8

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 237
    .line 238
    .line 239
    const/4 v2, 0x0

    .line 240
    invoke-virtual {v1, v2}, Ln4/k;->setElevation(F)V

    .line 241
    .line 242
    .line 243
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 244
    .line 245
    const/4 v3, -0x1

    .line 246
    const/4 v4, -0x2

    .line 247
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, LW4/a;

    .line 254
    .line 255
    invoke-direct {v2, v0, p1}, LW4/a;-><init>(LR4/k1;Landroid/content/Context;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 259
    .line 260
    .line 261
    iput-object v1, v0, LR4/k1;->w:Lb4/e;

    .line 262
    .line 263
    :cond_9
    iget-object p1, v0, LR4/k1;->w:Lb4/e;

    .line 264
    .line 265
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-object p1

    .line 269
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    const/16 v0, 0x46

    .line 276
    .line 277
    if-lt p1, v0, :cond_c

    .line 278
    .line 279
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 280
    .line 281
    iget-object v0, p1, LR4/k1;->e:LT1/u;

    .line 282
    .line 283
    if-eqz v0, :cond_a

    .line 284
    .line 285
    iget-object v0, v0, LT1/u;->b:LW1/j;

    .line 286
    .line 287
    invoke-virtual {v0}, LW1/j;->f()LT1/p;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_a

    .line 292
    .line 293
    iget-object v0, v0, LT1/p;->r:LW1/l;

    .line 294
    .line 295
    iget-object v0, v0, LW1/l;->e:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Ljava/lang/String;

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_a
    const/4 v0, 0x0

    .line 301
    :goto_4
    const-string v1, "splashScreen"

    .line 302
    .line 303
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_c

    .line 308
    .line 309
    sget-boolean v0, LU4/a;->e:Z

    .line 310
    .line 311
    if-eqz v0, :cond_c

    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    sput-boolean v0, LU4/a;->e:Z

    .line 315
    .line 316
    invoke-static {p1}, LU4/a;->C(LR4/k1;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, p1, LR4/k1;->l:Lk5/b;

    .line 320
    .line 321
    if-eqz v0, :cond_c

    .line 322
    .line 323
    iget-object v0, v0, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 324
    .line 325
    if-eqz v0, :cond_c

    .line 326
    .line 327
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 328
    .line 329
    const-string v1, "removeObservers"

    .line 330
    .line 331
    invoke-static {v1}, Landroidx/lifecycle/G;->a(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    iget-object v1, v0, Landroidx/lifecycle/G;->b:Lo/f;

    .line 335
    .line 336
    invoke-virtual {v1}, Lo/f;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    :cond_b
    :goto_5
    move-object v2, v1

    .line 341
    check-cast v2, Lo/b;

    .line 342
    .line 343
    invoke-virtual {v2}, Lo/b;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-eqz v3, :cond_c

    .line 348
    .line 349
    invoke-virtual {v2}, Lo/b;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    check-cast v2, Ljava/util/Map$Entry;

    .line 354
    .line 355
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    check-cast v3, Landroidx/lifecycle/F;

    .line 360
    .line 361
    invoke-virtual {v3, p1}, Landroidx/lifecycle/F;->h(Landroidx/lifecycle/x;)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_b

    .line 366
    .line 367
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    check-cast v2, Landroidx/lifecycle/K;

    .line 372
    .line 373
    invoke-virtual {v0, v2}, Landroidx/lifecycle/G;->j(Landroidx/lifecycle/K;)V

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_c
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 378
    .line 379
    return-object p1

    .line 380
    :pswitch_4
    check-cast p1, Landroid/content/res/Configuration;

    .line 381
    .line 382
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 383
    .line 384
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 385
    .line 386
    if-eqz v0, :cond_d

    .line 387
    .line 388
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 389
    .line 390
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 391
    .line 392
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    goto :goto_6

    .line 397
    :cond_d
    const/4 v0, 0x0

    .line 398
    :goto_6
    const-string v1, "#ffffff"

    .line 399
    .line 400
    const-string v2, "#000000"

    .line 401
    .line 402
    if-nez v0, :cond_e

    .line 403
    .line 404
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 405
    .line 406
    const/16 v3, 0x1e

    .line 407
    .line 408
    if-lt v0, v3, :cond_e

    .line 409
    .line 410
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 411
    .line 412
    const/16 v0, 0x8

    .line 413
    .line 414
    invoke-static {v2, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_e
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 419
    .line 420
    const/4 v0, 0x1

    .line 421
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 422
    .line 423
    .line 424
    :goto_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 425
    .line 426
    return-object p1

    .line 427
    :pswitch_5
    check-cast p1, Landroid/content/Context;

    .line 428
    .line 429
    const-string v0, "it"

    .line 430
    .line 431
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 435
    .line 436
    iget-object p1, p1, LR4/k1;->Q:LR4/X1;

    .line 437
    .line 438
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-object p1

    .line 442
    :pswitch_6
    check-cast p1, Landroid/content/Context;

    .line 443
    .line 444
    const-string v0, "context"

    .line 445
    .line 446
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, p0, LU4/o;->r:LR4/k1;

    .line 450
    .line 451
    iget-object v1, v0, LR4/k1;->u:Landroid/widget/RelativeLayout;

    .line 452
    .line 453
    if-nez v1, :cond_f

    .line 454
    .line 455
    new-instance v1, Landroid/widget/RelativeLayout;

    .line 456
    .line 457
    invoke-direct {v1, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 458
    .line 459
    .line 460
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    invoke-virtual {v1, p1}, Landroid/view/View;->setId(I)V

    .line 465
    .line 466
    .line 467
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 468
    .line 469
    const/4 v2, -0x1

    .line 470
    const/4 v3, -0x2

    .line 471
    invoke-direct {p1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 475
    .line 476
    .line 477
    iput-object v1, v0, LR4/k1;->u:Landroid/widget/RelativeLayout;

    .line 478
    .line 479
    :cond_f
    iget-object p1, v0, LR4/k1;->u:Landroid/widget/RelativeLayout;

    .line 480
    .line 481
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    return-object p1

    .line 485
    :pswitch_7
    check-cast p1, Landroid/content/res/Configuration;

    .line 486
    .line 487
    iget-object p1, p0, LU4/o;->r:LR4/k1;

    .line 488
    .line 489
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 490
    .line 491
    if-eqz v0, :cond_10

    .line 492
    .line 493
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 494
    .line 495
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    goto :goto_8

    .line 502
    :cond_10
    const/4 v0, 0x0

    .line 503
    :goto_8
    const-string v1, "#ffffff"

    .line 504
    .line 505
    const-string v2, "#000000"

    .line 506
    .line 507
    if-nez v0, :cond_11

    .line 508
    .line 509
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 510
    .line 511
    const/16 v3, 0x1e

    .line 512
    .line 513
    if-lt v0, v3, :cond_11

    .line 514
    .line 515
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 516
    .line 517
    const/16 v0, 0x8

    .line 518
    .line 519
    invoke-static {v2, v1, p1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 520
    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_11
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 524
    .line 525
    const/4 v0, 0x1

    .line 526
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 527
    .line 528
    .line 529
    :goto_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 530
    .line 531
    return-object p1

    .line 532
    nop

    .line 533
    :pswitch_data_0
    .packed-switch 0x0
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
