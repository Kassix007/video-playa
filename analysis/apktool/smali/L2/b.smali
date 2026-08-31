.class public final LL2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL2/g;


# instance fields
.field public final synthetic a:I

.field public final b:LI2/B;

.field public final c:LU2/n;


# direct methods
.method public synthetic constructor <init>(LI2/B;LU2/n;I)V
    .locals 0

    .line 1
    iput p3, p0, LL2/b;->a:I

    iput-object p1, p0, LL2/b;->b:LI2/B;

    iput-object p2, p0, LL2/b;->c:LU2/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LL2/b;->a:I

    .line 4
    .line 5
    const-string v2, "toLowerCase(...)"

    .line 6
    .line 7
    const/16 v4, 0x1c

    .line 8
    .line 9
    const/16 v5, 0x8

    .line 10
    .line 11
    const/4 v6, -0x1

    .line 12
    const/4 v7, 0x6

    .line 13
    const-string v8, "substring(...)"

    .line 14
    .line 15
    const-string v9, ""

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    const/4 v13, 0x0

    .line 21
    sget-object v14, LJ2/h;->s:LJ2/h;

    .line 22
    .line 23
    iget-object v15, v0, LL2/b;->b:LI2/B;

    .line 24
    .line 25
    iget-object v3, v0, LL2/b;->c:LU2/n;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    iget-object v1, v15, LI2/B;->d:Ljava/lang/String;

    .line 31
    .line 32
    const-string v2, "Invalid android.resource URI: "

    .line 33
    .line 34
    if-eqz v1, :cond_d

    .line 35
    .line 36
    invoke-static {v1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    move-object v13, v1

    .line 43
    :cond_0
    if-eqz v13, :cond_d

    .line 44
    .line 45
    invoke-static {v15}, LI2/q;->g(LI2/B;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v1, :cond_c

    .line 56
    .line 57
    invoke-static {v1}, LJ5/t;->H0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_c

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget-object v2, v3, LU2/n;->a:Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4, v13}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :goto_0
    new-instance v5, Landroid/util/TypedValue;

    .line 93
    .line 94
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v1, v5, v12}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 98
    .line 99
    .line 100
    iget-object v5, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-static {v5}, LE3/h;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const-string v6, "text/xml"

    .line 111
    .line 112
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_b

    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v13, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    const-string v6, "Invalid resource ID: "

    .line 127
    .line 128
    if-eqz v5, :cond_3

    .line 129
    .line 130
    invoke-static {v2, v1}, La/a;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    if-eqz v4, :cond_2

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_2
    invoke-static {v1, v6}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v2

    .line 151
    :cond_3
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    :goto_1
    if-eq v7, v10, :cond_4

    .line 160
    .line 161
    if-eq v7, v12, :cond_4

    .line 162
    .line 163
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    goto :goto_1

    .line 168
    :cond_4
    if-ne v7, v10, :cond_a

    .line 169
    .line 170
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    sget-object v7, Lm1/l;->a:Ljava/lang/ThreadLocal;

    .line 175
    .line 176
    invoke-virtual {v4, v1, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-eqz v4, :cond_9

    .line 181
    .line 182
    :goto_2
    sget-object v1, LY2/j;->a:[Landroid/graphics/Bitmap$Config;

    .line 183
    .line 184
    instance-of v1, v4, Landroid/graphics/drawable/VectorDrawable;

    .line 185
    .line 186
    if-nez v1, :cond_6

    .line 187
    .line 188
    instance-of v1, v4, Lr2/o;

    .line 189
    .line 190
    if-eqz v1, :cond_5

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    move v1, v11

    .line 194
    goto :goto_4

    .line 195
    :cond_6
    :goto_3
    move v1, v12

    .line 196
    :goto_4
    new-instance v5, LL2/h;

    .line 197
    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    sget-object v6, LU2/i;->a:LI2/l;

    .line 201
    .line 202
    invoke-static {v3, v6}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Landroid/graphics/Bitmap$Config;

    .line 207
    .line 208
    iget-object v7, v3, LU2/n;->b:LV2/h;

    .line 209
    .line 210
    iget-object v8, v3, LU2/n;->c:LV2/g;

    .line 211
    .line 212
    iget-object v3, v3, LU2/n;->d:LV2/d;

    .line 213
    .line 214
    sget-object v9, LV2/d;->r:LV2/d;

    .line 215
    .line 216
    if-ne v3, v9, :cond_7

    .line 217
    .line 218
    move v11, v12

    .line 219
    :cond_7
    invoke-static {v4, v6, v7, v8, v11}, Ly4/b;->l(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LV2/h;LV2/g;Z)Landroid/graphics/Bitmap;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 228
    .line 229
    invoke-direct {v4, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    invoke-static {v4}, LI2/q;->c(Landroid/graphics/drawable/Drawable;)LI2/n;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-direct {v5, v2, v1, v14}, LL2/h;-><init>(LI2/n;ZLJ2/h;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_9
    invoke-static {v1, v6}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v2

    .line 254
    :cond_a
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 255
    .line 256
    const-string v2, "No start tag found."

    .line 257
    .line 258
    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    :cond_b
    new-instance v2, Landroid/util/TypedValue;

    .line 263
    .line 264
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    new-instance v4, LL2/i;

    .line 272
    .line 273
    invoke-static {v2}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-static {v2}, La/a;->j(Lq6/G;)Lq6/A;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget-object v3, v3, LU2/n;->f:Lq6/l;

    .line 282
    .line 283
    new-instance v6, LJ2/r;

    .line 284
    .line 285
    invoke-direct {v6, v13, v1}, LJ2/r;-><init>(Ljava/lang/String;I)V

    .line 286
    .line 287
    .line 288
    new-instance v1, LJ2/s;

    .line 289
    .line 290
    invoke-direct {v1, v2, v3, v6}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {v4, v1, v5, v14}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 294
    .line 295
    .line 296
    move-object v5, v4

    .line 297
    :goto_5
    return-object v5

    .line 298
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 299
    .line 300
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v1

    .line 316
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 317
    .line 318
    new-instance v3, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v1

    .line 334
    :pswitch_0
    iget-object v1, v15, LI2/B;->e:Ljava/lang/String;

    .line 335
    .line 336
    if-nez v1, :cond_e

    .line 337
    .line 338
    move-object v1, v9

    .line 339
    :cond_e
    const/16 v10, 0x21

    .line 340
    .line 341
    invoke-static {v1, v10, v11, v7}, LJ5/m;->R0(Ljava/lang/CharSequence;CII)I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    if-eq v7, v6, :cond_11

    .line 346
    .line 347
    sget-object v6, Lq6/x;->r:Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v1, v11, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v6, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v6}, LO3/D;->r(Ljava/lang/String;)Lq6/x;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    add-int/2addr v7, v12

    .line 361
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    invoke-virtual {v1, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v1}, LO3/D;->r(Ljava/lang/String;)Lq6/x;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    new-instance v7, LL2/i;

    .line 377
    .line 378
    iget-object v3, v3, LU2/n;->f:Lq6/l;

    .line 379
    .line 380
    const-string v8, "<this>"

    .line 381
    .line 382
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    new-instance v8, LZ4/G;

    .line 386
    .line 387
    invoke-direct {v8, v5}, LZ4/G;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-static {v6, v3, v8}, Lr6/b;->d(Lq6/x;Lq6/l;LB5/c;)Lq6/J;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v1, v3, v13, v13, v4}, LQ2/g;->c(Lq6/x;Lq6/l;Ljava/lang/String;LK2/h;I)LJ2/p;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-virtual {v1}, Lq6/x;->b()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const/16 v4, 0x2e

    .line 403
    .line 404
    invoke-static {v4, v1, v9}, LJ5/m;->i1(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-static {v1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_f

    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_f
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 416
    .line 417
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    sget-object v2, LY2/g;->a:Lo5/e;

    .line 425
    .line 426
    invoke-virtual {v2, v1}, Lo5/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    move-object v13, v2

    .line 431
    check-cast v13, Ljava/lang/String;

    .line 432
    .line 433
    if-nez v13, :cond_10

    .line 434
    .line 435
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v13

    .line 443
    :cond_10
    :goto_6
    invoke-direct {v7, v3, v13, v14}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 444
    .line 445
    .line 446
    return-object v7

    .line 447
    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    const-string v2, "Invalid jar:file URI: "

    .line 450
    .line 451
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 462
    .line 463
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v2

    .line 471
    :pswitch_1
    sget-object v1, Lq6/x;->r:Ljava/lang/String;

    .line 472
    .line 473
    invoke-static {v15}, LI2/q;->f(LI2/B;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    if-eqz v1, :cond_14

    .line 478
    .line 479
    invoke-static {v1}, LO3/D;->r(Ljava/lang/String;)Lq6/x;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    new-instance v5, LL2/i;

    .line 484
    .line 485
    iget-object v3, v3, LU2/n;->f:Lq6/l;

    .line 486
    .line 487
    invoke-static {v1, v3, v13, v13, v4}, LQ2/g;->c(Lq6/x;Lq6/l;Ljava/lang/String;LK2/h;I)LJ2/p;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-virtual {v1}, Lq6/x;->b()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    const/16 v4, 0x2e

    .line 496
    .line 497
    invoke-static {v4, v1, v9}, LJ5/m;->i1(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-static {v1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    if-eqz v4, :cond_12

    .line 506
    .line 507
    goto :goto_7

    .line 508
    :cond_12
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 509
    .line 510
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    sget-object v2, LY2/g;->a:Lo5/e;

    .line 518
    .line 519
    invoke-virtual {v2, v1}, Lo5/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    move-object v13, v2

    .line 524
    check-cast v13, Ljava/lang/String;

    .line 525
    .line 526
    if-nez v13, :cond_13

    .line 527
    .line 528
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-virtual {v2, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v13

    .line 536
    :cond_13
    :goto_7
    invoke-direct {v5, v3, v13, v14}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 537
    .line 538
    .line 539
    return-object v5

    .line 540
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 541
    .line 542
    const-string v2, "filePath == null"

    .line 543
    .line 544
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v1

    .line 548
    :pswitch_2
    iget-object v1, v15, LI2/B;->a:Ljava/lang/String;

    .line 549
    .line 550
    iget-object v2, v15, LI2/B;->a:Ljava/lang/String;

    .line 551
    .line 552
    const-string v4, ";base64,"

    .line 553
    .line 554
    invoke-static {v1, v4, v11, v7}, LJ5/m;->S0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    const-string v4, "invalid data uri: "

    .line 559
    .line 560
    if-eq v1, v6, :cond_35

    .line 561
    .line 562
    const/16 v9, 0x3a

    .line 563
    .line 564
    invoke-static {v2, v9, v11, v7}, LJ5/m;->R0(Ljava/lang/CharSequence;CII)I

    .line 565
    .line 566
    .line 567
    move-result v9

    .line 568
    if-eq v9, v6, :cond_34

    .line 569
    .line 570
    add-int/2addr v9, v12

    .line 571
    invoke-virtual {v2, v9, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    sget-object v9, Ly5/c;->c:Ly5/a;

    .line 579
    .line 580
    add-int/2addr v1, v5

    .line 581
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 582
    .line 583
    .line 584
    move-result v10

    .line 585
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    iget-boolean v14, v9, Ly5/c;->b:Z

    .line 589
    .line 590
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 591
    .line 592
    .line 593
    move-result v15

    .line 594
    invoke-static {v1, v10, v15}, Lcom/google/android/gms/internal/measurement/K1;->i(III)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v1, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-static {v1, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    sget-object v2, LJ5/a;->b:Ljava/nio/charset/Charset;

    .line 605
    .line 606
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    const-string v2, "getBytes(...)"

    .line 611
    .line 612
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    array-length v2, v1

    .line 616
    array-length v8, v1

    .line 617
    invoke-static {v11, v2, v8}, Lcom/google/android/gms/internal/measurement/K1;->i(III)V

    .line 618
    .line 619
    .line 620
    const/16 v8, 0x3d

    .line 621
    .line 622
    const/4 v10, -0x2

    .line 623
    if-nez v2, :cond_15

    .line 624
    .line 625
    move v10, v11

    .line 626
    move/from16 v16, v12

    .line 627
    .line 628
    goto :goto_c

    .line 629
    :cond_15
    if-eq v2, v12, :cond_33

    .line 630
    .line 631
    if-eqz v14, :cond_19

    .line 632
    .line 633
    move/from16 v16, v2

    .line 634
    .line 635
    move v15, v11

    .line 636
    :goto_8
    if-ge v15, v2, :cond_16

    .line 637
    .line 638
    aget-byte v11, v1, v15

    .line 639
    .line 640
    and-int/lit16 v11, v11, 0xff

    .line 641
    .line 642
    sget-object v17, Ly5/d;->a:[I

    .line 643
    .line 644
    aget v11, v17, v11

    .line 645
    .line 646
    if-gez v11, :cond_18

    .line 647
    .line 648
    if-ne v11, v10, :cond_17

    .line 649
    .line 650
    sub-int v11, v2, v15

    .line 651
    .line 652
    sub-int v16, v16, v11

    .line 653
    .line 654
    :cond_16
    :goto_9
    move/from16 v11, v16

    .line 655
    .line 656
    :goto_a
    move/from16 v16, v12

    .line 657
    .line 658
    goto :goto_b

    .line 659
    :cond_17
    add-int/lit8 v16, v16, -0x1

    .line 660
    .line 661
    :cond_18
    add-int/lit8 v15, v15, 0x1

    .line 662
    .line 663
    const/4 v11, 0x0

    .line 664
    goto :goto_8

    .line 665
    :cond_19
    add-int/lit8 v11, v2, -0x1

    .line 666
    .line 667
    aget-byte v11, v1, v11

    .line 668
    .line 669
    if-ne v11, v8, :cond_1a

    .line 670
    .line 671
    add-int/lit8 v16, v2, -0x1

    .line 672
    .line 673
    add-int/lit8 v11, v2, -0x2

    .line 674
    .line 675
    aget-byte v11, v1, v11

    .line 676
    .line 677
    if-ne v11, v8, :cond_16

    .line 678
    .line 679
    add-int/lit8 v16, v2, -0x2

    .line 680
    .line 681
    goto :goto_9

    .line 682
    :cond_1a
    move v11, v2

    .line 683
    goto :goto_a

    .line 684
    :goto_b
    int-to-long v12, v11

    .line 685
    int-to-long v10, v7

    .line 686
    mul-long/2addr v12, v10

    .line 687
    int-to-long v10, v5

    .line 688
    div-long/2addr v12, v10

    .line 689
    long-to-int v10, v12

    .line 690
    :goto_c
    new-array v11, v10, [B

    .line 691
    .line 692
    iget-boolean v9, v9, Ly5/c;->a:Z

    .line 693
    .line 694
    if-eqz v9, :cond_1b

    .line 695
    .line 696
    sget-object v9, Ly5/d;->b:[I

    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_1b
    sget-object v9, Ly5/d;->a:[I

    .line 700
    .line 701
    :goto_d
    const/4 v12, -0x8

    .line 702
    move/from16 v20, v5

    .line 703
    .line 704
    move/from16 v18, v7

    .line 705
    .line 706
    move v7, v12

    .line 707
    const/4 v13, 0x0

    .line 708
    const/4 v15, 0x0

    .line 709
    const/16 v19, 0x0

    .line 710
    .line 711
    :goto_e
    const-string v5, ") at index "

    .line 712
    .line 713
    const-string v8, "toString(...)"

    .line 714
    .line 715
    const-string v6, "\'("

    .line 716
    .line 717
    if-ge v13, v2, :cond_29

    .line 718
    .line 719
    if-ne v7, v12, :cond_1c

    .line 720
    .line 721
    add-int/lit8 v12, v13, 0x3

    .line 722
    .line 723
    if-ge v12, v2, :cond_1c

    .line 724
    .line 725
    add-int/lit8 v22, v13, 0x1

    .line 726
    .line 727
    aget-byte v0, v1, v13

    .line 728
    .line 729
    and-int/lit16 v0, v0, 0xff

    .line 730
    .line 731
    aget v0, v9, v0

    .line 732
    .line 733
    add-int/lit8 v23, v13, 0x2

    .line 734
    .line 735
    move/from16 v24, v0

    .line 736
    .line 737
    aget-byte v0, v1, v22

    .line 738
    .line 739
    and-int/lit16 v0, v0, 0xff

    .line 740
    .line 741
    aget v0, v9, v0

    .line 742
    .line 743
    move/from16 v22, v0

    .line 744
    .line 745
    aget-byte v0, v1, v23

    .line 746
    .line 747
    and-int/lit16 v0, v0, 0xff

    .line 748
    .line 749
    aget v0, v9, v0

    .line 750
    .line 751
    add-int/lit8 v23, v13, 0x4

    .line 752
    .line 753
    aget-byte v12, v1, v12

    .line 754
    .line 755
    and-int/lit16 v12, v12, 0xff

    .line 756
    .line 757
    aget v12, v9, v12

    .line 758
    .line 759
    shl-int/lit8 v24, v24, 0x12

    .line 760
    .line 761
    shl-int/lit8 v22, v22, 0xc

    .line 762
    .line 763
    or-int v22, v24, v22

    .line 764
    .line 765
    shl-int/lit8 v0, v0, 0x6

    .line 766
    .line 767
    or-int v0, v22, v0

    .line 768
    .line 769
    or-int/2addr v0, v12

    .line 770
    if-ltz v0, :cond_1c

    .line 771
    .line 772
    add-int/lit8 v5, v15, 0x1

    .line 773
    .line 774
    shr-int/lit8 v6, v0, 0x10

    .line 775
    .line 776
    int-to-byte v6, v6

    .line 777
    aput-byte v6, v11, v15

    .line 778
    .line 779
    add-int/lit8 v6, v15, 0x2

    .line 780
    .line 781
    shr-int/lit8 v8, v0, 0x8

    .line 782
    .line 783
    int-to-byte v8, v8

    .line 784
    aput-byte v8, v11, v5

    .line 785
    .line 786
    add-int/lit8 v15, v15, 0x3

    .line 787
    .line 788
    int-to-byte v0, v0

    .line 789
    aput-byte v0, v11, v6

    .line 790
    .line 791
    move-object/from16 v0, p0

    .line 792
    .line 793
    move/from16 v13, v23

    .line 794
    .line 795
    const/4 v6, -0x1

    .line 796
    const/16 v8, 0x3d

    .line 797
    .line 798
    :goto_f
    const/4 v12, -0x8

    .line 799
    goto :goto_e

    .line 800
    :cond_1c
    aget-byte v0, v1, v13

    .line 801
    .line 802
    and-int/lit16 v0, v0, 0xff

    .line 803
    .line 804
    aget v12, v9, v0

    .line 805
    .line 806
    if-gez v12, :cond_27

    .line 807
    .line 808
    move-object/from16 v22, v1

    .line 809
    .line 810
    const/4 v1, -0x2

    .line 811
    if-ne v12, v1, :cond_25

    .line 812
    .line 813
    const/4 v12, -0x8

    .line 814
    if-eq v7, v12, :cond_24

    .line 815
    .line 816
    const/4 v0, -0x6

    .line 817
    if-eq v7, v0, :cond_1d

    .line 818
    .line 819
    const/4 v0, -0x4

    .line 820
    if-eq v7, v0, :cond_1f

    .line 821
    .line 822
    if-ne v7, v1, :cond_1e

    .line 823
    .line 824
    :cond_1d
    add-int/lit8 v13, v13, 0x1

    .line 825
    .line 826
    goto :goto_12

    .line 827
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 828
    .line 829
    const-string v1, "Unreachable"

    .line 830
    .line 831
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    throw v0

    .line 835
    :cond_1f
    add-int/lit8 v13, v13, 0x1

    .line 836
    .line 837
    if-nez v14, :cond_20

    .line 838
    .line 839
    goto :goto_11

    .line 840
    :cond_20
    :goto_10
    if-ge v13, v2, :cond_22

    .line 841
    .line 842
    aget-byte v0, v22, v13

    .line 843
    .line 844
    and-int/lit16 v0, v0, 0xff

    .line 845
    .line 846
    sget-object v9, Ly5/d;->a:[I

    .line 847
    .line 848
    aget v0, v9, v0

    .line 849
    .line 850
    const/4 v9, -0x1

    .line 851
    if-eq v0, v9, :cond_21

    .line 852
    .line 853
    goto :goto_11

    .line 854
    :cond_21
    add-int/lit8 v13, v13, 0x1

    .line 855
    .line 856
    goto :goto_10

    .line 857
    :cond_22
    :goto_11
    if-eq v13, v2, :cond_23

    .line 858
    .line 859
    aget-byte v0, v22, v13

    .line 860
    .line 861
    const/16 v12, 0x3d

    .line 862
    .line 863
    if-ne v0, v12, :cond_23

    .line 864
    .line 865
    add-int/lit8 v13, v13, 0x1

    .line 866
    .line 867
    goto :goto_12

    .line 868
    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 869
    .line 870
    const-string v1, "Missing one pad character at index "

    .line 871
    .line 872
    invoke-static {v13, v1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    throw v0

    .line 880
    :goto_12
    move/from16 v0, v16

    .line 881
    .line 882
    :goto_13
    const/4 v1, -0x2

    .line 883
    goto/16 :goto_14

    .line 884
    .line 885
    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 886
    .line 887
    const-string v1, "Redundant pad character at index "

    .line 888
    .line 889
    invoke-static {v13, v1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    throw v0

    .line 897
    :cond_25
    const/16 v12, 0x3d

    .line 898
    .line 899
    if-eqz v14, :cond_26

    .line 900
    .line 901
    add-int/lit8 v13, v13, 0x1

    .line 902
    .line 903
    move-object/from16 v0, p0

    .line 904
    .line 905
    move v8, v12

    .line 906
    move-object/from16 v1, v22

    .line 907
    .line 908
    const/4 v6, -0x1

    .line 909
    goto :goto_f

    .line 910
    :cond_26
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 911
    .line 912
    new-instance v2, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    const-string v3, "Invalid symbol \'"

    .line 915
    .line 916
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    int-to-char v3, v0

    .line 920
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-static/range {v20 .. v20}, Lcom/google/android/gms/internal/measurement/I1;->M(I)V

    .line 927
    .line 928
    .line 929
    move/from16 v3, v20

    .line 930
    .line 931
    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    throw v1

    .line 955
    :cond_27
    move-object/from16 v22, v1

    .line 956
    .line 957
    const/16 v21, 0x3d

    .line 958
    .line 959
    add-int/lit8 v13, v13, 0x1

    .line 960
    .line 961
    shl-int/lit8 v0, v19, 0x6

    .line 962
    .line 963
    or-int v19, v0, v12

    .line 964
    .line 965
    add-int/lit8 v12, v7, 0x6

    .line 966
    .line 967
    if-ltz v12, :cond_28

    .line 968
    .line 969
    add-int/lit8 v0, v15, 0x1

    .line 970
    .line 971
    ushr-int v5, v19, v12

    .line 972
    .line 973
    int-to-byte v5, v5

    .line 974
    aput-byte v5, v11, v15

    .line 975
    .line 976
    shl-int v5, v16, v12

    .line 977
    .line 978
    add-int/lit8 v5, v5, -0x1

    .line 979
    .line 980
    and-int v19, v19, v5

    .line 981
    .line 982
    add-int/lit8 v7, v7, -0x2

    .line 983
    .line 984
    move v15, v0

    .line 985
    move/from16 v8, v21

    .line 986
    .line 987
    move-object/from16 v1, v22

    .line 988
    .line 989
    const/4 v6, -0x1

    .line 990
    const/4 v12, -0x8

    .line 991
    const/16 v20, 0x8

    .line 992
    .line 993
    move-object/from16 v0, p0

    .line 994
    .line 995
    goto/16 :goto_e

    .line 996
    .line 997
    :cond_28
    move-object/from16 v0, p0

    .line 998
    .line 999
    move v7, v12

    .line 1000
    move/from16 v8, v21

    .line 1001
    .line 1002
    move-object/from16 v1, v22

    .line 1003
    .line 1004
    const/4 v6, -0x1

    .line 1005
    const/4 v12, -0x8

    .line 1006
    const/16 v20, 0x8

    .line 1007
    .line 1008
    goto/16 :goto_e

    .line 1009
    .line 1010
    :cond_29
    move-object/from16 v22, v1

    .line 1011
    .line 1012
    const/4 v0, 0x0

    .line 1013
    goto/16 :goto_13

    .line 1014
    .line 1015
    :goto_14
    if-eq v7, v1, :cond_32

    .line 1016
    .line 1017
    const/4 v12, -0x8

    .line 1018
    if-eq v7, v12, :cond_2b

    .line 1019
    .line 1020
    if-eqz v0, :cond_2a

    .line 1021
    .line 1022
    goto :goto_15

    .line 1023
    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1024
    .line 1025
    const-string v1, "The padding option is set to PRESENT, but the input is not properly padded"

    .line 1026
    .line 1027
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    throw v0

    .line 1031
    :cond_2b
    :goto_15
    if-nez v19, :cond_31

    .line 1032
    .line 1033
    if-nez v14, :cond_2c

    .line 1034
    .line 1035
    goto :goto_17

    .line 1036
    :cond_2c
    :goto_16
    if-ge v13, v2, :cond_2e

    .line 1037
    .line 1038
    aget-byte v0, v22, v13

    .line 1039
    .line 1040
    and-int/lit16 v0, v0, 0xff

    .line 1041
    .line 1042
    sget-object v1, Ly5/d;->a:[I

    .line 1043
    .line 1044
    aget v0, v1, v0

    .line 1045
    .line 1046
    const/4 v9, -0x1

    .line 1047
    if-eq v0, v9, :cond_2d

    .line 1048
    .line 1049
    goto :goto_17

    .line 1050
    :cond_2d
    add-int/lit8 v13, v13, 0x1

    .line 1051
    .line 1052
    goto :goto_16

    .line 1053
    :cond_2e
    :goto_17
    if-lt v13, v2, :cond_30

    .line 1054
    .line 1055
    if-ne v15, v10, :cond_2f

    .line 1056
    .line 1057
    new-instance v0, Lq6/g;

    .line 1058
    .line 1059
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0, v11}, Lq6/g;->write([B)V

    .line 1063
    .line 1064
    .line 1065
    iget-object v1, v3, LU2/n;->f:Lq6/l;

    .line 1066
    .line 1067
    new-instance v2, LJ2/s;

    .line 1068
    .line 1069
    const/4 v5, 0x0

    .line 1070
    invoke-direct {v2, v0, v1, v5}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v0, LL2/i;

    .line 1074
    .line 1075
    sget-object v1, LJ2/h;->r:LJ2/h;

    .line 1076
    .line 1077
    invoke-direct {v0, v2, v4, v1}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 1078
    .line 1079
    .line 1080
    return-object v0

    .line 1081
    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1082
    .line 1083
    const-string v1, "Check failed."

    .line 1084
    .line 1085
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    throw v0

    .line 1089
    :cond_30
    aget-byte v0, v22, v13

    .line 1090
    .line 1091
    and-int/lit16 v0, v0, 0xff

    .line 1092
    .line 1093
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1094
    .line 1095
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1096
    .line 1097
    const-string v3, "Symbol \'"

    .line 1098
    .line 1099
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    int-to-char v3, v0

    .line 1103
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1107
    .line 1108
    .line 1109
    const/16 v3, 0x8

    .line 1110
    .line 1111
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/I1;->M(I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    invoke-static {v0, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1125
    .line 1126
    .line 1127
    add-int/lit8 v13, v13, -0x1

    .line 1128
    .line 1129
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    const-string v0, " is prohibited after the pad character"

    .line 1133
    .line 1134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    throw v1

    .line 1145
    :cond_31
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1146
    .line 1147
    const-string v1, "The pad bits must be zeros"

    .line 1148
    .line 1149
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    throw v0

    .line 1153
    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1154
    .line 1155
    const-string v1, "The last unit of input does not have enough bits"

    .line 1156
    .line 1157
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    throw v0

    .line 1161
    :cond_33
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1162
    .line 1163
    const-string v1, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "

    .line 1164
    .line 1165
    invoke-static {v2, v1}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1170
    .line 1171
    .line 1172
    throw v0

    .line 1173
    :cond_34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1174
    .line 1175
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1186
    .line 1187
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    throw v1

    .line 1195
    :cond_35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1208
    .line 1209
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    throw v1

    .line 1217
    :pswitch_3
    move/from16 v16, v12

    .line 1218
    .line 1219
    move-object v5, v13

    .line 1220
    iget-object v0, v15, LI2/B;->a:Ljava/lang/String;

    .line 1221
    .line 1222
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    iget-object v1, v3, LU2/n;->a:Landroid/content/Context;

    .line 1227
    .line 1228
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    iget-object v2, v15, LI2/B;->d:Ljava/lang/String;

    .line 1233
    .line 1234
    const-string v4, "com.android.contacts"

    .line 1235
    .line 1236
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v4

    .line 1240
    const-string v6, "r"

    .line 1241
    .line 1242
    const-string v7, "\'."

    .line 1243
    .line 1244
    if-eqz v4, :cond_37

    .line 1245
    .line 1246
    invoke-static {v15}, LI2/q;->g(LI2/B;)Ljava/util/List;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v4

    .line 1250
    invoke-static {v4}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v4

    .line 1254
    const-string v8, "display_photo"

    .line 1255
    .line 1256
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v4

    .line 1260
    if-eqz v4, :cond_37

    .line 1261
    .line 1262
    invoke-virtual {v1, v0, v6}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    if-eqz v2, :cond_36

    .line 1267
    .line 1268
    goto/16 :goto_1c

    .line 1269
    .line 1270
    :cond_36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    const-string v2, "Unable to find a contact photo associated with \'"

    .line 1273
    .line 1274
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1288
    .line 1289
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    throw v1

    .line 1297
    :cond_37
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1298
    .line 1299
    const/16 v8, 0x1d

    .line 1300
    .line 1301
    if-lt v4, v8, :cond_3d

    .line 1302
    .line 1303
    const-string v4, "media"

    .line 1304
    .line 1305
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    move-result v2

    .line 1309
    if-nez v2, :cond_38

    .line 1310
    .line 1311
    goto/16 :goto_1b

    .line 1312
    .line 1313
    :cond_38
    invoke-static {v15}, LI2/q;->g(LI2/B;)Ljava/util/List;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1318
    .line 1319
    .line 1320
    move-result v4

    .line 1321
    const/4 v8, 0x3

    .line 1322
    if-lt v4, v8, :cond_3d

    .line 1323
    .line 1324
    add-int/lit8 v8, v4, -0x3

    .line 1325
    .line 1326
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v8

    .line 1330
    const-string v9, "audio"

    .line 1331
    .line 1332
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v8

    .line 1336
    if-eqz v8, :cond_3d

    .line 1337
    .line 1338
    sub-int/2addr v4, v10

    .line 1339
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v2

    .line 1343
    const-string v4, "albums"

    .line 1344
    .line 1345
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v2

    .line 1349
    if-eqz v2, :cond_3d

    .line 1350
    .line 1351
    iget-object v2, v3, LU2/n;->b:LV2/h;

    .line 1352
    .line 1353
    iget-object v4, v2, LV2/h;->a:LV2/c;

    .line 1354
    .line 1355
    instance-of v6, v4, LV2/a;

    .line 1356
    .line 1357
    if-eqz v6, :cond_39

    .line 1358
    .line 1359
    check-cast v4, LV2/a;

    .line 1360
    .line 1361
    goto :goto_18

    .line 1362
    :cond_39
    move-object v4, v5

    .line 1363
    :goto_18
    if-eqz v4, :cond_3b

    .line 1364
    .line 1365
    iget v4, v4, LV2/a;->a:I

    .line 1366
    .line 1367
    iget-object v2, v2, LV2/h;->b:LV2/c;

    .line 1368
    .line 1369
    instance-of v6, v2, LV2/a;

    .line 1370
    .line 1371
    if-eqz v6, :cond_3a

    .line 1372
    .line 1373
    check-cast v2, LV2/a;

    .line 1374
    .line 1375
    goto :goto_19

    .line 1376
    :cond_3a
    move-object v2, v5

    .line 1377
    :goto_19
    if-eqz v2, :cond_3b

    .line 1378
    .line 1379
    iget v2, v2, LV2/a;->a:I

    .line 1380
    .line 1381
    new-instance v13, Landroid/os/Bundle;

    .line 1382
    .line 1383
    move/from16 v5, v16

    .line 1384
    .line 1385
    invoke-direct {v13, v5}, Landroid/os/Bundle;-><init>(I)V

    .line 1386
    .line 1387
    .line 1388
    new-instance v5, Landroid/graphics/Point;

    .line 1389
    .line 1390
    invoke-direct {v5, v4, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 1391
    .line 1392
    .line 1393
    const-string v2, "android.content.extra.SIZE"

    .line 1394
    .line 1395
    invoke-virtual {v13, v2, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1396
    .line 1397
    .line 1398
    goto :goto_1a

    .line 1399
    :cond_3b
    move-object v13, v5

    .line 1400
    :goto_1a
    invoke-static {v1, v0, v13}, Lt1/a;->c(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    if-eqz v2, :cond_3c

    .line 1405
    .line 1406
    goto :goto_1c

    .line 1407
    :cond_3c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    const-string v2, "Unable to find a music thumbnail associated with \'"

    .line 1410
    .line 1411
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1425
    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    throw v1

    .line 1434
    :cond_3d
    :goto_1b
    invoke-virtual {v1, v0, v6}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v2

    .line 1438
    if-eqz v2, :cond_3e

    .line 1439
    .line 1440
    :goto_1c
    new-instance v4, LL2/i;

    .line 1441
    .line 1442
    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v5

    .line 1446
    invoke-static {v5}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v5

    .line 1450
    invoke-static {v5}, La/a;->j(Lq6/G;)Lq6/A;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v5

    .line 1454
    iget-object v3, v3, LU2/n;->f:Lq6/l;

    .line 1455
    .line 1456
    new-instance v6, LJ2/g;

    .line 1457
    .line 1458
    invoke-direct {v6, v2}, LJ2/g;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    .line 1459
    .line 1460
    .line 1461
    new-instance v2, LJ2/s;

    .line 1462
    .line 1463
    invoke-direct {v2, v5, v3, v6}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    invoke-direct {v4, v2, v0, v14}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 1471
    .line 1472
    .line 1473
    return-object v4

    .line 1474
    :cond_3e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1475
    .line 1476
    const-string v2, "Unable to open \'"

    .line 1477
    .line 1478
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1492
    .line 1493
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1498
    .line 1499
    .line 1500
    throw v1

    .line 1501
    :pswitch_4
    invoke-static {v15}, LI2/q;->g(LI2/B;)Ljava/util/List;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    check-cast v0, Ljava/lang/Iterable;

    .line 1506
    .line 1507
    invoke-static {v0}, Ln5/l;->i0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    move-object v4, v0

    .line 1512
    check-cast v4, Ljava/lang/Iterable;

    .line 1513
    .line 1514
    const/4 v8, 0x0

    .line 1515
    const/16 v9, 0x3e

    .line 1516
    .line 1517
    const-string v5, "/"

    .line 1518
    .line 1519
    const/4 v6, 0x0

    .line 1520
    const/4 v7, 0x0

    .line 1521
    invoke-static/range {v4 .. v9}, Ln5/l;->q0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;LB5/c;I)Ljava/lang/String;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    new-instance v1, LL2/i;

    .line 1526
    .line 1527
    iget-object v2, v3, LU2/n;->a:Landroid/content/Context;

    .line 1528
    .line 1529
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v2

    .line 1533
    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v2

    .line 1537
    invoke-static {v2}, La/a;->R(Ljava/io/InputStream;)Lq6/c;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    invoke-static {v2}, La/a;->j(Lq6/G;)Lq6/A;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    iget-object v3, v3, LU2/n;->f:Lq6/l;

    .line 1546
    .line 1547
    new-instance v4, LJ2/a;

    .line 1548
    .line 1549
    invoke-direct {v4, v0}, LJ2/a;-><init>(Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    new-instance v5, LJ2/s;

    .line 1553
    .line 1554
    invoke-direct {v5, v2, v3, v4}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v0}, LE3/h;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    invoke-direct {v1, v5, v0, v14}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 1562
    .line 1563
    .line 1564
    return-object v1

    .line 1565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
