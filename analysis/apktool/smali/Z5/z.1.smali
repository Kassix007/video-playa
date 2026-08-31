.class public final LZ5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:LZ5/z;

.field public static final b:LZ5/U;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LZ5/z;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ5/z;->a:LZ5/z;

    .line 7
    .line 8
    new-instance v0, LZ5/U;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, LX5/d;->k:LX5/d;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, LZ5/U;-><init>(Ljava/lang/String;LX5/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LZ5/z;->b:LZ5/U;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, LZ5/z;->b:LZ5/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 23

    .line 1
    sget-object v0, LK5/d;->s:LK5/d;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, LY5/b;->w()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "input"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, LK5/g;

    .line 19
    .line 20
    const-string v2, "An empty string is not a valid Instant"

    .line 21
    .line 22
    invoke-direct {v1, v2, v0}, LK5/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_16

    .line 26
    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0x20

    .line 33
    .line 34
    const/16 v4, 0x2b

    .line 35
    .line 36
    const/16 v5, 0x2d

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    if-eq v2, v4, :cond_1

    .line 40
    .line 41
    if-eq v2, v5, :cond_1

    .line 42
    .line 43
    move v7, v1

    .line 44
    move v2, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v7, v6

    .line 47
    :goto_0
    move v9, v1

    .line 48
    move v8, v7

    .line 49
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const/16 v11, 0x3a

    .line 54
    .line 55
    const/16 v12, 0x30

    .line 56
    .line 57
    if-ge v8, v10, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-gt v12, v10, :cond_2

    .line 64
    .line 65
    if-ge v10, v11, :cond_2

    .line 66
    .line 67
    mul-int/lit8 v9, v9, 0xa

    .line 68
    .line 69
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    sub-int/2addr v10, v12

    .line 74
    add-int/2addr v9, v10

    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sub-int v10, v8, v7

    .line 79
    .line 80
    const-string v13, " digits"

    .line 81
    .line 82
    const/16 v14, 0xa

    .line 83
    .line 84
    if-le v10, v14, :cond_3

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto/16 :goto_16

    .line 108
    .line 109
    :cond_3
    if-ne v10, v14, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    const/16 v15, 0x32

    .line 116
    .line 117
    invoke-static {v7, v15}, Lkotlin/jvm/internal/m;->f(II)I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-ltz v7, :cond_4

    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 126
    .line 127
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto/16 :goto_16

    .line 145
    .line 146
    :cond_4
    const/4 v7, 0x4

    .line 147
    if-ge v10, v7, :cond_5

    .line 148
    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 152
    .line 153
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    goto/16 :goto_16

    .line 171
    .line 172
    :cond_5
    if-ne v2, v4, :cond_6

    .line 173
    .line 174
    if-ne v10, v7, :cond_6

    .line 175
    .line 176
    const-string v1, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 177
    .line 178
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    goto/16 :goto_16

    .line 183
    .line 184
    :cond_6
    if-ne v2, v3, :cond_7

    .line 185
    .line 186
    if-eq v10, v7, :cond_7

    .line 187
    .line 188
    const-string v1, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 189
    .line 190
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto/16 :goto_16

    .line 195
    .line 196
    :cond_7
    if-ne v2, v5, :cond_8

    .line 197
    .line 198
    neg-int v9, v9

    .line 199
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    add-int/lit8 v3, v8, 0x10

    .line 204
    .line 205
    if-ge v2, v3, :cond_9

    .line 206
    .line 207
    const-string v1, "The input string is too short"

    .line 208
    .line 209
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    goto/16 :goto_16

    .line 214
    .line 215
    :cond_9
    new-instance v2, LI5/m;

    .line 216
    .line 217
    const/4 v10, 0x2

    .line 218
    invoke-direct {v2, v10}, LI5/m;-><init>(I)V

    .line 219
    .line 220
    .line 221
    const-string v15, "\'-\'"

    .line 222
    .line 223
    invoke-static {v0, v15, v8, v2}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    if-eqz v2, :cond_a

    .line 228
    .line 229
    :goto_2
    move-object v1, v2

    .line 230
    goto/16 :goto_16

    .line 231
    .line 232
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 233
    .line 234
    new-instance v1, LI5/m;

    .line 235
    .line 236
    const/4 v10, 0x3

    .line 237
    invoke-direct {v1, v10}, LI5/m;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v15, v2, v1}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    if-eqz v1, :cond_b

    .line 245
    .line 246
    goto/16 :goto_16

    .line 247
    .line 248
    :cond_b
    add-int/lit8 v1, v8, 0x6

    .line 249
    .line 250
    new-instance v2, LI5/m;

    .line 251
    .line 252
    invoke-direct {v2, v7}, LI5/m;-><init>(I)V

    .line 253
    .line 254
    .line 255
    const-string v15, "\'T\' or \'t\'"

    .line 256
    .line 257
    invoke-static {v0, v15, v1, v2}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-eqz v1, :cond_c

    .line 262
    .line 263
    goto/16 :goto_16

    .line 264
    .line 265
    :cond_c
    add-int/lit8 v1, v8, 0x9

    .line 266
    .line 267
    new-instance v2, LI5/m;

    .line 268
    .line 269
    const/4 v15, 0x5

    .line 270
    invoke-direct {v2, v15}, LI5/m;-><init>(I)V

    .line 271
    .line 272
    .line 273
    const-string v15, "\':\'"

    .line 274
    .line 275
    invoke-static {v0, v15, v1, v2}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    goto/16 :goto_16

    .line 282
    .line 283
    :cond_d
    add-int/lit8 v1, v8, 0xc

    .line 284
    .line 285
    new-instance v2, LI5/m;

    .line 286
    .line 287
    const/4 v7, 0x6

    .line 288
    invoke-direct {v2, v7}, LI5/m;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v15, v1, v2}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_e

    .line 296
    .line 297
    goto/16 :goto_16

    .line 298
    .line 299
    :cond_e
    const/4 v1, 0x0

    .line 300
    :goto_3
    if-ge v1, v14, :cond_10

    .line 301
    .line 302
    sget-object v2, LK5/f;->b:[I

    .line 303
    .line 304
    aget v2, v2, v1

    .line 305
    .line 306
    add-int/2addr v2, v8

    .line 307
    new-instance v15, LI5/m;

    .line 308
    .line 309
    const/4 v10, 0x7

    .line 310
    invoke-direct {v15, v10}, LI5/m;-><init>(I)V

    .line 311
    .line 312
    .line 313
    const-string v10, "an ASCII digit"

    .line 314
    .line 315
    invoke-static {v0, v10, v2, v15}, LK5/f;->g(Ljava/lang/String;Ljava/lang/String;ILB5/c;)LK5/g;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    if-eqz v2, :cond_f

    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 323
    .line 324
    const/4 v10, 0x3

    .line 325
    goto :goto_3

    .line 326
    :cond_10
    add-int/lit8 v1, v8, 0x1

    .line 327
    .line 328
    invoke-static {v1, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    add-int/lit8 v2, v8, 0x4

    .line 333
    .line 334
    invoke-static {v2, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    add-int/lit8 v10, v8, 0x7

    .line 339
    .line 340
    invoke-static {v10, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    add-int/lit8 v15, v8, 0xa

    .line 345
    .line 346
    invoke-static {v15, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    add-int/lit8 v7, v8, 0xd

    .line 351
    .line 352
    invoke-static {v7, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    add-int/lit8 v8, v8, 0xf

    .line 357
    .line 358
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    const/16 v4, 0x2e

    .line 363
    .line 364
    const/16 v14, 0x9

    .line 365
    .line 366
    if-ne v5, v4, :cond_13

    .line 367
    .line 368
    move v8, v3

    .line 369
    const/4 v4, 0x0

    .line 370
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-ge v8, v5, :cond_11

    .line 375
    .line 376
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    if-gt v12, v5, :cond_11

    .line 381
    .line 382
    if-ge v5, v11, :cond_11

    .line 383
    .line 384
    mul-int/lit8 v4, v4, 0xa

    .line 385
    .line 386
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    sub-int/2addr v5, v12

    .line 391
    add-int/2addr v4, v5

    .line 392
    add-int/lit8 v8, v8, 0x1

    .line 393
    .line 394
    goto :goto_4

    .line 395
    :cond_11
    sub-int v3, v8, v3

    .line 396
    .line 397
    if-gt v6, v3, :cond_12

    .line 398
    .line 399
    const/16 v5, 0xa

    .line 400
    .line 401
    if-ge v3, v5, :cond_12

    .line 402
    .line 403
    sget-object v5, LK5/f;->a:[I

    .line 404
    .line 405
    rsub-int/lit8 v3, v3, 0x9

    .line 406
    .line 407
    aget v3, v5, v3

    .line 408
    .line 409
    mul-int/2addr v4, v3

    .line 410
    goto :goto_5

    .line 411
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 414
    .line 415
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    goto/16 :goto_16

    .line 433
    .line 434
    :cond_13
    const/4 v4, 0x0

    .line 435
    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-lt v8, v3, :cond_14

    .line 440
    .line 441
    const-string v1, "The UTC offset at the end of the string is missing"

    .line 442
    .line 443
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    goto/16 :goto_16

    .line 448
    .line 449
    :cond_14
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    const/16 v5, 0x27

    .line 454
    .line 455
    const-string v13, ", got \'"

    .line 456
    .line 457
    move/from16 v21, v6

    .line 458
    .line 459
    const/16 v6, 0x2b

    .line 460
    .line 461
    if-eq v3, v6, :cond_17

    .line 462
    .line 463
    const/16 v6, 0x2d

    .line 464
    .line 465
    if-eq v3, v6, :cond_17

    .line 466
    .line 467
    const/16 v6, 0x5a

    .line 468
    .line 469
    if-eq v3, v6, :cond_15

    .line 470
    .line 471
    const/16 v6, 0x7a

    .line 472
    .line 473
    if-eq v3, v6, :cond_15

    .line 474
    .line 475
    new-instance v1, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v2, "Expected the UTC offset at position "

    .line 478
    .line 479
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    goto/16 :goto_16

    .line 503
    .line 504
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    add-int/lit8 v8, v8, 0x1

    .line 509
    .line 510
    if-ne v3, v8, :cond_16

    .line 511
    .line 512
    const/4 v11, 0x0

    .line 513
    :goto_6
    move/from16 v3, v21

    .line 514
    .line 515
    goto/16 :goto_10

    .line 516
    .line 517
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v2, "Extra text after the instant at position "

    .line 520
    .line 521
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    goto/16 :goto_16

    .line 536
    .line 537
    :cond_17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    sub-int/2addr v6, v8

    .line 542
    if-le v6, v14, :cond_18

    .line 543
    .line 544
    new-instance v1, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v2, "The UTC offset string \""

    .line 547
    .line 548
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const/16 v3, 0x10

    .line 564
    .line 565
    invoke-static {v3, v2}, LK5/f;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    const-string v2, "\" is too long"

    .line 573
    .line 574
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    goto/16 :goto_16

    .line 586
    .line 587
    :cond_18
    rem-int/lit8 v20, v6, 0x3

    .line 588
    .line 589
    if-eqz v20, :cond_19

    .line 590
    .line 591
    new-instance v1, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    const-string v2, "Invalid UTC offset string \""

    .line 594
    .line 595
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    const/16 v2, 0x22

    .line 614
    .line 615
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    goto/16 :goto_16

    .line 627
    .line 628
    :cond_19
    const/4 v14, 0x0

    .line 629
    :goto_7
    const/4 v12, 0x2

    .line 630
    if-ge v14, v12, :cond_1c

    .line 631
    .line 632
    sget-object v12, LK5/f;->c:[I

    .line 633
    .line 634
    aget v12, v12, v14

    .line 635
    .line 636
    add-int/2addr v12, v8

    .line 637
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 638
    .line 639
    .line 640
    move-result v5

    .line 641
    if-lt v12, v5, :cond_1a

    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_1a
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 645
    .line 646
    .line 647
    move-result v5

    .line 648
    if-eq v5, v11, :cond_1b

    .line 649
    .line 650
    const-string v1, "Expected \':\' at index "

    .line 651
    .line 652
    invoke-static {v1, v13, v12}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    const/16 v2, 0x27

    .line 664
    .line 665
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    goto/16 :goto_16

    .line 677
    .line 678
    :cond_1b
    add-int/lit8 v14, v14, 0x1

    .line 679
    .line 680
    const/16 v5, 0x27

    .line 681
    .line 682
    goto :goto_7

    .line 683
    :cond_1c
    :goto_8
    const/4 v5, 0x0

    .line 684
    :goto_9
    const/4 v12, 0x6

    .line 685
    if-ge v5, v12, :cond_1f

    .line 686
    .line 687
    sget-object v12, LK5/f;->d:[I

    .line 688
    .line 689
    aget v12, v12, v5

    .line 690
    .line 691
    add-int/2addr v12, v8

    .line 692
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 693
    .line 694
    .line 695
    move-result v14

    .line 696
    if-lt v12, v14, :cond_1d

    .line 697
    .line 698
    goto :goto_a

    .line 699
    :cond_1d
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 700
    .line 701
    .line 702
    move-result v14

    .line 703
    move/from16 v22, v5

    .line 704
    .line 705
    const/16 v5, 0x30

    .line 706
    .line 707
    if-gt v5, v14, :cond_1e

    .line 708
    .line 709
    if-ge v14, v11, :cond_1e

    .line 710
    .line 711
    add-int/lit8 v12, v22, 0x1

    .line 712
    .line 713
    move v5, v12

    .line 714
    goto :goto_9

    .line 715
    :cond_1e
    const-string v1, "Expected an ASCII digit at index "

    .line 716
    .line 717
    invoke-static {v1, v13, v12}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    const/16 v2, 0x27

    .line 729
    .line 730
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    goto/16 :goto_16

    .line 742
    .line 743
    :cond_1f
    :goto_a
    add-int/lit8 v5, v8, 0x1

    .line 744
    .line 745
    invoke-static {v5, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    const/4 v11, 0x3

    .line 750
    if-le v6, v11, :cond_20

    .line 751
    .line 752
    add-int/lit8 v11, v8, 0x4

    .line 753
    .line 754
    invoke-static {v11, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 755
    .line 756
    .line 757
    move-result v11

    .line 758
    :goto_b
    const/4 v12, 0x6

    .line 759
    goto :goto_c

    .line 760
    :cond_20
    const/4 v11, 0x0

    .line 761
    goto :goto_b

    .line 762
    :goto_c
    if-le v6, v12, :cond_21

    .line 763
    .line 764
    add-int/lit8 v6, v8, 0x7

    .line 765
    .line 766
    invoke-static {v6, v0}, LK5/f;->i(ILjava/lang/String;)I

    .line 767
    .line 768
    .line 769
    move-result v6

    .line 770
    :goto_d
    const/16 v12, 0x3b

    .line 771
    .line 772
    goto :goto_e

    .line 773
    :cond_21
    const/4 v6, 0x0

    .line 774
    goto :goto_d

    .line 775
    :goto_e
    if-le v11, v12, :cond_22

    .line 776
    .line 777
    new-instance v1, Ljava/lang/StringBuilder;

    .line 778
    .line 779
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 780
    .line 781
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    goto/16 :goto_16

    .line 796
    .line 797
    :cond_22
    if-le v6, v12, :cond_23

    .line 798
    .line 799
    new-instance v1, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 802
    .line 803
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    goto/16 :goto_16

    .line 818
    .line 819
    :cond_23
    const/16 v12, 0x11

    .line 820
    .line 821
    if-le v5, v12, :cond_25

    .line 822
    .line 823
    const/16 v12, 0x12

    .line 824
    .line 825
    if-ne v5, v12, :cond_24

    .line 826
    .line 827
    if-nez v11, :cond_24

    .line 828
    .line 829
    if-eqz v6, :cond_25

    .line 830
    .line 831
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 834
    .line 835
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 839
    .line 840
    .line 841
    move-result v2

    .line 842
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    goto/16 :goto_16

    .line 862
    .line 863
    :cond_25
    mul-int/lit16 v5, v5, 0xe10

    .line 864
    .line 865
    mul-int/lit8 v11, v11, 0x3c

    .line 866
    .line 867
    add-int/2addr v11, v5

    .line 868
    add-int/2addr v11, v6

    .line 869
    const/16 v6, 0x2d

    .line 870
    .line 871
    if-ne v3, v6, :cond_26

    .line 872
    .line 873
    const/4 v3, -0x1

    .line 874
    goto :goto_f

    .line 875
    :cond_26
    move/from16 v3, v21

    .line 876
    .line 877
    :goto_f
    mul-int/2addr v11, v3

    .line 878
    goto/16 :goto_6

    .line 879
    .line 880
    :goto_10
    if-gt v3, v1, :cond_34

    .line 881
    .line 882
    const/16 v5, 0xd

    .line 883
    .line 884
    if-ge v1, v5, :cond_34

    .line 885
    .line 886
    if-gt v3, v2, :cond_33

    .line 887
    .line 888
    and-int/lit8 v3, v9, 0x3

    .line 889
    .line 890
    if-nez v3, :cond_28

    .line 891
    .line 892
    rem-int/lit8 v5, v9, 0x64

    .line 893
    .line 894
    if-nez v5, :cond_27

    .line 895
    .line 896
    rem-int/lit16 v5, v9, 0x190

    .line 897
    .line 898
    if-nez v5, :cond_28

    .line 899
    .line 900
    :cond_27
    const/4 v5, 0x1

    .line 901
    :goto_11
    const/4 v12, 0x2

    .line 902
    goto :goto_12

    .line 903
    :cond_28
    const/4 v5, 0x0

    .line 904
    goto :goto_11

    .line 905
    :goto_12
    if-eq v1, v12, :cond_2a

    .line 906
    .line 907
    const/4 v6, 0x4

    .line 908
    if-eq v1, v6, :cond_29

    .line 909
    .line 910
    const/4 v12, 0x6

    .line 911
    if-eq v1, v12, :cond_29

    .line 912
    .line 913
    const/16 v5, 0x9

    .line 914
    .line 915
    if-eq v1, v5, :cond_29

    .line 916
    .line 917
    const/16 v5, 0xb

    .line 918
    .line 919
    if-eq v1, v5, :cond_29

    .line 920
    .line 921
    const/16 v5, 0x1f

    .line 922
    .line 923
    goto :goto_13

    .line 924
    :cond_29
    const/16 v5, 0x1e

    .line 925
    .line 926
    goto :goto_13

    .line 927
    :cond_2a
    if-eqz v5, :cond_2b

    .line 928
    .line 929
    const/16 v5, 0x1d

    .line 930
    .line 931
    goto :goto_13

    .line 932
    :cond_2b
    const/16 v5, 0x1c

    .line 933
    .line 934
    :goto_13
    if-gt v2, v5, :cond_33

    .line 935
    .line 936
    const/16 v5, 0x17

    .line 937
    .line 938
    if-le v10, v5, :cond_2c

    .line 939
    .line 940
    new-instance v1, Ljava/lang/StringBuilder;

    .line 941
    .line 942
    const-string v2, "Expected hour in 0..23, got "

    .line 943
    .line 944
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    goto/16 :goto_16

    .line 959
    .line 960
    :cond_2c
    const/16 v12, 0x3b

    .line 961
    .line 962
    if-le v15, v12, :cond_2d

    .line 963
    .line 964
    new-instance v1, Ljava/lang/StringBuilder;

    .line 965
    .line 966
    const-string v2, "Expected minute-of-hour in 0..59, got "

    .line 967
    .line 968
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    goto/16 :goto_16

    .line 983
    .line 984
    :cond_2d
    if-le v7, v12, :cond_2e

    .line 985
    .line 986
    new-instance v1, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 989
    .line 990
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    goto/16 :goto_16

    .line 1005
    .line 1006
    :cond_2e
    int-to-long v5, v9

    .line 1007
    const/16 v0, 0x16d

    .line 1008
    .line 1009
    int-to-long v12, v0

    .line 1010
    mul-long/2addr v12, v5

    .line 1011
    const-wide/16 v18, 0x0

    .line 1012
    .line 1013
    cmp-long v0, v5, v18

    .line 1014
    .line 1015
    if-ltz v0, :cond_2f

    .line 1016
    .line 1017
    move/from16 p1, v9

    .line 1018
    .line 1019
    const/4 v0, 0x3

    .line 1020
    int-to-long v8, v0

    .line 1021
    add-long/2addr v8, v5

    .line 1022
    move/from16 v16, v15

    .line 1023
    .line 1024
    const/4 v0, 0x4

    .line 1025
    int-to-long v14, v0

    .line 1026
    div-long/2addr v8, v14

    .line 1027
    const/16 v0, 0x63

    .line 1028
    .line 1029
    int-to-long v14, v0

    .line 1030
    add-long/2addr v14, v5

    .line 1031
    const/16 v0, 0x64

    .line 1032
    .line 1033
    move-wide/from16 v18, v5

    .line 1034
    .line 1035
    int-to-long v5, v0

    .line 1036
    div-long/2addr v14, v5

    .line 1037
    sub-long/2addr v8, v14

    .line 1038
    const/16 v0, 0x18f

    .line 1039
    .line 1040
    int-to-long v5, v0

    .line 1041
    add-long v5, v18, v5

    .line 1042
    .line 1043
    move-wide/from16 v17, v5

    .line 1044
    .line 1045
    const/16 v14, 0x190

    .line 1046
    .line 1047
    int-to-long v5, v14

    .line 1048
    div-long v5, v17, v5

    .line 1049
    .line 1050
    add-long/2addr v5, v8

    .line 1051
    add-long/2addr v5, v12

    .line 1052
    goto :goto_14

    .line 1053
    :cond_2f
    move-wide/from16 v18, v5

    .line 1054
    .line 1055
    move/from16 p1, v9

    .line 1056
    .line 1057
    move/from16 v16, v15

    .line 1058
    .line 1059
    const/4 v0, -0x4

    .line 1060
    int-to-long v5, v0

    .line 1061
    div-long v5, v18, v5

    .line 1062
    .line 1063
    const/16 v0, -0x64

    .line 1064
    .line 1065
    int-to-long v8, v0

    .line 1066
    div-long v8, v18, v8

    .line 1067
    .line 1068
    sub-long/2addr v5, v8

    .line 1069
    const/16 v0, -0x190

    .line 1070
    .line 1071
    int-to-long v8, v0

    .line 1072
    div-long v8, v18, v8

    .line 1073
    .line 1074
    add-long/2addr v8, v5

    .line 1075
    sub-long v5, v12, v8

    .line 1076
    .line 1077
    :goto_14
    mul-int/lit16 v0, v1, 0x16f

    .line 1078
    .line 1079
    add-int/lit16 v0, v0, -0x16a

    .line 1080
    .line 1081
    div-int/lit8 v0, v0, 0xc

    .line 1082
    .line 1083
    int-to-long v8, v0

    .line 1084
    add-long/2addr v5, v8

    .line 1085
    const/16 v21, 0x1

    .line 1086
    .line 1087
    add-int/lit8 v2, v2, -0x1

    .line 1088
    .line 1089
    int-to-long v8, v2

    .line 1090
    add-long/2addr v5, v8

    .line 1091
    const/4 v12, 0x2

    .line 1092
    if-le v1, v12, :cond_32

    .line 1093
    .line 1094
    const-wide/16 v0, -0x1

    .line 1095
    .line 1096
    add-long/2addr v0, v5

    .line 1097
    if-nez v3, :cond_31

    .line 1098
    .line 1099
    rem-int/lit8 v9, p1, 0x64

    .line 1100
    .line 1101
    if-nez v9, :cond_30

    .line 1102
    .line 1103
    move/from16 v9, p1

    .line 1104
    .line 1105
    const/16 v14, 0x190

    .line 1106
    .line 1107
    rem-int/2addr v9, v14

    .line 1108
    if-nez v9, :cond_31

    .line 1109
    .line 1110
    :cond_30
    move-wide v5, v0

    .line 1111
    goto :goto_15

    .line 1112
    :cond_31
    const-wide/16 v0, -0x2

    .line 1113
    .line 1114
    add-long/2addr v5, v0

    .line 1115
    :cond_32
    :goto_15
    const v0, 0xafaa8

    .line 1116
    .line 1117
    .line 1118
    int-to-long v0, v0

    .line 1119
    sub-long/2addr v5, v0

    .line 1120
    mul-int/lit16 v10, v10, 0xe10

    .line 1121
    .line 1122
    mul-int/lit8 v15, v16, 0x3c

    .line 1123
    .line 1124
    add-int/2addr v15, v10

    .line 1125
    add-int/2addr v15, v7

    .line 1126
    const v0, 0x15180

    .line 1127
    .line 1128
    .line 1129
    int-to-long v0, v0

    .line 1130
    mul-long/2addr v5, v0

    .line 1131
    int-to-long v0, v15

    .line 1132
    add-long/2addr v5, v0

    .line 1133
    int-to-long v0, v11

    .line 1134
    sub-long/2addr v5, v0

    .line 1135
    new-instance v1, LK5/h;

    .line 1136
    .line 1137
    invoke-direct {v1, v5, v6, v4}, LK5/h;-><init>(JI)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_16

    .line 1141
    :cond_33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    const-string v4, "Expected a valid day-of-month for month "

    .line 1144
    .line 1145
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    .line 1151
    const-string v1, " of year "

    .line 1152
    .line 1153
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    .line 1159
    const-string v1, ", got "

    .line 1160
    .line 1161
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    goto :goto_16

    .line 1176
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1177
    .line 1178
    const-string v3, "Expected a month number in 1..12, got "

    .line 1179
    .line 1180
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    invoke-static {v0, v1}, LK5/f;->h(Ljava/lang/String;Ljava/lang/String;)LK5/g;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v1

    .line 1194
    :goto_16
    invoke-interface {v1}, LK5/i;->toInstant()LK5/d;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    return-object v0
.end method
