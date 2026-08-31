.class public abstract Lcom/google/android/gms/internal/vision/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;

.field public static final c:Lcom/google/android/gms/internal/vision/T0;

.field public static final d:Z

.field public static final e:Z

.field public static final f:J

.field public static final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/vision/U0;->g()Lsun/misc/Unsafe;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/google/android/gms/internal/vision/U0;->a:Lsun/misc/Unsafe;

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/vision/L;->a:Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v1, Lcom/google/android/gms/internal/vision/U0;->b:Ljava/lang/Class;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/android/gms/internal/vision/U0;->k(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/U0;->k(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/L;->a()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    new-instance v5, Lcom/google/android/gms/internal/vision/R0;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v5, v0, v2}, Lcom/google/android/gms/internal/vision/R0;-><init>(Lsun/misc/Unsafe;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    if-eqz v4, :cond_3

    .line 43
    .line 44
    new-instance v5, Lcom/google/android/gms/internal/vision/R0;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v5, v0, v2}, Lcom/google/android/gms/internal/vision/R0;-><init>(Lsun/misc/Unsafe;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance v5, Lcom/google/android/gms/internal/vision/S0;

    .line 52
    .line 53
    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/vision/T0;-><init>(Lsun/misc/Unsafe;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_0
    sput-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 57
    .line 58
    const-string v2, "copyMemory"

    .line 59
    .line 60
    const-string v4, "platform method missing - proto runtime falling back to safer methods: "

    .line 61
    .line 62
    const-string v5, "com.google.protobuf.UnsafeUtil"

    .line 63
    .line 64
    const-class v6, Lcom/google/android/gms/internal/vision/U0;

    .line 65
    .line 66
    const-string v7, "putLong"

    .line 67
    .line 68
    const-string v8, "putInt"

    .line 69
    .line 70
    const-string v9, "getInt"

    .line 71
    .line 72
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    const-string v11, "putByte"

    .line 75
    .line 76
    const-string v12, "getByte"

    .line 77
    .line 78
    const-class v13, Ljava/lang/reflect/Field;

    .line 79
    .line 80
    const-string v14, "objectFieldOffset"

    .line 81
    .line 82
    const-class v15, Ljava/lang/Object;

    .line 83
    .line 84
    move-object/from16 v16, v6

    .line 85
    .line 86
    const-string v6, "getLong"

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x1

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    move-object/from16 v20, v10

    .line 95
    .line 96
    move-object/from16 v21, v11

    .line 97
    .line 98
    move-object/from16 v19, v13

    .line 99
    .line 100
    :goto_1
    move/from16 v0, v17

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 108
    move-object/from16 v19, v13

    .line 109
    .line 110
    :try_start_1
    filled-new-array/range {v19 .. v19}, [Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    invoke-virtual {v0, v14, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-virtual {v0, v6, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/google/android/gms/internal/vision/U0;->m()Ljava/lang/reflect/Field;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    if-nez v13, :cond_5

    .line 129
    .line 130
    move-object/from16 v20, v10

    .line 131
    .line 132
    move-object/from16 v21, v11

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/vision/L;->a()Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_6

    .line 140
    .line 141
    :goto_2
    move-object/from16 v20, v10

    .line 142
    .line 143
    move-object/from16 v21, v11

    .line 144
    .line 145
    move/from16 v0, v18

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v0, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 153
    .line 154
    .line 155
    filled-new-array {v1, v10}, [Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    invoke-virtual {v0, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 160
    .line 161
    .line 162
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    invoke-virtual {v0, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 167
    .line 168
    .line 169
    filled-new-array {v1, v3}, [Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-virtual {v0, v8, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 174
    .line 175
    .line 176
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    invoke-virtual {v0, v6, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 181
    .line 182
    .line 183
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-virtual {v0, v7, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 188
    .line 189
    .line 190
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    invoke-virtual {v0, v2, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 195
    .line 196
    .line 197
    filled-new-array {v15, v1, v15, v1, v1}, [Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-virtual {v0, v2, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto :goto_3

    .line 207
    :catchall_1
    move-exception v0

    .line 208
    move-object/from16 v19, v13

    .line 209
    .line 210
    :goto_3
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static {v2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    sget-object v13, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 219
    .line 220
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v20

    .line 228
    move-object/from16 v21, v11

    .line 229
    .line 230
    add-int/lit8 v11, v20, 0x47

    .line 231
    .line 232
    move-object/from16 v20, v10

    .line 233
    .line 234
    new-instance v10, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-string v10, "supportsUnsafeByteBufferOperations"

    .line 250
    .line 251
    invoke-virtual {v2, v13, v5, v10, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :goto_4
    sput-boolean v0, Lcom/google/android/gms/internal/vision/U0;->d:Z

    .line 257
    .line 258
    const-class v0, Ljava/lang/Class;

    .line 259
    .line 260
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->a:Lsun/misc/Unsafe;

    .line 261
    .line 262
    if-nez v2, :cond_7

    .line 263
    .line 264
    :goto_5
    move/from16 v0, v17

    .line 265
    .line 266
    goto/16 :goto_7

    .line 267
    .line 268
    :cond_7
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    filled-new-array/range {v19 .. v19}, [Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-virtual {v2, v14, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 277
    .line 278
    .line 279
    const-string v10, "arrayBaseOffset"

    .line 280
    .line 281
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    invoke-virtual {v2, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    const-string v10, "arrayIndexScale"

    .line 289
    .line 290
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v2, v10, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 295
    .line 296
    .line 297
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v2, v9, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 302
    .line 303
    .line 304
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v2, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 309
    .line 310
    .line 311
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v2, v6, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 316
    .line 317
    .line 318
    filled-new-array {v15, v1, v1}, [Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v2, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 323
    .line 324
    .line 325
    const-string v0, "getObject"

    .line 326
    .line 327
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 332
    .line 333
    .line 334
    const-string v0, "putObject"

    .line 335
    .line 336
    filled-new-array {v15, v1, v15}, [Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 341
    .line 342
    .line 343
    invoke-static {}, Lcom/google/android/gms/internal/vision/L;->a()Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_8

    .line 348
    .line 349
    :goto_6
    move/from16 v0, v18

    .line 350
    .line 351
    goto/16 :goto_7

    .line 352
    .line 353
    :cond_8
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v2, v12, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 358
    .line 359
    .line 360
    move-object/from16 v3, v20

    .line 361
    .line 362
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object/from16 v3, v21

    .line 367
    .line 368
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 369
    .line 370
    .line 371
    const-string v0, "getBoolean"

    .line 372
    .line 373
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 378
    .line 379
    .line 380
    const-string v0, "putBoolean"

    .line 381
    .line 382
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 383
    .line 384
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 389
    .line 390
    .line 391
    const-string v0, "getFloat"

    .line 392
    .line 393
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 398
    .line 399
    .line 400
    const-string v0, "putFloat"

    .line 401
    .line 402
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 403
    .line 404
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 409
    .line 410
    .line 411
    const-string v0, "getDouble"

    .line 412
    .line 413
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 418
    .line 419
    .line 420
    const-string v0, "putDouble"

    .line 421
    .line 422
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 423
    .line 424
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 429
    .line 430
    .line 431
    goto :goto_6

    .line 432
    :catchall_2
    move-exception v0

    .line 433
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 442
    .line 443
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    add-int/lit8 v3, v3, 0x47

    .line 452
    .line 453
    new-instance v6, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    const-string v3, "supportsUnsafeArrayOperations"

    .line 469
    .line 470
    invoke-virtual {v1, v2, v5, v3, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_5

    .line 474
    .line 475
    :goto_7
    sput-boolean v0, Lcom/google/android/gms/internal/vision/U0;->e:Z

    .line 476
    .line 477
    const-class v0, [B

    .line 478
    .line 479
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    int-to-long v0, v0

    .line 484
    sput-wide v0, Lcom/google/android/gms/internal/vision/U0;->f:J

    .line 485
    .line 486
    const-class v0, [Z

    .line 487
    .line 488
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 489
    .line 490
    .line 491
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 492
    .line 493
    .line 494
    const-class v0, [I

    .line 495
    .line 496
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 497
    .line 498
    .line 499
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 500
    .line 501
    .line 502
    const-class v0, [J

    .line 503
    .line 504
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 505
    .line 506
    .line 507
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 508
    .line 509
    .line 510
    const-class v0, [F

    .line 511
    .line 512
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 513
    .line 514
    .line 515
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 516
    .line 517
    .line 518
    const-class v0, [D

    .line 519
    .line 520
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 521
    .line 522
    .line 523
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 524
    .line 525
    .line 526
    const-class v0, [Ljava/lang/Object;

    .line 527
    .line 528
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->f(Ljava/lang/Class;)I

    .line 529
    .line 530
    .line 531
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/U0;->h(Ljava/lang/Class;)V

    .line 532
    .line 533
    .line 534
    invoke-static {}, Lcom/google/android/gms/internal/vision/U0;->m()Ljava/lang/reflect/Field;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    if-eqz v0, :cond_a

    .line 539
    .line 540
    sget-object v1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 541
    .line 542
    if-nez v1, :cond_9

    .line 543
    .line 544
    goto :goto_8

    .line 545
    :cond_9
    iget-object v1, v1, Lcom/google/android/gms/internal/vision/T0;->a:Lsun/misc/Unsafe;

    .line 546
    .line 547
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 548
    .line 549
    .line 550
    :cond_a
    :goto_8
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 555
    .line 556
    if-ne v0, v1, :cond_b

    .line 557
    .line 558
    move/from16 v17, v18

    .line 559
    .line 560
    :cond_b
    sput-boolean v17, Lcom/google/android/gms/internal/vision/U0;->g:Z

    .line 561
    .line 562
    return-void
.end method

.method public static a([BJ)B
    .locals 2

    .line 1
    sget-wide v0, Lcom/google/android/gms/internal/vision/U0;->f:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {p1, v0, v1, p0}, Lcom/google/android/gms/internal/vision/T0;->a(JLjava/lang/Object;)B

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public static c(IJLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/vision/T0;->b(IJLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static d(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/vision/T0;->a:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p2, p0, p1, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static e([BJB)V
    .locals 2

    .line 1
    sget-wide v0, Lcom/google/android/gms/internal/vision/U0;->f:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {p1, p0, v0, v1, p3}, Lcom/google/android/gms/internal/vision/T0;->c(Ljava/lang/Object;JB)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static f(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/vision/U0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/vision/T0;->a:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public static g()Lsun/misc/Unsafe;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/vision/W0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :catchall_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public static h(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/vision/U0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/vision/T0;->a:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    not-int p1, p1

    .line 12
    and-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    shl-int/lit8 p1, p1, 0x3

    .line 15
    .line 16
    const/16 p2, 0xff

    .line 17
    .line 18
    shl-int v3, p2, p1

    .line 19
    .line 20
    not-int v3, v3

    .line 21
    and-int/2addr v2, v3

    .line 22
    and-int/2addr p2, p3

    .line 23
    shl-int p1, p2, p1

    .line 24
    .line 25
    or-int/2addr p1, v2

    .line 26
    invoke-static {p1, v0, v1, p0}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static j(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    and-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    const/16 p2, 0xff

    .line 16
    .line 17
    shl-int v3, p2, p1

    .line 18
    .line 19
    not-int v3, v3

    .line 20
    and-int/2addr v2, v3

    .line 21
    and-int/2addr p2, p3

    .line 22
    shl-int p1, p2, p1

    .line 23
    .line 24
    or-int/2addr p1, v2

    .line 25
    invoke-static {p1, v0, v1, p0}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static k(Ljava/lang/Class;)Z
    .locals 7

    .line 1
    const-class v0, [B

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/vision/L;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/vision/U0;->b:Ljava/lang/Class;

    .line 12
    .line 13
    const-string v3, "peekLong"

    .line 14
    .line 15
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    filled-new-array {p0, v4}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    const-string v3, "pokeLong"

    .line 25
    .line 26
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    filled-new-array {p0, v5, v4}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    const-string v3, "pokeInt"

    .line 36
    .line 37
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    filled-new-array {p0, v5, v4}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    const-string v3, "peekInt"

    .line 47
    .line 48
    filled-new-array {p0, v4}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    const-string v3, "pokeByte"

    .line 56
    .line 57
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    filled-new-array {p0, v4}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    const-string v3, "peekByte"

    .line 67
    .line 68
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    const-string v3, "pokeByteArray"

    .line 76
    .line 77
    filled-new-array {p0, v0, v5, v5}, [Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    const-string v3, "peekByteArray"

    .line 85
    .line 86
    filled-new-array {p0, v0, v5, v5}, [Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v1, v3, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :catchall_0
    return v2
.end method

.method public static l(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/vision/T0;->a:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p2, p0, p1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static m()Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/vision/L;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Ljava/nio/Buffer;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "effectiveDirectAddress"

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-object v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, "address"

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    goto :goto_1

    .line 28
    :catchall_1
    move-object v0, v2

    .line 29
    :goto_1
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    return-object v2
.end method

.method public static n(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    not-long p0, p0

    .line 11
    const-wide/16 v0, 0x3

    .line 12
    .line 13
    and-long/2addr p0, v0

    .line 14
    const/4 v0, 0x3

    .line 15
    shl-long/2addr p0, v0

    .line 16
    long-to-int p0, p0

    .line 17
    ushr-int p0, p2, p0

    .line 18
    .line 19
    int-to-byte p0, p0

    .line 20
    return p0
.end method

.method public static o(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const-wide/16 v0, 0x3

    .line 11
    .line 12
    and-long/2addr p0, v0

    .line 13
    const/4 v0, 0x3

    .line 14
    shl-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    ushr-int p0, p2, p0

    .line 17
    .line 18
    int-to-byte p0, p0

    .line 19
    return p0
.end method
