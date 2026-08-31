.class public abstract Lcom/google/android/gms/internal/clearcut/i0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lsun/misc/Unsafe;

.field public static final c:Ljava/lang/Class;

.field public static final d:Lcom/google/android/gms/internal/clearcut/h0;

.field public static final e:Z

.field public static final f:Z

.field public static final g:J

.field public static final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    const-class v0, Lcom/google/android/gms/internal/clearcut/i0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/clearcut/i0;->a:Ljava/util/logging/Logger;

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i0;->f()Lsun/misc/Unsafe;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/gms/internal/clearcut/i0;->b:Lsun/misc/Unsafe;

    .line 18
    .line 19
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i;->a:Ljava/lang/Class;

    .line 20
    .line 21
    sput-object v1, Lcom/google/android/gms/internal/clearcut/i0;->c:Ljava/lang/Class;

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/google/android/gms/internal/clearcut/i0;->j(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-static {v3}, Lcom/google/android/gms/internal/clearcut/i0;->j(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i;->a()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_3

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    new-instance v2, Lcom/google/android/gms/internal/clearcut/f0;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v2, v0, v4}, Lcom/google/android/gms/internal/clearcut/f0;-><init>(Lsun/misc/Unsafe;I)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    if-eqz v4, :cond_0

    .line 55
    .line 56
    new-instance v2, Lcom/google/android/gms/internal/clearcut/f0;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v2, v0, v4}, Lcom/google/android/gms/internal/clearcut/f0;-><init>(Lsun/misc/Unsafe;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance v2, Lcom/google/android/gms/internal/clearcut/g0;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/clearcut/h0;-><init>(Lsun/misc/Unsafe;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    sput-object v2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 69
    .line 70
    const-string v2, "copyMemory"

    .line 71
    .line 72
    const-string v4, "platform method missing - proto runtime falling back to safer methods: "

    .line 73
    .line 74
    const-string v6, "com.google.protobuf.UnsafeUtil"

    .line 75
    .line 76
    const-string v7, "putLong"

    .line 77
    .line 78
    const-string v8, "putInt"

    .line 79
    .line 80
    const-string v9, "getInt"

    .line 81
    .line 82
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    const-string v11, "putByte"

    .line 85
    .line 86
    const-string v12, "getByte"

    .line 87
    .line 88
    const-class v13, Ljava/lang/reflect/Field;

    .line 89
    .line 90
    const-string v14, "objectFieldOffset"

    .line 91
    .line 92
    const-class v15, Ljava/lang/Object;

    .line 93
    .line 94
    const-string v5, "getLong"

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    move-object/from16 v17, v13

    .line 99
    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    :goto_1
    move-object/from16 v18, v10

    .line 103
    .line 104
    move-object/from16 v19, v11

    .line 105
    .line 106
    :goto_2
    move/from16 v0, v16

    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    filled-new-array/range {v17 .. v17}, [Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-virtual {v0, v14, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 119
    .line 120
    .line 121
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    invoke-virtual {v0, v5, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i0;->g()Ljava/lang/reflect/Field;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    if-nez v13, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i;->a()Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_6

    .line 140
    .line 141
    :goto_3
    move-object/from16 v18, v10

    .line 142
    .line 143
    move-object/from16 v19, v11

    .line 144
    .line 145
    const/4 v0, 0x1

    .line 146
    goto :goto_4

    .line 147
    :cond_6
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-virtual {v0, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    filled-new-array {v1, v10}, [Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v0, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    invoke-virtual {v0, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 166
    .line 167
    .line 168
    filled-new-array {v1, v3}, [Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    invoke-virtual {v0, v8, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 173
    .line 174
    .line 175
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-virtual {v0, v5, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    filled-new-array {v1, v1}, [Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-virtual {v0, v7, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 187
    .line 188
    .line 189
    filled-new-array {v1, v1, v1}, [Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    invoke-virtual {v0, v2, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 194
    .line 195
    .line 196
    filled-new-array {v15, v1, v15, v1, v1}, [Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    invoke-virtual {v0, v2, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :catchall_0
    move-exception v0

    .line 205
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->a:Ljava/util/logging/Logger;

    .line 206
    .line 207
    sget-object v13, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 208
    .line 209
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v18

    .line 217
    move-object/from16 v19, v11

    .line 218
    .line 219
    add-int/lit8 v11, v18, 0x47

    .line 220
    .line 221
    move-object/from16 v18, v10

    .line 222
    .line 223
    new-instance v10, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v10, "supportsUnsafeByteBufferOperations"

    .line 239
    .line 240
    invoke-virtual {v2, v13, v6, v10, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    :goto_4
    sput-boolean v0, Lcom/google/android/gms/internal/clearcut/i0;->e:Z

    .line 246
    .line 247
    const-class v0, Ljava/lang/Class;

    .line 248
    .line 249
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->b:Lsun/misc/Unsafe;

    .line 250
    .line 251
    if-nez v2, :cond_7

    .line 252
    .line 253
    :goto_5
    move/from16 v0, v16

    .line 254
    .line 255
    goto/16 :goto_7

    .line 256
    .line 257
    :cond_7
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    filled-new-array/range {v17 .. v17}, [Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-virtual {v2, v14, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 266
    .line 267
    .line 268
    const-string v10, "arrayBaseOffset"

    .line 269
    .line 270
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-virtual {v2, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 275
    .line 276
    .line 277
    const-string v10, "arrayIndexScale"

    .line 278
    .line 279
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v2, v10, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 284
    .line 285
    .line 286
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v2, v9, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 291
    .line 292
    .line 293
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v2, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 298
    .line 299
    .line 300
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v2, v5, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 305
    .line 306
    .line 307
    filled-new-array {v15, v1, v1}, [Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v2, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 312
    .line 313
    .line 314
    const-string v0, "getObject"

    .line 315
    .line 316
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 321
    .line 322
    .line 323
    const-string v0, "putObject"

    .line 324
    .line 325
    filled-new-array {v15, v1, v15}, [Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 330
    .line 331
    .line 332
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i;->a()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_8

    .line 337
    .line 338
    :goto_6
    const/4 v0, 0x1

    .line 339
    goto :goto_7

    .line 340
    :cond_8
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v2, v12, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 345
    .line 346
    .line 347
    move-object/from16 v3, v18

    .line 348
    .line 349
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    move-object/from16 v3, v19

    .line 354
    .line 355
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 356
    .line 357
    .line 358
    const-string v0, "getBoolean"

    .line 359
    .line 360
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 365
    .line 366
    .line 367
    const-string v0, "putBoolean"

    .line 368
    .line 369
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 370
    .line 371
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 376
    .line 377
    .line 378
    const-string v0, "getFloat"

    .line 379
    .line 380
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 385
    .line 386
    .line 387
    const-string v0, "putFloat"

    .line 388
    .line 389
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 390
    .line 391
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 396
    .line 397
    .line 398
    const-string v0, "getDouble"

    .line 399
    .line 400
    filled-new-array {v15, v1}, [Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 405
    .line 406
    .line 407
    const-string v0, "putDouble"

    .line 408
    .line 409
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 410
    .line 411
    filled-new-array {v15, v1, v3}, [Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 416
    .line 417
    .line 418
    goto :goto_6

    .line 419
    :catchall_1
    move-exception v0

    .line 420
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i0;->a:Ljava/util/logging/Logger;

    .line 421
    .line 422
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 423
    .line 424
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    add-int/lit8 v3, v3, 0x47

    .line 433
    .line 434
    new-instance v5, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    const-string v3, "supportsUnsafeArrayOperations"

    .line 450
    .line 451
    invoke-virtual {v1, v2, v6, v3, v0}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_5

    .line 455
    .line 456
    :goto_7
    sput-boolean v0, Lcom/google/android/gms/internal/clearcut/i0;->f:Z

    .line 457
    .line 458
    const-class v0, [B

    .line 459
    .line 460
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    int-to-long v0, v0

    .line 465
    sput-wide v0, Lcom/google/android/gms/internal/clearcut/i0;->g:J

    .line 466
    .line 467
    const-class v0, [Z

    .line 468
    .line 469
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 470
    .line 471
    .line 472
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 473
    .line 474
    .line 475
    const-class v0, [I

    .line 476
    .line 477
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 478
    .line 479
    .line 480
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 481
    .line 482
    .line 483
    const-class v0, [J

    .line 484
    .line 485
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 486
    .line 487
    .line 488
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 489
    .line 490
    .line 491
    const-class v0, [F

    .line 492
    .line 493
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 494
    .line 495
    .line 496
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 497
    .line 498
    .line 499
    const-class v0, [D

    .line 500
    .line 501
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 502
    .line 503
    .line 504
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 505
    .line 506
    .line 507
    const-class v0, [Ljava/lang/Object;

    .line 508
    .line 509
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->h(Ljava/lang/Class;)I

    .line 510
    .line 511
    .line 512
    invoke-static {v0}, Lcom/google/android/gms/internal/clearcut/i0;->i(Ljava/lang/Class;)V

    .line 513
    .line 514
    .line 515
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i0;->g()Ljava/lang/reflect/Field;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-eqz v0, :cond_a

    .line 520
    .line 521
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 522
    .line 523
    if-nez v1, :cond_9

    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 527
    .line 528
    .line 529
    :cond_a
    :goto_8
    const-class v0, Ljava/lang/String;

    .line 530
    .line 531
    const-string v1, "value"

    .line 532
    .line 533
    :try_start_2
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 534
    .line 535
    .line 536
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 537
    const/4 v1, 0x1

    .line 538
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 539
    .line 540
    .line 541
    goto :goto_9

    .line 542
    :catchall_2
    const/4 v1, 0x1

    .line 543
    :catchall_3
    const/4 v0, 0x0

    .line 544
    :goto_9
    if-eqz v0, :cond_b

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    const-class v3, [C

    .line 551
    .line 552
    if-ne v2, v3, :cond_b

    .line 553
    .line 554
    move-object v5, v0

    .line 555
    goto :goto_a

    .line 556
    :cond_b
    const/4 v5, 0x0

    .line 557
    :goto_a
    if-eqz v5, :cond_d

    .line 558
    .line 559
    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 560
    .line 561
    if-nez v0, :cond_c

    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_c
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/clearcut/h0;->a(Ljava/lang/reflect/Field;)J

    .line 565
    .line 566
    .line 567
    :cond_d
    :goto_b
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 572
    .line 573
    if-ne v0, v2, :cond_e

    .line 574
    .line 575
    move/from16 v16, v1

    .line 576
    .line 577
    :cond_e
    sput-boolean v16, Lcom/google/android/gms/internal/clearcut/i0;->h:Z

    .line 578
    .line 579
    return-void
.end method

.method public static a([BJ)B
    .locals 2

    .line 1
    sget-wide v0, Lcom/google/android/gms/internal/clearcut/i0;->g:J

    add-long/2addr v0, p1

    sget-object p1, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    invoke-virtual {p1, v0, v1, p0}, Lcom/google/android/gms/internal/clearcut/h0;->l(JLjava/lang/Object;)B

    move-result p0

    return p0
.end method

.method public static b(IJLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/clearcut/h0;->b(IJLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static c(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/clearcut/h0;->a:Lsun/misc/Unsafe;

    .line 4
    .line 5
    invoke-virtual {v0, p2, p0, p1, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static d(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

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
    invoke-static {p1, v0, v1, p0}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static e(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

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
    invoke-static {p1, v0, v1, p0}, Lcom/google/android/gms/internal/clearcut/i0;->b(IJLjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static f()Lsun/misc/Unsafe;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/clearcut/j0;

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

.method public static g()Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const-class v3, Ljava/nio/Buffer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "effectiveDirectAddress"

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-object v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const-string v0, "address"

    .line 26
    .line 27
    :try_start_1
    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-object v0, v2

    .line 36
    :goto_1
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    return-object v2
.end method

.method public static h(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/clearcut/i0;->f:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    iget-object v0, v0, Lcom/google/android/gms/internal/clearcut/h0;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static i(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/clearcut/i0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/clearcut/h0;->a:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static j(Ljava/lang/Class;)Z
    .locals 7

    .line 1
    const-class v0, [B

    invoke-static {}, Lcom/google/android/gms/internal/clearcut/i;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/clearcut/i0;->c:Ljava/lang/Class;

    const-string v3, "peekLong"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeLong"

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v5, v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeInt"

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v5, v4}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekInt"

    filled-new-array {p0, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByte"

    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    filled-new-array {p0, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByte"

    filled-new-array {p0}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByteArray"

    filled-new-array {p0, v0, v5, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByteArray"

    filled-new-array {p0, v0, v5, v5}, [Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, v3, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v2
.end method

.method public static k(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/clearcut/h0;->a:Lsun/misc/Unsafe;

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

.method public static l(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

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

.method public static m(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/android/gms/internal/clearcut/i0;->d:Lcom/google/android/gms/internal/clearcut/h0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/internal/clearcut/h0;->g(JLjava/lang/Object;)I

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
