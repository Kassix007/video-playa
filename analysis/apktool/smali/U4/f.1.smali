.class public final synthetic LU4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/k1;LP/W;I)V
    .locals 0

    .line 1
    iput p3, p0, LU4/f;->q:I

    iput-object p1, p0, LU4/f;->r:LR4/k1;

    iput-object p2, p0, LU4/f;->s:LP/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LU4/f;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LT1/s;

    .line 7
    .line 8
    const-string v0, "$this$NavHost"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lg5/i;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    iget-object v2, p0, LU4/f;->r:LR4/k1;

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 19
    .line 20
    .line 21
    new-instance v1, LX/e;

    .line 22
    .line 23
    const v3, -0x45888963

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-string v0, "downloadScreen/{url}"

    .line 31
    .line 32
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lg5/i;

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 39
    .line 40
    .line 41
    new-instance v1, LX/e;

    .line 42
    .line 43
    const v3, 0x24145946

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "splashScreen"

    .line 50
    .line 51
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lg5/i;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 58
    .line 59
    .line 60
    new-instance v1, LX/e;

    .line 61
    .line 62
    const v3, -0x558de1db

    .line 63
    .line 64
    .line 65
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "mainScreen"

    .line 69
    .line 70
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lg5/i;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 77
    .line 78
    .line 79
    new-instance v1, LX/e;

    .line 80
    .line 81
    const v3, 0x30cfe304

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-string v0, "notificationScreen/{url}"

    .line 88
    .line 89
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lg5/i;

    .line 93
    .line 94
    const/4 v1, 0x7

    .line 95
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 96
    .line 97
    .line 98
    new-instance v1, LX/e;

    .line 99
    .line 100
    const v3, -0x48d2581d

    .line 101
    .line 102
    .line 103
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const-string v0, "onboardingScreen"

    .line 107
    .line 108
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v2, LR4/k1;->d:LR4/i;

    .line 112
    .line 113
    if-eqz v0, :cond_0

    .line 114
    .line 115
    iget-object v0, v0, LR4/i;->b:LR4/F1;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    const/4 v0, 0x0

    .line 119
    :goto_0
    if-eqz v0, :cond_1

    .line 120
    .line 121
    new-instance v0, Lg5/i;

    .line 122
    .line 123
    const/16 v1, 0x8

    .line 124
    .line 125
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 126
    .line 127
    .line 128
    new-instance v1, LX/e;

    .line 129
    .line 130
    const v3, -0x2dc47a5e

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string v0, "noInternetScreen"

    .line 137
    .line 138
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 139
    .line 140
    .line 141
    :cond_1
    new-instance v0, Lg5/j;

    .line 142
    .line 143
    iget-object v1, p0, LU4/f;->s:LP/W;

    .line 144
    .line 145
    invoke-direct {v0, v2, v1}, Lg5/j;-><init>(LR4/k1;LP/W;)V

    .line 146
    .line 147
    .line 148
    new-instance v1, LX/e;

    .line 149
    .line 150
    const v3, 0x3d8b6cc2

    .line 151
    .line 152
    .line 153
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    const-string v0, "iapScreen"

    .line 157
    .line 158
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Lg5/i;

    .line 162
    .line 163
    const/4 v1, 0x0

    .line 164
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 165
    .line 166
    .line 167
    new-instance v1, LX/e;

    .line 168
    .line 169
    const v3, -0x3c16ce5f

    .line 170
    .line 171
    .line 172
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const-string v0, "pdfScreen"

    .line 176
    .line 177
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 178
    .line 179
    .line 180
    new-instance v0, Lg5/i;

    .line 181
    .line 182
    const/4 v1, 0x1

    .line 183
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 184
    .line 185
    .line 186
    new-instance v1, LX/e;

    .line 187
    .line 188
    const v3, 0x4a46f680    # 3259808.0f

    .line 189
    .line 190
    .line 191
    invoke-direct {v1, v3, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const-string v0, "externalUrlsForLogin"

    .line 195
    .line 196
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Lg5/i;

    .line 200
    .line 201
    const/4 v1, 0x2

    .line 202
    invoke-direct {v0, v2, v1}, Lg5/i;-><init>(LR4/k1;I)V

    .line 203
    .line 204
    .line 205
    new-instance v1, LX/e;

    .line 206
    .line 207
    const v2, -0x2f5b44a1

    .line 208
    .line 209
    .line 210
    invoke-direct {v1, v2, v4, v0}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    const-string v0, "googleGsiLoginScreen"

    .line 214
    .line 215
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->m(LT1/s;Ljava/lang/String;LX/e;)V

    .line 216
    .line 217
    .line 218
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 222
    .line 223
    iget-object p1, p0, LU4/f;->r:LR4/k1;

    .line 224
    .line 225
    iget-object v0, p1, LR4/k1;->M:LO3/e0;

    .line 226
    .line 227
    invoke-virtual {v0}, LO3/e0;->b()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_3

    .line 232
    .line 233
    iget-object p1, p1, LR4/k1;->N:LO3/D;

    .line 234
    .line 235
    if-eqz p1, :cond_2

    .line 236
    .line 237
    iget-object p1, p0, LU4/f;->s:LP/W;

    .line 238
    .line 239
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    check-cast p1, LR4/Y0;

    .line 244
    .line 245
    if-eqz p1, :cond_3

    .line 246
    .line 247
    iget-object p1, p1, LR4/Y0;->e:Ljava/util/List;

    .line 248
    .line 249
    if-eqz p1, :cond_3

    .line 250
    .line 251
    invoke-static {p1}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, LR4/V0;

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_2
    const-string p1, "inAppPurchaseUtil"

    .line 259
    .line 260
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const/4 p1, 0x0

    .line 264
    throw p1

    .line 265
    :cond_3
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 266
    .line 267
    return-object p1

    .line 268
    :pswitch_1
    check-cast p1, Landroid/content/res/Configuration;

    .line 269
    .line 270
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 271
    .line 272
    const/4 v0, 0x2

    .line 273
    if-ne p1, v0, :cond_4

    .line 274
    .line 275
    const/4 p1, 0x1

    .line 276
    goto :goto_3

    .line 277
    :cond_4
    const/4 p1, 0x0

    .line 278
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    iget-object v0, p0, LU4/f;->s:LP/W;

    .line 283
    .line 284
    invoke-interface {v0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, LU4/f;->r:LR4/k1;

    .line 288
    .line 289
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 290
    .line 291
    iget-object p1, p1, LR4/k1;->d:LR4/i;

    .line 292
    .line 293
    const/4 v1, 0x0

    .line 294
    if-eqz p1, :cond_5

    .line 295
    .line 296
    iget-object v2, p1, LR4/i;->a:LR4/O1;

    .line 297
    .line 298
    if-eqz v2, :cond_5

    .line 299
    .line 300
    iget-object v2, v2, LR4/O1;->b:Ljava/lang/String;

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_5
    move-object v2, v1

    .line 304
    :goto_4
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    invoke-virtual {v3, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 316
    .line 317
    .line 318
    if-eqz p1, :cond_6

    .line 319
    .line 320
    iget-object v2, p1, LR4/i;->a:LR4/O1;

    .line 321
    .line 322
    if-eqz v2, :cond_6

    .line 323
    .line 324
    iget-object v2, v2, LR4/O1;->b:Ljava/lang/String;

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_6
    move-object v2, v1

    .line 328
    :goto_5
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v3, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 340
    .line 341
    .line 342
    if-eqz p1, :cond_7

    .line 343
    .line 344
    iget-object v2, p1, LR4/i;->a:LR4/O1;

    .line 345
    .line 346
    if-eqz v2, :cond_7

    .line 347
    .line 348
    iget-object v2, v2, LR4/O1;->b:Ljava/lang/String;

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_7
    move-object v2, v1

    .line 352
    :goto_6
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/P1;->b0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    if-eqz p1, :cond_8

    .line 359
    .line 360
    iget-object p1, p1, LR4/i;->a:LR4/O1;

    .line 361
    .line 362
    if-eqz p1, :cond_8

    .line 363
    .line 364
    iget-object v1, p1, LR4/O1;->b:Ljava/lang/String;

    .line 365
    .line 366
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->a0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_1

    .line 373
    .line 374
    :pswitch_2
    check-cast p1, Landroid/content/res/Configuration;

    .line 375
    .line 376
    iget-object p1, p0, LU4/f;->r:LR4/k1;

    .line 377
    .line 378
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 379
    .line 380
    const/4 v1, 0x0

    .line 381
    if-eqz v0, :cond_9

    .line 382
    .line 383
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 384
    .line 385
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    goto :goto_7

    .line 392
    :cond_9
    move v0, v1

    .line 393
    :goto_7
    const/4 v2, 0x0

    .line 394
    iget-object v3, p0, LU4/f;->s:LP/W;

    .line 395
    .line 396
    if-nez v0, :cond_a

    .line 397
    .line 398
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 399
    .line 400
    const/16 v4, 0x1e

    .line 401
    .line 402
    if-lt v0, v4, :cond_a

    .line 403
    .line 404
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v0, Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iget-object p1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 415
    .line 416
    const/16 v1, 0x9

    .line 417
    .line 418
    invoke-static {v2, v0, p1, v1}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 419
    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_a
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 423
    .line 424
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, Ljava/lang/String;

    .line 429
    .line 430
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {p1, v0, v2, v1}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 435
    .line 436
    .line 437
    :goto_8
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 438
    .line 439
    return-object p1

    .line 440
    :pswitch_3
    check-cast p1, Landroid/content/res/Configuration;

    .line 441
    .line 442
    iget-object p1, p0, LU4/f;->r:LR4/k1;

    .line 443
    .line 444
    iget-object p1, p1, LR4/k1;->x:Ljava/lang/String;

    .line 445
    .line 446
    if-eqz p1, :cond_b

    .line 447
    .line 448
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 449
    .line 450
    iget-object v0, p0, LU4/f;->s:LP/W;

    .line 451
    .line 452
    invoke-interface {v0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_b
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 456
    .line 457
    return-object p1

    .line 458
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 459
    .line 460
    if-nez p1, :cond_c

    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 464
    .line 465
    .line 466
    move-result p1

    .line 467
    const/16 v0, 0x64

    .line 468
    .line 469
    if-ne p1, v0, :cond_e

    .line 470
    .line 471
    iget-object p1, p0, LU4/f;->r:LR4/k1;

    .line 472
    .line 473
    iget-object v0, p1, LR4/k1;->L:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 474
    .line 475
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    iget-object v1, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 479
    .line 480
    if-eqz v1, :cond_d

    .line 481
    .line 482
    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    goto :goto_9

    .line 487
    :cond_d
    const/4 v1, 0x0

    .line 488
    :goto_9
    invoke-virtual {v0, p1, v1}, Lcom/web2native/OrufyConnectHandlerUtil;->matchUrl(LR4/k1;Ljava/lang/String;)Z

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    if-eqz p1, :cond_e

    .line 493
    .line 494
    const/4 p1, 0x1

    .line 495
    goto :goto_b

    .line 496
    :cond_e
    :goto_a
    const/4 p1, 0x0

    .line 497
    :goto_b
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    iget-object v0, p0, LU4/f;->s:LP/W;

    .line 502
    .line 503
    invoke-interface {v0, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    goto/16 :goto_1

    .line 507
    .line 508
    nop

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
