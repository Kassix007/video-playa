.class public final LY3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY3/b;

.field public final b:LY3/b;

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LY3/b;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, LY3/b;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/16 v3, 0xff

    .line 14
    .line 15
    iput v3, v2, LY3/b;->y:I

    .line 16
    .line 17
    const/4 v3, -0x2

    .line 18
    iput v3, v2, LY3/b;->A:I

    .line 19
    .line 20
    iput v3, v2, LY3/b;->B:I

    .line 21
    .line 22
    iput v3, v2, LY3/b;->C:I

    .line 23
    .line 24
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    iput-object v3, v2, LY3/b;->J:Ljava/lang/Boolean;

    .line 27
    .line 28
    iput-object v2, v1, LY3/c;->b:LY3/b;

    .line 29
    .line 30
    iget v2, v0, LY3/b;->q:I

    .line 31
    .line 32
    const/4 v8, 0x2

    .line 33
    const/4 v9, 0x1

    .line 34
    const/4 v10, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    const-string v3, "badge"

    .line 38
    .line 39
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eq v5, v8, :cond_1

    .line 52
    .line 53
    if-ne v5, v9, :cond_0

    .line 54
    .line 55
    :cond_1
    if-ne v5, v8, :cond_3

    .line 56
    .line 57
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    invoke-static {v4}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 68
    .line 69
    .line 70
    move-result-object v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    invoke-interface {v2}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    move/from16 v17, v3

    .line 76
    .line 77
    move-object v3, v2

    .line 78
    move/from16 v2, v17

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto :goto_0

    .line 83
    :catch_1
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    :try_start_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 86
    .line 87
    new-instance v4, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v5, "Must have a <"

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v3, "> start tag"

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 114
    .line 115
    const-string v3, "No start tag found"

    .line 116
    .line 117
    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    :goto_0
    new-instance v3, Landroid/content/res/Resources$NotFoundException;

    .line 122
    .line 123
    new-instance v4, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v5, "Can\'t load badge resource ID #0x"

    .line 126
    .line 127
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v3, v2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    throw v3

    .line 148
    :cond_4
    const/4 v2, 0x0

    .line 149
    move-object v3, v2

    .line 150
    move v2, v10

    .line 151
    :goto_1
    if-nez v2, :cond_5

    .line 152
    .line 153
    const v2, 0x7f12040e

    .line 154
    .line 155
    .line 156
    :cond_5
    move v6, v2

    .line 157
    sget-object v4, LV3/a;->a:[I

    .line 158
    .line 159
    new-array v7, v10, [I

    .line 160
    .line 161
    const v5, 0x7f030059

    .line 162
    .line 163
    .line 164
    move-object/from16 v2, p1

    .line 165
    .line 166
    invoke-static/range {v2 .. v7}, Ll4/m;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    const/4 v5, 0x4

    .line 175
    const/4 v6, -0x1

    .line 176
    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    int-to-float v7, v7

    .line 181
    iput v7, v1, LY3/c;->c:F

    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    const v11, 0x7f06024d

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    iput v7, v1, LY3/c;->i:I

    .line 195
    .line 196
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    const v11, 0x7f060250

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    iput v7, v1, LY3/c;->j:I

    .line 208
    .line 209
    const/16 v7, 0xe

    .line 210
    .line 211
    invoke-virtual {v3, v7, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    int-to-float v11, v11

    .line 216
    iput v11, v1, LY3/c;->d:F

    .line 217
    .line 218
    const v11, 0x7f0600b7

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    const/16 v13, 0xc

    .line 226
    .line 227
    invoke-virtual {v3, v13, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    iput v12, v1, LY3/c;->e:F

    .line 232
    .line 233
    const/16 v12, 0x11

    .line 234
    .line 235
    const v14, 0x7f0600bb

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v14}, Landroid/content/res/Resources;->getDimension(I)F

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    invoke-virtual {v3, v12, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    iput v12, v1, LY3/c;->g:F

    .line 247
    .line 248
    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    const/4 v12, 0x3

    .line 253
    invoke-virtual {v3, v12, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    iput v11, v1, LY3/c;->f:F

    .line 258
    .line 259
    const/16 v11, 0xd

    .line 260
    .line 261
    invoke-virtual {v4, v14}, Landroid/content/res/Resources;->getDimension(I)F

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    invoke-virtual {v3, v11, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    iput v11, v1, LY3/c;->h:F

    .line 270
    .line 271
    const/16 v11, 0x18

    .line 272
    .line 273
    invoke-virtual {v3, v11, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    iput v11, v1, LY3/c;->k:I

    .line 278
    .line 279
    iget-object v11, v1, LY3/c;->b:LY3/b;

    .line 280
    .line 281
    iget v14, v0, LY3/b;->y:I

    .line 282
    .line 283
    const/4 v15, -0x2

    .line 284
    if-ne v14, v15, :cond_6

    .line 285
    .line 286
    const/16 v14, 0xff

    .line 287
    .line 288
    :cond_6
    iput v14, v11, LY3/b;->y:I

    .line 289
    .line 290
    iget v14, v0, LY3/b;->A:I

    .line 291
    .line 292
    if-eq v14, v15, :cond_7

    .line 293
    .line 294
    iput v14, v11, LY3/b;->A:I

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_7
    const/16 v11, 0x17

    .line 298
    .line 299
    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    if-eqz v14, :cond_8

    .line 304
    .line 305
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 306
    .line 307
    invoke-virtual {v3, v11, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    iput v11, v6, LY3/b;->A:I

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_8
    iget-object v11, v1, LY3/c;->b:LY3/b;

    .line 315
    .line 316
    iput v6, v11, LY3/b;->A:I

    .line 317
    .line 318
    :goto_2
    iget-object v6, v0, LY3/b;->z:Ljava/lang/String;

    .line 319
    .line 320
    const/4 v11, 0x7

    .line 321
    if-eqz v6, :cond_9

    .line 322
    .line 323
    iget-object v14, v1, LY3/c;->b:LY3/b;

    .line 324
    .line 325
    iput-object v6, v14, LY3/b;->z:Ljava/lang/String;

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_9
    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    if-eqz v6, :cond_a

    .line 333
    .line 334
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 335
    .line 336
    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v14

    .line 340
    iput-object v14, v6, LY3/b;->z:Ljava/lang/String;

    .line 341
    .line 342
    :cond_a
    :goto_3
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 343
    .line 344
    iget-object v14, v0, LY3/b;->E:Ljava/lang/CharSequence;

    .line 345
    .line 346
    iput-object v14, v6, LY3/b;->E:Ljava/lang/CharSequence;

    .line 347
    .line 348
    iget-object v14, v0, LY3/b;->F:Ljava/lang/CharSequence;

    .line 349
    .line 350
    if-nez v14, :cond_b

    .line 351
    .line 352
    const v14, 0x7f1100da

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    :cond_b
    iput-object v14, v6, LY3/b;->F:Ljava/lang/CharSequence;

    .line 360
    .line 361
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 362
    .line 363
    iget v14, v0, LY3/b;->G:I

    .line 364
    .line 365
    if-nez v14, :cond_c

    .line 366
    .line 367
    const/high16 v14, 0x7f0f0000

    .line 368
    .line 369
    :cond_c
    iput v14, v6, LY3/b;->G:I

    .line 370
    .line 371
    iget v14, v0, LY3/b;->H:I

    .line 372
    .line 373
    if-nez v14, :cond_d

    .line 374
    .line 375
    const v14, 0x7f1100e7

    .line 376
    .line 377
    .line 378
    :cond_d
    iput v14, v6, LY3/b;->H:I

    .line 379
    .line 380
    iget-object v14, v0, LY3/b;->J:Ljava/lang/Boolean;

    .line 381
    .line 382
    if-eqz v14, :cond_f

    .line 383
    .line 384
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    if-eqz v14, :cond_e

    .line 389
    .line 390
    goto :goto_4

    .line 391
    :cond_e
    move v14, v10

    .line 392
    goto :goto_5

    .line 393
    :cond_f
    :goto_4
    move v14, v9

    .line 394
    :goto_5
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    iput-object v14, v6, LY3/b;->J:Ljava/lang/Boolean;

    .line 399
    .line 400
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 401
    .line 402
    iget v14, v0, LY3/b;->B:I

    .line 403
    .line 404
    if-ne v14, v15, :cond_10

    .line 405
    .line 406
    const/16 v14, 0x15

    .line 407
    .line 408
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    :cond_10
    iput v14, v6, LY3/b;->B:I

    .line 413
    .line 414
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 415
    .line 416
    iget v14, v0, LY3/b;->C:I

    .line 417
    .line 418
    if-ne v14, v15, :cond_11

    .line 419
    .line 420
    const/16 v14, 0x16

    .line 421
    .line 422
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 423
    .line 424
    .line 425
    move-result v14

    .line 426
    :cond_11
    iput v14, v6, LY3/b;->C:I

    .line 427
    .line 428
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 429
    .line 430
    iget-object v14, v0, LY3/b;->u:Ljava/lang/Integer;

    .line 431
    .line 432
    const v15, 0x7f12017b

    .line 433
    .line 434
    .line 435
    const/4 v11, 0x5

    .line 436
    if-nez v14, :cond_12

    .line 437
    .line 438
    invoke-virtual {v3, v11, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    goto :goto_6

    .line 443
    :cond_12
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 444
    .line 445
    .line 446
    move-result v14

    .line 447
    :goto_6
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v14

    .line 451
    iput-object v14, v6, LY3/b;->u:Ljava/lang/Integer;

    .line 452
    .line 453
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 454
    .line 455
    iget-object v14, v0, LY3/b;->v:Ljava/lang/Integer;

    .line 456
    .line 457
    const/4 v7, 0x6

    .line 458
    if-nez v14, :cond_13

    .line 459
    .line 460
    invoke-virtual {v3, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 461
    .line 462
    .line 463
    move-result v14

    .line 464
    goto :goto_7

    .line 465
    :cond_13
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result v14

    .line 469
    :goto_7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v14

    .line 473
    iput-object v14, v6, LY3/b;->v:Ljava/lang/Integer;

    .line 474
    .line 475
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 476
    .line 477
    iget-object v14, v0, LY3/b;->w:Ljava/lang/Integer;

    .line 478
    .line 479
    if-nez v14, :cond_14

    .line 480
    .line 481
    const/16 v14, 0xf

    .line 482
    .line 483
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 484
    .line 485
    .line 486
    move-result v14

    .line 487
    goto :goto_8

    .line 488
    :cond_14
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    :goto_8
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    iput-object v14, v6, LY3/b;->w:Ljava/lang/Integer;

    .line 497
    .line 498
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 499
    .line 500
    iget-object v14, v0, LY3/b;->x:Ljava/lang/Integer;

    .line 501
    .line 502
    if-nez v14, :cond_15

    .line 503
    .line 504
    const/16 v14, 0x10

    .line 505
    .line 506
    invoke-virtual {v3, v14, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 507
    .line 508
    .line 509
    move-result v14

    .line 510
    goto :goto_9

    .line 511
    :cond_15
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v14

    .line 515
    :goto_9
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v14

    .line 519
    iput-object v14, v6, LY3/b;->x:Ljava/lang/Integer;

    .line 520
    .line 521
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 522
    .line 523
    iget-object v14, v0, LY3/b;->r:Ljava/lang/Integer;

    .line 524
    .line 525
    if-nez v14, :cond_16

    .line 526
    .line 527
    invoke-static {v2, v3, v9}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 528
    .line 529
    .line 530
    move-result-object v14

    .line 531
    invoke-virtual {v14}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 532
    .line 533
    .line 534
    move-result v14

    .line 535
    goto :goto_a

    .line 536
    :cond_16
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v14

    .line 540
    :goto_a
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v14

    .line 544
    iput-object v14, v6, LY3/b;->r:Ljava/lang/Integer;

    .line 545
    .line 546
    iget-object v6, v1, LY3/c;->b:LY3/b;

    .line 547
    .line 548
    iget-object v14, v0, LY3/b;->t:Ljava/lang/Integer;

    .line 549
    .line 550
    const/16 v15, 0x8

    .line 551
    .line 552
    if-nez v14, :cond_17

    .line 553
    .line 554
    const v14, 0x7f12020c

    .line 555
    .line 556
    .line 557
    invoke-virtual {v3, v15, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 558
    .line 559
    .line 560
    move-result v14

    .line 561
    goto :goto_b

    .line 562
    :cond_17
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 563
    .line 564
    .line 565
    move-result v14

    .line 566
    :goto_b
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v14

    .line 570
    iput-object v14, v6, LY3/b;->t:Ljava/lang/Integer;

    .line 571
    .line 572
    iget-object v6, v0, LY3/b;->s:Ljava/lang/Integer;

    .line 573
    .line 574
    if-eqz v6, :cond_18

    .line 575
    .line 576
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 577
    .line 578
    iput-object v6, v2, LY3/b;->s:Ljava/lang/Integer;

    .line 579
    .line 580
    goto/16 :goto_d

    .line 581
    .line 582
    :cond_18
    const/16 v6, 0x9

    .line 583
    .line 584
    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 585
    .line 586
    .line 587
    move-result v16

    .line 588
    if-eqz v16, :cond_19

    .line 589
    .line 590
    iget-object v5, v1, LY3/c;->b:LY3/b;

    .line 591
    .line 592
    invoke-static {v2, v3, v6}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    iput-object v2, v5, LY3/b;->s:Ljava/lang/Integer;

    .line 605
    .line 606
    goto :goto_d

    .line 607
    :cond_19
    iget-object v14, v1, LY3/c;->b:LY3/b;

    .line 608
    .line 609
    iget-object v14, v14, LY3/b;->t:Ljava/lang/Integer;

    .line 610
    .line 611
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 612
    .line 613
    .line 614
    move-result v14

    .line 615
    sget-object v6, LV3/a;->D:[I

    .line 616
    .line 617
    invoke-virtual {v2, v14, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    const/4 v15, 0x0

    .line 622
    invoke-virtual {v6, v10, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 623
    .line 624
    .line 625
    invoke-static {v2, v6, v12}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 626
    .line 627
    .line 628
    move-result-object v12

    .line 629
    invoke-static {v2, v6, v5}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 630
    .line 631
    .line 632
    invoke-static {v2, v6, v11}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v6, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 639
    .line 640
    .line 641
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 642
    .line 643
    .line 644
    move-result v5

    .line 645
    if-eqz v5, :cond_1a

    .line 646
    .line 647
    goto :goto_c

    .line 648
    :cond_1a
    const/16 v13, 0xa

    .line 649
    .line 650
    :goto_c
    invoke-virtual {v6, v13, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 651
    .line 652
    .line 653
    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    const/16 v5, 0xe

    .line 657
    .line 658
    invoke-virtual {v6, v5, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 659
    .line 660
    .line 661
    invoke-static {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/I1;->Z(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 662
    .line 663
    .line 664
    const/4 v5, 0x7

    .line 665
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 666
    .line 667
    .line 668
    const/16 v5, 0x8

    .line 669
    .line 670
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 671
    .line 672
    .line 673
    const/16 v5, 0x9

    .line 674
    .line 675
    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 676
    .line 677
    .line 678
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 679
    .line 680
    .line 681
    sget-object v5, LV3/a;->t:[I

    .line 682
    .line 683
    invoke-virtual {v2, v14, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v10, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 694
    .line 695
    .line 696
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 697
    .line 698
    invoke-virtual {v12}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    iput-object v5, v2, LY3/b;->s:Ljava/lang/Integer;

    .line 707
    .line 708
    :goto_d
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 709
    .line 710
    iget-object v5, v0, LY3/b;->I:Ljava/lang/Integer;

    .line 711
    .line 712
    if-nez v5, :cond_1b

    .line 713
    .line 714
    const v5, 0x800035

    .line 715
    .line 716
    .line 717
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 718
    .line 719
    .line 720
    move-result v5

    .line 721
    goto :goto_e

    .line 722
    :cond_1b
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    :goto_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    iput-object v5, v2, LY3/b;->I:Ljava/lang/Integer;

    .line 731
    .line 732
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 733
    .line 734
    iget-object v5, v0, LY3/b;->K:Ljava/lang/Integer;

    .line 735
    .line 736
    if-nez v5, :cond_1c

    .line 737
    .line 738
    const v5, 0x7f06024e

    .line 739
    .line 740
    .line 741
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    const/16 v6, 0xb

    .line 746
    .line 747
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    goto :goto_f

    .line 752
    :cond_1c
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    :goto_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    iput-object v5, v2, LY3/b;->K:Ljava/lang/Integer;

    .line 761
    .line 762
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 763
    .line 764
    iget-object v5, v0, LY3/b;->L:Ljava/lang/Integer;

    .line 765
    .line 766
    if-nez v5, :cond_1d

    .line 767
    .line 768
    const v5, 0x7f0600bd

    .line 769
    .line 770
    .line 771
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 772
    .line 773
    .line 774
    move-result v4

    .line 775
    const/16 v5, 0xa

    .line 776
    .line 777
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    goto :goto_10

    .line 782
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    :goto_10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    iput-object v4, v2, LY3/b;->L:Ljava/lang/Integer;

    .line 791
    .line 792
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 793
    .line 794
    iget-object v4, v0, LY3/b;->M:Ljava/lang/Integer;

    .line 795
    .line 796
    if-nez v4, :cond_1e

    .line 797
    .line 798
    const/16 v4, 0x12

    .line 799
    .line 800
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 801
    .line 802
    .line 803
    move-result v4

    .line 804
    goto :goto_11

    .line 805
    :cond_1e
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 806
    .line 807
    .line 808
    move-result v4

    .line 809
    :goto_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    move-result-object v4

    .line 813
    iput-object v4, v2, LY3/b;->M:Ljava/lang/Integer;

    .line 814
    .line 815
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 816
    .line 817
    iget-object v4, v0, LY3/b;->N:Ljava/lang/Integer;

    .line 818
    .line 819
    if-nez v4, :cond_1f

    .line 820
    .line 821
    const/16 v4, 0x19

    .line 822
    .line 823
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 824
    .line 825
    .line 826
    move-result v4

    .line 827
    goto :goto_12

    .line 828
    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 829
    .line 830
    .line 831
    move-result v4

    .line 832
    :goto_12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    iput-object v4, v2, LY3/b;->N:Ljava/lang/Integer;

    .line 837
    .line 838
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 839
    .line 840
    iget-object v4, v0, LY3/b;->O:Ljava/lang/Integer;

    .line 841
    .line 842
    if-nez v4, :cond_20

    .line 843
    .line 844
    iget-object v4, v2, LY3/b;->M:Ljava/lang/Integer;

    .line 845
    .line 846
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    const/16 v5, 0x13

    .line 851
    .line 852
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    goto :goto_13

    .line 857
    :cond_20
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    :goto_13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    iput-object v4, v2, LY3/b;->O:Ljava/lang/Integer;

    .line 866
    .line 867
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 868
    .line 869
    iget-object v4, v0, LY3/b;->P:Ljava/lang/Integer;

    .line 870
    .line 871
    if-nez v4, :cond_21

    .line 872
    .line 873
    iget-object v4, v2, LY3/b;->N:Ljava/lang/Integer;

    .line 874
    .line 875
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    const/16 v5, 0x1a

    .line 880
    .line 881
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 882
    .line 883
    .line 884
    move-result v4

    .line 885
    goto :goto_14

    .line 886
    :cond_21
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 887
    .line 888
    .line 889
    move-result v4

    .line 890
    :goto_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    iput-object v4, v2, LY3/b;->P:Ljava/lang/Integer;

    .line 895
    .line 896
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 897
    .line 898
    iget-object v4, v0, LY3/b;->S:Ljava/lang/Integer;

    .line 899
    .line 900
    if-nez v4, :cond_22

    .line 901
    .line 902
    const/16 v4, 0x14

    .line 903
    .line 904
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    goto :goto_15

    .line 909
    :cond_22
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 910
    .line 911
    .line 912
    move-result v4

    .line 913
    :goto_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    iput-object v4, v2, LY3/b;->S:Ljava/lang/Integer;

    .line 918
    .line 919
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 920
    .line 921
    iget-object v4, v0, LY3/b;->Q:Ljava/lang/Integer;

    .line 922
    .line 923
    if-nez v4, :cond_23

    .line 924
    .line 925
    move v4, v10

    .line 926
    goto :goto_16

    .line 927
    :cond_23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 928
    .line 929
    .line 930
    move-result v4

    .line 931
    :goto_16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    iput-object v4, v2, LY3/b;->Q:Ljava/lang/Integer;

    .line 936
    .line 937
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 938
    .line 939
    iget-object v4, v0, LY3/b;->R:Ljava/lang/Integer;

    .line 940
    .line 941
    if-nez v4, :cond_24

    .line 942
    .line 943
    move v4, v10

    .line 944
    goto :goto_17

    .line 945
    :cond_24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    :goto_17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 950
    .line 951
    .line 952
    move-result-object v4

    .line 953
    iput-object v4, v2, LY3/b;->R:Ljava/lang/Integer;

    .line 954
    .line 955
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 956
    .line 957
    iget-object v4, v0, LY3/b;->T:Ljava/lang/Boolean;

    .line 958
    .line 959
    if-nez v4, :cond_25

    .line 960
    .line 961
    invoke-virtual {v3, v10, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 962
    .line 963
    .line 964
    move-result v4

    .line 965
    goto :goto_18

    .line 966
    :cond_25
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 967
    .line 968
    .line 969
    move-result v4

    .line 970
    :goto_18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    iput-object v4, v2, LY3/b;->T:Ljava/lang/Boolean;

    .line 975
    .line 976
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 977
    .line 978
    .line 979
    iget-object v2, v0, LY3/b;->D:Ljava/util/Locale;

    .line 980
    .line 981
    if-nez v2, :cond_26

    .line 982
    .line 983
    iget-object v2, v1, LY3/c;->b:LY3/b;

    .line 984
    .line 985
    sget-object v3, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    .line 986
    .line 987
    invoke-static {v3}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 988
    .line 989
    .line 990
    move-result-object v3

    .line 991
    iput-object v3, v2, LY3/b;->D:Ljava/util/Locale;

    .line 992
    .line 993
    goto :goto_19

    .line 994
    :cond_26
    iget-object v3, v1, LY3/c;->b:LY3/b;

    .line 995
    .line 996
    iput-object v2, v3, LY3/b;->D:Ljava/util/Locale;

    .line 997
    .line 998
    :goto_19
    iput-object v0, v1, LY3/c;->a:LY3/b;

    .line 999
    .line 1000
    return-void
.end method
