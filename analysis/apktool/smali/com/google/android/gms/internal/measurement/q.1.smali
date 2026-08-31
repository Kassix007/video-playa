.class public final Lcom/google/android/gms/internal/measurement/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lcom/google/android/gms/internal/measurement/n;


# instance fields
.field public final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "StringValue cannot be null."

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method


# virtual methods
.method public final b()Ljava/lang/Double;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object v0

    .line 14
    :catch_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final d()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/measurement/p;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final g(Ljava/lang/String;LE/c0;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;
    .locals 24

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v4, "charAt"

    .line 4
    .line 5
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v5

    .line 9
    const-string v6, "trim"

    .line 10
    .line 11
    const-string v7, "concat"

    .line 12
    .line 13
    const-string v8, "toLocaleUpperCase"

    .line 14
    .line 15
    const-string v9, "toString"

    .line 16
    .line 17
    const-string v10, "toLocaleLowerCase"

    .line 18
    .line 19
    const-string v11, "toLowerCase"

    .line 20
    .line 21
    const-string v12, "substring"

    .line 22
    .line 23
    const-string v13, "split"

    .line 24
    .line 25
    const-string v14, "slice"

    .line 26
    .line 27
    const-string v15, "search"

    .line 28
    .line 29
    move/from16 v16, v5

    .line 30
    .line 31
    const-string v5, "replace"

    .line 32
    .line 33
    const-string v2, "match"

    .line 34
    .line 35
    const-string v3, "lastIndexOf"

    .line 36
    .line 37
    const-string v0, "indexOf"

    .line 38
    .line 39
    move-object/from16 v17, v4

    .line 40
    .line 41
    const-string v4, "hasOwnProperty"

    .line 42
    .line 43
    move-object/from16 v18, v6

    .line 44
    .line 45
    const-string v6, "toUpperCase"

    .line 46
    .line 47
    if-nez v16, :cond_1

    .line 48
    .line 49
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    if-nez v16, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v16

    .line 59
    if-nez v16, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    if-nez v16, :cond_1

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v16

    .line 71
    if-nez v16, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v16

    .line 77
    if-nez v16, :cond_1

    .line 78
    .line 79
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v16

    .line 83
    if-nez v16, :cond_1

    .line 84
    .line 85
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v16

    .line 89
    if-nez v16, :cond_1

    .line 90
    .line 91
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v16

    .line 95
    if-nez v16, :cond_1

    .line 96
    .line 97
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v16

    .line 101
    if-nez v16, :cond_1

    .line 102
    .line 103
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    if-nez v16, :cond_1

    .line 108
    .line 109
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    if-nez v16, :cond_1

    .line 114
    .line 115
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v16

    .line 119
    if-nez v16, :cond_1

    .line 120
    .line 121
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    if-nez v16, :cond_1

    .line 126
    .line 127
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    if-nez v16, :cond_1

    .line 132
    .line 133
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v16

    .line 137
    if-nez v16, :cond_1

    .line 138
    .line 139
    move-object/from16 v16, v4

    .line 140
    .line 141
    move-object/from16 v4, v18

    .line 142
    .line 143
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v18

    .line 147
    if-eqz v18, :cond_0

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 151
    .line 152
    const-string v2, " is not a String function"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_1
    move-object/from16 v16, v4

    .line 163
    .line 164
    move-object/from16 v4, v18

    .line 165
    .line 166
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v18

    .line 170
    move-object/from16 v19, v9

    .line 171
    .line 172
    sparse-switch v18, :sswitch_data_0

    .line 173
    .line 174
    .line 175
    :cond_2
    move-object/from16 v9, v16

    .line 176
    .line 177
    move-object/from16 v4, v17

    .line 178
    .line 179
    :goto_1
    move-object/from16 v7, v19

    .line 180
    .line 181
    goto/16 :goto_4

    .line 182
    .line 183
    :sswitch_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_2

    .line 188
    .line 189
    move-object/from16 v9, v16

    .line 190
    .line 191
    move-object/from16 v4, v17

    .line 192
    .line 193
    move-object/from16 v7, v19

    .line 194
    .line 195
    const/4 v1, 0x3

    .line 196
    goto/16 :goto_5

    .line 197
    .line 198
    :sswitch_1
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_2

    .line 203
    .line 204
    const/4 v1, 0x6

    .line 205
    :goto_2
    move-object/from16 v9, v16

    .line 206
    .line 207
    move-object/from16 v4, v17

    .line 208
    .line 209
    :goto_3
    move-object/from16 v7, v19

    .line 210
    .line 211
    goto/16 :goto_5

    .line 212
    .line 213
    :sswitch_2
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_2

    .line 218
    .line 219
    const/16 v1, 0xa

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :sswitch_3
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_2

    .line 227
    .line 228
    const/16 v1, 0x9

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :sswitch_4
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_2

    .line 236
    .line 237
    const/16 v1, 0x8

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :sswitch_5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_2

    .line 245
    .line 246
    const/4 v1, 0x5

    .line 247
    goto :goto_2

    .line 248
    :sswitch_6
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_2

    .line 253
    .line 254
    const/16 v1, 0x10

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :sswitch_7
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_2

    .line 262
    .line 263
    const/16 v1, 0xf

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :sswitch_8
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_2

    .line 271
    .line 272
    const/4 v1, 0x4

    .line 273
    goto :goto_2

    .line 274
    :sswitch_9
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_2

    .line 279
    .line 280
    const/16 v1, 0xb

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :sswitch_a
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_2

    .line 288
    .line 289
    const/4 v1, 0x7

    .line 290
    goto :goto_2

    .line 291
    :sswitch_b
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_2

    .line 296
    .line 297
    const/16 v1, 0xd

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :sswitch_c
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-eqz v1, :cond_2

    .line 305
    .line 306
    move-object/from16 v9, v16

    .line 307
    .line 308
    move-object/from16 v4, v17

    .line 309
    .line 310
    move-object/from16 v7, v19

    .line 311
    .line 312
    const/4 v1, 0x1

    .line 313
    goto :goto_5

    .line 314
    :sswitch_d
    move-object/from16 v4, v17

    .line 315
    .line 316
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_3

    .line 321
    .line 322
    move-object/from16 v9, v16

    .line 323
    .line 324
    move-object/from16 v7, v19

    .line 325
    .line 326
    const/4 v1, 0x0

    .line 327
    goto :goto_5

    .line 328
    :cond_3
    move-object/from16 v9, v16

    .line 329
    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :sswitch_e
    move-object/from16 v4, v17

    .line 333
    .line 334
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_3

    .line 339
    .line 340
    const/16 v1, 0xc

    .line 341
    .line 342
    move-object/from16 v9, v16

    .line 343
    .line 344
    goto/16 :goto_3

    .line 345
    .line 346
    :sswitch_f
    move-object/from16 v4, v17

    .line 347
    .line 348
    move-object/from16 v7, v19

    .line 349
    .line 350
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_4

    .line 355
    .line 356
    const/16 v1, 0xe

    .line 357
    .line 358
    move-object/from16 v9, v16

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_4
    move-object/from16 v9, v16

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :sswitch_10
    move-object/from16 v9, v16

    .line 365
    .line 366
    move-object/from16 v4, v17

    .line 367
    .line 368
    move-object/from16 v7, v19

    .line 369
    .line 370
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_5

    .line 375
    .line 376
    const/4 v1, 0x2

    .line 377
    goto :goto_5

    .line 378
    :cond_5
    :goto_4
    const/4 v1, -0x1

    .line 379
    :goto_5
    const-string v16, "undefined"

    .line 380
    .line 381
    move-object/from16 v18, v0

    .line 382
    .line 383
    move/from16 p1, v1

    .line 384
    .line 385
    const-wide/16 v22, 0x0

    .line 386
    .line 387
    move-object/from16 v0, p0

    .line 388
    .line 389
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 390
    .line 391
    packed-switch p1, :pswitch_data_0

    .line 392
    .line 393
    .line 394
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 395
    .line 396
    const-string v2, "Command not supported"

    .line 397
    .line 398
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :pswitch_0
    move-object/from16 v4, p3

    .line 403
    .line 404
    const/4 v2, 0x0

    .line 405
    invoke-static {v2, v6, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 406
    .line 407
    .line 408
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-object v2

    .line 418
    :pswitch_1
    move-object/from16 v4, p3

    .line 419
    .line 420
    const/4 v2, 0x0

    .line 421
    invoke-static {v2, v6, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 422
    .line 423
    .line 424
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 425
    .line 426
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 427
    .line 428
    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    return-object v2

    .line 436
    :pswitch_2
    move-object/from16 v4, p3

    .line 437
    .line 438
    const/4 v2, 0x0

    .line 439
    invoke-static {v2, v7, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 440
    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_3
    move-object/from16 v4, p3

    .line 444
    .line 445
    const/4 v2, 0x0

    .line 446
    invoke-static {v2, v11, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 447
    .line 448
    .line 449
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 450
    .line 451
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 452
    .line 453
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    return-object v2

    .line 461
    :pswitch_4
    move-object/from16 v4, p3

    .line 462
    .line 463
    const/4 v2, 0x0

    .line 464
    invoke-static {v2, v10, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 465
    .line 466
    .line 467
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    return-object v2

    .line 477
    :pswitch_5
    move-object/from16 v4, p3

    .line 478
    .line 479
    const/4 v2, 0x0

    .line 480
    invoke-static {v2, v8, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 481
    .line 482
    .line 483
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    return-object v2

    .line 493
    :pswitch_6
    move-object/from16 v4, p3

    .line 494
    .line 495
    const/4 v2, 0x0

    .line 496
    const/4 v3, 0x2

    .line 497
    invoke-static {v12, v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-nez v3, :cond_6

    .line 505
    .line 506
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 511
    .line 512
    move-object/from16 v6, p2

    .line 513
    .line 514
    iget-object v2, v6, LE/c0;->r:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 517
    .line 518
    invoke-virtual {v2, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 527
    .line 528
    .line 529
    move-result-wide v2

    .line 530
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 531
    .line 532
    .line 533
    move-result-wide v2

    .line 534
    double-to-int v2, v2

    .line 535
    goto :goto_6

    .line 536
    :cond_6
    move-object/from16 v6, p2

    .line 537
    .line 538
    const/4 v2, 0x0

    .line 539
    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    const/4 v5, 0x1

    .line 544
    if-le v3, v5, :cond_7

    .line 545
    .line 546
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 551
    .line 552
    iget-object v4, v6, LE/c0;->r:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v4, Lcom/google/android/gms/internal/measurement/t;

    .line 555
    .line 556
    invoke-virtual {v4, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 565
    .line 566
    .line 567
    move-result-wide v3

    .line 568
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 569
    .line 570
    .line 571
    move-result-wide v3

    .line 572
    double-to-int v3, v3

    .line 573
    :goto_7
    const/4 v4, 0x0

    .line 574
    goto :goto_8

    .line 575
    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    goto :goto_7

    .line 580
    :goto_8
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    new-instance v4, Lcom/google/android/gms/internal/measurement/q;

    .line 605
    .line 606
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 611
    .line 612
    .line 613
    move-result v2

    .line 614
    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return-object v4

    .line 622
    :pswitch_7
    move-object/from16 v6, p2

    .line 623
    .line 624
    move-object/from16 v4, p3

    .line 625
    .line 626
    const/4 v3, 0x2

    .line 627
    invoke-static {v13, v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    if-nez v2, :cond_8

    .line 635
    .line 636
    new-instance v1, Lcom/google/android/gms/internal/measurement/d;

    .line 637
    .line 638
    const/4 v5, 0x1

    .line 639
    new-array v2, v5, [Lcom/google/android/gms/internal/measurement/n;

    .line 640
    .line 641
    const/4 v3, 0x0

    .line 642
    aput-object v0, v2, v3

    .line 643
    .line 644
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/util/List;)V

    .line 649
    .line 650
    .line 651
    return-object v1

    .line 652
    :cond_8
    const/4 v3, 0x0

    .line 653
    new-instance v2, Ljava/util/ArrayList;

    .line 654
    .line 655
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 659
    .line 660
    .line 661
    move-result v5

    .line 662
    if-eqz v5, :cond_9

    .line 663
    .line 664
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto/16 :goto_c

    .line 668
    .line 669
    :cond_9
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    check-cast v5, Lcom/google/android/gms/internal/measurement/n;

    .line 674
    .line 675
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 678
    .line 679
    invoke-virtual {v3, v6, v5}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    const/4 v7, 0x1

    .line 692
    if-le v5, v7, :cond_a

    .line 693
    .line 694
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    check-cast v4, Lcom/google/android/gms/internal/measurement/n;

    .line 699
    .line 700
    iget-object v5, v6, LE/c0;->r:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 703
    .line 704
    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 713
    .line 714
    .line 715
    move-result-wide v4

    .line 716
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/I1;->O0(D)I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    int-to-long v4, v4

    .line 721
    const-wide v6, 0xffffffffL

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    and-long/2addr v4, v6

    .line 727
    goto :goto_9

    .line 728
    :cond_a
    const-wide/32 v4, 0x7fffffff

    .line 729
    .line 730
    .line 731
    :goto_9
    const-wide/16 v6, 0x0

    .line 732
    .line 733
    cmp-long v6, v4, v6

    .line 734
    .line 735
    if-nez v6, :cond_b

    .line 736
    .line 737
    new-instance v1, Lcom/google/android/gms/internal/measurement/d;

    .line 738
    .line 739
    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 740
    .line 741
    .line 742
    return-object v1

    .line 743
    :cond_b
    invoke-static {v3}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    long-to-int v7, v4

    .line 748
    const/16 v21, 0x1

    .line 749
    .line 750
    add-int/lit8 v7, v7, 0x1

    .line 751
    .line 752
    invoke-virtual {v1, v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    array-length v6, v1

    .line 757
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    if-eqz v3, :cond_c

    .line 762
    .line 763
    if-lez v6, :cond_c

    .line 764
    .line 765
    const/16 v17, 0x0

    .line 766
    .line 767
    aget-object v3, v1, v17

    .line 768
    .line 769
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v9

    .line 773
    add-int/lit8 v3, v6, -0x1

    .line 774
    .line 775
    aget-object v7, v1, v3

    .line 776
    .line 777
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 778
    .line 779
    .line 780
    move-result v7

    .line 781
    if-nez v7, :cond_d

    .line 782
    .line 783
    move v3, v6

    .line 784
    goto :goto_a

    .line 785
    :cond_c
    move v3, v6

    .line 786
    const/4 v9, 0x0

    .line 787
    :cond_d
    :goto_a
    int-to-long v6, v6

    .line 788
    cmp-long v4, v6, v4

    .line 789
    .line 790
    if-lez v4, :cond_e

    .line 791
    .line 792
    add-int/lit8 v3, v3, -0x1

    .line 793
    .line 794
    :cond_e
    :goto_b
    if-ge v9, v3, :cond_f

    .line 795
    .line 796
    new-instance v4, Lcom/google/android/gms/internal/measurement/q;

    .line 797
    .line 798
    aget-object v5, v1, v9

    .line 799
    .line 800
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    add-int/lit8 v9, v9, 0x1

    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_f
    :goto_c
    new-instance v1, Lcom/google/android/gms/internal/measurement/d;

    .line 810
    .line 811
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/util/List;)V

    .line 812
    .line 813
    .line 814
    return-object v1

    .line 815
    :pswitch_8
    move-object/from16 v6, p2

    .line 816
    .line 817
    move-object/from16 v4, p3

    .line 818
    .line 819
    const/4 v3, 0x2

    .line 820
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    if-nez v2, :cond_10

    .line 828
    .line 829
    const/4 v2, 0x0

    .line 830
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 835
    .line 836
    iget-object v2, v6, LE/c0;->r:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 839
    .line 840
    invoke-virtual {v2, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 849
    .line 850
    .line 851
    move-result-wide v2

    .line 852
    goto :goto_d

    .line 853
    :cond_10
    move-wide/from16 v2, v22

    .line 854
    .line 855
    :goto_d
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 856
    .line 857
    .line 858
    move-result-wide v2

    .line 859
    cmpg-double v5, v2, v22

    .line 860
    .line 861
    if-gez v5, :cond_11

    .line 862
    .line 863
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 864
    .line 865
    .line 866
    move-result v5

    .line 867
    int-to-double v7, v5

    .line 868
    add-double/2addr v7, v2

    .line 869
    move-wide/from16 v2, v22

    .line 870
    .line 871
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 872
    .line 873
    .line 874
    move-result-wide v7

    .line 875
    goto :goto_e

    .line 876
    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 877
    .line 878
    .line 879
    move-result v5

    .line 880
    int-to-double v7, v5

    .line 881
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(DD)D

    .line 882
    .line 883
    .line 884
    move-result-wide v7

    .line 885
    :goto_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    const/4 v5, 0x1

    .line 890
    if-le v2, v5, :cond_12

    .line 891
    .line 892
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 897
    .line 898
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 901
    .line 902
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 911
    .line 912
    .line 913
    move-result-wide v2

    .line 914
    goto :goto_f

    .line 915
    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 916
    .line 917
    .line 918
    move-result v2

    .line 919
    int-to-double v2, v2

    .line 920
    :goto_f
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 921
    .line 922
    .line 923
    move-result-wide v2

    .line 924
    const-wide/16 v9, 0x0

    .line 925
    .line 926
    cmpg-double v4, v2, v9

    .line 927
    .line 928
    if-gez v4, :cond_13

    .line 929
    .line 930
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    int-to-double v4, v4

    .line 935
    add-double/2addr v4, v2

    .line 936
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(DD)D

    .line 937
    .line 938
    .line 939
    move-result-wide v2

    .line 940
    goto :goto_10

    .line 941
    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    int-to-double v4, v4

    .line 946
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 947
    .line 948
    .line 949
    move-result-wide v2

    .line 950
    :goto_10
    double-to-int v4, v7

    .line 951
    double-to-int v2, v2

    .line 952
    sub-int/2addr v2, v4

    .line 953
    const/4 v3, 0x0

    .line 954
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    add-int/2addr v2, v4

    .line 959
    new-instance v3, Lcom/google/android/gms/internal/measurement/q;

    .line 960
    .line 961
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    return-object v3

    .line 969
    :pswitch_9
    move-object/from16 v6, p2

    .line 970
    .line 971
    move-object/from16 v4, p3

    .line 972
    .line 973
    const/4 v3, 0x0

    .line 974
    const/4 v5, 0x1

    .line 975
    invoke-static {v15, v5, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 979
    .line 980
    .line 981
    move-result v2

    .line 982
    if-nez v2, :cond_14

    .line 983
    .line 984
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 989
    .line 990
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 993
    .line 994
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v16

    .line 1002
    :cond_14
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    if-eqz v2, :cond_15

    .line 1015
    .line 1016
    new-instance v2, Lcom/google/android/gms/internal/measurement/g;

    .line 1017
    .line 1018
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    .line 1019
    .line 1020
    .line 1021
    move-result v1

    .line 1022
    int-to-double v3, v1

    .line 1023
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1028
    .line 1029
    .line 1030
    return-object v2

    .line 1031
    :cond_15
    new-instance v1, Lcom/google/android/gms/internal/measurement/g;

    .line 1032
    .line 1033
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 1034
    .line 1035
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v2

    .line 1039
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1040
    .line 1041
    .line 1042
    return-object v1

    .line 1043
    :pswitch_a
    move-object/from16 v6, p2

    .line 1044
    .line 1045
    move-object/from16 v4, p3

    .line 1046
    .line 1047
    const/4 v3, 0x2

    .line 1048
    invoke-static {v5, v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    sget-object v3, Lcom/google/android/gms/internal/measurement/n;->d:Lcom/google/android/gms/internal/measurement/r;

    .line 1056
    .line 1057
    if-nez v2, :cond_16

    .line 1058
    .line 1059
    const/4 v2, 0x0

    .line 1060
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    check-cast v5, Lcom/google/android/gms/internal/measurement/n;

    .line 1065
    .line 1066
    iget-object v2, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1069
    .line 1070
    invoke-virtual {v2, v6, v5}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v16

    .line 1078
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1079
    .line 1080
    .line 1081
    move-result v2

    .line 1082
    const/4 v5, 0x1

    .line 1083
    if-le v2, v5, :cond_16

    .line 1084
    .line 1085
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1090
    .line 1091
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1092
    .line 1093
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1094
    .line 1095
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v3

    .line 1099
    :cond_16
    move-object/from16 v2, v16

    .line 1100
    .line 1101
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1102
    .line 1103
    .line 1104
    move-result v4

    .line 1105
    if-ltz v4, :cond_22

    .line 1106
    .line 1107
    instance-of v5, v3, Lcom/google/android/gms/internal/measurement/h;

    .line 1108
    .line 1109
    if-eqz v5, :cond_17

    .line 1110
    .line 1111
    check-cast v3, Lcom/google/android/gms/internal/measurement/h;

    .line 1112
    .line 1113
    new-instance v5, Lcom/google/android/gms/internal/measurement/q;

    .line 1114
    .line 1115
    invoke-direct {v5, v2}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    int-to-double v7, v4

    .line 1119
    new-instance v9, Lcom/google/android/gms/internal/measurement/g;

    .line 1120
    .line 1121
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v7

    .line 1125
    invoke-direct {v9, v7}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1126
    .line 1127
    .line 1128
    const/4 v7, 0x3

    .line 1129
    new-array v7, v7, [Lcom/google/android/gms/internal/measurement/n;

    .line 1130
    .line 1131
    const/4 v8, 0x0

    .line 1132
    aput-object v5, v7, v8

    .line 1133
    .line 1134
    const/16 v21, 0x1

    .line 1135
    .line 1136
    aput-object v9, v7, v21

    .line 1137
    .line 1138
    const/16 v20, 0x2

    .line 1139
    .line 1140
    aput-object v0, v7, v20

    .line 1141
    .line 1142
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v5

    .line 1146
    invoke-virtual {v3, v6, v5}, Lcom/google/android/gms/internal/measurement/h;->a(LE/c0;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    goto :goto_11

    .line 1151
    :cond_17
    const/4 v8, 0x0

    .line 1152
    :goto_11
    new-instance v5, Lcom/google/android/gms/internal/measurement/q;

    .line 1153
    .line 1154
    invoke-virtual {v1, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v6

    .line 1158
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v3

    .line 1162
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1163
    .line 1164
    .line 1165
    move-result v2

    .line 1166
    add-int/2addr v2, v4

    .line 1167
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1176
    .line 1177
    .line 1178
    move-result v2

    .line 1179
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v4

    .line 1183
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1184
    .line 1185
    .line 1186
    move-result v4

    .line 1187
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v7

    .line 1191
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1192
    .line 1193
    .line 1194
    move-result v7

    .line 1195
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    add-int/2addr v2, v4

    .line 1198
    add-int/2addr v2, v7

    .line 1199
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    invoke-direct {v5, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    return-object v5

    .line 1219
    :pswitch_b
    move-object/from16 v6, p2

    .line 1220
    .line 1221
    move-object/from16 v4, p3

    .line 1222
    .line 1223
    const/4 v5, 0x1

    .line 1224
    invoke-static {v2, v5, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    if-gtz v2, :cond_18

    .line 1232
    .line 1233
    const-string v2, ""

    .line 1234
    .line 1235
    goto :goto_12

    .line 1236
    :cond_18
    const/4 v2, 0x0

    .line 1237
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v3

    .line 1241
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 1242
    .line 1243
    iget-object v2, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1246
    .line 1247
    invoke-virtual {v2, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v2

    .line 1251
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v2

    .line 1255
    :goto_12
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v1

    .line 1263
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 1264
    .line 1265
    .line 1266
    move-result v2

    .line 1267
    if-eqz v2, :cond_19

    .line 1268
    .line 1269
    new-instance v2, Lcom/google/android/gms/internal/measurement/d;

    .line 1270
    .line 1271
    new-instance v3, Lcom/google/android/gms/internal/measurement/q;

    .line 1272
    .line 1273
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v1

    .line 1277
    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    const/4 v5, 0x1

    .line 1281
    new-array v1, v5, [Lcom/google/android/gms/internal/measurement/n;

    .line 1282
    .line 1283
    const/4 v8, 0x0

    .line 1284
    aput-object v3, v1, v8

    .line 1285
    .line 1286
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v1

    .line 1290
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/util/List;)V

    .line 1291
    .line 1292
    .line 1293
    return-object v2

    .line 1294
    :cond_19
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->e:Lcom/google/android/gms/internal/measurement/l;

    .line 1295
    .line 1296
    return-object v1

    .line 1297
    :pswitch_c
    move-object/from16 v6, p2

    .line 1298
    .line 1299
    move-object/from16 v4, p3

    .line 1300
    .line 1301
    const/4 v2, 0x2

    .line 1302
    const/4 v8, 0x0

    .line 1303
    invoke-static {v3, v2, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1307
    .line 1308
    .line 1309
    move-result v2

    .line 1310
    if-gtz v2, :cond_1a

    .line 1311
    .line 1312
    :goto_13
    move-object/from16 v2, v16

    .line 1313
    .line 1314
    goto :goto_14

    .line 1315
    :cond_1a
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1320
    .line 1321
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1322
    .line 1323
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1324
    .line 1325
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v16

    .line 1333
    goto :goto_13

    .line 1334
    :goto_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1335
    .line 1336
    .line 1337
    move-result v3

    .line 1338
    const/4 v5, 0x2

    .line 1339
    if-ge v3, v5, :cond_1b

    .line 1340
    .line 1341
    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    .line 1342
    .line 1343
    goto :goto_15

    .line 1344
    :cond_1b
    const/4 v5, 0x1

    .line 1345
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v3

    .line 1349
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 1350
    .line 1351
    iget-object v4, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v4, Lcom/google/android/gms/internal/measurement/t;

    .line 1354
    .line 1355
    invoke-virtual {v4, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v3

    .line 1359
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1364
    .line 1365
    .line 1366
    move-result-wide v3

    .line 1367
    :goto_15
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v5

    .line 1371
    if-eqz v5, :cond_1c

    .line 1372
    .line 1373
    const-wide/high16 v3, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 1374
    .line 1375
    goto :goto_16

    .line 1376
    :cond_1c
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1377
    .line 1378
    .line 1379
    move-result-wide v3

    .line 1380
    :goto_16
    double-to-int v3, v3

    .line 1381
    new-instance v4, Lcom/google/android/gms/internal/measurement/g;

    .line 1382
    .line 1383
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 1384
    .line 1385
    .line 1386
    move-result v1

    .line 1387
    int-to-double v1, v1

    .line 1388
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v1

    .line 1392
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1393
    .line 1394
    .line 1395
    return-object v4

    .line 1396
    :pswitch_d
    move-object/from16 v6, p2

    .line 1397
    .line 1398
    move-object/from16 v4, p3

    .line 1399
    .line 1400
    move-object/from16 v2, v18

    .line 1401
    .line 1402
    move-wide/from16 v9, v22

    .line 1403
    .line 1404
    const/4 v3, 0x2

    .line 1405
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-gtz v2, :cond_1d

    .line 1413
    .line 1414
    :goto_17
    move-object/from16 v2, v16

    .line 1415
    .line 1416
    goto :goto_18

    .line 1417
    :cond_1d
    const/4 v2, 0x0

    .line 1418
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1423
    .line 1424
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1425
    .line 1426
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1427
    .line 1428
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v2

    .line 1432
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v16

    .line 1436
    goto :goto_17

    .line 1437
    :goto_18
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    const/4 v5, 0x2

    .line 1442
    if-ge v3, v5, :cond_1e

    .line 1443
    .line 1444
    move-wide v3, v9

    .line 1445
    goto :goto_19

    .line 1446
    :cond_1e
    const/4 v5, 0x1

    .line 1447
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v3

    .line 1451
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 1452
    .line 1453
    iget-object v4, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1454
    .line 1455
    check-cast v4, Lcom/google/android/gms/internal/measurement/t;

    .line 1456
    .line 1457
    invoke-virtual {v4, v6, v3}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 1466
    .line 1467
    .line 1468
    move-result-wide v3

    .line 1469
    :goto_19
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1470
    .line 1471
    .line 1472
    move-result-wide v3

    .line 1473
    double-to-int v3, v3

    .line 1474
    new-instance v4, Lcom/google/android/gms/internal/measurement/g;

    .line 1475
    .line 1476
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 1477
    .line 1478
    .line 1479
    move-result v1

    .line 1480
    int-to-double v1, v1

    .line 1481
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1486
    .line 1487
    .line 1488
    return-object v4

    .line 1489
    :pswitch_e
    move-object/from16 v6, p2

    .line 1490
    .line 1491
    move-object/from16 v4, p3

    .line 1492
    .line 1493
    const/4 v5, 0x1

    .line 1494
    invoke-static {v5, v9, v4}, Lcom/google/android/gms/internal/measurement/I1;->I0(ILjava/lang/String;Ljava/util/List;)V

    .line 1495
    .line 1496
    .line 1497
    const/4 v2, 0x0

    .line 1498
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1503
    .line 1504
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1505
    .line 1506
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1507
    .line 1508
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v3

    .line 1516
    const-string v4, "length"

    .line 1517
    .line 1518
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v3

    .line 1522
    sget-object v4, Lcom/google/android/gms/internal/measurement/n;->i:Lcom/google/android/gms/internal/measurement/e;

    .line 1523
    .line 1524
    if-eqz v3, :cond_1f

    .line 1525
    .line 1526
    return-object v4

    .line 1527
    :cond_1f
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v2

    .line 1531
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1532
    .line 1533
    .line 1534
    move-result-wide v2

    .line 1535
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 1536
    .line 1537
    .line 1538
    move-result-wide v5

    .line 1539
    cmpl-double v5, v2, v5

    .line 1540
    .line 1541
    if-nez v5, :cond_20

    .line 1542
    .line 1543
    double-to-int v2, v2

    .line 1544
    if-ltz v2, :cond_20

    .line 1545
    .line 1546
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1547
    .line 1548
    .line 1549
    move-result v1

    .line 1550
    if-ge v2, v1, :cond_20

    .line 1551
    .line 1552
    return-object v4

    .line 1553
    :cond_20
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->j:Lcom/google/android/gms/internal/measurement/e;

    .line 1554
    .line 1555
    return-object v1

    .line 1556
    :pswitch_f
    move-object/from16 v6, p2

    .line 1557
    .line 1558
    move-object/from16 v4, p3

    .line 1559
    .line 1560
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v2

    .line 1564
    if-nez v2, :cond_22

    .line 1565
    .line 1566
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1567
    .line 1568
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    const/4 v9, 0x0

    .line 1572
    :goto_1a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1573
    .line 1574
    .line 1575
    move-result v1

    .line 1576
    if-ge v9, v1, :cond_21

    .line 1577
    .line 1578
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v1

    .line 1582
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 1583
    .line 1584
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1585
    .line 1586
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1587
    .line 1588
    invoke-virtual {v3, v6, v1}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v1

    .line 1592
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/n;->zzc()Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v1

    .line 1596
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1597
    .line 1598
    .line 1599
    add-int/lit8 v9, v9, 0x1

    .line 1600
    .line 1601
    goto :goto_1a

    .line 1602
    :cond_21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v1

    .line 1606
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 1607
    .line 1608
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1609
    .line 1610
    .line 1611
    return-object v2

    .line 1612
    :cond_22
    return-object v0

    .line 1613
    :pswitch_10
    move-object/from16 v6, p2

    .line 1614
    .line 1615
    move-object/from16 v3, p3

    .line 1616
    .line 1617
    const/4 v5, 0x1

    .line 1618
    invoke-static {v4, v5, v3}, Lcom/google/android/gms/internal/measurement/I1;->K0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1622
    .line 1623
    .line 1624
    move-result v2

    .line 1625
    if-nez v2, :cond_23

    .line 1626
    .line 1627
    const/4 v2, 0x0

    .line 1628
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1633
    .line 1634
    iget-object v3, v6, LE/c0;->r:Ljava/lang/Object;

    .line 1635
    .line 1636
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1637
    .line 1638
    invoke-virtual {v3, v6, v2}, Lcom/google/android/gms/internal/measurement/t;->c(LE/c0;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v2

    .line 1642
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v2

    .line 1646
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1647
    .line 1648
    .line 1649
    move-result-wide v2

    .line 1650
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/I1;->P0(D)D

    .line 1651
    .line 1652
    .line 1653
    move-result-wide v2

    .line 1654
    double-to-int v9, v2

    .line 1655
    goto :goto_1b

    .line 1656
    :cond_23
    const/4 v2, 0x0

    .line 1657
    move v9, v2

    .line 1658
    :goto_1b
    if-ltz v9, :cond_25

    .line 1659
    .line 1660
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1661
    .line 1662
    .line 1663
    move-result v2

    .line 1664
    if-lt v9, v2, :cond_24

    .line 1665
    .line 1666
    goto :goto_1c

    .line 1667
    :cond_24
    new-instance v2, Lcom/google/android/gms/internal/measurement/q;

    .line 1668
    .line 1669
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 1670
    .line 1671
    .line 1672
    move-result v1

    .line 1673
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1678
    .line 1679
    .line 1680
    return-object v2

    .line 1681
    :cond_25
    :goto_1c
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->k:Lcom/google/android/gms/internal/measurement/q;

    .line 1682
    .line 1683
    return-object v1

    .line 1684
    nop

    .line 1685
    :sswitch_data_0
    .sparse-switch
        -0x6aaca37f -> :sswitch_10
        -0x69e9ad94 -> :sswitch_f
        -0x57513364 -> :sswitch_e
        -0x5128e1d7 -> :sswitch_d
        -0x50c088ec -> :sswitch_c
        -0x43ce226a -> :sswitch_b
        -0x36059a58 -> :sswitch_a
        -0x2b53be43 -> :sswitch_9
        -0x1bdda92d -> :sswitch_8
        -0x17d0ad49 -> :sswitch_7
        0x367422 -> :sswitch_6
        0x62dd9c5 -> :sswitch_5
        0x6873d92 -> :sswitch_4
        0x6891b1a -> :sswitch_3
        0x1f9f6e51 -> :sswitch_2
        0x413cb2b4 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/measurement/p;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final l()Lcom/google/android/gms/internal/measurement/n;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    add-int/lit8 v2, v2, 0x2

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v2, "\""

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q;->q:Ljava/lang/String;

    return-object v0
.end method
