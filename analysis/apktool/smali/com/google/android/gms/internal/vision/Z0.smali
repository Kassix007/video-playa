.class public final Lcom/google/android/gms/internal/vision/Z0;
.super Lcom/google/android/gms/internal/vision/d0;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/vision/Z0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static B(J[BII)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/16 v1, -0xc

    .line 3
    .line 4
    if-eqz p4, :cond_6

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/16 v3, -0x41

    .line 8
    .line 9
    if-eq p4, v2, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne p4, v2, :cond_2

    .line 13
    .line 14
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    const-wide/16 v4, 0x1

    .line 19
    .line 20
    add-long/2addr p0, v4

    .line 21
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    sget-object p1, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 26
    .line 27
    if-gt p3, v1, :cond_1

    .line 28
    .line 29
    if-gt p4, v3, :cond_1

    .line 30
    .line 31
    if-le p0, v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    shl-int/lit8 p1, p4, 0x8

    .line 35
    .line 36
    xor-int/2addr p1, p3

    .line 37
    shl-int/lit8 p0, p0, 0x10

    .line 38
    .line 39
    xor-int/2addr p0, p1

    .line 40
    return p0

    .line 41
    :cond_1
    :goto_0
    return v0

    .line 42
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_3
    invoke-static {p2, p0, p1}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    sget-object p1, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 53
    .line 54
    if-gt p3, v1, :cond_5

    .line 55
    .line 56
    if-le p0, v3, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    shl-int/lit8 p0, p0, 0x8

    .line 60
    .line 61
    xor-int/2addr p0, p3

    .line 62
    return p0

    .line 63
    :cond_5
    :goto_1
    return v0

    .line 64
    :cond_6
    sget-object p0, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 65
    .line 66
    if-le p3, v1, :cond_7

    .line 67
    .line 68
    return v0

    .line 69
    :cond_7
    return p3
.end method


# virtual methods
.method public final h(Ljava/lang/String;[BII)I
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget v5, v3, Lcom/google/android/gms/internal/vision/Z0;->b:I

    .line 12
    .line 13
    packed-switch v5, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    int-to-long v5, v2

    .line 17
    int-to-long v7, v4

    .line 18
    add-long/2addr v7, v5

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    const-string v10, " at index "

    .line 24
    .line 25
    const-string v11, "Failed writing "

    .line 26
    .line 27
    if-gt v9, v4, :cond_c

    .line 28
    .line 29
    array-length v12, v1

    .line 30
    sub-int/2addr v12, v4

    .line 31
    if-lt v12, v2, :cond_c

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    const-wide/16 v12, 0x1

    .line 35
    .line 36
    const/16 v4, 0x80

    .line 37
    .line 38
    if-ge v2, v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v14

    .line 44
    if-ge v14, v4, :cond_0

    .line 45
    .line 46
    add-long/2addr v12, v5

    .line 47
    int-to-byte v4, v14

    .line 48
    invoke-static {v1, v5, v6, v4}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    move-wide v5, v12

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    if-ne v2, v9, :cond_1

    .line 56
    .line 57
    long-to-int v0, v5

    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_1
    :goto_1
    if-ge v2, v9, :cond_b

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-ge v14, v4, :cond_2

    .line 67
    .line 68
    cmp-long v15, v5, v7

    .line 69
    .line 70
    if-gez v15, :cond_2

    .line 71
    .line 72
    add-long v15, v5, v12

    .line 73
    .line 74
    int-to-byte v14, v14

    .line 75
    invoke-static {v1, v5, v6, v14}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 76
    .line 77
    .line 78
    move v6, v4

    .line 79
    move-wide/from16 p3, v12

    .line 80
    .line 81
    move-wide v12, v15

    .line 82
    goto/16 :goto_4

    .line 83
    .line 84
    :cond_2
    const/16 v15, 0x800

    .line 85
    .line 86
    const-wide/16 v16, 0x2

    .line 87
    .line 88
    if-ge v14, v15, :cond_3

    .line 89
    .line 90
    sub-long v18, v7, v16

    .line 91
    .line 92
    cmp-long v15, v5, v18

    .line 93
    .line 94
    if-gtz v15, :cond_3

    .line 95
    .line 96
    move-wide/from16 p3, v12

    .line 97
    .line 98
    add-long v12, v5, p3

    .line 99
    .line 100
    ushr-int/lit8 v15, v14, 0x6

    .line 101
    .line 102
    or-int/lit16 v15, v15, 0x3c0

    .line 103
    .line 104
    int-to-byte v15, v15

    .line 105
    invoke-static {v1, v5, v6, v15}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 106
    .line 107
    .line 108
    add-long v5, v5, v16

    .line 109
    .line 110
    and-int/lit8 v14, v14, 0x3f

    .line 111
    .line 112
    or-int/2addr v14, v4

    .line 113
    int-to-byte v14, v14

    .line 114
    invoke-static {v1, v12, v13, v14}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 115
    .line 116
    .line 117
    move-wide v12, v5

    .line 118
    move v6, v4

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_3
    move-wide/from16 p3, v12

    .line 122
    .line 123
    const v12, 0xdfff

    .line 124
    .line 125
    .line 126
    const v13, 0xd800

    .line 127
    .line 128
    .line 129
    const-wide/16 v18, 0x3

    .line 130
    .line 131
    if-lt v14, v13, :cond_5

    .line 132
    .line 133
    if-ge v12, v14, :cond_4

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move-wide/from16 v20, v5

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    :goto_2
    sub-long v20, v7, v18

    .line 140
    .line 141
    cmp-long v15, v5, v20

    .line 142
    .line 143
    if-gtz v15, :cond_4

    .line 144
    .line 145
    add-long v12, v5, p3

    .line 146
    .line 147
    ushr-int/lit8 v15, v14, 0xc

    .line 148
    .line 149
    or-int/lit16 v15, v15, 0x1e0

    .line 150
    .line 151
    int-to-byte v15, v15

    .line 152
    invoke-static {v1, v5, v6, v15}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 153
    .line 154
    .line 155
    move-wide/from16 v20, v5

    .line 156
    .line 157
    add-long v4, v20, v16

    .line 158
    .line 159
    ushr-int/lit8 v6, v14, 0x6

    .line 160
    .line 161
    and-int/lit8 v6, v6, 0x3f

    .line 162
    .line 163
    const/16 v15, 0x80

    .line 164
    .line 165
    or-int/2addr v6, v15

    .line 166
    int-to-byte v6, v6

    .line 167
    invoke-static {v1, v12, v13, v6}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 168
    .line 169
    .line 170
    add-long v12, v20, v18

    .line 171
    .line 172
    and-int/lit8 v6, v14, 0x3f

    .line 173
    .line 174
    or-int/2addr v6, v15

    .line 175
    int-to-byte v6, v6

    .line 176
    invoke-static {v1, v4, v5, v6}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 177
    .line 178
    .line 179
    const/16 v6, 0x80

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :goto_3
    const-wide/16 v4, 0x4

    .line 183
    .line 184
    sub-long v22, v7, v4

    .line 185
    .line 186
    cmp-long v6, v20, v22

    .line 187
    .line 188
    if-gtz v6, :cond_8

    .line 189
    .line 190
    add-int/lit8 v6, v2, 0x1

    .line 191
    .line 192
    if-eq v6, v9, :cond_7

    .line 193
    .line 194
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {v14, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    if-eqz v12, :cond_6

    .line 203
    .line 204
    invoke-static {v14, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-long v12, v20, p3

    .line 209
    .line 210
    ushr-int/lit8 v14, v2, 0x12

    .line 211
    .line 212
    or-int/lit16 v14, v14, 0xf0

    .line 213
    .line 214
    int-to-byte v14, v14

    .line 215
    move-wide/from16 v22, v4

    .line 216
    .line 217
    move-wide/from16 v4, v20

    .line 218
    .line 219
    invoke-static {v1, v4, v5, v14}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 220
    .line 221
    .line 222
    move v14, v2

    .line 223
    add-long v2, v4, v16

    .line 224
    .line 225
    ushr-int/lit8 v16, v14, 0xc

    .line 226
    .line 227
    and-int/lit8 v15, v16, 0x3f

    .line 228
    .line 229
    move/from16 v16, v6

    .line 230
    .line 231
    const/16 v6, 0x80

    .line 232
    .line 233
    or-int/2addr v15, v6

    .line 234
    int-to-byte v15, v15

    .line 235
    invoke-static {v1, v12, v13, v15}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 236
    .line 237
    .line 238
    add-long v12, v4, v18

    .line 239
    .line 240
    ushr-int/lit8 v15, v14, 0x6

    .line 241
    .line 242
    and-int/lit8 v15, v15, 0x3f

    .line 243
    .line 244
    or-int/2addr v15, v6

    .line 245
    int-to-byte v15, v15

    .line 246
    invoke-static {v1, v2, v3, v15}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 247
    .line 248
    .line 249
    add-long v2, v4, v22

    .line 250
    .line 251
    and-int/lit8 v4, v14, 0x3f

    .line 252
    .line 253
    or-int/2addr v4, v6

    .line 254
    int-to-byte v4, v4

    .line 255
    invoke-static {v1, v12, v13, v4}, Lcom/google/android/gms/internal/vision/U0;->e([BJB)V

    .line 256
    .line 257
    .line 258
    move-wide v12, v2

    .line 259
    move/from16 v2, v16

    .line 260
    .line 261
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 262
    .line 263
    move-object/from16 v3, p0

    .line 264
    .line 265
    move v4, v6

    .line 266
    move-wide v5, v12

    .line 267
    move-wide/from16 v12, p3

    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :cond_6
    move/from16 v16, v6

    .line 272
    .line 273
    move/from16 v2, v16

    .line 274
    .line 275
    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/vision/Y0;

    .line 276
    .line 277
    add-int/lit8 v2, v2, -0x1

    .line 278
    .line 279
    invoke-direct {v0, v2, v9}, Lcom/google/android/gms/internal/vision/Y0;-><init>(II)V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :cond_8
    move-wide/from16 v4, v20

    .line 284
    .line 285
    if-gt v13, v14, :cond_a

    .line 286
    .line 287
    if-gt v14, v12, :cond_a

    .line 288
    .line 289
    add-int/lit8 v1, v2, 0x1

    .line 290
    .line 291
    if-eq v1, v9, :cond_9

    .line 292
    .line 293
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-static {v14, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_a

    .line 302
    .line 303
    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/vision/Y0;

    .line 304
    .line 305
    invoke-direct {v0, v2, v9}, Lcom/google/android/gms/internal/vision/Y0;-><init>(II)V

    .line 306
    .line 307
    .line 308
    throw v0

    .line 309
    :cond_a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 310
    .line 311
    new-instance v1, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const/16 v2, 0x2e

    .line 314
    .line 315
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :cond_b
    move-wide v4, v5

    .line 339
    long-to-int v0, v4

    .line 340
    :goto_5
    return v0

    .line 341
    :cond_c
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 342
    .line 343
    add-int/lit8 v9, v9, -0x1

    .line 344
    .line 345
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    add-int/2addr v2, v4

    .line 350
    new-instance v3, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const/16 v4, 0x25

    .line 353
    .line 354
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    add-int/2addr v4, v2

    .line 382
    const/4 v5, 0x0

    .line 383
    :goto_6
    const/16 v6, 0x80

    .line 384
    .line 385
    if-ge v5, v3, :cond_d

    .line 386
    .line 387
    add-int v7, v5, v2

    .line 388
    .line 389
    if-ge v7, v4, :cond_d

    .line 390
    .line 391
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 392
    .line 393
    .line 394
    move-result v8

    .line 395
    if-ge v8, v6, :cond_d

    .line 396
    .line 397
    int-to-byte v6, v8

    .line 398
    aput-byte v6, v1, v7

    .line 399
    .line 400
    add-int/lit8 v5, v5, 0x1

    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_d
    if-ne v5, v3, :cond_e

    .line 404
    .line 405
    add-int v0, v2, v3

    .line 406
    .line 407
    goto/16 :goto_9

    .line 408
    .line 409
    :cond_e
    add-int/2addr v2, v5

    .line 410
    :goto_7
    if-ge v5, v3, :cond_18

    .line 411
    .line 412
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    if-ge v7, v6, :cond_f

    .line 417
    .line 418
    if-ge v2, v4, :cond_f

    .line 419
    .line 420
    add-int/lit8 v8, v2, 0x1

    .line 421
    .line 422
    int-to-byte v7, v7

    .line 423
    aput-byte v7, v1, v2

    .line 424
    .line 425
    move v2, v8

    .line 426
    goto/16 :goto_8

    .line 427
    .line 428
    :cond_f
    const/16 v8, 0x800

    .line 429
    .line 430
    if-ge v7, v8, :cond_10

    .line 431
    .line 432
    add-int/lit8 v8, v4, -0x2

    .line 433
    .line 434
    if-gt v2, v8, :cond_10

    .line 435
    .line 436
    add-int/lit8 v8, v2, 0x1

    .line 437
    .line 438
    ushr-int/lit8 v9, v7, 0x6

    .line 439
    .line 440
    or-int/lit16 v9, v9, 0x3c0

    .line 441
    .line 442
    int-to-byte v9, v9

    .line 443
    aput-byte v9, v1, v2

    .line 444
    .line 445
    add-int/lit8 v2, v2, 0x2

    .line 446
    .line 447
    and-int/lit8 v7, v7, 0x3f

    .line 448
    .line 449
    or-int/2addr v7, v6

    .line 450
    int-to-byte v7, v7

    .line 451
    aput-byte v7, v1, v8

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_10
    const v8, 0xdfff

    .line 455
    .line 456
    .line 457
    const v9, 0xd800

    .line 458
    .line 459
    .line 460
    if-lt v7, v9, :cond_11

    .line 461
    .line 462
    if-ge v8, v7, :cond_12

    .line 463
    .line 464
    :cond_11
    add-int/lit8 v10, v4, -0x3

    .line 465
    .line 466
    if-gt v2, v10, :cond_12

    .line 467
    .line 468
    add-int/lit8 v8, v2, 0x1

    .line 469
    .line 470
    ushr-int/lit8 v9, v7, 0xc

    .line 471
    .line 472
    or-int/lit16 v9, v9, 0x1e0

    .line 473
    .line 474
    int-to-byte v9, v9

    .line 475
    aput-byte v9, v1, v2

    .line 476
    .line 477
    add-int/lit8 v9, v2, 0x2

    .line 478
    .line 479
    ushr-int/lit8 v10, v7, 0x6

    .line 480
    .line 481
    and-int/lit8 v10, v10, 0x3f

    .line 482
    .line 483
    or-int/2addr v10, v6

    .line 484
    int-to-byte v10, v10

    .line 485
    aput-byte v10, v1, v8

    .line 486
    .line 487
    add-int/lit8 v2, v2, 0x3

    .line 488
    .line 489
    and-int/lit8 v7, v7, 0x3f

    .line 490
    .line 491
    or-int/2addr v7, v6

    .line 492
    int-to-byte v7, v7

    .line 493
    aput-byte v7, v1, v9

    .line 494
    .line 495
    goto :goto_8

    .line 496
    :cond_12
    add-int/lit8 v10, v4, -0x4

    .line 497
    .line 498
    if-gt v2, v10, :cond_15

    .line 499
    .line 500
    add-int/lit8 v8, v5, 0x1

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    if-eq v8, v9, :cond_14

    .line 507
    .line 508
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 509
    .line 510
    .line 511
    move-result v5

    .line 512
    invoke-static {v7, v5}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    if-eqz v9, :cond_13

    .line 517
    .line 518
    invoke-static {v7, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    add-int/lit8 v7, v2, 0x1

    .line 523
    .line 524
    ushr-int/lit8 v9, v5, 0x12

    .line 525
    .line 526
    or-int/lit16 v9, v9, 0xf0

    .line 527
    .line 528
    int-to-byte v9, v9

    .line 529
    aput-byte v9, v1, v2

    .line 530
    .line 531
    add-int/lit8 v9, v2, 0x2

    .line 532
    .line 533
    ushr-int/lit8 v10, v5, 0xc

    .line 534
    .line 535
    and-int/lit8 v10, v10, 0x3f

    .line 536
    .line 537
    or-int/2addr v10, v6

    .line 538
    int-to-byte v10, v10

    .line 539
    aput-byte v10, v1, v7

    .line 540
    .line 541
    add-int/lit8 v7, v2, 0x3

    .line 542
    .line 543
    ushr-int/lit8 v10, v5, 0x6

    .line 544
    .line 545
    and-int/lit8 v10, v10, 0x3f

    .line 546
    .line 547
    or-int/2addr v10, v6

    .line 548
    int-to-byte v10, v10

    .line 549
    aput-byte v10, v1, v9

    .line 550
    .line 551
    add-int/lit8 v2, v2, 0x4

    .line 552
    .line 553
    and-int/lit8 v5, v5, 0x3f

    .line 554
    .line 555
    or-int/2addr v5, v6

    .line 556
    int-to-byte v5, v5

    .line 557
    aput-byte v5, v1, v7

    .line 558
    .line 559
    move v5, v8

    .line 560
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 561
    .line 562
    goto/16 :goto_7

    .line 563
    .line 564
    :cond_13
    move v5, v8

    .line 565
    :cond_14
    new-instance v0, Lcom/google/android/gms/internal/vision/Y0;

    .line 566
    .line 567
    add-int/lit8 v5, v5, -0x1

    .line 568
    .line 569
    invoke-direct {v0, v5, v3}, Lcom/google/android/gms/internal/vision/Y0;-><init>(II)V

    .line 570
    .line 571
    .line 572
    throw v0

    .line 573
    :cond_15
    if-gt v9, v7, :cond_17

    .line 574
    .line 575
    if-gt v7, v8, :cond_17

    .line 576
    .line 577
    add-int/lit8 v1, v5, 0x1

    .line 578
    .line 579
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eq v1, v4, :cond_16

    .line 584
    .line 585
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    invoke-static {v7, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_17

    .line 594
    .line 595
    :cond_16
    new-instance v0, Lcom/google/android/gms/internal/vision/Y0;

    .line 596
    .line 597
    invoke-direct {v0, v5, v3}, Lcom/google/android/gms/internal/vision/Y0;-><init>(II)V

    .line 598
    .line 599
    .line 600
    throw v0

    .line 601
    :cond_17
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 602
    .line 603
    new-instance v1, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const/16 v3, 0x25

    .line 606
    .line 607
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 608
    .line 609
    .line 610
    const-string v3, "Failed writing "

    .line 611
    .line 612
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v3, " at index "

    .line 619
    .line 620
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    throw v0

    .line 634
    :cond_18
    move v0, v2

    .line 635
    :goto_9
    return v0

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i([BII)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget v4, v2, Lcom/google/android/gms/internal/vision/Z0;->b:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    or-int v4, v1, v3

    .line 15
    .line 16
    array-length v5, v0

    .line 17
    sub-int/2addr v5, v3

    .line 18
    or-int/2addr v4, v5

    .line 19
    if-ltz v4, :cond_10

    .line 20
    .line 21
    int-to-long v4, v1

    .line 22
    int-to-long v6, v3

    .line 23
    sub-long/2addr v6, v4

    .line 24
    long-to-int v1, v6

    .line 25
    const/16 v3, 0x10

    .line 26
    .line 27
    const-wide/16 v7, 0x1

    .line 28
    .line 29
    if-ge v1, v3, :cond_0

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-wide v9, v4

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-ge v3, v1, :cond_2

    .line 36
    .line 37
    add-long v11, v9, v7

    .line 38
    .line 39
    invoke-static {v0, v9, v10}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-gez v9, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    move-wide v9, v11

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v3, v1

    .line 51
    :goto_1
    sub-int/2addr v1, v3

    .line 52
    int-to-long v9, v3

    .line 53
    add-long/2addr v4, v9

    .line 54
    :goto_2
    const/4 v3, 0x0

    .line 55
    :goto_3
    if-lez v1, :cond_4

    .line 56
    .line 57
    add-long v9, v4, v7

    .line 58
    .line 59
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-ltz v3, :cond_3

    .line 64
    .line 65
    add-int/lit8 v1, v1, -0x1

    .line 66
    .line 67
    move-wide v4, v9

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    move-wide v4, v9

    .line 70
    :cond_4
    if-nez v1, :cond_5

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    goto/16 :goto_6

    .line 74
    .line 75
    :cond_5
    add-int/lit8 v9, v1, -0x1

    .line 76
    .line 77
    const/16 v10, -0x20

    .line 78
    .line 79
    const/16 v11, -0x41

    .line 80
    .line 81
    if-ge v3, v10, :cond_8

    .line 82
    .line 83
    if-nez v9, :cond_6

    .line 84
    .line 85
    move v6, v3

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_6
    add-int/lit8 v1, v1, -0x2

    .line 89
    .line 90
    const/16 v9, -0x3e

    .line 91
    .line 92
    if-lt v3, v9, :cond_f

    .line 93
    .line 94
    add-long v9, v4, v7

    .line 95
    .line 96
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-le v3, v11, :cond_7

    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_7
    move-wide v15, v7

    .line 105
    move-wide v4, v9

    .line 106
    goto :goto_4

    .line 107
    :cond_8
    const/16 v12, -0x10

    .line 108
    .line 109
    const-wide/16 v13, 0x2

    .line 110
    .line 111
    if-ge v3, v12, :cond_d

    .line 112
    .line 113
    const/4 v12, 0x2

    .line 114
    if-ge v9, v12, :cond_9

    .line 115
    .line 116
    invoke-static {v4, v5, v0, v3, v9}, Lcom/google/android/gms/internal/vision/Z0;->B(J[BII)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    goto :goto_6

    .line 121
    :cond_9
    add-int/lit8 v1, v1, -0x3

    .line 122
    .line 123
    move-wide v15, v7

    .line 124
    add-long v6, v4, v15

    .line 125
    .line 126
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-gt v8, v11, :cond_f

    .line 131
    .line 132
    const/16 v9, -0x60

    .line 133
    .line 134
    if-ne v3, v10, :cond_a

    .line 135
    .line 136
    if-lt v8, v9, :cond_f

    .line 137
    .line 138
    :cond_a
    const/16 v10, -0x13

    .line 139
    .line 140
    if-ne v3, v10, :cond_b

    .line 141
    .line 142
    if-ge v8, v9, :cond_f

    .line 143
    .line 144
    :cond_b
    add-long/2addr v4, v13

    .line 145
    invoke-static {v0, v6, v7}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-le v3, v11, :cond_c

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_c
    :goto_4
    move-wide v7, v15

    .line 153
    goto :goto_2

    .line 154
    :cond_d
    move-wide v15, v7

    .line 155
    const/4 v6, 0x3

    .line 156
    if-ge v9, v6, :cond_e

    .line 157
    .line 158
    invoke-static {v4, v5, v0, v3, v9}, Lcom/google/android/gms/internal/vision/Z0;->B(J[BII)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    goto :goto_6

    .line 163
    :cond_e
    add-int/lit8 v1, v1, -0x4

    .line 164
    .line 165
    add-long v7, v4, v15

    .line 166
    .line 167
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-gt v6, v11, :cond_f

    .line 172
    .line 173
    shl-int/lit8 v3, v3, 0x1c

    .line 174
    .line 175
    add-int/lit8 v6, v6, 0x70

    .line 176
    .line 177
    add-int/2addr v6, v3

    .line 178
    shr-int/lit8 v3, v6, 0x1e

    .line 179
    .line 180
    if-nez v3, :cond_f

    .line 181
    .line 182
    add-long/2addr v13, v4

    .line 183
    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-gt v3, v11, :cond_f

    .line 188
    .line 189
    const-wide/16 v6, 0x3

    .line 190
    .line 191
    add-long/2addr v4, v6

    .line 192
    invoke-static {v0, v13, v14}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-le v3, v11, :cond_c

    .line 197
    .line 198
    :cond_f
    :goto_5
    const/4 v6, -0x1

    .line 199
    :goto_6
    return v6

    .line 200
    :cond_10
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 201
    .line 202
    array-length v0, v0

    .line 203
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const-string v1, "Array length=%d, index=%d, limit=%d"

    .line 220
    .line 221
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-direct {v4, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v4

    .line 229
    :goto_7
    :pswitch_0
    if-ge v1, v3, :cond_11

    .line 230
    .line 231
    aget-byte v4, v0, v1

    .line 232
    .line 233
    if-ltz v4, :cond_11

    .line 234
    .line 235
    add-int/lit8 v1, v1, 0x1

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_11
    if-lt v1, v3, :cond_12

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_12
    :goto_8
    if-lt v1, v3, :cond_13

    .line 242
    .line 243
    :goto_9
    const/4 v0, 0x0

    .line 244
    goto/16 :goto_b

    .line 245
    .line 246
    :cond_13
    add-int/lit8 v4, v1, 0x1

    .line 247
    .line 248
    aget-byte v5, v0, v1

    .line 249
    .line 250
    if-gez v5, :cond_1c

    .line 251
    .line 252
    const/16 v6, -0x20

    .line 253
    .line 254
    const/16 v7, -0x41

    .line 255
    .line 256
    if-ge v5, v6, :cond_15

    .line 257
    .line 258
    if-lt v4, v3, :cond_14

    .line 259
    .line 260
    move v0, v5

    .line 261
    goto :goto_b

    .line 262
    :cond_14
    const/16 v6, -0x3e

    .line 263
    .line 264
    if-lt v5, v6, :cond_1b

    .line 265
    .line 266
    add-int/lit8 v1, v1, 0x2

    .line 267
    .line 268
    aget-byte v4, v0, v4

    .line 269
    .line 270
    if-le v4, v7, :cond_12

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_15
    const/16 v8, -0x10

    .line 274
    .line 275
    if-ge v5, v8, :cond_19

    .line 276
    .line 277
    add-int/lit8 v8, v3, -0x1

    .line 278
    .line 279
    if-lt v4, v8, :cond_16

    .line 280
    .line 281
    invoke-static {v0, v4, v3}, Lcom/google/android/gms/internal/vision/X0;->b([BII)I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    goto :goto_b

    .line 286
    :cond_16
    add-int/lit8 v8, v1, 0x2

    .line 287
    .line 288
    aget-byte v4, v0, v4

    .line 289
    .line 290
    if-gt v4, v7, :cond_1b

    .line 291
    .line 292
    const/16 v9, -0x60

    .line 293
    .line 294
    if-ne v5, v6, :cond_17

    .line 295
    .line 296
    if-lt v4, v9, :cond_1b

    .line 297
    .line 298
    :cond_17
    const/16 v6, -0x13

    .line 299
    .line 300
    if-ne v5, v6, :cond_18

    .line 301
    .line 302
    if-ge v4, v9, :cond_1b

    .line 303
    .line 304
    :cond_18
    add-int/lit8 v1, v1, 0x3

    .line 305
    .line 306
    aget-byte v4, v0, v8

    .line 307
    .line 308
    if-le v4, v7, :cond_12

    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_19
    add-int/lit8 v6, v3, -0x2

    .line 312
    .line 313
    if-lt v4, v6, :cond_1a

    .line 314
    .line 315
    invoke-static {v0, v4, v3}, Lcom/google/android/gms/internal/vision/X0;->b([BII)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    goto :goto_b

    .line 320
    :cond_1a
    add-int/lit8 v6, v1, 0x2

    .line 321
    .line 322
    aget-byte v4, v0, v4

    .line 323
    .line 324
    if-gt v4, v7, :cond_1b

    .line 325
    .line 326
    shl-int/lit8 v5, v5, 0x1c

    .line 327
    .line 328
    add-int/lit8 v4, v4, 0x70

    .line 329
    .line 330
    add-int/2addr v4, v5

    .line 331
    shr-int/lit8 v4, v4, 0x1e

    .line 332
    .line 333
    if-nez v4, :cond_1b

    .line 334
    .line 335
    add-int/lit8 v4, v1, 0x3

    .line 336
    .line 337
    aget-byte v5, v0, v6

    .line 338
    .line 339
    if-gt v5, v7, :cond_1b

    .line 340
    .line 341
    add-int/lit8 v1, v1, 0x4

    .line 342
    .line 343
    aget-byte v4, v0, v4

    .line 344
    .line 345
    if-le v4, v7, :cond_12

    .line 346
    .line 347
    :cond_1b
    :goto_a
    const/4 v0, -0x1

    .line 348
    :goto_b
    return v0

    .line 349
    :cond_1c
    move v1, v4

    .line 350
    goto :goto_8

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final v([BII)Ljava/lang/String;
    .locals 10

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/Z0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    or-int v0, p2, p3

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    sub-int/2addr v1, p2

    .line 10
    sub-int/2addr v1, p3

    .line 11
    or-int/2addr v0, v1

    .line 12
    if-ltz v0, :cond_9

    .line 13
    .line 14
    add-int v0, p2, p3

    .line 15
    .line 16
    new-array v5, p3, [C

    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    move v1, p3

    .line 20
    :goto_0
    if-ge p2, v0, :cond_0

    .line 21
    .line 22
    int-to-long v2, p2

    .line 23
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_0

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    add-int/lit8 v3, v1, 0x1

    .line 32
    .line 33
    int-to-char v2, v2

    .line 34
    aput-char v2, v5, v1

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v6, v1

    .line 39
    :goto_1
    if-ge p2, v0, :cond_8

    .line 40
    .line 41
    add-int/lit8 v1, p2, 0x1

    .line 42
    .line 43
    int-to-long v2, p2

    .line 44
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ltz v2, :cond_2

    .line 49
    .line 50
    add-int/lit8 p2, v6, 0x1

    .line 51
    .line 52
    int-to-char v2, v2

    .line 53
    aput-char v2, v5, v6

    .line 54
    .line 55
    :goto_2
    if-ge v1, v0, :cond_1

    .line 56
    .line 57
    int-to-long v2, v1

    .line 58
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-ltz v2, :cond_1

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    add-int/lit8 v3, p2, 0x1

    .line 67
    .line 68
    int-to-char v2, v2

    .line 69
    aput-char v2, v5, p2

    .line 70
    .line 71
    move p2, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    move v6, p2

    .line 74
    move p2, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    const/16 v3, -0x20

    .line 77
    .line 78
    if-ge v2, v3, :cond_4

    .line 79
    .line 80
    if-ge v1, v0, :cond_3

    .line 81
    .line 82
    add-int/lit8 p2, p2, 0x2

    .line 83
    .line 84
    int-to-long v3, v1

    .line 85
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/lit8 v3, v6, 0x1

    .line 90
    .line 91
    invoke-static {v2, v1, v5, v6}, Lcom/google/android/gms/internal/vision/d0;->o(BB[CI)V

    .line 92
    .line 93
    .line 94
    move v6, v3

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    throw p1

    .line 101
    :cond_4
    const/16 v3, -0x10

    .line 102
    .line 103
    if-ge v2, v3, :cond_6

    .line 104
    .line 105
    add-int/lit8 v3, v0, -0x1

    .line 106
    .line 107
    if-ge v1, v3, :cond_5

    .line 108
    .line 109
    add-int/lit8 v3, p2, 0x2

    .line 110
    .line 111
    int-to-long v7, v1

    .line 112
    invoke-static {p1, v7, v8}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int/lit8 p2, p2, 0x3

    .line 117
    .line 118
    int-to-long v3, v3

    .line 119
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    add-int/lit8 v4, v6, 0x1

    .line 124
    .line 125
    invoke-static {v2, v1, v3, v5, v6}, Lcom/google/android/gms/internal/vision/d0;->n(BBB[CI)V

    .line 126
    .line 127
    .line 128
    move v6, v4

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    throw p1

    .line 135
    :cond_6
    add-int/lit8 v3, v0, -0x2

    .line 136
    .line 137
    if-ge v1, v3, :cond_7

    .line 138
    .line 139
    add-int/lit8 v3, p2, 0x2

    .line 140
    .line 141
    int-to-long v7, v1

    .line 142
    invoke-static {p1, v7, v8}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    add-int/lit8 v4, p2, 0x3

    .line 147
    .line 148
    int-to-long v7, v3

    .line 149
    invoke-static {p1, v7, v8}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    add-int/lit8 p2, p2, 0x4

    .line 154
    .line 155
    int-to-long v7, v4

    .line 156
    invoke-static {p1, v7, v8}, Lcom/google/android/gms/internal/vision/U0;->a([BJ)B

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    move v9, v2

    .line 161
    move v2, v1

    .line 162
    move v1, v9

    .line 163
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/vision/d0;->m(BBBB[CI)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v6, v6, 0x2

    .line 167
    .line 168
    goto/16 :goto_1

    .line 169
    .line 170
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    throw p1

    .line 175
    :cond_8
    new-instance p1, Ljava/lang/String;

    .line 176
    .line 177
    invoke-direct {p1, v5, p3, v6}, Ljava/lang/String;-><init>([CII)V

    .line 178
    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_9
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 182
    .line 183
    array-length p1, p1

    .line 184
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    const-string p2, "buffer length=%d, index=%d, size=%d"

    .line 201
    .line 202
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :pswitch_0
    or-int v0, p2, p3

    .line 211
    .line 212
    array-length v1, p1

    .line 213
    sub-int/2addr v1, p2

    .line 214
    sub-int/2addr v1, p3

    .line 215
    or-int/2addr v0, v1

    .line 216
    if-ltz v0, :cond_13

    .line 217
    .line 218
    add-int v0, p2, p3

    .line 219
    .line 220
    new-array v5, p3, [C

    .line 221
    .line 222
    const/4 p3, 0x0

    .line 223
    move v1, p3

    .line 224
    :goto_3
    if-ge p2, v0, :cond_a

    .line 225
    .line 226
    aget-byte v2, p1, p2

    .line 227
    .line 228
    if-ltz v2, :cond_a

    .line 229
    .line 230
    add-int/lit8 p2, p2, 0x1

    .line 231
    .line 232
    add-int/lit8 v3, v1, 0x1

    .line 233
    .line 234
    int-to-char v2, v2

    .line 235
    aput-char v2, v5, v1

    .line 236
    .line 237
    move v1, v3

    .line 238
    goto :goto_3

    .line 239
    :cond_a
    move v6, v1

    .line 240
    :goto_4
    if-ge p2, v0, :cond_12

    .line 241
    .line 242
    add-int/lit8 v1, p2, 0x1

    .line 243
    .line 244
    move v2, v1

    .line 245
    aget-byte v1, p1, p2

    .line 246
    .line 247
    if-ltz v1, :cond_c

    .line 248
    .line 249
    add-int/lit8 p2, v6, 0x1

    .line 250
    .line 251
    int-to-char v1, v1

    .line 252
    aput-char v1, v5, v6

    .line 253
    .line 254
    move v1, v2

    .line 255
    :goto_5
    if-ge v1, v0, :cond_b

    .line 256
    .line 257
    aget-byte v2, p1, v1

    .line 258
    .line 259
    if-ltz v2, :cond_b

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    add-int/lit8 v3, p2, 0x1

    .line 264
    .line 265
    int-to-char v2, v2

    .line 266
    aput-char v2, v5, p2

    .line 267
    .line 268
    move p2, v3

    .line 269
    goto :goto_5

    .line 270
    :cond_b
    move v6, p2

    .line 271
    move p2, v1

    .line 272
    goto :goto_4

    .line 273
    :cond_c
    const/16 v3, -0x20

    .line 274
    .line 275
    if-ge v1, v3, :cond_e

    .line 276
    .line 277
    if-ge v2, v0, :cond_d

    .line 278
    .line 279
    add-int/lit8 p2, p2, 0x2

    .line 280
    .line 281
    aget-byte v2, p1, v2

    .line 282
    .line 283
    add-int/lit8 v3, v6, 0x1

    .line 284
    .line 285
    invoke-static {v1, v2, v5, v6}, Lcom/google/android/gms/internal/vision/d0;->o(BB[CI)V

    .line 286
    .line 287
    .line 288
    move v6, v3

    .line 289
    goto :goto_4

    .line 290
    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    throw p1

    .line 295
    :cond_e
    const/16 v3, -0x10

    .line 296
    .line 297
    if-ge v1, v3, :cond_10

    .line 298
    .line 299
    add-int/lit8 v3, v0, -0x1

    .line 300
    .line 301
    if-ge v2, v3, :cond_f

    .line 302
    .line 303
    add-int/lit8 v3, p2, 0x2

    .line 304
    .line 305
    aget-byte v2, p1, v2

    .line 306
    .line 307
    add-int/lit8 p2, p2, 0x3

    .line 308
    .line 309
    aget-byte v3, p1, v3

    .line 310
    .line 311
    add-int/lit8 v4, v6, 0x1

    .line 312
    .line 313
    invoke-static {v1, v2, v3, v5, v6}, Lcom/google/android/gms/internal/vision/d0;->n(BBB[CI)V

    .line 314
    .line 315
    .line 316
    move v6, v4

    .line 317
    goto :goto_4

    .line 318
    :cond_f
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    throw p1

    .line 323
    :cond_10
    add-int/lit8 v3, v0, -0x2

    .line 324
    .line 325
    if-ge v2, v3, :cond_11

    .line 326
    .line 327
    add-int/lit8 v3, p2, 0x2

    .line 328
    .line 329
    aget-byte v2, p1, v2

    .line 330
    .line 331
    add-int/lit8 v4, p2, 0x3

    .line 332
    .line 333
    aget-byte v3, p1, v3

    .line 334
    .line 335
    add-int/lit8 p2, p2, 0x4

    .line 336
    .line 337
    aget-byte v4, p1, v4

    .line 338
    .line 339
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/vision/d0;->m(BBBB[CI)V

    .line 340
    .line 341
    .line 342
    add-int/lit8 v6, v6, 0x2

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_11
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    throw p1

    .line 350
    :cond_12
    new-instance p1, Ljava/lang/String;

    .line 351
    .line 352
    invoke-direct {p1, v5, p3, v6}, Ljava/lang/String;-><init>([CII)V

    .line 353
    .line 354
    .line 355
    return-object p1

    .line 356
    :cond_13
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 357
    .line 358
    array-length p1, p1

    .line 359
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object p2

    .line 367
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object p3

    .line 371
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    const-string p2, "buffer length=%d, index=%d, size=%d"

    .line 376
    .line 377
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v0

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
