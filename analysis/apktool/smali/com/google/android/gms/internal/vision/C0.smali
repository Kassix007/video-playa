.class public final Lcom/google/android/gms/internal/vision/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/vision/L0;


# static fields
.field public static final n:[I

.field public static final o:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/android/gms/internal/vision/K;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Lcom/google/android/gms/internal/vision/F0;

.field public final k:Lcom/google/android/gms/internal/vision/r0;

.field public final l:Lcom/google/android/gms/internal/vision/N0;

.field public final m:Lcom/google/android/gms/internal/vision/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/vision/C0;->n:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/vision/U0;->g()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/vision/K;Z[IIILcom/google/android/gms/internal/vision/F0;Lcom/google/android/gms/internal/vision/r0;Lcom/google/android/gms/internal/vision/N0;Lcom/google/android/gms/internal/vision/V;Lcom/google/android/gms/internal/vision/z0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/vision/C0;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/vision/C0;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/vision/C0;->d:I

    .line 11
    .line 12
    iput-boolean p6, p0, Lcom/google/android/gms/internal/vision/C0;->f:Z

    .line 13
    .line 14
    iput-object p7, p0, Lcom/google/android/gms/internal/vision/C0;->g:[I

    .line 15
    .line 16
    iput p8, p0, Lcom/google/android/gms/internal/vision/C0;->h:I

    .line 17
    .line 18
    iput p9, p0, Lcom/google/android/gms/internal/vision/C0;->i:I

    .line 19
    .line 20
    iput-object p10, p0, Lcom/google/android/gms/internal/vision/C0;->j:Lcom/google/android/gms/internal/vision/F0;

    .line 21
    .line 22
    iput-object p11, p0, Lcom/google/android/gms/internal/vision/C0;->k:Lcom/google/android/gms/internal/vision/r0;

    .line 23
    .line 24
    iput-object p12, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 25
    .line 26
    iput-object p5, p0, Lcom/google/android/gms/internal/vision/C0;->e:Lcom/google/android/gms/internal/vision/K;

    .line 27
    .line 28
    iput-object p14, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 29
    .line 30
    return-void
.end method

.method public static B(JLjava/lang/Object;)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static C(JLjava/lang/Object;)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static D(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/O0;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/vision/e0;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/internal/vision/O0;->f:Lcom/google/android/gms/internal/vision/O0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/vision/O0;->b()Lcom/google/android/gms/internal/vision/O0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public static l(Lcom/google/android/gms/internal/vision/J0;Lcom/google/android/gms/internal/vision/F0;Lcom/google/android/gms/internal/vision/r0;Lcom/google/android/gms/internal/vision/N0;Lcom/google/android/gms/internal/vision/V;Lcom/google/android/gms/internal/vision/z0;)Lcom/google/android/gms/internal/vision/C0;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/vision/J0;

    .line 4
    .line 5
    if-eqz v1, :cond_33

    .line 6
    .line 7
    iget v1, v0, Lcom/google/android/gms/internal/vision/J0;->d:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    and-int/2addr v1, v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    move v10, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v10, v2

    .line 17
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/vision/J0;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const v6, 0xd800

    .line 28
    .line 29
    .line 30
    if-lt v5, v6, :cond_1

    .line 31
    .line 32
    move v5, v2

    .line 33
    :goto_1
    add-int/lit8 v7, v5, 0x1

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-lt v5, v6, :cond_2

    .line 40
    .line 41
    move v5, v7

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v7, v2

    .line 44
    :cond_2
    add-int/lit8 v5, v7, 0x1

    .line 45
    .line 46
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/16 v8, 0xd

    .line 51
    .line 52
    if-lt v7, v6, :cond_4

    .line 53
    .line 54
    and-int/lit16 v7, v7, 0x1fff

    .line 55
    .line 56
    move v9, v8

    .line 57
    :goto_2
    add-int/lit8 v11, v5, 0x1

    .line 58
    .line 59
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-lt v5, v6, :cond_3

    .line 64
    .line 65
    and-int/lit16 v5, v5, 0x1fff

    .line 66
    .line 67
    shl-int/2addr v5, v9

    .line 68
    or-int/2addr v7, v5

    .line 69
    add-int/lit8 v9, v9, 0xd

    .line 70
    .line 71
    move v5, v11

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    shl-int/2addr v5, v9

    .line 74
    or-int/2addr v7, v5

    .line 75
    move v5, v11

    .line 76
    :cond_4
    if-nez v7, :cond_5

    .line 77
    .line 78
    sget-object v7, Lcom/google/android/gms/internal/vision/C0;->n:[I

    .line 79
    .line 80
    move/from16 v17, v2

    .line 81
    .line 82
    move v2, v3

    .line 83
    move v12, v2

    .line 84
    move v13, v12

    .line 85
    move v14, v13

    .line 86
    move v15, v14

    .line 87
    move-object v11, v7

    .line 88
    move v9, v8

    .line 89
    move v7, v15

    .line 90
    move v8, v7

    .line 91
    goto/16 :goto_c

    .line 92
    .line 93
    :cond_5
    add-int/lit8 v7, v5, 0x1

    .line 94
    .line 95
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-lt v5, v6, :cond_7

    .line 100
    .line 101
    and-int/lit16 v5, v5, 0x1fff

    .line 102
    .line 103
    move v9, v8

    .line 104
    :goto_3
    add-int/lit8 v11, v7, 0x1

    .line 105
    .line 106
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-lt v7, v6, :cond_6

    .line 111
    .line 112
    and-int/lit16 v7, v7, 0x1fff

    .line 113
    .line 114
    shl-int/2addr v7, v9

    .line 115
    or-int/2addr v5, v7

    .line 116
    add-int/lit8 v9, v9, 0xd

    .line 117
    .line 118
    move v7, v11

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    shl-int/2addr v7, v9

    .line 121
    or-int/2addr v5, v7

    .line 122
    move v7, v11

    .line 123
    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 124
    .line 125
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-lt v7, v6, :cond_9

    .line 130
    .line 131
    and-int/lit16 v7, v7, 0x1fff

    .line 132
    .line 133
    move v11, v8

    .line 134
    :goto_4
    add-int/lit8 v12, v9, 0x1

    .line 135
    .line 136
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-lt v9, v6, :cond_8

    .line 141
    .line 142
    and-int/lit16 v9, v9, 0x1fff

    .line 143
    .line 144
    shl-int/2addr v9, v11

    .line 145
    or-int/2addr v7, v9

    .line 146
    add-int/lit8 v11, v11, 0xd

    .line 147
    .line 148
    move v9, v12

    .line 149
    goto :goto_4

    .line 150
    :cond_8
    shl-int/2addr v9, v11

    .line 151
    or-int/2addr v7, v9

    .line 152
    move v9, v12

    .line 153
    :cond_9
    add-int/lit8 v11, v9, 0x1

    .line 154
    .line 155
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-lt v9, v6, :cond_b

    .line 160
    .line 161
    and-int/lit16 v9, v9, 0x1fff

    .line 162
    .line 163
    move v12, v8

    .line 164
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 165
    .line 166
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-lt v11, v6, :cond_a

    .line 171
    .line 172
    and-int/lit16 v11, v11, 0x1fff

    .line 173
    .line 174
    shl-int/2addr v11, v12

    .line 175
    or-int/2addr v9, v11

    .line 176
    add-int/lit8 v12, v12, 0xd

    .line 177
    .line 178
    move v11, v13

    .line 179
    goto :goto_5

    .line 180
    :cond_a
    shl-int/2addr v11, v12

    .line 181
    or-int/2addr v9, v11

    .line 182
    move v11, v13

    .line 183
    :cond_b
    add-int/lit8 v12, v11, 0x1

    .line 184
    .line 185
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    if-lt v11, v6, :cond_d

    .line 190
    .line 191
    and-int/lit16 v11, v11, 0x1fff

    .line 192
    .line 193
    move v13, v8

    .line 194
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 195
    .line 196
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-lt v12, v6, :cond_c

    .line 201
    .line 202
    and-int/lit16 v12, v12, 0x1fff

    .line 203
    .line 204
    shl-int/2addr v12, v13

    .line 205
    or-int/2addr v11, v12

    .line 206
    add-int/lit8 v13, v13, 0xd

    .line 207
    .line 208
    move v12, v14

    .line 209
    goto :goto_6

    .line 210
    :cond_c
    shl-int/2addr v12, v13

    .line 211
    or-int/2addr v11, v12

    .line 212
    move v12, v14

    .line 213
    :cond_d
    add-int/lit8 v13, v12, 0x1

    .line 214
    .line 215
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    if-lt v12, v6, :cond_f

    .line 220
    .line 221
    and-int/lit16 v12, v12, 0x1fff

    .line 222
    .line 223
    move v14, v8

    .line 224
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 225
    .line 226
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-lt v13, v6, :cond_e

    .line 231
    .line 232
    and-int/lit16 v13, v13, 0x1fff

    .line 233
    .line 234
    shl-int/2addr v13, v14

    .line 235
    or-int/2addr v12, v13

    .line 236
    add-int/lit8 v14, v14, 0xd

    .line 237
    .line 238
    move v13, v15

    .line 239
    goto :goto_7

    .line 240
    :cond_e
    shl-int/2addr v13, v14

    .line 241
    or-int/2addr v12, v13

    .line 242
    move v13, v15

    .line 243
    :cond_f
    add-int/lit8 v14, v13, 0x1

    .line 244
    .line 245
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    if-lt v13, v6, :cond_11

    .line 250
    .line 251
    and-int/lit16 v13, v13, 0x1fff

    .line 252
    .line 253
    move v15, v8

    .line 254
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 255
    .line 256
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-lt v14, v6, :cond_10

    .line 261
    .line 262
    and-int/lit16 v14, v14, 0x1fff

    .line 263
    .line 264
    shl-int/2addr v14, v15

    .line 265
    or-int/2addr v13, v14

    .line 266
    add-int/lit8 v15, v15, 0xd

    .line 267
    .line 268
    move/from16 v14, v16

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_10
    shl-int/2addr v14, v15

    .line 272
    or-int/2addr v13, v14

    .line 273
    move/from16 v14, v16

    .line 274
    .line 275
    :cond_11
    add-int/lit8 v15, v14, 0x1

    .line 276
    .line 277
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 278
    .line 279
    .line 280
    move-result v14

    .line 281
    if-lt v14, v6, :cond_13

    .line 282
    .line 283
    and-int/lit16 v14, v14, 0x1fff

    .line 284
    .line 285
    move/from16 v16, v8

    .line 286
    .line 287
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 288
    .line 289
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    if-lt v15, v6, :cond_12

    .line 294
    .line 295
    and-int/lit16 v15, v15, 0x1fff

    .line 296
    .line 297
    shl-int v15, v15, v16

    .line 298
    .line 299
    or-int/2addr v14, v15

    .line 300
    add-int/lit8 v16, v16, 0xd

    .line 301
    .line 302
    move/from16 v15, v17

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_12
    shl-int v15, v15, v16

    .line 306
    .line 307
    or-int/2addr v14, v15

    .line 308
    move/from16 v15, v17

    .line 309
    .line 310
    :cond_13
    add-int/lit8 v16, v15, 0x1

    .line 311
    .line 312
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 313
    .line 314
    .line 315
    move-result v15

    .line 316
    if-lt v15, v6, :cond_15

    .line 317
    .line 318
    and-int/lit16 v15, v15, 0x1fff

    .line 319
    .line 320
    move/from16 v17, v2

    .line 321
    .line 322
    move/from16 v2, v16

    .line 323
    .line 324
    move/from16 v16, v8

    .line 325
    .line 326
    :goto_a
    add-int/lit8 v18, v2, 0x1

    .line 327
    .line 328
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-lt v2, v6, :cond_14

    .line 333
    .line 334
    and-int/lit16 v2, v2, 0x1fff

    .line 335
    .line 336
    shl-int v2, v2, v16

    .line 337
    .line 338
    or-int/2addr v15, v2

    .line 339
    add-int/lit8 v16, v16, 0xd

    .line 340
    .line 341
    move/from16 v2, v18

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_14
    shl-int v2, v2, v16

    .line 345
    .line 346
    or-int/2addr v15, v2

    .line 347
    move/from16 v16, v18

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_15
    move/from16 v17, v2

    .line 351
    .line 352
    :goto_b
    add-int v2, v15, v13

    .line 353
    .line 354
    add-int/2addr v2, v14

    .line 355
    new-array v2, v2, [I

    .line 356
    .line 357
    shl-int/lit8 v14, v5, 0x1

    .line 358
    .line 359
    add-int/2addr v14, v7

    .line 360
    move v7, v9

    .line 361
    move v9, v8

    .line 362
    move v8, v11

    .line 363
    move-object v11, v2

    .line 364
    move v2, v5

    .line 365
    move/from16 v5, v16

    .line 366
    .line 367
    :goto_c
    sget-object v3, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 368
    .line 369
    iget-object v9, v0, Lcom/google/android/gms/internal/vision/J0;->c:[Ljava/lang/Object;

    .line 370
    .line 371
    iget-object v6, v0, Lcom/google/android/gms/internal/vision/J0;->a:Lcom/google/android/gms/internal/vision/K;

    .line 372
    .line 373
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    move/from16 v20, v2

    .line 378
    .line 379
    mul-int/lit8 v2, v12, 0x3

    .line 380
    .line 381
    new-array v2, v2, [I

    .line 382
    .line 383
    shl-int/lit8 v12, v12, 0x1

    .line 384
    .line 385
    new-array v12, v12, [Ljava/lang/Object;

    .line 386
    .line 387
    add-int/2addr v13, v15

    .line 388
    move/from16 v24, v13

    .line 389
    .line 390
    move/from16 v23, v15

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    :goto_d
    if-ge v5, v4, :cond_32

    .line 397
    .line 398
    add-int/lit8 v25, v5, 0x1

    .line 399
    .line 400
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    move-object/from16 v26, v2

    .line 405
    .line 406
    const v2, 0xd800

    .line 407
    .line 408
    .line 409
    if-lt v5, v2, :cond_17

    .line 410
    .line 411
    and-int/lit16 v5, v5, 0x1fff

    .line 412
    .line 413
    move/from16 v2, v25

    .line 414
    .line 415
    const/16 v25, 0xd

    .line 416
    .line 417
    :goto_e
    add-int/lit8 v27, v2, 0x1

    .line 418
    .line 419
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    move/from16 v28, v4

    .line 424
    .line 425
    const v4, 0xd800

    .line 426
    .line 427
    .line 428
    if-lt v2, v4, :cond_16

    .line 429
    .line 430
    and-int/lit16 v2, v2, 0x1fff

    .line 431
    .line 432
    shl-int v2, v2, v25

    .line 433
    .line 434
    or-int/2addr v5, v2

    .line 435
    add-int/lit8 v25, v25, 0xd

    .line 436
    .line 437
    move/from16 v2, v27

    .line 438
    .line 439
    move/from16 v4, v28

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_16
    shl-int v2, v2, v25

    .line 443
    .line 444
    or-int/2addr v5, v2

    .line 445
    move/from16 v2, v27

    .line 446
    .line 447
    goto :goto_f

    .line 448
    :cond_17
    move/from16 v28, v4

    .line 449
    .line 450
    move/from16 v2, v25

    .line 451
    .line 452
    :goto_f
    add-int/lit8 v4, v2, 0x1

    .line 453
    .line 454
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    move/from16 v25, v4

    .line 459
    .line 460
    const v4, 0xd800

    .line 461
    .line 462
    .line 463
    if-lt v2, v4, :cond_19

    .line 464
    .line 465
    and-int/lit16 v2, v2, 0x1fff

    .line 466
    .line 467
    move/from16 v4, v25

    .line 468
    .line 469
    const/16 v25, 0xd

    .line 470
    .line 471
    :goto_10
    add-int/lit8 v27, v4, 0x1

    .line 472
    .line 473
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    move/from16 v29, v2

    .line 478
    .line 479
    const v2, 0xd800

    .line 480
    .line 481
    .line 482
    if-lt v4, v2, :cond_18

    .line 483
    .line 484
    and-int/lit16 v2, v4, 0x1fff

    .line 485
    .line 486
    shl-int v2, v2, v25

    .line 487
    .line 488
    or-int v2, v29, v2

    .line 489
    .line 490
    add-int/lit8 v25, v25, 0xd

    .line 491
    .line 492
    move/from16 v4, v27

    .line 493
    .line 494
    goto :goto_10

    .line 495
    :cond_18
    shl-int v2, v4, v25

    .line 496
    .line 497
    or-int v2, v29, v2

    .line 498
    .line 499
    move/from16 v4, v27

    .line 500
    .line 501
    goto :goto_11

    .line 502
    :cond_19
    move/from16 v4, v25

    .line 503
    .line 504
    :goto_11
    move/from16 v25, v5

    .line 505
    .line 506
    and-int/lit16 v5, v2, 0xff

    .line 507
    .line 508
    move/from16 v27, v7

    .line 509
    .line 510
    and-int/lit16 v7, v2, 0x400

    .line 511
    .line 512
    if-eqz v7, :cond_1a

    .line 513
    .line 514
    add-int/lit8 v7, v21, 0x1

    .line 515
    .line 516
    aput v22, v11, v21

    .line 517
    .line 518
    move/from16 v21, v7

    .line 519
    .line 520
    :cond_1a
    const/16 v7, 0x33

    .line 521
    .line 522
    move/from16 v31, v8

    .line 523
    .line 524
    if-lt v5, v7, :cond_22

    .line 525
    .line 526
    add-int/lit8 v7, v4, 0x1

    .line 527
    .line 528
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    const v8, 0xd800

    .line 533
    .line 534
    .line 535
    if-lt v4, v8, :cond_1c

    .line 536
    .line 537
    and-int/lit16 v4, v4, 0x1fff

    .line 538
    .line 539
    const/16 v32, 0xd

    .line 540
    .line 541
    :goto_12
    add-int/lit8 v33, v7, 0x1

    .line 542
    .line 543
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    if-lt v7, v8, :cond_1b

    .line 548
    .line 549
    and-int/lit16 v7, v7, 0x1fff

    .line 550
    .line 551
    shl-int v7, v7, v32

    .line 552
    .line 553
    or-int/2addr v4, v7

    .line 554
    add-int/lit8 v32, v32, 0xd

    .line 555
    .line 556
    move/from16 v7, v33

    .line 557
    .line 558
    const v8, 0xd800

    .line 559
    .line 560
    .line 561
    goto :goto_12

    .line 562
    :cond_1b
    shl-int v7, v7, v32

    .line 563
    .line 564
    or-int/2addr v4, v7

    .line 565
    move/from16 v7, v33

    .line 566
    .line 567
    :cond_1c
    add-int/lit8 v8, v5, -0x33

    .line 568
    .line 569
    move/from16 v32, v4

    .line 570
    .line 571
    const/16 v4, 0x9

    .line 572
    .line 573
    if-eq v8, v4, :cond_1e

    .line 574
    .line 575
    const/16 v4, 0x11

    .line 576
    .line 577
    if-ne v8, v4, :cond_1d

    .line 578
    .line 579
    goto :goto_14

    .line 580
    :cond_1d
    const/16 v4, 0xc

    .line 581
    .line 582
    if-ne v8, v4, :cond_1f

    .line 583
    .line 584
    if-nez v10, :cond_1f

    .line 585
    .line 586
    div-int/lit8 v4, v22, 0x3

    .line 587
    .line 588
    shl-int/lit8 v4, v4, 0x1

    .line 589
    .line 590
    add-int/lit8 v4, v4, 0x1

    .line 591
    .line 592
    add-int/lit8 v8, v14, 0x1

    .line 593
    .line 594
    aget-object v14, v9, v14

    .line 595
    .line 596
    aput-object v14, v12, v4

    .line 597
    .line 598
    :goto_13
    move v14, v8

    .line 599
    goto :goto_15

    .line 600
    :cond_1e
    :goto_14
    div-int/lit8 v4, v22, 0x3

    .line 601
    .line 602
    shl-int/lit8 v4, v4, 0x1

    .line 603
    .line 604
    add-int/lit8 v4, v4, 0x1

    .line 605
    .line 606
    add-int/lit8 v8, v14, 0x1

    .line 607
    .line 608
    aget-object v14, v9, v14

    .line 609
    .line 610
    aput-object v14, v12, v4

    .line 611
    .line 612
    goto :goto_13

    .line 613
    :cond_1f
    :goto_15
    shl-int/lit8 v4, v32, 0x1

    .line 614
    .line 615
    aget-object v8, v9, v4

    .line 616
    .line 617
    move/from16 v29, v4

    .line 618
    .line 619
    instance-of v4, v8, Ljava/lang/reflect/Field;

    .line 620
    .line 621
    if-eqz v4, :cond_20

    .line 622
    .line 623
    check-cast v8, Ljava/lang/reflect/Field;

    .line 624
    .line 625
    :goto_16
    move v4, v7

    .line 626
    goto :goto_17

    .line 627
    :cond_20
    check-cast v8, Ljava/lang/String;

    .line 628
    .line 629
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/vision/C0;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    aput-object v8, v9, v29

    .line 634
    .line 635
    goto :goto_16

    .line 636
    :goto_17
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 637
    .line 638
    .line 639
    move-result-wide v7

    .line 640
    long-to-int v7, v7

    .line 641
    add-int/lit8 v8, v29, 0x1

    .line 642
    .line 643
    move/from16 v29, v4

    .line 644
    .line 645
    aget-object v4, v9, v8

    .line 646
    .line 647
    move/from16 v30, v7

    .line 648
    .line 649
    instance-of v7, v4, Ljava/lang/reflect/Field;

    .line 650
    .line 651
    if-eqz v7, :cond_21

    .line 652
    .line 653
    check-cast v4, Ljava/lang/reflect/Field;

    .line 654
    .line 655
    goto :goto_18

    .line 656
    :cond_21
    check-cast v4, Ljava/lang/String;

    .line 657
    .line 658
    invoke-static {v4, v6}, Lcom/google/android/gms/internal/vision/C0;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    aput-object v4, v9, v8

    .line 663
    .line 664
    :goto_18
    invoke-virtual {v3, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 665
    .line 666
    .line 667
    move-result-wide v7

    .line 668
    long-to-int v4, v7

    .line 669
    move/from16 v7, v30

    .line 670
    .line 671
    move/from16 v30, v29

    .line 672
    .line 673
    move/from16 v29, v7

    .line 674
    .line 675
    move v7, v4

    .line 676
    const/4 v4, 0x0

    .line 677
    goto/16 :goto_22

    .line 678
    .line 679
    :cond_22
    add-int/lit8 v7, v14, 0x1

    .line 680
    .line 681
    aget-object v8, v9, v14

    .line 682
    .line 683
    check-cast v8, Ljava/lang/String;

    .line 684
    .line 685
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/vision/C0;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 686
    .line 687
    .line 688
    move-result-object v8

    .line 689
    move/from16 v32, v7

    .line 690
    .line 691
    const/16 v7, 0x9

    .line 692
    .line 693
    if-eq v5, v7, :cond_29

    .line 694
    .line 695
    const/16 v7, 0x11

    .line 696
    .line 697
    if-ne v5, v7, :cond_23

    .line 698
    .line 699
    goto :goto_1c

    .line 700
    :cond_23
    const/16 v7, 0x1b

    .line 701
    .line 702
    if-eq v5, v7, :cond_28

    .line 703
    .line 704
    const/16 v7, 0x31

    .line 705
    .line 706
    if-ne v5, v7, :cond_24

    .line 707
    .line 708
    goto :goto_1b

    .line 709
    :cond_24
    const/16 v7, 0xc

    .line 710
    .line 711
    if-eq v5, v7, :cond_27

    .line 712
    .line 713
    const/16 v7, 0x1e

    .line 714
    .line 715
    if-eq v5, v7, :cond_27

    .line 716
    .line 717
    const/16 v7, 0x2c

    .line 718
    .line 719
    if-ne v5, v7, :cond_25

    .line 720
    .line 721
    goto :goto_1a

    .line 722
    :cond_25
    const/16 v7, 0x32

    .line 723
    .line 724
    if-ne v5, v7, :cond_2a

    .line 725
    .line 726
    add-int/lit8 v7, v23, 0x1

    .line 727
    .line 728
    aput v22, v11, v23

    .line 729
    .line 730
    div-int/lit8 v23, v22, 0x3

    .line 731
    .line 732
    shl-int/lit8 v23, v23, 0x1

    .line 733
    .line 734
    add-int/lit8 v29, v14, 0x2

    .line 735
    .line 736
    aget-object v30, v9, v32

    .line 737
    .line 738
    aput-object v30, v12, v23

    .line 739
    .line 740
    move/from16 v30, v7

    .line 741
    .line 742
    and-int/lit16 v7, v2, 0x800

    .line 743
    .line 744
    if-eqz v7, :cond_26

    .line 745
    .line 746
    add-int/lit8 v23, v23, 0x1

    .line 747
    .line 748
    add-int/lit8 v7, v14, 0x3

    .line 749
    .line 750
    aget-object v14, v9, v29

    .line 751
    .line 752
    aput-object v14, v12, v23

    .line 753
    .line 754
    move v14, v7

    .line 755
    :goto_19
    move/from16 v23, v30

    .line 756
    .line 757
    goto :goto_1d

    .line 758
    :cond_26
    move/from16 v14, v29

    .line 759
    .line 760
    goto :goto_19

    .line 761
    :cond_27
    :goto_1a
    if-nez v10, :cond_2a

    .line 762
    .line 763
    div-int/lit8 v7, v22, 0x3

    .line 764
    .line 765
    shl-int/lit8 v7, v7, 0x1

    .line 766
    .line 767
    add-int/lit8 v7, v7, 0x1

    .line 768
    .line 769
    add-int/lit8 v14, v14, 0x2

    .line 770
    .line 771
    aget-object v29, v9, v32

    .line 772
    .line 773
    aput-object v29, v12, v7

    .line 774
    .line 775
    goto :goto_1d

    .line 776
    :cond_28
    :goto_1b
    div-int/lit8 v7, v22, 0x3

    .line 777
    .line 778
    shl-int/lit8 v7, v7, 0x1

    .line 779
    .line 780
    add-int/lit8 v7, v7, 0x1

    .line 781
    .line 782
    add-int/lit8 v14, v14, 0x2

    .line 783
    .line 784
    aget-object v29, v9, v32

    .line 785
    .line 786
    aput-object v29, v12, v7

    .line 787
    .line 788
    goto :goto_1d

    .line 789
    :cond_29
    :goto_1c
    div-int/lit8 v7, v22, 0x3

    .line 790
    .line 791
    shl-int/lit8 v7, v7, 0x1

    .line 792
    .line 793
    add-int/lit8 v7, v7, 0x1

    .line 794
    .line 795
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    move-result-object v14

    .line 799
    aput-object v14, v12, v7

    .line 800
    .line 801
    :cond_2a
    move/from16 v14, v32

    .line 802
    .line 803
    :goto_1d
    invoke-virtual {v3, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 804
    .line 805
    .line 806
    move-result-wide v7

    .line 807
    long-to-int v7, v7

    .line 808
    and-int/lit16 v8, v2, 0x1000

    .line 809
    .line 810
    move/from16 v29, v7

    .line 811
    .line 812
    const/16 v7, 0x1000

    .line 813
    .line 814
    if-ne v8, v7, :cond_2e

    .line 815
    .line 816
    const/16 v7, 0x11

    .line 817
    .line 818
    if-gt v5, v7, :cond_2e

    .line 819
    .line 820
    add-int/lit8 v7, v4, 0x1

    .line 821
    .line 822
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    const v8, 0xd800

    .line 827
    .line 828
    .line 829
    if-lt v4, v8, :cond_2c

    .line 830
    .line 831
    and-int/lit16 v4, v4, 0x1fff

    .line 832
    .line 833
    const/16 v19, 0xd

    .line 834
    .line 835
    :goto_1e
    add-int/lit8 v30, v7, 0x1

    .line 836
    .line 837
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-lt v7, v8, :cond_2b

    .line 842
    .line 843
    and-int/lit16 v7, v7, 0x1fff

    .line 844
    .line 845
    shl-int v7, v7, v19

    .line 846
    .line 847
    or-int/2addr v4, v7

    .line 848
    add-int/lit8 v19, v19, 0xd

    .line 849
    .line 850
    move/from16 v7, v30

    .line 851
    .line 852
    goto :goto_1e

    .line 853
    :cond_2b
    shl-int v7, v7, v19

    .line 854
    .line 855
    or-int/2addr v4, v7

    .line 856
    goto :goto_1f

    .line 857
    :cond_2c
    move/from16 v30, v7

    .line 858
    .line 859
    :goto_1f
    shl-int/lit8 v7, v20, 0x1

    .line 860
    .line 861
    div-int/lit8 v19, v4, 0x20

    .line 862
    .line 863
    add-int v19, v19, v7

    .line 864
    .line 865
    aget-object v7, v9, v19

    .line 866
    .line 867
    instance-of v8, v7, Ljava/lang/reflect/Field;

    .line 868
    .line 869
    if-eqz v8, :cond_2d

    .line 870
    .line 871
    check-cast v7, Ljava/lang/reflect/Field;

    .line 872
    .line 873
    goto :goto_20

    .line 874
    :cond_2d
    check-cast v7, Ljava/lang/String;

    .line 875
    .line 876
    invoke-static {v7, v6}, Lcom/google/android/gms/internal/vision/C0;->n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 877
    .line 878
    .line 879
    move-result-object v7

    .line 880
    aput-object v7, v9, v19

    .line 881
    .line 882
    :goto_20
    invoke-virtual {v3, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 883
    .line 884
    .line 885
    move-result-wide v7

    .line 886
    long-to-int v7, v7

    .line 887
    rem-int/lit8 v4, v4, 0x20

    .line 888
    .line 889
    goto :goto_21

    .line 890
    :cond_2e
    const v7, 0xfffff

    .line 891
    .line 892
    .line 893
    move/from16 v30, v4

    .line 894
    .line 895
    const/4 v4, 0x0

    .line 896
    :goto_21
    const/16 v8, 0x12

    .line 897
    .line 898
    if-lt v5, v8, :cond_2f

    .line 899
    .line 900
    const/16 v8, 0x31

    .line 901
    .line 902
    if-gt v5, v8, :cond_2f

    .line 903
    .line 904
    add-int/lit8 v8, v24, 0x1

    .line 905
    .line 906
    aput v29, v11, v24

    .line 907
    .line 908
    move/from16 v24, v8

    .line 909
    .line 910
    :cond_2f
    :goto_22
    add-int/lit8 v8, v22, 0x1

    .line 911
    .line 912
    aput v25, v26, v22

    .line 913
    .line 914
    add-int/lit8 v19, v22, 0x2

    .line 915
    .line 916
    move-object/from16 v25, v1

    .line 917
    .line 918
    and-int/lit16 v1, v2, 0x200

    .line 919
    .line 920
    if-eqz v1, :cond_30

    .line 921
    .line 922
    const/high16 v1, 0x20000000

    .line 923
    .line 924
    goto :goto_23

    .line 925
    :cond_30
    const/4 v1, 0x0

    .line 926
    :goto_23
    and-int/lit16 v2, v2, 0x100

    .line 927
    .line 928
    if-eqz v2, :cond_31

    .line 929
    .line 930
    const/high16 v2, 0x10000000

    .line 931
    .line 932
    goto :goto_24

    .line 933
    :cond_31
    const/4 v2, 0x0

    .line 934
    :goto_24
    or-int/2addr v1, v2

    .line 935
    shl-int/lit8 v2, v5, 0x14

    .line 936
    .line 937
    or-int/2addr v1, v2

    .line 938
    or-int v1, v1, v29

    .line 939
    .line 940
    aput v1, v26, v8

    .line 941
    .line 942
    add-int/lit8 v22, v22, 0x3

    .line 943
    .line 944
    shl-int/lit8 v1, v4, 0x14

    .line 945
    .line 946
    or-int/2addr v1, v7

    .line 947
    aput v1, v26, v19

    .line 948
    .line 949
    move-object/from16 v1, v25

    .line 950
    .line 951
    move-object/from16 v2, v26

    .line 952
    .line 953
    move/from16 v7, v27

    .line 954
    .line 955
    move/from16 v4, v28

    .line 956
    .line 957
    move/from16 v5, v30

    .line 958
    .line 959
    move/from16 v8, v31

    .line 960
    .line 961
    goto/16 :goto_d

    .line 962
    .line 963
    :cond_32
    move-object/from16 v26, v2

    .line 964
    .line 965
    move/from16 v27, v7

    .line 966
    .line 967
    move/from16 v31, v8

    .line 968
    .line 969
    new-instance v4, Lcom/google/android/gms/internal/vision/C0;

    .line 970
    .line 971
    iget-object v9, v0, Lcom/google/android/gms/internal/vision/J0;->a:Lcom/google/android/gms/internal/vision/K;

    .line 972
    .line 973
    move-object/from16 v14, p1

    .line 974
    .line 975
    move-object/from16 v16, p3

    .line 976
    .line 977
    move-object/from16 v17, p4

    .line 978
    .line 979
    move-object/from16 v18, p5

    .line 980
    .line 981
    move-object v6, v12

    .line 982
    move v12, v15

    .line 983
    move-object/from16 v5, v26

    .line 984
    .line 985
    move-object/from16 v15, p2

    .line 986
    .line 987
    invoke-direct/range {v4 .. v18}, Lcom/google/android/gms/internal/vision/C0;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/vision/K;Z[IIILcom/google/android/gms/internal/vision/F0;Lcom/google/android/gms/internal/vision/r0;Lcom/google/android/gms/internal/vision/N0;Lcom/google/android/gms/internal/vision/V;Lcom/google/android/gms/internal/vision/z0;)V

    .line 988
    .line 989
    .line 990
    return-object v4

    .line 991
    :cond_33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    new-instance v0, Ljava/lang/ClassCastException;

    .line 995
    .line 996
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 997
    .line 998
    .line 999
    throw v0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v2, v2, 0x28

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    add-int/2addr v3, v2

    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v2, v3

    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const-string v2, "Field "

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p0, " for "

    .line 78
    .line 79
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, " not found. Known fields are "

    .line 86
    .line 87
    invoke-static {v3, p0, v0}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v1
.end method

.method public static p(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V
    .locals 8

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p2, p2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lcom/google/android/gms/internal/vision/Q;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p2, p0, v0}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p2, Lcom/google/android/gms/internal/vision/Q;->c:[B

    .line 16
    .line 17
    iget v1, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    mul-int/lit8 v0, v0, 0x3

    .line 24
    .line 25
    invoke-static {v0}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v2}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ne v2, v0, :cond_0

    .line 38
    .line 39
    add-int v0, v1, v2

    .line 40
    .line 41
    iput v0, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/google/android/gms/internal/vision/Q;->F()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    sget-object v4, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 48
    .line 49
    invoke-virtual {v4, p1, p0, v0, v3}, Lcom/google/android/gms/internal/vision/d0;->h(Ljava/lang/String;[BII)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput v1, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 54
    .line 55
    sub-int v0, p0, v1

    .line 56
    .line 57
    sub-int/2addr v0, v2

    .line 58
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 59
    .line 60
    .line 61
    iput p0, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    move-object v7, p0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/vision/X0;->a(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 73
    .line 74
    .line 75
    iget v0, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/google/android/gms/internal/vision/Q;->F()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    sget-object v3, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    .line 82
    .line 83
    invoke-virtual {v3, p1, p0, v0, v2}, Lcom/google/android/gms/internal/vision/d0;->h(Ljava/lang/String;[BII)I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    iput p0, p2, Lcom/google/android/gms/internal/vision/Q;->e:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/vision/Y0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    .line 89
    return-void

    .line 90
    :catch_1
    move-exception v0

    .line 91
    move-object p0, v0

    .line 92
    new-instance p1, Lcom/google/android/gms/internal/vision/S;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/vision/S;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :goto_0
    iput v1, p2, Lcom/google/android/gms/internal/vision/Q;->e:I

    .line 99
    .line 100
    sget-object v2, Lcom/google/android/gms/internal/vision/Q;->f:Ljava/util/logging/Logger;

    .line 101
    .line 102
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 103
    .line 104
    const-string v5, "inefficientWriteStringNoTag"

    .line 105
    .line 106
    const-string v6, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    .line 107
    .line 108
    const-string v4, "com.google.protobuf.CodedOutputStream"

    .line 109
    .line 110
    invoke-virtual/range {v2 .. v7}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :try_start_1
    array-length p1, p0

    .line 120
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 121
    .line 122
    .line 123
    array-length p1, p0

    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-virtual {p2, p0, v0, p1}, Lcom/google/android/gms/internal/vision/Q;->L([BII)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/google/android/gms/internal/vision/S; {:try_start_1 .. :try_end_1} :catch_2

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :catch_2
    move-exception v0

    .line 130
    move-object p0, v0

    .line 131
    throw p0

    .line 132
    :catch_3
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    new-instance p1, Lcom/google/android/gms/internal/vision/S;

    .line 135
    .line 136
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/vision/S;-><init>(Ljava/lang/IndexOutOfBoundsException;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/vision/P;

    .line 141
    .line 142
    invoke-virtual {p2, p0, p1}, Lcom/google/android/gms/internal/vision/w0;->a(ILcom/google/android/gms/internal/vision/P;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method


# virtual methods
.method public final A(I)I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/C0;->h:I

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/google/android/gms/internal/vision/C0;->g:[I

    .line 5
    .line 6
    iget v3, p0, Lcom/google/android/gms/internal/vision/C0;->i:I

    .line 7
    .line 8
    if-ge v0, v3, :cond_1

    .line 9
    .line 10
    aget v2, v2, v0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    int-to-long v2, v2

    .line 21
    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget-object v5, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v5, v4

    .line 33
    check-cast v5, Lcom/google/android/gms/internal/vision/y0;

    .line 34
    .line 35
    iput-boolean v1, v5, Lcom/google/android/gms/internal/vision/y0;->q:Z

    .line 36
    .line 37
    invoke-static {v2, v3, p1, v4}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    array-length v0, v2

    .line 44
    :goto_1
    if-ge v3, v0, :cond_2

    .line 45
    .line 46
    aget v4, v2, v3

    .line 47
    .line 48
    int-to-long v4, v4

    .line 49
    iget-object v6, p0, Lcom/google/android/gms/internal/vision/C0;->k:Lcom/google/android/gms/internal/vision/r0;

    .line 50
    .line 51
    invoke-virtual {v6, v4, v5, p1}, Lcom/google/android/gms/internal/vision/r0;->b(JLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    check-cast p1, Lcom/google/android/gms/internal/vision/e0;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 65
    .line 66
    iput-boolean v1, p1, Lcom/google/android/gms/internal/vision/O0;->e:Z

    .line 67
    .line 68
    return-void
.end method

.method public final b(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lcom/google/android/gms/internal/vision/Q;

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/google/android/gms/internal/vision/C0;->f:Z

    .line 9
    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    aget v6, v1, v4

    .line 24
    .line 25
    const/high16 v7, 0xff00000

    .line 26
    .line 27
    and-int/2addr v7, v5

    .line 28
    ushr-int/lit8 v7, v7, 0x14

    .line 29
    .line 30
    const/16 v8, 0x3f

    .line 31
    .line 32
    const/4 v9, 0x5

    .line 33
    const/4 v10, 0x1

    .line 34
    const v11, 0xfffff

    .line 35
    .line 36
    .line 37
    packed-switch v7, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :pswitch_0
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    and-int/2addr v5, v11

    .line 49
    int-to-long v7, v5

    .line 50
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {p2, v6, v5, v7}, Lcom/google/android/gms/internal/vision/w0;->c(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :pswitch_1
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    and-int/2addr v5, v11

    .line 70
    int-to-long v11, v5

    .line 71
    invoke-static {v11, v12, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    shl-long v9, v11, v10

    .line 76
    .line 77
    shr-long v7, v11, v8

    .line 78
    .line 79
    xor-long/2addr v7, v9

    .line 80
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :pswitch_2
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_2

    .line 93
    .line 94
    and-int/2addr v5, v11

    .line 95
    int-to-long v7, v5

    .line 96
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    shl-int/lit8 v7, v5, 0x1

    .line 101
    .line 102
    shr-int/lit8 v5, v5, 0x1f

    .line 103
    .line 104
    xor-int/2addr v5, v7

    .line 105
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_3
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_2

    .line 118
    .line 119
    and-int/2addr v5, v11

    .line 120
    int-to-long v7, v5

    .line 121
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v7

    .line 125
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :pswitch_4
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_2

    .line 138
    .line 139
    and-int/2addr v5, v11

    .line 140
    int-to-long v7, v5

    .line 141
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_1

    .line 152
    .line 153
    :pswitch_5
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    if-eqz v7, :cond_2

    .line 158
    .line 159
    and-int/2addr v5, v11

    .line 160
    int-to-long v7, v5

    .line 161
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :pswitch_6
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_2

    .line 178
    .line 179
    and-int/2addr v5, v11

    .line 180
    int-to-long v7, v5

    .line 181
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :pswitch_7
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_2

    .line 198
    .line 199
    and-int/2addr v5, v11

    .line 200
    int-to-long v7, v5

    .line 201
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Lcom/google/android/gms/internal/vision/P;

    .line 206
    .line 207
    invoke-virtual {p2, v6, v5}, Lcom/google/android/gms/internal/vision/w0;->a(ILcom/google/android/gms/internal/vision/P;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :pswitch_8
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    if-eqz v7, :cond_2

    .line 217
    .line 218
    and-int/2addr v5, v11

    .line 219
    int-to-long v7, v5

    .line 220
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {p2, v6, v5, v7}, Lcom/google/android/gms/internal/vision/w0;->b(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_9
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_2

    .line 238
    .line 239
    and-int/2addr v5, v11

    .line 240
    int-to-long v7, v5

    .line 241
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-static {v6, v5, p2}, Lcom/google/android/gms/internal/vision/C0;->p(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :pswitch_a
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_2

    .line 255
    .line 256
    and-int/2addr v5, v11

    .line 257
    int-to-long v7, v5

    .line 258
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    check-cast v5, Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 269
    .line 270
    .line 271
    int-to-byte v5, v5

    .line 272
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->B(B)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :pswitch_b
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-eqz v7, :cond_2

    .line 282
    .line 283
    and-int/2addr v5, v11

    .line 284
    int-to-long v7, v5

    .line 285
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_1

    .line 296
    .line 297
    :pswitch_c
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    if-eqz v7, :cond_2

    .line 302
    .line 303
    and-int/2addr v5, v11

    .line 304
    int-to-long v7, v5

    .line 305
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 306
    .line 307
    .line 308
    move-result-wide v7

    .line 309
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_d
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    if-eqz v7, :cond_2

    .line 322
    .line 323
    and-int/2addr v5, v11

    .line 324
    int-to-long v7, v5

    .line 325
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :pswitch_e
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    if-eqz v7, :cond_2

    .line 342
    .line 343
    and-int/2addr v5, v11

    .line 344
    int-to-long v7, v5

    .line 345
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 346
    .line 347
    .line 348
    move-result-wide v7

    .line 349
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_f
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    if-eqz v7, :cond_2

    .line 362
    .line 363
    and-int/2addr v5, v11

    .line 364
    int-to-long v7, v5

    .line 365
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 366
    .line 367
    .line 368
    move-result-wide v7

    .line 369
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_1

    .line 376
    .line 377
    :pswitch_10
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    if-eqz v7, :cond_2

    .line 382
    .line 383
    and-int/2addr v5, v11

    .line 384
    int-to-long v7, v5

    .line 385
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    check-cast v5, Ljava/lang/Float;

    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_1

    .line 409
    .line 410
    :pswitch_11
    invoke-virtual {p0, v6, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    if-eqz v7, :cond_2

    .line 415
    .line 416
    and-int/2addr v5, v11

    .line 417
    int-to-long v7, v5

    .line 418
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    check-cast v5, Ljava/lang/Double;

    .line 423
    .line 424
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 425
    .line 426
    .line 427
    move-result-wide v7

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 432
    .line 433
    .line 434
    move-result-wide v7

    .line 435
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_1

    .line 442
    .line 443
    :pswitch_12
    and-int/2addr v5, v11

    .line 444
    int-to-long v5, v5

    .line 445
    invoke-static {v5, v6, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v5

    .line 449
    if-nez v5, :cond_0

    .line 450
    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :cond_0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    iget-object p2, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 458
    .line 459
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    if-nez p1, :cond_1

    .line 463
    .line 464
    new-instance p1, Ljava/lang/NoSuchMethodError;

    .line 465
    .line 466
    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 467
    .line 468
    .line 469
    throw p1

    .line 470
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 471
    .line 472
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 473
    .line 474
    .line 475
    throw p1

    .line 476
    :pswitch_13
    and-int/2addr v5, v11

    .line 477
    int-to-long v7, v5

    .line 478
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    check-cast v5, Ljava/util/List;

    .line 483
    .line 484
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    invoke-static {v6, v5, p2, v7}, Lcom/google/android/gms/internal/vision/M0;->m(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Lcom/google/android/gms/internal/vision/L0;)V

    .line 489
    .line 490
    .line 491
    goto/16 :goto_1

    .line 492
    .line 493
    :pswitch_14
    and-int/2addr v5, v11

    .line 494
    int-to-long v7, v5

    .line 495
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    check-cast v5, Ljava/util/List;

    .line 500
    .line 501
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->u(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_1

    .line 505
    .line 506
    :pswitch_15
    and-int/2addr v5, v11

    .line 507
    int-to-long v7, v5

    .line 508
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    check-cast v5, Ljava/util/List;

    .line 513
    .line 514
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->F(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_1

    .line 518
    .line 519
    :pswitch_16
    and-int/2addr v5, v11

    .line 520
    int-to-long v7, v5

    .line 521
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    check-cast v5, Ljava/util/List;

    .line 526
    .line 527
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->y(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_1

    .line 531
    .line 532
    :pswitch_17
    and-int/2addr v5, v11

    .line 533
    int-to-long v7, v5

    .line 534
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    check-cast v5, Ljava/util/List;

    .line 539
    .line 540
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->H(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_1

    .line 544
    .line 545
    :pswitch_18
    and-int/2addr v5, v11

    .line 546
    int-to-long v7, v5

    .line 547
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    check-cast v5, Ljava/util/List;

    .line 552
    .line 553
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->I(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_1

    .line 557
    .line 558
    :pswitch_19
    and-int/2addr v5, v11

    .line 559
    int-to-long v7, v5

    .line 560
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    check-cast v5, Ljava/util/List;

    .line 565
    .line 566
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->E(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 567
    .line 568
    .line 569
    goto/16 :goto_1

    .line 570
    .line 571
    :pswitch_1a
    and-int/2addr v5, v11

    .line 572
    int-to-long v7, v5

    .line 573
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    check-cast v5, Ljava/util/List;

    .line 578
    .line 579
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->J(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_1

    .line 583
    .line 584
    :pswitch_1b
    and-int/2addr v5, v11

    .line 585
    int-to-long v7, v5

    .line 586
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    check-cast v5, Ljava/util/List;

    .line 591
    .line 592
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->G(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_1

    .line 596
    .line 597
    :pswitch_1c
    and-int/2addr v5, v11

    .line 598
    int-to-long v7, v5

    .line 599
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    check-cast v5, Ljava/util/List;

    .line 604
    .line 605
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->w(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 606
    .line 607
    .line 608
    goto/16 :goto_1

    .line 609
    .line 610
    :pswitch_1d
    and-int/2addr v5, v11

    .line 611
    int-to-long v7, v5

    .line 612
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    check-cast v5, Ljava/util/List;

    .line 617
    .line 618
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->B(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_1

    .line 622
    .line 623
    :pswitch_1e
    and-int/2addr v5, v11

    .line 624
    int-to-long v7, v5

    .line 625
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    check-cast v5, Ljava/util/List;

    .line 630
    .line 631
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->s(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_1

    .line 635
    .line 636
    :pswitch_1f
    and-int/2addr v5, v11

    .line 637
    int-to-long v7, v5

    .line 638
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    check-cast v5, Ljava/util/List;

    .line 643
    .line 644
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->q(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_1

    .line 648
    .line 649
    :pswitch_20
    and-int/2addr v5, v11

    .line 650
    int-to-long v7, v5

    .line 651
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    check-cast v5, Ljava/util/List;

    .line 656
    .line 657
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->n(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_1

    .line 661
    .line 662
    :pswitch_21
    and-int/2addr v5, v11

    .line 663
    int-to-long v7, v5

    .line 664
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    check-cast v5, Ljava/util/List;

    .line 669
    .line 670
    invoke-static {v6, v5, p2, v10}, Lcom/google/android/gms/internal/vision/M0;->g(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 671
    .line 672
    .line 673
    goto/16 :goto_1

    .line 674
    .line 675
    :pswitch_22
    and-int/2addr v5, v11

    .line 676
    int-to-long v7, v5

    .line 677
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    check-cast v5, Ljava/util/List;

    .line 682
    .line 683
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->u(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 684
    .line 685
    .line 686
    goto/16 :goto_1

    .line 687
    .line 688
    :pswitch_23
    and-int/2addr v5, v11

    .line 689
    int-to-long v7, v5

    .line 690
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    check-cast v5, Ljava/util/List;

    .line 695
    .line 696
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->F(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 697
    .line 698
    .line 699
    goto/16 :goto_1

    .line 700
    .line 701
    :pswitch_24
    and-int/2addr v5, v11

    .line 702
    int-to-long v7, v5

    .line 703
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v5

    .line 707
    check-cast v5, Ljava/util/List;

    .line 708
    .line 709
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->y(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 710
    .line 711
    .line 712
    goto/16 :goto_1

    .line 713
    .line 714
    :pswitch_25
    and-int/2addr v5, v11

    .line 715
    int-to-long v7, v5

    .line 716
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    check-cast v5, Ljava/util/List;

    .line 721
    .line 722
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->H(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 723
    .line 724
    .line 725
    goto/16 :goto_1

    .line 726
    .line 727
    :pswitch_26
    and-int/2addr v5, v11

    .line 728
    int-to-long v7, v5

    .line 729
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    check-cast v5, Ljava/util/List;

    .line 734
    .line 735
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->I(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 736
    .line 737
    .line 738
    goto/16 :goto_1

    .line 739
    .line 740
    :pswitch_27
    and-int/2addr v5, v11

    .line 741
    int-to-long v7, v5

    .line 742
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v5

    .line 746
    check-cast v5, Ljava/util/List;

    .line 747
    .line 748
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->E(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 749
    .line 750
    .line 751
    goto/16 :goto_1

    .line 752
    .line 753
    :pswitch_28
    and-int/2addr v5, v11

    .line 754
    int-to-long v7, v5

    .line 755
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v5

    .line 759
    check-cast v5, Ljava/util/List;

    .line 760
    .line 761
    invoke-static {v6, v5, p2}, Lcom/google/android/gms/internal/vision/M0;->l(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;)V

    .line 762
    .line 763
    .line 764
    goto/16 :goto_1

    .line 765
    .line 766
    :pswitch_29
    and-int/2addr v5, v11

    .line 767
    int-to-long v7, v5

    .line 768
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v5

    .line 772
    check-cast v5, Ljava/util/List;

    .line 773
    .line 774
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 775
    .line 776
    .line 777
    move-result-object v7

    .line 778
    invoke-static {v6, v5, p2, v7}, Lcom/google/android/gms/internal/vision/M0;->f(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Lcom/google/android/gms/internal/vision/L0;)V

    .line 779
    .line 780
    .line 781
    goto/16 :goto_1

    .line 782
    .line 783
    :pswitch_2a
    and-int/2addr v5, v11

    .line 784
    int-to-long v7, v5

    .line 785
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    check-cast v5, Ljava/util/List;

    .line 790
    .line 791
    invoke-static {v6, v5, p2}, Lcom/google/android/gms/internal/vision/M0;->e(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;)V

    .line 792
    .line 793
    .line 794
    goto/16 :goto_1

    .line 795
    .line 796
    :pswitch_2b
    and-int/2addr v5, v11

    .line 797
    int-to-long v7, v5

    .line 798
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    check-cast v5, Ljava/util/List;

    .line 803
    .line 804
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->J(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_1

    .line 808
    .line 809
    :pswitch_2c
    and-int/2addr v5, v11

    .line 810
    int-to-long v7, v5

    .line 811
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    check-cast v5, Ljava/util/List;

    .line 816
    .line 817
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->G(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 818
    .line 819
    .line 820
    goto/16 :goto_1

    .line 821
    .line 822
    :pswitch_2d
    and-int/2addr v5, v11

    .line 823
    int-to-long v7, v5

    .line 824
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    check-cast v5, Ljava/util/List;

    .line 829
    .line 830
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->w(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 831
    .line 832
    .line 833
    goto/16 :goto_1

    .line 834
    .line 835
    :pswitch_2e
    and-int/2addr v5, v11

    .line 836
    int-to-long v7, v5

    .line 837
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v5

    .line 841
    check-cast v5, Ljava/util/List;

    .line 842
    .line 843
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->B(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 844
    .line 845
    .line 846
    goto/16 :goto_1

    .line 847
    .line 848
    :pswitch_2f
    and-int/2addr v5, v11

    .line 849
    int-to-long v7, v5

    .line 850
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v5

    .line 854
    check-cast v5, Ljava/util/List;

    .line 855
    .line 856
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->s(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 857
    .line 858
    .line 859
    goto/16 :goto_1

    .line 860
    .line 861
    :pswitch_30
    and-int/2addr v5, v11

    .line 862
    int-to-long v7, v5

    .line 863
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    check-cast v5, Ljava/util/List;

    .line 868
    .line 869
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->q(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 870
    .line 871
    .line 872
    goto/16 :goto_1

    .line 873
    .line 874
    :pswitch_31
    and-int/2addr v5, v11

    .line 875
    int-to-long v7, v5

    .line 876
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v5

    .line 880
    check-cast v5, Ljava/util/List;

    .line 881
    .line 882
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->n(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 883
    .line 884
    .line 885
    goto/16 :goto_1

    .line 886
    .line 887
    :pswitch_32
    and-int/2addr v5, v11

    .line 888
    int-to-long v7, v5

    .line 889
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    check-cast v5, Ljava/util/List;

    .line 894
    .line 895
    invoke-static {v6, v5, p2, v3}, Lcom/google/android/gms/internal/vision/M0;->g(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_1

    .line 899
    .line 900
    :pswitch_33
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v7

    .line 904
    if-eqz v7, :cond_2

    .line 905
    .line 906
    and-int/2addr v5, v11

    .line 907
    int-to-long v7, v5

    .line 908
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 913
    .line 914
    .line 915
    move-result-object v7

    .line 916
    invoke-virtual {p2, v6, v5, v7}, Lcom/google/android/gms/internal/vision/w0;->c(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 917
    .line 918
    .line 919
    goto/16 :goto_1

    .line 920
    .line 921
    :pswitch_34
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v7

    .line 925
    if-eqz v7, :cond_2

    .line 926
    .line 927
    and-int/2addr v5, v11

    .line 928
    int-to-long v11, v5

    .line 929
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 930
    .line 931
    invoke-virtual {v5, v11, v12, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 932
    .line 933
    .line 934
    move-result-wide v11

    .line 935
    shl-long v9, v11, v10

    .line 936
    .line 937
    shr-long v7, v11, v8

    .line 938
    .line 939
    xor-long/2addr v7, v9

    .line 940
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 944
    .line 945
    .line 946
    goto/16 :goto_1

    .line 947
    .line 948
    :pswitch_35
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v7

    .line 952
    if-eqz v7, :cond_2

    .line 953
    .line 954
    and-int/2addr v5, v11

    .line 955
    int-to-long v7, v5

    .line 956
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 957
    .line 958
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 959
    .line 960
    .line 961
    move-result v5

    .line 962
    shl-int/lit8 v7, v5, 0x1

    .line 963
    .line 964
    shr-int/lit8 v5, v5, 0x1f

    .line 965
    .line 966
    xor-int/2addr v5, v7

    .line 967
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 971
    .line 972
    .line 973
    goto/16 :goto_1

    .line 974
    .line 975
    :pswitch_36
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    move-result v7

    .line 979
    if-eqz v7, :cond_2

    .line 980
    .line 981
    and-int/2addr v5, v11

    .line 982
    int-to-long v7, v5

    .line 983
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 984
    .line 985
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 986
    .line 987
    .line 988
    move-result-wide v7

    .line 989
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 993
    .line 994
    .line 995
    goto/16 :goto_1

    .line 996
    .line 997
    :pswitch_37
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v7

    .line 1001
    if-eqz v7, :cond_2

    .line 1002
    .line 1003
    and-int/2addr v5, v11

    .line 1004
    int-to-long v7, v5

    .line 1005
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1006
    .line 1007
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1008
    .line 1009
    .line 1010
    move-result v5

    .line 1011
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1015
    .line 1016
    .line 1017
    goto/16 :goto_1

    .line 1018
    .line 1019
    :pswitch_38
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v7

    .line 1023
    if-eqz v7, :cond_2

    .line 1024
    .line 1025
    and-int/2addr v5, v11

    .line 1026
    int-to-long v7, v5

    .line 1027
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1028
    .line 1029
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1030
    .line 1031
    .line 1032
    move-result v5

    .line 1033
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 1037
    .line 1038
    .line 1039
    goto/16 :goto_1

    .line 1040
    .line 1041
    :pswitch_39
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v7

    .line 1045
    if-eqz v7, :cond_2

    .line 1046
    .line 1047
    and-int/2addr v5, v11

    .line 1048
    int-to-long v7, v5

    .line 1049
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1050
    .line 1051
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v5

    .line 1055
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 1059
    .line 1060
    .line 1061
    goto/16 :goto_1

    .line 1062
    .line 1063
    :pswitch_3a
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v7

    .line 1067
    if-eqz v7, :cond_2

    .line 1068
    .line 1069
    and-int/2addr v5, v11

    .line 1070
    int-to-long v7, v5

    .line 1071
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    check-cast v5, Lcom/google/android/gms/internal/vision/P;

    .line 1076
    .line 1077
    invoke-virtual {p2, v6, v5}, Lcom/google/android/gms/internal/vision/w0;->a(ILcom/google/android/gms/internal/vision/P;)V

    .line 1078
    .line 1079
    .line 1080
    goto/16 :goto_1

    .line 1081
    .line 1082
    :pswitch_3b
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v7

    .line 1086
    if-eqz v7, :cond_2

    .line 1087
    .line 1088
    and-int/2addr v5, v11

    .line 1089
    int-to-long v7, v5

    .line 1090
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v5

    .line 1094
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v7

    .line 1098
    invoke-virtual {p2, v6, v5, v7}, Lcom/google/android/gms/internal/vision/w0;->b(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 1099
    .line 1100
    .line 1101
    goto/16 :goto_1

    .line 1102
    .line 1103
    :pswitch_3c
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v7

    .line 1107
    if-eqz v7, :cond_2

    .line 1108
    .line 1109
    and-int/2addr v5, v11

    .line 1110
    int-to-long v7, v5

    .line 1111
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v5

    .line 1115
    invoke-static {v6, v5, p2}, Lcom/google/android/gms/internal/vision/C0;->p(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 1116
    .line 1117
    .line 1118
    goto/16 :goto_1

    .line 1119
    .line 1120
    :pswitch_3d
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v7

    .line 1124
    if-eqz v7, :cond_2

    .line 1125
    .line 1126
    and-int/2addr v5, v11

    .line 1127
    int-to-long v7, v5

    .line 1128
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1129
    .line 1130
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v5

    .line 1134
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1135
    .line 1136
    .line 1137
    int-to-byte v5, v5

    .line 1138
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->B(B)V

    .line 1139
    .line 1140
    .line 1141
    goto/16 :goto_1

    .line 1142
    .line 1143
    :pswitch_3e
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v7

    .line 1147
    if-eqz v7, :cond_2

    .line 1148
    .line 1149
    and-int/2addr v5, v11

    .line 1150
    int-to-long v7, v5

    .line 1151
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1152
    .line 1153
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1154
    .line 1155
    .line 1156
    move-result v5

    .line 1157
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1161
    .line 1162
    .line 1163
    goto/16 :goto_1

    .line 1164
    .line 1165
    :pswitch_3f
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v7

    .line 1169
    if-eqz v7, :cond_2

    .line 1170
    .line 1171
    and-int/2addr v5, v11

    .line 1172
    int-to-long v7, v5

    .line 1173
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1174
    .line 1175
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v7

    .line 1179
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 1183
    .line 1184
    .line 1185
    goto/16 :goto_1

    .line 1186
    .line 1187
    :pswitch_40
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v7

    .line 1191
    if-eqz v7, :cond_2

    .line 1192
    .line 1193
    and-int/2addr v5, v11

    .line 1194
    int-to-long v7, v5

    .line 1195
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1196
    .line 1197
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1198
    .line 1199
    .line 1200
    move-result v5

    .line 1201
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 1205
    .line 1206
    .line 1207
    goto :goto_1

    .line 1208
    :pswitch_41
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v7

    .line 1212
    if-eqz v7, :cond_2

    .line 1213
    .line 1214
    and-int/2addr v5, v11

    .line 1215
    int-to-long v7, v5

    .line 1216
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1217
    .line 1218
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1219
    .line 1220
    .line 1221
    move-result-wide v7

    .line 1222
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 1226
    .line 1227
    .line 1228
    goto :goto_1

    .line 1229
    :pswitch_42
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v7

    .line 1233
    if-eqz v7, :cond_2

    .line 1234
    .line 1235
    and-int/2addr v5, v11

    .line 1236
    int-to-long v7, v5

    .line 1237
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1238
    .line 1239
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1240
    .line 1241
    .line 1242
    move-result-wide v7

    .line 1243
    invoke-virtual {v0, v6, v3}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_1

    .line 1250
    :pswitch_43
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v7

    .line 1254
    if-eqz v7, :cond_2

    .line 1255
    .line 1256
    and-int/2addr v5, v11

    .line 1257
    int-to-long v7, v5

    .line 1258
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1259
    .line 1260
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 1261
    .line 1262
    .line 1263
    move-result v5

    .line 1264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1268
    .line 1269
    .line 1270
    move-result v5

    .line 1271
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1275
    .line 1276
    .line 1277
    goto :goto_1

    .line 1278
    :pswitch_44
    invoke-virtual {p0, v4, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v7

    .line 1282
    if-eqz v7, :cond_2

    .line 1283
    .line 1284
    and-int/2addr v5, v11

    .line 1285
    int-to-long v7, v5

    .line 1286
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1287
    .line 1288
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 1289
    .line 1290
    .line 1291
    move-result-wide v7

    .line 1292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    invoke-static {v7, v8}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1296
    .line 1297
    .line 1298
    move-result-wide v7

    .line 1299
    invoke-virtual {v0, v6, v10}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v0, v7, v8}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 1303
    .line 1304
    .line 1305
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x3

    .line 1306
    .line 1307
    goto/16 :goto_0

    .line 1308
    .line 1309
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 1310
    .line 1311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    check-cast p1, Lcom/google/android/gms/internal/vision/e0;

    .line 1315
    .line 1316
    iget-object p1, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 1317
    .line 1318
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/vision/O0;->c(Lcom/google/android/gms/internal/vision/w0;)V

    .line 1319
    .line 1320
    .line 1321
    return-void

    .line 1322
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->x(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 1323
    .line 1324
    .line 1325
    return-void

    .line 1326
    nop

    .line 1327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

.method public final c(Ljava/lang/Object;)Z
    .locals 13

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v3, v0

    .line 6
    move v2, v1

    .line 7
    move v4, v2

    .line 8
    :goto_0
    iget v5, p0, Lcom/google/android/gms/internal/vision/C0;->h:I

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v2, v5, :cond_f

    .line 12
    .line 13
    iget-object v5, p0, Lcom/google/android/gms/internal/vision/C0;->g:[I

    .line 14
    .line 15
    aget v5, v5, v2

    .line 16
    .line 17
    iget-object v7, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 18
    .line 19
    aget v8, v7, v5

    .line 20
    .line 21
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    add-int/lit8 v10, v5, 0x2

    .line 26
    .line 27
    aget v7, v7, v10

    .line 28
    .line 29
    and-int v10, v7, v0

    .line 30
    .line 31
    ushr-int/lit8 v7, v7, 0x14

    .line 32
    .line 33
    shl-int v7, v6, v7

    .line 34
    .line 35
    if-eq v10, v3, :cond_1

    .line 36
    .line 37
    if-eq v10, v0, :cond_0

    .line 38
    .line 39
    sget-object v3, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 40
    .line 41
    int-to-long v11, v10

    .line 42
    invoke-virtual {v3, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    :cond_0
    move v3, v10

    .line 47
    :cond_1
    const/high16 v10, 0x10000000

    .line 48
    .line 49
    and-int/2addr v10, v9

    .line 50
    if-eqz v10, :cond_4

    .line 51
    .line 52
    if-ne v3, v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v5, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    and-int v10, v4, v7

    .line 60
    .line 61
    if-eqz v10, :cond_3

    .line 62
    .line 63
    move v10, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move v10, v1

    .line 66
    :goto_1
    if-nez v10, :cond_4

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_4
    const/high16 v10, 0xff00000

    .line 71
    .line 72
    and-int/2addr v10, v9

    .line 73
    ushr-int/lit8 v10, v10, 0x14

    .line 74
    .line 75
    const/16 v11, 0x9

    .line 76
    .line 77
    if-eq v10, v11, :cond_b

    .line 78
    .line 79
    const/16 v11, 0x11

    .line 80
    .line 81
    if-eq v10, v11, :cond_b

    .line 82
    .line 83
    const/16 v6, 0x1b

    .line 84
    .line 85
    if-eq v10, v6, :cond_9

    .line 86
    .line 87
    const/16 v6, 0x3c

    .line 88
    .line 89
    if-eq v10, v6, :cond_8

    .line 90
    .line 91
    const/16 v6, 0x44

    .line 92
    .line 93
    if-eq v10, v6, :cond_8

    .line 94
    .line 95
    const/16 v6, 0x31

    .line 96
    .line 97
    if-eq v10, v6, :cond_9

    .line 98
    .line 99
    const/16 v6, 0x32

    .line 100
    .line 101
    if-eq v10, v6, :cond_5

    .line 102
    .line 103
    goto/16 :goto_5

    .line 104
    .line 105
    :cond_5
    and-int v6, v9, v0

    .line 106
    .line 107
    int-to-long v6, v6

    .line 108
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    iget-object v7, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v6, Lcom/google/android/gms/internal/vision/y0;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    goto/16 :goto_5

    .line 126
    .line 127
    :cond_6
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-nez p1, :cond_7

    .line 132
    .line 133
    new-instance p1, Ljava/lang/NoSuchMethodError;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_8
    invoke-virtual {p0, v8, v5, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_e

    .line 150
    .line 151
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    and-int v6, v9, v0

    .line 156
    .line 157
    int-to-long v6, v6

    .line 158
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/vision/L0;->c(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-nez v5, :cond_e

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_9
    and-int v6, v9, v0

    .line 170
    .line 171
    int-to-long v6, v6

    .line 172
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_e

    .line 183
    .line 184
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    move v7, v1

    .line 189
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-ge v7, v8, :cond_e

    .line 194
    .line 195
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-interface {v5, v8}, Lcom/google/android/gms/internal/vision/L0;->c(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-nez v8, :cond_a

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_b
    if-ne v3, v0, :cond_c

    .line 210
    .line 211
    invoke-virtual {p0, v5, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    goto :goto_3

    .line 216
    :cond_c
    and-int/2addr v7, v4

    .line 217
    if-eqz v7, :cond_d

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_d
    move v6, v1

    .line 221
    :goto_3
    if-eqz v6, :cond_e

    .line 222
    .line 223
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    and-int v6, v9, v0

    .line 228
    .line 229
    int-to-long v6, v6

    .line 230
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/vision/L0;->c(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-nez v5, :cond_e

    .line 239
    .line 240
    :goto_4
    return v1

    .line 241
    :cond_e
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 242
    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :cond_f
    return v6
.end method

.method public final d(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ge v0, v2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int v4, v2, v3

    .line 18
    .line 19
    int-to-long v7, v4

    .line 20
    aget v4, v1, v0

    .line 21
    .line 22
    const/high16 v5, 0xff00000

    .line 23
    .line 24
    and-int/2addr v2, v5

    .line 25
    ushr-int/lit8 v2, v2, 0x14

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :cond_0
    :goto_1
    move-object v6, p1

    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :pswitch_1
    invoke-virtual {p0, v4, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v7, v8, p1, v2}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v0, 0x2

    .line 51
    .line 52
    aget v1, v1, v2

    .line 53
    .line 54
    and-int/2addr v1, v3

    .line 55
    int-to-long v1, v1

    .line 56
    invoke-static {v4, v1, v2, p1}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_3
    invoke-virtual {p0, v4, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v7, v8, p1, v2}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v2, v0, 0x2

    .line 78
    .line 79
    aget v1, v1, v2

    .line 80
    .line 81
    and-int/2addr v1, v3

    .line 82
    int-to-long v1, v1

    .line 83
    invoke-static {v4, v1, v2, p1}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_4
    sget-object v1, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 88
    .line 89
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v3, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/vision/z0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/y0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v7, v8, p1, v1}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_5
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/C0;->k:Lcom/google/android/gms/internal/vision/r0;

    .line 111
    .line 112
    invoke-virtual {v1, v7, v8, p1, p2}, Lcom/google/android/gms/internal/vision/r0;->a(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->q(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_7
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_0

    .line 125
    .line 126
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 127
    .line 128
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    move-object v6, p1

    .line 133
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->f(Ljava/lang/Object;JJ)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_2

    .line 140
    .line 141
    :pswitch_8
    move-object v6, p1

    .line 142
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_1

    .line 147
    .line 148
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 149
    .line 150
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_2

    .line 161
    .line 162
    :pswitch_9
    move-object v6, p1

    .line 163
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_1

    .line 168
    .line 169
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 170
    .line 171
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v9

    .line 175
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->f(Ljava/lang/Object;JJ)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_2

    .line 182
    .line 183
    :pswitch_a
    move-object v6, p1

    .line 184
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_1

    .line 189
    .line 190
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 191
    .line 192
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_b
    move-object v6, p1

    .line 205
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_1

    .line 210
    .line 211
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 212
    .line 213
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_2

    .line 224
    .line 225
    :pswitch_c
    move-object v6, p1

    .line 226
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_1

    .line 231
    .line 232
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 233
    .line 234
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_2

    .line 245
    .line 246
    :pswitch_d
    move-object v6, p1

    .line 247
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-eqz p1, :cond_1

    .line 252
    .line 253
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-static {v7, v8, v6, p1}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :pswitch_e
    move-object v6, p1

    .line 266
    invoke-virtual {p0, v0, v6, p2}, Lcom/google/android/gms/internal/vision/C0;->q(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :pswitch_f
    move-object v6, p1

    .line 272
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-eqz p1, :cond_1

    .line 277
    .line 278
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-static {v7, v8, v6, p1}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_2

    .line 289
    .line 290
    :pswitch_10
    move-object v6, p1

    .line 291
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-eqz p1, :cond_1

    .line 296
    .line 297
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 298
    .line 299
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-virtual {p1, v6, v7, v8, v1}, Lcom/google/android/gms/internal/vision/T0;->g(Ljava/lang/Object;JZ)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :pswitch_11
    move-object v6, p1

    .line 312
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_1

    .line 317
    .line 318
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 319
    .line 320
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :pswitch_12
    move-object v6, p1

    .line 333
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    if-eqz p1, :cond_1

    .line 338
    .line 339
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 340
    .line 341
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 342
    .line 343
    .line 344
    move-result-wide v9

    .line 345
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->f(Ljava/lang/Object;JJ)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    goto :goto_2

    .line 352
    :pswitch_13
    move-object v6, p1

    .line 353
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    if-eqz p1, :cond_1

    .line 358
    .line 359
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 360
    .line 361
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    invoke-static {p1, v7, v8, v6}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    goto :goto_2

    .line 372
    :pswitch_14
    move-object v6, p1

    .line 373
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    if-eqz p1, :cond_1

    .line 378
    .line 379
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 380
    .line 381
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 382
    .line 383
    .line 384
    move-result-wide v9

    .line 385
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->f(Ljava/lang/Object;JJ)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    goto :goto_2

    .line 392
    :pswitch_15
    move-object v6, p1

    .line 393
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    if-eqz p1, :cond_1

    .line 398
    .line 399
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 400
    .line 401
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v9

    .line 405
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->f(Ljava/lang/Object;JJ)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto :goto_2

    .line 412
    :pswitch_16
    move-object v6, p1

    .line 413
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    if-eqz p1, :cond_1

    .line 418
    .line 419
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 420
    .line 421
    invoke-virtual {p1, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    invoke-virtual {p1, v6, v7, v8, v1}, Lcom/google/android/gms/internal/vision/T0;->e(Ljava/lang/Object;JF)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto :goto_2

    .line 432
    :pswitch_17
    move-object v6, p1

    .line 433
    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_1

    .line 438
    .line 439
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 440
    .line 441
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 442
    .line 443
    .line 444
    move-result-wide v9

    .line 445
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/vision/T0;->d(Ljava/lang/Object;JD)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p0, v0, v6}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 452
    .line 453
    move-object p1, v6

    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :cond_2
    move-object v6, p1

    .line 457
    iget-object p1, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 458
    .line 459
    invoke-static {p1, v6, p2}, Lcom/google/android/gms/internal/vision/M0;->h(Lcom/google/android/gms/internal/vision/N0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;[BIILcom/google/android/gms/internal/clearcut/j;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    move-object/from16 v13, p5

    .line 10
    .line 11
    iget-boolean v1, v0, Lcom/google/android/gms/internal/vision/C0;->f:Z

    .line 12
    .line 13
    if-eqz v1, :cond_1a

    .line 14
    .line 15
    sget-object v1, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 16
    .line 17
    move/from16 v3, p3

    .line 18
    .line 19
    const/4 v4, -0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    const v11, 0xfffff

    .line 22
    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    :goto_0
    if-ge v3, v8, :cond_17

    .line 26
    .line 27
    add-int/lit8 v6, v3, 0x1

    .line 28
    .line 29
    aget-byte v3, v7, v3

    .line 30
    .line 31
    if-gez v3, :cond_0

    .line 32
    .line 33
    invoke-static {v3, v7, v6, v13}, Lcom/google/android/gms/internal/vision/d0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 38
    .line 39
    :cond_0
    move v14, v6

    .line 40
    ushr-int/lit8 v6, v3, 0x3

    .line 41
    .line 42
    const v16, 0xfffff

    .line 43
    .line 44
    .line 45
    and-int/lit8 v10, v3, 0x7

    .line 46
    .line 47
    iget v15, v0, Lcom/google/android/gms/internal/vision/C0;->d:I

    .line 48
    .line 49
    iget v9, v0, Lcom/google/android/gms/internal/vision/C0;->c:I

    .line 50
    .line 51
    if-le v6, v4, :cond_2

    .line 52
    .line 53
    div-int/lit8 v5, v5, 0x3

    .line 54
    .line 55
    if-lt v6, v9, :cond_1

    .line 56
    .line 57
    if-gt v6, v15, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v6, v5}, Lcom/google/android/gms/internal/vision/C0;->t(II)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/4 v4, -0x1

    .line 65
    :goto_1
    const/4 v9, 0x0

    .line 66
    :goto_2
    move v15, v4

    .line 67
    const/4 v4, -0x1

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    if-lt v6, v9, :cond_3

    .line 70
    .line 71
    if-gt v6, v15, :cond_3

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-virtual {v0, v6, v9}, Lcom/google/android/gms/internal/vision/C0;->t(II)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v9, 0x0

    .line 80
    const/4 v4, -0x1

    .line 81
    goto :goto_2

    .line 82
    :goto_3
    if-ne v15, v4, :cond_4

    .line 83
    .line 84
    move-object/from16 v27, v1

    .line 85
    .line 86
    move-object v8, v2

    .line 87
    move v5, v3

    .line 88
    move/from16 v20, v4

    .line 89
    .line 90
    move/from16 v18, v9

    .line 91
    .line 92
    move/from16 v26, v12

    .line 93
    .line 94
    move v2, v14

    .line 95
    move/from16 v12, v18

    .line 96
    .line 97
    goto/16 :goto_10

    .line 98
    .line 99
    :cond_4
    add-int/lit8 v5, v15, 0x1

    .line 100
    .line 101
    iget-object v4, v0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 102
    .line 103
    aget v5, v4, v5

    .line 104
    .line 105
    const/high16 v18, 0xff00000

    .line 106
    .line 107
    and-int v18, v5, v18

    .line 108
    .line 109
    ushr-int/lit8 v9, v18, 0x14

    .line 110
    .line 111
    move/from16 v18, v3

    .line 112
    .line 113
    and-int v3, v5, v16

    .line 114
    .line 115
    move-object/from16 v19, v4

    .line 116
    .line 117
    int-to-long v3, v3

    .line 118
    move-wide/from16 v20, v3

    .line 119
    .line 120
    const/16 v3, 0x11

    .line 121
    .line 122
    if-gt v9, v3, :cond_d

    .line 123
    .line 124
    add-int/lit8 v3, v15, 0x2

    .line 125
    .line 126
    aget v3, v19, v3

    .line 127
    .line 128
    ushr-int/lit8 v19, v3, 0x14

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    shl-int v19, v4, v19

    .line 132
    .line 133
    and-int v3, v3, v16

    .line 134
    .line 135
    if-eq v3, v11, :cond_7

    .line 136
    .line 137
    move/from16 v23, v9

    .line 138
    .line 139
    move/from16 v9, v16

    .line 140
    .line 141
    move/from16 v24, v4

    .line 142
    .line 143
    move/from16 v16, v5

    .line 144
    .line 145
    if-eq v11, v9, :cond_5

    .line 146
    .line 147
    int-to-long v4, v11

    .line 148
    invoke-virtual {v1, v2, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 149
    .line 150
    .line 151
    :cond_5
    if-eq v3, v9, :cond_6

    .line 152
    .line 153
    int-to-long v4, v3

    .line 154
    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    :cond_6
    move v11, v3

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    move/from16 v24, v4

    .line 161
    .line 162
    move/from16 v23, v9

    .line 163
    .line 164
    move/from16 v9, v16

    .line 165
    .line 166
    move/from16 v16, v5

    .line 167
    .line 168
    :goto_4
    const/4 v3, 0x5

    .line 169
    packed-switch v23, :pswitch_data_0

    .line 170
    .line 171
    .line 172
    move-object v9, v1

    .line 173
    move-object v1, v2

    .line 174
    move/from16 v17, v6

    .line 175
    .line 176
    const/16 v20, -0x1

    .line 177
    .line 178
    goto/16 :goto_b

    .line 179
    .line 180
    :pswitch_0
    if-nez v10, :cond_8

    .line 181
    .line 182
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    iget-wide v3, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 187
    .line 188
    ushr-long v22, v3, v24

    .line 189
    .line 190
    const-wide/16 v24, 0x1

    .line 191
    .line 192
    and-long v3, v3, v24

    .line 193
    .line 194
    neg-long v3, v3

    .line 195
    xor-long v3, v22, v3

    .line 196
    .line 197
    move/from16 v17, v6

    .line 198
    .line 199
    move-wide v5, v3

    .line 200
    move-wide/from16 v3, v20

    .line 201
    .line 202
    const/16 v20, -0x1

    .line 203
    .line 204
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 205
    .line 206
    .line 207
    or-int v12, v12, v19

    .line 208
    .line 209
    move v3, v10

    .line 210
    :goto_5
    move v5, v15

    .line 211
    move/from16 v4, v17

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_8
    move/from16 v17, v6

    .line 216
    .line 217
    const/16 v20, -0x1

    .line 218
    .line 219
    :cond_9
    move-object v9, v1

    .line 220
    move-object v1, v2

    .line 221
    goto/16 :goto_b

    .line 222
    .line 223
    :pswitch_1
    move/from16 v17, v6

    .line 224
    .line 225
    move-wide/from16 v4, v20

    .line 226
    .line 227
    const/16 v20, -0x1

    .line 228
    .line 229
    if-nez v10, :cond_9

    .line 230
    .line 231
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 236
    .line 237
    invoke-static {v6}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 242
    .line 243
    .line 244
    :goto_6
    or-int v12, v12, v19

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :pswitch_2
    move/from16 v17, v6

    .line 248
    .line 249
    move-wide/from16 v4, v20

    .line 250
    .line 251
    const/16 v20, -0x1

    .line 252
    .line 253
    if-nez v10, :cond_9

    .line 254
    .line 255
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 260
    .line 261
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :pswitch_3
    move/from16 v17, v6

    .line 266
    .line 267
    move-wide/from16 v4, v20

    .line 268
    .line 269
    const/4 v3, 0x2

    .line 270
    const/16 v20, -0x1

    .line 271
    .line 272
    if-ne v10, v3, :cond_9

    .line 273
    .line 274
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->z([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 279
    .line 280
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :pswitch_4
    move/from16 v17, v6

    .line 285
    .line 286
    move-wide/from16 v4, v20

    .line 287
    .line 288
    const/4 v3, 0x2

    .line 289
    const/16 v20, -0x1

    .line 290
    .line 291
    if-ne v10, v3, :cond_9

    .line 292
    .line 293
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-static {v3, v7, v14, v8, v13}, Lcom/google/android/gms/internal/vision/d0;->g(Lcom/google/android/gms/internal/vision/L0;[BIILcom/google/android/gms/internal/clearcut/j;)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    if-nez v6, :cond_a

    .line 306
    .line 307
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 308
    .line 309
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_a
    iget-object v10, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v6, v10}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :pswitch_5
    move/from16 v17, v6

    .line 324
    .line 325
    move-wide/from16 v4, v20

    .line 326
    .line 327
    const/4 v3, 0x2

    .line 328
    const/16 v20, -0x1

    .line 329
    .line 330
    if-ne v10, v3, :cond_9

    .line 331
    .line 332
    const/high16 v3, 0x20000000

    .line 333
    .line 334
    and-int v3, v16, v3

    .line 335
    .line 336
    if-nez v3, :cond_b

    .line 337
    .line 338
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->w([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    goto :goto_7

    .line 343
    :cond_b
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->x([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    :goto_7
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-virtual {v1, v2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :pswitch_6
    move/from16 v17, v6

    .line 354
    .line 355
    move-wide/from16 v4, v20

    .line 356
    .line 357
    const/16 v20, -0x1

    .line 358
    .line 359
    if-nez v10, :cond_9

    .line 360
    .line 361
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    iget-wide v9, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 366
    .line 367
    const-wide/16 v22, 0x0

    .line 368
    .line 369
    cmp-long v6, v9, v22

    .line 370
    .line 371
    if-eqz v6, :cond_c

    .line 372
    .line 373
    move/from16 v6, v24

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_c
    const/4 v6, 0x0

    .line 377
    :goto_8
    sget-object v9, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 378
    .line 379
    invoke-virtual {v9, v2, v4, v5, v6}, Lcom/google/android/gms/internal/vision/T0;->g(Ljava/lang/Object;JZ)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_6

    .line 383
    .line 384
    :pswitch_7
    move/from16 v17, v6

    .line 385
    .line 386
    move-wide/from16 v4, v20

    .line 387
    .line 388
    const/16 v20, -0x1

    .line 389
    .line 390
    if-ne v10, v3, :cond_9

    .line 391
    .line 392
    invoke-static {v14, v7}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-virtual {v1, v2, v4, v5, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 397
    .line 398
    .line 399
    :goto_9
    add-int/lit8 v3, v14, 0x4

    .line 400
    .line 401
    goto/16 :goto_6

    .line 402
    .line 403
    :pswitch_8
    move/from16 v17, v6

    .line 404
    .line 405
    move-wide/from16 v4, v20

    .line 406
    .line 407
    move/from16 v3, v24

    .line 408
    .line 409
    const/16 v20, -0x1

    .line 410
    .line 411
    if-ne v10, v3, :cond_9

    .line 412
    .line 413
    move-wide v3, v4

    .line 414
    invoke-static {v14, v7}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    .line 415
    .line 416
    .line 417
    move-result-wide v5

    .line 418
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 419
    .line 420
    .line 421
    add-int/lit8 v3, v14, 0x8

    .line 422
    .line 423
    goto/16 :goto_6

    .line 424
    .line 425
    :pswitch_9
    move/from16 v17, v6

    .line 426
    .line 427
    move-wide/from16 v3, v20

    .line 428
    .line 429
    const/16 v20, -0x1

    .line 430
    .line 431
    if-nez v10, :cond_9

    .line 432
    .line 433
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 438
    .line 439
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 440
    .line 441
    .line 442
    or-int v12, v12, v19

    .line 443
    .line 444
    move v3, v5

    .line 445
    goto/16 :goto_5

    .line 446
    .line 447
    :pswitch_a
    move/from16 v17, v6

    .line 448
    .line 449
    move-wide/from16 v3, v20

    .line 450
    .line 451
    const/16 v20, -0x1

    .line 452
    .line 453
    if-nez v10, :cond_9

    .line 454
    .line 455
    invoke-static {v7, v14, v13}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    iget-wide v5, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    .line 460
    .line 461
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 462
    .line 463
    .line 464
    or-int v12, v12, v19

    .line 465
    .line 466
    move v3, v9

    .line 467
    goto/16 :goto_5

    .line 468
    .line 469
    :pswitch_b
    move/from16 v17, v6

    .line 470
    .line 471
    move-wide/from16 v4, v20

    .line 472
    .line 473
    const/16 v20, -0x1

    .line 474
    .line 475
    if-ne v10, v3, :cond_9

    .line 476
    .line 477
    invoke-static {v14, v7}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 486
    .line 487
    invoke-virtual {v6, v2, v4, v5, v3}, Lcom/google/android/gms/internal/vision/T0;->e(Ljava/lang/Object;JF)V

    .line 488
    .line 489
    .line 490
    goto :goto_9

    .line 491
    :pswitch_c
    move/from16 v17, v6

    .line 492
    .line 493
    move-wide/from16 v4, v20

    .line 494
    .line 495
    move/from16 v3, v24

    .line 496
    .line 497
    const/16 v20, -0x1

    .line 498
    .line 499
    if-ne v10, v3, :cond_9

    .line 500
    .line 501
    invoke-static {v14, v7}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    .line 502
    .line 503
    .line 504
    move-result-wide v9

    .line 505
    invoke-static {v9, v10}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 506
    .line 507
    .line 508
    move-result-wide v9

    .line 509
    move-object v3, v1

    .line 510
    sget-object v1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 511
    .line 512
    move-wide/from16 v28, v9

    .line 513
    .line 514
    move-object v9, v3

    .line 515
    move-wide v3, v4

    .line 516
    move-wide/from16 v5, v28

    .line 517
    .line 518
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/vision/T0;->d(Ljava/lang/Object;JD)V

    .line 519
    .line 520
    .line 521
    move-object v1, v2

    .line 522
    add-int/lit8 v3, v14, 0x8

    .line 523
    .line 524
    or-int v12, v12, v19

    .line 525
    .line 526
    :goto_a
    move-object v1, v9

    .line 527
    goto/16 :goto_5

    .line 528
    .line 529
    :goto_b
    move-object v8, v1

    .line 530
    move-object/from16 v27, v9

    .line 531
    .line 532
    move/from16 v26, v12

    .line 533
    .line 534
    move v2, v14

    .line 535
    move v12, v15

    .line 536
    move/from16 v6, v17

    .line 537
    .line 538
    move/from16 v5, v18

    .line 539
    .line 540
    const/16 v18, 0x0

    .line 541
    .line 542
    goto/16 :goto_10

    .line 543
    .line 544
    :cond_d
    move/from16 v16, v5

    .line 545
    .line 546
    move/from16 v17, v6

    .line 547
    .line 548
    move/from16 v23, v9

    .line 549
    .line 550
    move-wide/from16 v3, v20

    .line 551
    .line 552
    const/16 v20, -0x1

    .line 553
    .line 554
    move-object v9, v1

    .line 555
    move-object v1, v2

    .line 556
    const/16 v2, 0x1b

    .line 557
    .line 558
    move/from16 v5, v23

    .line 559
    .line 560
    if-ne v5, v2, :cond_11

    .line 561
    .line 562
    const/4 v2, 0x2

    .line 563
    if-ne v10, v2, :cond_10

    .line 564
    .line 565
    invoke-virtual {v9, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    check-cast v2, Lcom/google/android/gms/internal/vision/n0;

    .line 570
    .line 571
    invoke-interface {v2}, Lcom/google/android/gms/internal/vision/n0;->zza()Z

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    if-nez v5, :cond_f

    .line 576
    .line 577
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-nez v5, :cond_e

    .line 582
    .line 583
    const/16 v5, 0xa

    .line 584
    .line 585
    goto :goto_c

    .line 586
    :cond_e
    shl-int/lit8 v5, v5, 0x1

    .line 587
    .line 588
    :goto_c
    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/vision/n0;->a(I)Lcom/google/android/gms/internal/vision/n0;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-virtual {v9, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    :cond_f
    move-object v6, v2

    .line 596
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    move-object v3, v7

    .line 601
    move v5, v8

    .line 602
    move-object v7, v13

    .line 603
    move v4, v14

    .line 604
    move/from16 v2, v18

    .line 605
    .line 606
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/d0;->e(Lcom/google/android/gms/internal/vision/L0;I[BIILcom/google/android/gms/internal/vision/n0;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    move-object/from16 v2, p1

    .line 611
    .line 612
    move-object/from16 v7, p2

    .line 613
    .line 614
    move/from16 v8, p4

    .line 615
    .line 616
    move-object/from16 v13, p5

    .line 617
    .line 618
    move v3, v1

    .line 619
    goto :goto_a

    .line 620
    :cond_10
    move-object/from16 v2, p1

    .line 621
    .line 622
    move-object/from16 v27, v9

    .line 623
    .line 624
    move/from16 v26, v12

    .line 625
    .line 626
    move v3, v14

    .line 627
    move v12, v15

    .line 628
    move/from16 v6, v17

    .line 629
    .line 630
    move/from16 v5, v18

    .line 631
    .line 632
    const/16 v18, 0x0

    .line 633
    .line 634
    move v15, v11

    .line 635
    goto/16 :goto_f

    .line 636
    .line 637
    :cond_11
    move v6, v14

    .line 638
    move/from16 v2, v18

    .line 639
    .line 640
    const/16 v1, 0x31

    .line 641
    .line 642
    if-gt v5, v1, :cond_13

    .line 643
    .line 644
    move-object v1, v9

    .line 645
    move v7, v10

    .line 646
    move/from16 v8, v16

    .line 647
    .line 648
    int-to-long v9, v8

    .line 649
    move-object/from16 v14, p5

    .line 650
    .line 651
    move-object/from16 v27, v1

    .line 652
    .line 653
    move/from16 v26, v12

    .line 654
    .line 655
    move v8, v15

    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    move-object/from16 v1, p1

    .line 659
    .line 660
    move-wide v12, v3

    .line 661
    move v3, v6

    .line 662
    move v15, v11

    .line 663
    move/from16 v6, v17

    .line 664
    .line 665
    move/from16 v4, p4

    .line 666
    .line 667
    move v11, v5

    .line 668
    move v5, v2

    .line 669
    move-object/from16 v2, p2

    .line 670
    .line 671
    invoke-virtual/range {v0 .. v14}, Lcom/google/android/gms/internal/vision/C0;->j(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    move-object v2, v1

    .line 676
    move v12, v8

    .line 677
    if-ne v7, v3, :cond_12

    .line 678
    .line 679
    move-object v8, v2

    .line 680
    :goto_d
    move v2, v7

    .line 681
    :goto_e
    move v11, v15

    .line 682
    goto/16 :goto_10

    .line 683
    .line 684
    :cond_12
    move/from16 v8, p4

    .line 685
    .line 686
    move-object/from16 v13, p5

    .line 687
    .line 688
    move v4, v6

    .line 689
    move v3, v7

    .line 690
    move v5, v12

    .line 691
    move v11, v15

    .line 692
    move/from16 v12, v26

    .line 693
    .line 694
    move-object/from16 v1, v27

    .line 695
    .line 696
    move-object/from16 v7, p2

    .line 697
    .line 698
    goto/16 :goto_0

    .line 699
    .line 700
    :cond_13
    move-object/from16 v27, v9

    .line 701
    .line 702
    move v7, v10

    .line 703
    move/from16 v26, v12

    .line 704
    .line 705
    move v12, v15

    .line 706
    move/from16 v8, v16

    .line 707
    .line 708
    const/16 v18, 0x0

    .line 709
    .line 710
    move-wide v9, v3

    .line 711
    move v3, v6

    .line 712
    move v15, v11

    .line 713
    move/from16 v6, v17

    .line 714
    .line 715
    move v11, v5

    .line 716
    move v5, v2

    .line 717
    move-object/from16 v2, p1

    .line 718
    .line 719
    const/16 v1, 0x32

    .line 720
    .line 721
    if-ne v11, v1, :cond_15

    .line 722
    .line 723
    const/4 v1, 0x2

    .line 724
    if-eq v7, v1, :cond_14

    .line 725
    .line 726
    :goto_f
    move-object v8, v2

    .line 727
    move v2, v3

    .line 728
    goto :goto_e

    .line 729
    :cond_14
    invoke-virtual {v0, v12, v9, v10, v2}, Lcom/google/android/gms/internal/vision/C0;->o(IJLjava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    const/4 v1, 0x0

    .line 733
    throw v1

    .line 734
    :cond_15
    move-wide/from16 v28, v9

    .line 735
    .line 736
    move v9, v11

    .line 737
    move-wide/from16 v10, v28

    .line 738
    .line 739
    move/from16 v4, p4

    .line 740
    .line 741
    move-object/from16 v13, p5

    .line 742
    .line 743
    move-object v1, v2

    .line 744
    move-object/from16 v2, p2

    .line 745
    .line 746
    invoke-virtual/range {v0 .. v13}, Lcom/google/android/gms/internal/vision/C0;->i(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I

    .line 747
    .line 748
    .line 749
    move-result v7

    .line 750
    move-object v8, v1

    .line 751
    if-ne v7, v3, :cond_16

    .line 752
    .line 753
    goto :goto_d

    .line 754
    :goto_10
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/C0;->D(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/O0;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    move-object/from16 v1, p2

    .line 759
    .line 760
    move/from16 v3, p4

    .line 761
    .line 762
    move v0, v5

    .line 763
    move-object/from16 v5, p5

    .line 764
    .line 765
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/vision/d0;->c(I[BIILcom/google/android/gms/internal/vision/O0;Lcom/google/android/gms/internal/clearcut/j;)I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    move-object/from16 v7, p2

    .line 770
    .line 771
    move-object/from16 v13, p5

    .line 772
    .line 773
    move v4, v6

    .line 774
    move-object v2, v8

    .line 775
    move v5, v12

    .line 776
    move/from16 v12, v26

    .line 777
    .line 778
    move-object/from16 v1, v27

    .line 779
    .line 780
    move v8, v3

    .line 781
    move v3, v0

    .line 782
    move-object/from16 v0, p0

    .line 783
    .line 784
    goto/16 :goto_0

    .line 785
    .line 786
    :cond_16
    move-object/from16 v0, p0

    .line 787
    .line 788
    move-object/from16 v13, p5

    .line 789
    .line 790
    move v4, v6

    .line 791
    move v3, v7

    .line 792
    move-object v2, v8

    .line 793
    move v5, v12

    .line 794
    move v11, v15

    .line 795
    move/from16 v12, v26

    .line 796
    .line 797
    move-object/from16 v1, v27

    .line 798
    .line 799
    move-object/from16 v7, p2

    .line 800
    .line 801
    move/from16 v8, p4

    .line 802
    .line 803
    goto/16 :goto_0

    .line 804
    .line 805
    :cond_17
    move-object/from16 v27, v1

    .line 806
    .line 807
    move v4, v8

    .line 808
    move v15, v11

    .line 809
    move/from16 v26, v12

    .line 810
    .line 811
    const v9, 0xfffff

    .line 812
    .line 813
    .line 814
    move-object v8, v2

    .line 815
    if-eq v15, v9, :cond_18

    .line 816
    .line 817
    int-to-long v0, v15

    .line 818
    move/from16 v12, v26

    .line 819
    .line 820
    move-object/from16 v9, v27

    .line 821
    .line 822
    invoke-virtual {v9, v8, v0, v1, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 823
    .line 824
    .line 825
    :cond_18
    if-ne v3, v4, :cond_19

    .line 826
    .line 827
    return-void

    .line 828
    :cond_19
    new-instance v0, Lcom/google/android/gms/internal/vision/m0;

    .line 829
    .line 830
    const-string v1, "Failed to parse the message."

    .line 831
    .line 832
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    throw v0

    .line 836
    :cond_1a
    move v4, v8

    .line 837
    move-object v8, v2

    .line 838
    const/4 v5, 0x0

    .line 839
    move-object/from16 v0, p0

    .line 840
    .line 841
    move-object/from16 v2, p2

    .line 842
    .line 843
    move/from16 v3, p3

    .line 844
    .line 845
    move-object/from16 v6, p5

    .line 846
    .line 847
    move-object v1, v8

    .line 848
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/vision/C0;->k(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    .line 849
    .line 850
    .line 851
    return-void

    .line 852
    nop

    .line 853
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lcom/google/android/gms/internal/vision/e0;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    const/high16 v8, 0xff00000

    .line 20
    .line 21
    and-int/2addr v4, v8

    .line 22
    ushr-int/lit8 v4, v4, 0x14

    .line 23
    .line 24
    const/16 v8, 0x4d5

    .line 25
    .line 26
    const/16 v9, 0x4cf

    .line 27
    .line 28
    const/16 v10, 0x25

    .line 29
    .line 30
    packed-switch v4, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    mul-int/lit8 v3, v3, 0x35

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    :goto_1
    add-int/2addr v4, v3

    .line 52
    move v3, v4

    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    mul-int/lit8 v3, v3, 0x35

    .line 62
    .line 63
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    mul-int/lit8 v3, v3, 0x35

    .line 79
    .line 80
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    goto :goto_1

    .line 85
    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_2

    .line 90
    .line 91
    mul-int/lit8 v3, v3, 0x35

    .line 92
    .line 93
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    goto :goto_1

    .line 102
    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    mul-int/lit8 v3, v3, 0x35

    .line 109
    .line 110
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    goto :goto_1

    .line 115
    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_2

    .line 120
    .line 121
    mul-int/lit8 v3, v3, 0x35

    .line 122
    .line 123
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    goto :goto_1

    .line 128
    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_2

    .line 133
    .line 134
    mul-int/lit8 v3, v3, 0x35

    .line 135
    .line 136
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    goto :goto_1

    .line 141
    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_2

    .line 146
    .line 147
    mul-int/lit8 v3, v3, 0x35

    .line 148
    .line 149
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    goto :goto_1

    .line 158
    :pswitch_8
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_2

    .line 163
    .line 164
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    mul-int/lit8 v3, v3, 0x35

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    goto :goto_1

    .line 175
    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_2

    .line 180
    .line 181
    mul-int/lit8 v3, v3, 0x35

    .line 182
    .line 183
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_2

    .line 200
    .line 201
    mul-int/lit8 v3, v3, 0x35

    .line 202
    .line 203
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    check-cast v4, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    sget-object v5, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    .line 214
    .line 215
    if-eqz v4, :cond_0

    .line 216
    .line 217
    :goto_2
    move v8, v9

    .line 218
    :cond_0
    add-int/2addr v8, v3

    .line 219
    move v3, v8

    .line 220
    goto/16 :goto_4

    .line 221
    .line 222
    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-eqz v4, :cond_2

    .line 227
    .line 228
    mul-int/lit8 v3, v3, 0x35

    .line 229
    .line 230
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_2

    .line 241
    .line 242
    mul-int/lit8 v3, v3, 0x35

    .line 243
    .line 244
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 245
    .line 246
    .line 247
    move-result-wide v4

    .line 248
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_2

    .line 259
    .line 260
    mul-int/lit8 v3, v3, 0x35

    .line 261
    .line 262
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-eqz v4, :cond_2

    .line 273
    .line 274
    mul-int/lit8 v3, v3, 0x35

    .line 275
    .line 276
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v4

    .line 280
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    goto/16 :goto_1

    .line 285
    .line 286
    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_2

    .line 291
    .line 292
    mul-int/lit8 v3, v3, 0x35

    .line 293
    .line 294
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    goto/16 :goto_1

    .line 303
    .line 304
    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-eqz v4, :cond_2

    .line 309
    .line 310
    mul-int/lit8 v3, v3, 0x35

    .line 311
    .line 312
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Ljava/lang/Float;

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    goto/16 :goto_1

    .line 327
    .line 328
    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-eqz v4, :cond_2

    .line 333
    .line 334
    mul-int/lit8 v3, v3, 0x35

    .line 335
    .line 336
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    check-cast v4, Ljava/lang/Double;

    .line 341
    .line 342
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 343
    .line 344
    .line 345
    move-result-wide v4

    .line 346
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 347
    .line 348
    .line 349
    move-result-wide v4

    .line 350
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 357
    .line 358
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    goto/16 :goto_1

    .line 367
    .line 368
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 369
    .line 370
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :pswitch_14
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    if-eqz v4, :cond_1

    .line 385
    .line 386
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 387
    .line 388
    .line 389
    move-result v10

    .line 390
    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    .line 391
    .line 392
    add-int/2addr v3, v10

    .line 393
    goto/16 :goto_4

    .line 394
    .line 395
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 396
    .line 397
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 398
    .line 399
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 400
    .line 401
    .line 402
    move-result-wide v4

    .line 403
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    goto/16 :goto_1

    .line 408
    .line 409
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 410
    .line 411
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 412
    .line 413
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    goto/16 :goto_1

    .line 418
    .line 419
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 420
    .line 421
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 422
    .line 423
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 424
    .line 425
    .line 426
    move-result-wide v4

    .line 427
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    goto/16 :goto_1

    .line 432
    .line 433
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 434
    .line 435
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 436
    .line 437
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    goto/16 :goto_1

    .line 442
    .line 443
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 444
    .line 445
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 446
    .line 447
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 454
    .line 455
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 456
    .line 457
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    goto/16 :goto_1

    .line 462
    .line 463
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 464
    .line 465
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    goto/16 :goto_1

    .line 474
    .line 475
    :pswitch_1c
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    if-eqz v4, :cond_1

    .line 480
    .line 481
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 482
    .line 483
    .line 484
    move-result v10

    .line 485
    goto :goto_3

    .line 486
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 487
    .line 488
    invoke-static {v6, v7, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    check-cast v4, Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    goto/16 :goto_1

    .line 499
    .line 500
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 501
    .line 502
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 503
    .line 504
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    sget-object v5, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    .line 509
    .line 510
    if-eqz v4, :cond_0

    .line 511
    .line 512
    goto/16 :goto_2

    .line 513
    .line 514
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 515
    .line 516
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 517
    .line 518
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    goto/16 :goto_1

    .line 523
    .line 524
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 525
    .line 526
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 527
    .line 528
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 529
    .line 530
    .line 531
    move-result-wide v4

    .line 532
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    goto/16 :goto_1

    .line 537
    .line 538
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 539
    .line 540
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 541
    .line 542
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    goto/16 :goto_1

    .line 547
    .line 548
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 549
    .line 550
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 551
    .line 552
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 553
    .line 554
    .line 555
    move-result-wide v4

    .line 556
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    goto/16 :goto_1

    .line 561
    .line 562
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 563
    .line 564
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 565
    .line 566
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 567
    .line 568
    .line 569
    move-result-wide v4

    .line 570
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    goto/16 :goto_1

    .line 575
    .line 576
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 577
    .line 578
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 579
    .line 580
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    goto/16 :goto_1

    .line 589
    .line 590
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 591
    .line 592
    sget-object v4, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 593
    .line 594
    invoke-virtual {v4, v6, v7, p1}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 595
    .line 596
    .line 597
    move-result-wide v4

    .line 598
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 599
    .line 600
    .line 601
    move-result-wide v4

    .line 602
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/i0;->a(J)I

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    goto/16 :goto_1

    .line 607
    .line 608
    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    .line 609
    .line 610
    goto/16 :goto_0

    .line 611
    .line 612
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 613
    .line 614
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 615
    .line 616
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    iget-object p1, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 620
    .line 621
    invoke-virtual {p1}, Lcom/google/android/gms/internal/vision/O0;->hashCode()I

    .line 622
    .line 623
    .line 624
    move-result p1

    .line 625
    add-int/2addr p1, v3

    .line 626
    return p1

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

.method public final g(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    const/high16 v9, 0xff00000

    .line 20
    .line 21
    and-int/2addr v5, v9

    .line 22
    ushr-int/lit8 v5, v5, 0x14

    .line 23
    .line 24
    packed-switch v5, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 30
    .line 31
    aget v5, v0, v5

    .line 32
    .line 33
    and-int/2addr v5, v6

    .line 34
    int-to-long v5, v5

    .line 35
    sget-object v9, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 36
    .line 37
    invoke-virtual {v9, v5, v6, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-virtual {v9, v5, v6, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-ne v10, v5, :cond_0

    .line 46
    .line 47
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    :cond_0
    :goto_1
    move v4, v2

    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :pswitch_1
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    goto/16 :goto_2

    .line 77
    .line 78
    :pswitch_2
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_0

    .line 97
    .line 98
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 120
    .line 121
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v9

    .line 125
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v5

    .line 129
    cmp-long v5, v9, v5

    .line 130
    .line 131
    if-eqz v5, :cond_1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_0

    .line 139
    .line 140
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 141
    .line 142
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eq v6, v5, :cond_1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_0

    .line 158
    .line 159
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 160
    .line 161
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v9

    .line 165
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    cmp-long v5, v9, v5

    .line 170
    .line 171
    if-eqz v5, :cond_1

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_0

    .line 179
    .line 180
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 181
    .line 182
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eq v6, v5, :cond_1

    .line 191
    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_0

    .line 199
    .line 200
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 201
    .line 202
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eq v6, v5, :cond_1

    .line 211
    .line 212
    goto/16 :goto_1

    .line 213
    .line 214
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_0

    .line 219
    .line 220
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 221
    .line 222
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eq v6, v5, :cond_1

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_0

    .line 239
    .line 240
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-nez v5, :cond_1

    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-eqz v5, :cond_0

    .line 261
    .line 262
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-nez v5, :cond_1

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-eqz v5, :cond_0

    .line 283
    .line 284
    invoke-static {v7, v8, p1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-static {v7, v8, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/M0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-nez v5, :cond_1

    .line 297
    .line 298
    goto/16 :goto_1

    .line 299
    .line 300
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    if-eqz v5, :cond_0

    .line 305
    .line 306
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 307
    .line 308
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eq v6, v5, :cond_1

    .line 317
    .line 318
    goto/16 :goto_1

    .line 319
    .line 320
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_0

    .line 325
    .line 326
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 327
    .line 328
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eq v6, v5, :cond_1

    .line 337
    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_0

    .line 345
    .line 346
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 347
    .line 348
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 349
    .line 350
    .line 351
    move-result-wide v9

    .line 352
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 353
    .line 354
    .line 355
    move-result-wide v5

    .line 356
    cmp-long v5, v9, v5

    .line 357
    .line 358
    if-eqz v5, :cond_1

    .line 359
    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_0

    .line 367
    .line 368
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 369
    .line 370
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eq v6, v5, :cond_1

    .line 379
    .line 380
    goto/16 :goto_1

    .line 381
    .line 382
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eqz v5, :cond_0

    .line 387
    .line 388
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 389
    .line 390
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 391
    .line 392
    .line 393
    move-result-wide v9

    .line 394
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 395
    .line 396
    .line 397
    move-result-wide v5

    .line 398
    cmp-long v5, v9, v5

    .line 399
    .line 400
    if-eqz v5, :cond_1

    .line 401
    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_0

    .line 409
    .line 410
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 411
    .line 412
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v9

    .line 416
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 417
    .line 418
    .line 419
    move-result-wide v5

    .line 420
    cmp-long v5, v9, v5

    .line 421
    .line 422
    if-eqz v5, :cond_1

    .line 423
    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 427
    .line 428
    .line 429
    move-result v5

    .line 430
    if-eqz v5, :cond_0

    .line 431
    .line 432
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 433
    .line 434
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    if-eq v6, v5, :cond_1

    .line 451
    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Lcom/google/android/gms/internal/vision/C0;->z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z

    .line 455
    .line 456
    .line 457
    move-result v5

    .line 458
    if-eqz v5, :cond_0

    .line 459
    .line 460
    sget-object v5, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 461
    .line 462
    invoke-virtual {v5, v7, v8, p1}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 463
    .line 464
    .line 465
    move-result-wide v9

    .line 466
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 467
    .line 468
    .line 469
    move-result-wide v9

    .line 470
    invoke-virtual {v5, v7, v8, p2}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 471
    .line 472
    .line 473
    move-result-wide v5

    .line 474
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 475
    .line 476
    .line 477
    move-result-wide v5

    .line 478
    cmp-long v5, v9, v5

    .line 479
    .line 480
    if-eqz v5, :cond_1

    .line 481
    .line 482
    goto/16 :goto_1

    .line 483
    .line 484
    :cond_1
    :goto_2
    if-nez v4, :cond_2

    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_2
    add-int/lit8 v3, v3, 0x3

    .line 488
    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 492
    .line 493
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    iget-object p1, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 497
    .line 498
    iget-object p2, p2, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 499
    .line 500
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/vision/O0;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    if-nez p1, :cond_4

    .line 505
    .line 506
    :goto_3
    return v2

    .line 507
    :cond_4
    return v4

    .line 508
    nop

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/google/android/gms/internal/vision/C0;->f:Z

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    iget-object v5, v0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 11
    .line 12
    iget-object v6, v0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 13
    .line 14
    const/high16 v7, 0xff00000

    .line 15
    .line 16
    const v8, 0xfffff

    .line 17
    .line 18
    .line 19
    iget-object v9, v0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    if-eqz v2, :cond_f

    .line 23
    .line 24
    sget-object v2, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 25
    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    :goto_0
    array-length v14, v9

    .line 29
    if-ge v12, v14, :cond_e

    .line 30
    .line 31
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 32
    .line 33
    .line 34
    move-result v14

    .line 35
    and-int v15, v14, v7

    .line 36
    .line 37
    ushr-int/lit8 v15, v15, 0x14

    .line 38
    .line 39
    move/from16 v16, v7

    .line 40
    .line 41
    aget v7, v9, v12

    .line 42
    .line 43
    and-int/2addr v14, v8

    .line 44
    move/from16 v17, v8

    .line 45
    .line 46
    move-object/from16 v18, v9

    .line 47
    .line 48
    int-to-long v8, v14

    .line 49
    sget-object v14, Lcom/google/android/gms/internal/vision/X;->r:Lcom/google/android/gms/internal/vision/X;

    .line 50
    .line 51
    iget v14, v14, Lcom/google/android/gms/internal/vision/X;->q:I

    .line 52
    .line 53
    if-lt v15, v14, :cond_0

    .line 54
    .line 55
    sget-object v14, Lcom/google/android/gms/internal/vision/X;->s:Lcom/google/android/gms/internal/vision/X;

    .line 56
    .line 57
    iget v14, v14, Lcom/google/android/gms/internal/vision/X;->q:I

    .line 58
    .line 59
    if-gt v15, v14, :cond_0

    .line 60
    .line 61
    add-int/lit8 v14, v12, 0x2

    .line 62
    .line 63
    aget v14, v18, v14

    .line 64
    .line 65
    :cond_0
    packed-switch v15, :pswitch_data_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :pswitch_0
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    if-eqz v14, :cond_d

    .line 75
    .line 76
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Lcom/google/android/gms/internal/vision/K;

    .line 81
    .line 82
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    :goto_1
    add-int/2addr v13, v7

    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :pswitch_1
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    if-eqz v14, :cond_d

    .line 98
    .line 99
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v8

    .line 103
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->Q(IJ)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    goto :goto_1

    .line 108
    :pswitch_2
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eqz v14, :cond_d

    .line 113
    .line 114
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->U(II)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    goto :goto_1

    .line 123
    :pswitch_3
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_d

    .line 128
    .line 129
    shl-int/lit8 v7, v7, 0x3

    .line 130
    .line 131
    invoke-static {v7, v4, v13}, LC0/S;->u(III)I

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :pswitch_4
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_d

    .line 142
    .line 143
    shl-int/lit8 v7, v7, 0x3

    .line 144
    .line 145
    invoke-static {v7, v3, v13}, LC0/S;->u(III)I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    goto/16 :goto_6

    .line 150
    .line 151
    :pswitch_5
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_d

    .line 156
    .line 157
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    shl-int/lit8 v7, v7, 0x3

    .line 162
    .line 163
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    :goto_2
    add-int/2addr v8, v7

    .line 172
    add-int/2addr v13, v8

    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :pswitch_6
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-eqz v14, :cond_d

    .line 180
    .line 181
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->S(II)I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    goto :goto_1

    .line 190
    :pswitch_7
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    if-eqz v14, :cond_d

    .line 195
    .line 196
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    check-cast v8, Lcom/google/android/gms/internal/vision/P;

    .line 201
    .line 202
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    goto :goto_1

    .line 207
    :pswitch_8
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    if-eqz v14, :cond_d

    .line 212
    .line 213
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/M0;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :pswitch_9
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    if-eqz v14, :cond_d

    .line 232
    .line 233
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    instance-of v9, v8, Lcom/google/android/gms/internal/vision/P;

    .line 238
    .line 239
    if-eqz v9, :cond_1

    .line 240
    .line 241
    check-cast v8, Lcom/google/android/gms/internal/vision/P;

    .line 242
    .line 243
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_1
    check-cast v8, Ljava/lang/String;

    .line 250
    .line 251
    shl-int/lit8 v7, v7, 0x3

    .line 252
    .line 253
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->G(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    goto :goto_2

    .line 262
    :pswitch_a
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-eqz v8, :cond_d

    .line 267
    .line 268
    shl-int/lit8 v7, v7, 0x3

    .line 269
    .line 270
    invoke-static {v7, v10, v13}, LC0/S;->u(III)I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    goto/16 :goto_6

    .line 275
    .line 276
    :pswitch_b
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_d

    .line 281
    .line 282
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->V(I)I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :pswitch_c
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-eqz v8, :cond_d

    .line 293
    .line 294
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->R(I)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    goto/16 :goto_1

    .line 299
    .line 300
    :pswitch_d
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    if-eqz v14, :cond_d

    .line 305
    .line 306
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    shl-int/lit8 v7, v7, 0x3

    .line 311
    .line 312
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :pswitch_e
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    if-eqz v14, :cond_d

    .line 327
    .line 328
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 329
    .line 330
    .line 331
    move-result-wide v8

    .line 332
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->N(IJ)I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :pswitch_f
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v14

    .line 342
    if-eqz v14, :cond_d

    .line 343
    .line 344
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 345
    .line 346
    .line 347
    move-result-wide v8

    .line 348
    shl-int/lit8 v7, v7, 0x3

    .line 349
    .line 350
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/vision/Q;->O(J)I

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    goto/16 :goto_2

    .line 359
    .line 360
    :pswitch_10
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    if-eqz v8, :cond_d

    .line 365
    .line 366
    shl-int/lit8 v7, v7, 0x3

    .line 367
    .line 368
    invoke-static {v7, v3, v13}, LC0/S;->u(III)I

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    goto/16 :goto_6

    .line 373
    .line 374
    :pswitch_11
    invoke-virtual {v0, v7, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    if-eqz v8, :cond_d

    .line 379
    .line 380
    shl-int/lit8 v7, v7, 0x3

    .line 381
    .line 382
    invoke-static {v7, v4, v13}, LC0/S;->u(III)I

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    goto/16 :goto_6

    .line 387
    .line 388
    :pswitch_12
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/z0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_6

    .line 403
    .line 404
    :pswitch_13
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    check-cast v8, Ljava/util/List;

    .line 409
    .line 410
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 411
    .line 412
    .line 413
    move-result-object v9

    .line 414
    sget-object v14, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 415
    .line 416
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    if-nez v14, :cond_2

    .line 421
    .line 422
    const/16 v19, 0x0

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_2
    const/4 v15, 0x0

    .line 426
    const/16 v19, 0x0

    .line 427
    .line 428
    :goto_3
    if-ge v15, v14, :cond_3

    .line 429
    .line 430
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v20

    .line 434
    move-object/from16 v11, v20

    .line 435
    .line 436
    check-cast v11, Lcom/google/android/gms/internal/vision/K;

    .line 437
    .line 438
    invoke-static {v7, v11, v9}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 439
    .line 440
    .line 441
    move-result v11

    .line 442
    add-int v19, v11, v19

    .line 443
    .line 444
    add-int/lit8 v15, v15, 0x1

    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_3
    :goto_4
    add-int v13, v19, v13

    .line 448
    .line 449
    goto/16 :goto_6

    .line 450
    .line 451
    :pswitch_14
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    check-cast v8, Ljava/util/List;

    .line 456
    .line 457
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->p(Ljava/util/List;)I

    .line 458
    .line 459
    .line 460
    move-result v8

    .line 461
    if-lez v8, :cond_d

    .line 462
    .line 463
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 468
    .line 469
    .line 470
    move-result v13

    .line 471
    goto/16 :goto_6

    .line 472
    .line 473
    :pswitch_15
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    check-cast v8, Ljava/util/List;

    .line 478
    .line 479
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->x(Ljava/util/List;)I

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    if-lez v8, :cond_d

    .line 484
    .line 485
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 486
    .line 487
    .line 488
    move-result v7

    .line 489
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 490
    .line 491
    .line 492
    move-result v13

    .line 493
    goto/16 :goto_6

    .line 494
    .line 495
    :pswitch_16
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    check-cast v8, Ljava/util/List;

    .line 500
    .line 501
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 502
    .line 503
    .line 504
    move-result v8

    .line 505
    if-lez v8, :cond_d

    .line 506
    .line 507
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    goto/16 :goto_6

    .line 516
    .line 517
    :pswitch_17
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    check-cast v8, Ljava/util/List;

    .line 522
    .line 523
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    if-lez v8, :cond_d

    .line 528
    .line 529
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 530
    .line 531
    .line 532
    move-result v7

    .line 533
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 534
    .line 535
    .line 536
    move-result v13

    .line 537
    goto/16 :goto_6

    .line 538
    .line 539
    :pswitch_18
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    check-cast v8, Ljava/util/List;

    .line 544
    .line 545
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->r(Ljava/util/List;)I

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    if-lez v8, :cond_d

    .line 550
    .line 551
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 556
    .line 557
    .line 558
    move-result v13

    .line 559
    goto/16 :goto_6

    .line 560
    .line 561
    :pswitch_19
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    check-cast v8, Ljava/util/List;

    .line 566
    .line 567
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->v(Ljava/util/List;)I

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-lez v8, :cond_d

    .line 572
    .line 573
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 578
    .line 579
    .line 580
    move-result v13

    .line 581
    goto/16 :goto_6

    .line 582
    .line 583
    :pswitch_1a
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v8

    .line 587
    check-cast v8, Ljava/util/List;

    .line 588
    .line 589
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 590
    .line 591
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 592
    .line 593
    .line 594
    move-result v8

    .line 595
    if-lez v8, :cond_d

    .line 596
    .line 597
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 602
    .line 603
    .line 604
    move-result v13

    .line 605
    goto/16 :goto_6

    .line 606
    .line 607
    :pswitch_1b
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    check-cast v8, Ljava/util/List;

    .line 612
    .line 613
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 614
    .line 615
    .line 616
    move-result v8

    .line 617
    if-lez v8, :cond_d

    .line 618
    .line 619
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 624
    .line 625
    .line 626
    move-result v13

    .line 627
    goto/16 :goto_6

    .line 628
    .line 629
    :pswitch_1c
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    check-cast v8, Ljava/util/List;

    .line 634
    .line 635
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 636
    .line 637
    .line 638
    move-result v8

    .line 639
    if-lez v8, :cond_d

    .line 640
    .line 641
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 642
    .line 643
    .line 644
    move-result v7

    .line 645
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    goto/16 :goto_6

    .line 650
    .line 651
    :pswitch_1d
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    check-cast v8, Ljava/util/List;

    .line 656
    .line 657
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->t(Ljava/util/List;)I

    .line 658
    .line 659
    .line 660
    move-result v8

    .line 661
    if-lez v8, :cond_d

    .line 662
    .line 663
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 664
    .line 665
    .line 666
    move-result v7

    .line 667
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 668
    .line 669
    .line 670
    move-result v13

    .line 671
    goto/16 :goto_6

    .line 672
    .line 673
    :pswitch_1e
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    check-cast v8, Ljava/util/List;

    .line 678
    .line 679
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->k(Ljava/util/List;)I

    .line 680
    .line 681
    .line 682
    move-result v8

    .line 683
    if-lez v8, :cond_d

    .line 684
    .line 685
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 690
    .line 691
    .line 692
    move-result v13

    .line 693
    goto/16 :goto_6

    .line 694
    .line 695
    :pswitch_1f
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    check-cast v8, Ljava/util/List;

    .line 700
    .line 701
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->c(Ljava/util/List;)I

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    if-lez v8, :cond_d

    .line 706
    .line 707
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 712
    .line 713
    .line 714
    move-result v13

    .line 715
    goto/16 :goto_6

    .line 716
    .line 717
    :pswitch_20
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v8

    .line 721
    check-cast v8, Ljava/util/List;

    .line 722
    .line 723
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    if-lez v8, :cond_d

    .line 728
    .line 729
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 730
    .line 731
    .line 732
    move-result v7

    .line 733
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 734
    .line 735
    .line 736
    move-result v13

    .line 737
    goto/16 :goto_6

    .line 738
    .line 739
    :pswitch_21
    invoke-virtual {v2, v1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v8

    .line 743
    check-cast v8, Ljava/util/List;

    .line 744
    .line 745
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    if-lez v8, :cond_d

    .line 750
    .line 751
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 752
    .line 753
    .line 754
    move-result v7

    .line 755
    invoke-static {v8, v7, v8, v13}, LC0/S;->v(IIII)I

    .line 756
    .line 757
    .line 758
    move-result v13

    .line 759
    goto/16 :goto_6

    .line 760
    .line 761
    :pswitch_22
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    check-cast v8, Ljava/util/List;

    .line 766
    .line 767
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 768
    .line 769
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 770
    .line 771
    .line 772
    move-result v9

    .line 773
    if-nez v9, :cond_4

    .line 774
    .line 775
    :goto_5
    const/4 v7, 0x0

    .line 776
    goto/16 :goto_1

    .line 777
    .line 778
    :cond_4
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->p(Ljava/util/List;)I

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 783
    .line 784
    .line 785
    move-result v7

    .line 786
    goto/16 :goto_1

    .line 787
    .line 788
    :pswitch_23
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v8

    .line 792
    check-cast v8, Ljava/util/List;

    .line 793
    .line 794
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 795
    .line 796
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 797
    .line 798
    .line 799
    move-result v9

    .line 800
    if-nez v9, :cond_5

    .line 801
    .line 802
    goto :goto_5

    .line 803
    :cond_5
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->x(Ljava/util/List;)I

    .line 804
    .line 805
    .line 806
    move-result v8

    .line 807
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 808
    .line 809
    .line 810
    move-result v7

    .line 811
    goto/16 :goto_1

    .line 812
    .line 813
    :pswitch_24
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v8

    .line 817
    check-cast v8, Ljava/util/List;

    .line 818
    .line 819
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 820
    .line 821
    .line 822
    move-result v7

    .line 823
    goto/16 :goto_1

    .line 824
    .line 825
    :pswitch_25
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    check-cast v8, Ljava/util/List;

    .line 830
    .line 831
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 832
    .line 833
    .line 834
    move-result v7

    .line 835
    goto/16 :goto_1

    .line 836
    .line 837
    :pswitch_26
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v8

    .line 841
    check-cast v8, Ljava/util/List;

    .line 842
    .line 843
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 844
    .line 845
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 846
    .line 847
    .line 848
    move-result v9

    .line 849
    if-nez v9, :cond_6

    .line 850
    .line 851
    goto :goto_5

    .line 852
    :cond_6
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->r(Ljava/util/List;)I

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 857
    .line 858
    .line 859
    move-result v7

    .line 860
    goto/16 :goto_1

    .line 861
    .line 862
    :pswitch_27
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v8

    .line 866
    check-cast v8, Ljava/util/List;

    .line 867
    .line 868
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 869
    .line 870
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 871
    .line 872
    .line 873
    move-result v9

    .line 874
    if-nez v9, :cond_7

    .line 875
    .line 876
    goto :goto_5

    .line 877
    :cond_7
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->v(Ljava/util/List;)I

    .line 878
    .line 879
    .line 880
    move-result v8

    .line 881
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 882
    .line 883
    .line 884
    move-result v7

    .line 885
    goto/16 :goto_1

    .line 886
    .line 887
    :pswitch_28
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v8

    .line 891
    check-cast v8, Ljava/util/List;

    .line 892
    .line 893
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->o(ILjava/util/List;)I

    .line 894
    .line 895
    .line 896
    move-result v7

    .line 897
    goto/16 :goto_1

    .line 898
    .line 899
    :pswitch_29
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v8

    .line 903
    check-cast v8, Ljava/util/List;

    .line 904
    .line 905
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 906
    .line 907
    .line 908
    move-result-object v9

    .line 909
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/M0;->b(ILjava/util/List;Lcom/google/android/gms/internal/vision/L0;)I

    .line 910
    .line 911
    .line 912
    move-result v7

    .line 913
    goto/16 :goto_1

    .line 914
    .line 915
    :pswitch_2a
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v8

    .line 919
    check-cast v8, Ljava/util/List;

    .line 920
    .line 921
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->j(ILjava/util/List;)I

    .line 922
    .line 923
    .line 924
    move-result v7

    .line 925
    goto/16 :goto_1

    .line 926
    .line 927
    :pswitch_2b
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v8

    .line 931
    check-cast v8, Ljava/util/List;

    .line 932
    .line 933
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 934
    .line 935
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 936
    .line 937
    .line 938
    move-result v8

    .line 939
    if-nez v8, :cond_8

    .line 940
    .line 941
    goto/16 :goto_5

    .line 942
    .line 943
    :cond_8
    shl-int/lit8 v7, v7, 0x3

    .line 944
    .line 945
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 946
    .line 947
    .line 948
    move-result v7

    .line 949
    add-int/2addr v7, v10

    .line 950
    mul-int/2addr v7, v8

    .line 951
    goto/16 :goto_1

    .line 952
    .line 953
    :pswitch_2c
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v8

    .line 957
    check-cast v8, Ljava/util/List;

    .line 958
    .line 959
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 960
    .line 961
    .line 962
    move-result v7

    .line 963
    goto/16 :goto_1

    .line 964
    .line 965
    :pswitch_2d
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    check-cast v8, Ljava/util/List;

    .line 970
    .line 971
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 972
    .line 973
    .line 974
    move-result v7

    .line 975
    goto/16 :goto_1

    .line 976
    .line 977
    :pswitch_2e
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v8

    .line 981
    check-cast v8, Ljava/util/List;

    .line 982
    .line 983
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 984
    .line 985
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 986
    .line 987
    .line 988
    move-result v9

    .line 989
    if-nez v9, :cond_9

    .line 990
    .line 991
    goto/16 :goto_5

    .line 992
    .line 993
    :cond_9
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->t(Ljava/util/List;)I

    .line 994
    .line 995
    .line 996
    move-result v8

    .line 997
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 998
    .line 999
    .line 1000
    move-result v7

    .line 1001
    goto/16 :goto_1

    .line 1002
    .line 1003
    :pswitch_2f
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v8

    .line 1007
    check-cast v8, Ljava/util/List;

    .line 1008
    .line 1009
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 1010
    .line 1011
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1012
    .line 1013
    .line 1014
    move-result v9

    .line 1015
    if-nez v9, :cond_a

    .line 1016
    .line 1017
    goto/16 :goto_5

    .line 1018
    .line 1019
    :cond_a
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->k(Ljava/util/List;)I

    .line 1020
    .line 1021
    .line 1022
    move-result v8

    .line 1023
    invoke-static {v7, v9, v8}, LC0/S;->x(III)I

    .line 1024
    .line 1025
    .line 1026
    move-result v7

    .line 1027
    goto/16 :goto_1

    .line 1028
    .line 1029
    :pswitch_30
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v8

    .line 1033
    check-cast v8, Ljava/util/List;

    .line 1034
    .line 1035
    sget-object v9, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 1036
    .line 1037
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1038
    .line 1039
    .line 1040
    move-result v9

    .line 1041
    if-nez v9, :cond_b

    .line 1042
    .line 1043
    goto/16 :goto_5

    .line 1044
    .line 1045
    :cond_b
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/M0;->c(Ljava/util/List;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v9

    .line 1049
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1050
    .line 1051
    .line 1052
    move-result v8

    .line 1053
    invoke-static {v7, v8, v9}, LC0/S;->x(III)I

    .line 1054
    .line 1055
    .line 1056
    move-result v7

    .line 1057
    goto/16 :goto_1

    .line 1058
    .line 1059
    :pswitch_31
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v8

    .line 1063
    check-cast v8, Ljava/util/List;

    .line 1064
    .line 1065
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 1066
    .line 1067
    .line 1068
    move-result v7

    .line 1069
    goto/16 :goto_1

    .line 1070
    .line 1071
    :pswitch_32
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v8

    .line 1075
    check-cast v8, Ljava/util/List;

    .line 1076
    .line 1077
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v7

    .line 1081
    goto/16 :goto_1

    .line 1082
    .line 1083
    :pswitch_33
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v11

    .line 1087
    if-eqz v11, :cond_d

    .line 1088
    .line 1089
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v8

    .line 1093
    check-cast v8, Lcom/google/android/gms/internal/vision/K;

    .line 1094
    .line 1095
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v9

    .line 1099
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 1100
    .line 1101
    .line 1102
    move-result v7

    .line 1103
    goto/16 :goto_1

    .line 1104
    .line 1105
    :pswitch_34
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v11

    .line 1109
    if-eqz v11, :cond_d

    .line 1110
    .line 1111
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1112
    .line 1113
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1114
    .line 1115
    .line 1116
    move-result-wide v8

    .line 1117
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->Q(IJ)I

    .line 1118
    .line 1119
    .line 1120
    move-result v7

    .line 1121
    goto/16 :goto_1

    .line 1122
    .line 1123
    :pswitch_35
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v11

    .line 1127
    if-eqz v11, :cond_d

    .line 1128
    .line 1129
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1130
    .line 1131
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1132
    .line 1133
    .line 1134
    move-result v8

    .line 1135
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->U(II)I

    .line 1136
    .line 1137
    .line 1138
    move-result v7

    .line 1139
    goto/16 :goto_1

    .line 1140
    .line 1141
    :pswitch_36
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v8

    .line 1145
    if-eqz v8, :cond_d

    .line 1146
    .line 1147
    shl-int/lit8 v7, v7, 0x3

    .line 1148
    .line 1149
    invoke-static {v7, v4, v13}, LC0/S;->u(III)I

    .line 1150
    .line 1151
    .line 1152
    move-result v13

    .line 1153
    goto/16 :goto_6

    .line 1154
    .line 1155
    :pswitch_37
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v8

    .line 1159
    if-eqz v8, :cond_d

    .line 1160
    .line 1161
    shl-int/lit8 v7, v7, 0x3

    .line 1162
    .line 1163
    invoke-static {v7, v3, v13}, LC0/S;->u(III)I

    .line 1164
    .line 1165
    .line 1166
    move-result v13

    .line 1167
    goto/16 :goto_6

    .line 1168
    .line 1169
    :pswitch_38
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v11

    .line 1173
    if-eqz v11, :cond_d

    .line 1174
    .line 1175
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1176
    .line 1177
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1178
    .line 1179
    .line 1180
    move-result v8

    .line 1181
    shl-int/lit8 v7, v7, 0x3

    .line 1182
    .line 1183
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1184
    .line 1185
    .line 1186
    move-result v7

    .line 1187
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 1188
    .line 1189
    .line 1190
    move-result v8

    .line 1191
    goto/16 :goto_2

    .line 1192
    .line 1193
    :pswitch_39
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v11

    .line 1197
    if-eqz v11, :cond_d

    .line 1198
    .line 1199
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1200
    .line 1201
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1202
    .line 1203
    .line 1204
    move-result v8

    .line 1205
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->S(II)I

    .line 1206
    .line 1207
    .line 1208
    move-result v7

    .line 1209
    goto/16 :goto_1

    .line 1210
    .line 1211
    :pswitch_3a
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v11

    .line 1215
    if-eqz v11, :cond_d

    .line 1216
    .line 1217
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v8

    .line 1221
    check-cast v8, Lcom/google/android/gms/internal/vision/P;

    .line 1222
    .line 1223
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 1224
    .line 1225
    .line 1226
    move-result v7

    .line 1227
    goto/16 :goto_1

    .line 1228
    .line 1229
    :pswitch_3b
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v11

    .line 1233
    if-eqz v11, :cond_d

    .line 1234
    .line 1235
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v8

    .line 1239
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v9

    .line 1243
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/M0;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)I

    .line 1244
    .line 1245
    .line 1246
    move-result v7

    .line 1247
    goto/16 :goto_1

    .line 1248
    .line 1249
    :pswitch_3c
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v11

    .line 1253
    if-eqz v11, :cond_d

    .line 1254
    .line 1255
    invoke-static {v8, v9, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v8

    .line 1259
    instance-of v9, v8, Lcom/google/android/gms/internal/vision/P;

    .line 1260
    .line 1261
    if-eqz v9, :cond_c

    .line 1262
    .line 1263
    check-cast v8, Lcom/google/android/gms/internal/vision/P;

    .line 1264
    .line 1265
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 1266
    .line 1267
    .line 1268
    move-result v7

    .line 1269
    goto/16 :goto_1

    .line 1270
    .line 1271
    :cond_c
    check-cast v8, Ljava/lang/String;

    .line 1272
    .line 1273
    shl-int/lit8 v7, v7, 0x3

    .line 1274
    .line 1275
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1276
    .line 1277
    .line 1278
    move-result v7

    .line 1279
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->G(Ljava/lang/String;)I

    .line 1280
    .line 1281
    .line 1282
    move-result v8

    .line 1283
    goto/16 :goto_2

    .line 1284
    .line 1285
    :pswitch_3d
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v8

    .line 1289
    if-eqz v8, :cond_d

    .line 1290
    .line 1291
    shl-int/lit8 v7, v7, 0x3

    .line 1292
    .line 1293
    invoke-static {v7, v10, v13}, LC0/S;->u(III)I

    .line 1294
    .line 1295
    .line 1296
    move-result v13

    .line 1297
    goto/16 :goto_6

    .line 1298
    .line 1299
    :pswitch_3e
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v8

    .line 1303
    if-eqz v8, :cond_d

    .line 1304
    .line 1305
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->V(I)I

    .line 1306
    .line 1307
    .line 1308
    move-result v7

    .line 1309
    goto/16 :goto_1

    .line 1310
    .line 1311
    :pswitch_3f
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v8

    .line 1315
    if-eqz v8, :cond_d

    .line 1316
    .line 1317
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->R(I)I

    .line 1318
    .line 1319
    .line 1320
    move-result v7

    .line 1321
    goto/16 :goto_1

    .line 1322
    .line 1323
    :pswitch_40
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v11

    .line 1327
    if-eqz v11, :cond_d

    .line 1328
    .line 1329
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1330
    .line 1331
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 1332
    .line 1333
    .line 1334
    move-result v8

    .line 1335
    shl-int/lit8 v7, v7, 0x3

    .line 1336
    .line 1337
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1338
    .line 1339
    .line 1340
    move-result v7

    .line 1341
    invoke-static {v8}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 1342
    .line 1343
    .line 1344
    move-result v8

    .line 1345
    goto/16 :goto_2

    .line 1346
    .line 1347
    :pswitch_41
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v11

    .line 1351
    if-eqz v11, :cond_d

    .line 1352
    .line 1353
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1354
    .line 1355
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1356
    .line 1357
    .line 1358
    move-result-wide v8

    .line 1359
    invoke-static {v7, v8, v9}, Lcom/google/android/gms/internal/vision/Q;->N(IJ)I

    .line 1360
    .line 1361
    .line 1362
    move-result v7

    .line 1363
    goto/16 :goto_1

    .line 1364
    .line 1365
    :pswitch_42
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v11

    .line 1369
    if-eqz v11, :cond_d

    .line 1370
    .line 1371
    sget-object v11, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1372
    .line 1373
    invoke-virtual {v11, v8, v9, v1}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v8

    .line 1377
    shl-int/lit8 v7, v7, 0x3

    .line 1378
    .line 1379
    invoke-static {v7}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1380
    .line 1381
    .line 1382
    move-result v7

    .line 1383
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/vision/Q;->O(J)I

    .line 1384
    .line 1385
    .line 1386
    move-result v8

    .line 1387
    goto/16 :goto_2

    .line 1388
    .line 1389
    :pswitch_43
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v8

    .line 1393
    if-eqz v8, :cond_d

    .line 1394
    .line 1395
    shl-int/lit8 v7, v7, 0x3

    .line 1396
    .line 1397
    invoke-static {v7, v3, v13}, LC0/S;->u(III)I

    .line 1398
    .line 1399
    .line 1400
    move-result v13

    .line 1401
    goto :goto_6

    .line 1402
    :pswitch_44
    invoke-virtual {v0, v12, v1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 1403
    .line 1404
    .line 1405
    move-result v8

    .line 1406
    if-eqz v8, :cond_d

    .line 1407
    .line 1408
    shl-int/lit8 v7, v7, 0x3

    .line 1409
    .line 1410
    invoke-static {v7, v4, v13}, LC0/S;->u(III)I

    .line 1411
    .line 1412
    .line 1413
    move-result v13

    .line 1414
    :cond_d
    :goto_6
    add-int/lit8 v12, v12, 0x3

    .line 1415
    .line 1416
    move/from16 v7, v16

    .line 1417
    .line 1418
    move/from16 v8, v17

    .line 1419
    .line 1420
    move-object/from16 v9, v18

    .line 1421
    .line 1422
    goto/16 :goto_0

    .line 1423
    .line 1424
    :cond_e
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1425
    .line 1426
    .line 1427
    check-cast v1, Lcom/google/android/gms/internal/vision/e0;

    .line 1428
    .line 1429
    iget-object v1, v1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 1430
    .line 1431
    invoke-virtual {v1}, Lcom/google/android/gms/internal/vision/O0;->d()I

    .line 1432
    .line 1433
    .line 1434
    move-result v1

    .line 1435
    add-int/2addr v1, v13

    .line 1436
    return v1

    .line 1437
    :cond_f
    move/from16 v16, v7

    .line 1438
    .line 1439
    move/from16 v17, v8

    .line 1440
    .line 1441
    move-object/from16 v18, v9

    .line 1442
    .line 1443
    sget-object v2, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 1444
    .line 1445
    move/from16 v9, v17

    .line 1446
    .line 1447
    move-object/from16 v12, v18

    .line 1448
    .line 1449
    const/4 v7, 0x0

    .line 1450
    const/4 v8, 0x0

    .line 1451
    const/4 v11, 0x0

    .line 1452
    :goto_7
    array-length v13, v12

    .line 1453
    if-ge v7, v13, :cond_23

    .line 1454
    .line 1455
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 1456
    .line 1457
    .line 1458
    move-result v13

    .line 1459
    aget v14, v12, v7

    .line 1460
    .line 1461
    and-int v15, v13, v16

    .line 1462
    .line 1463
    ushr-int/lit8 v15, v15, 0x14

    .line 1464
    .line 1465
    move/from16 v18, v10

    .line 1466
    .line 1467
    const/16 v10, 0x11

    .line 1468
    .line 1469
    if-gt v15, v10, :cond_10

    .line 1470
    .line 1471
    add-int/lit8 v10, v7, 0x2

    .line 1472
    .line 1473
    aget v10, v12, v10

    .line 1474
    .line 1475
    and-int v3, v10, v17

    .line 1476
    .line 1477
    ushr-int/lit8 v10, v10, 0x14

    .line 1478
    .line 1479
    shl-int v10, v18, v10

    .line 1480
    .line 1481
    move-object/from16 v21, v5

    .line 1482
    .line 1483
    if-eq v3, v9, :cond_11

    .line 1484
    .line 1485
    int-to-long v4, v3

    .line 1486
    invoke-virtual {v2, v1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1487
    .line 1488
    .line 1489
    move-result v11

    .line 1490
    move v9, v3

    .line 1491
    goto :goto_8

    .line 1492
    :cond_10
    move-object/from16 v21, v5

    .line 1493
    .line 1494
    const/4 v10, 0x0

    .line 1495
    :cond_11
    :goto_8
    and-int v3, v13, v17

    .line 1496
    .line 1497
    int-to-long v3, v3

    .line 1498
    packed-switch v15, :pswitch_data_1

    .line 1499
    .line 1500
    .line 1501
    goto :goto_a

    .line 1502
    :pswitch_45
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v5

    .line 1506
    if-eqz v5, :cond_12

    .line 1507
    .line 1508
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v3

    .line 1512
    check-cast v3, Lcom/google/android/gms/internal/vision/K;

    .line 1513
    .line 1514
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v4

    .line 1518
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 1519
    .line 1520
    .line 1521
    move-result v3

    .line 1522
    :goto_9
    add-int/2addr v8, v3

    .line 1523
    :cond_12
    :goto_a
    move/from16 v5, v18

    .line 1524
    .line 1525
    :cond_13
    :goto_b
    const/4 v4, 0x4

    .line 1526
    :cond_14
    :goto_c
    const/16 v10, 0x8

    .line 1527
    .line 1528
    goto/16 :goto_18

    .line 1529
    .line 1530
    :pswitch_46
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1531
    .line 1532
    .line 1533
    move-result v5

    .line 1534
    if-eqz v5, :cond_12

    .line 1535
    .line 1536
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 1537
    .line 1538
    .line 1539
    move-result-wide v3

    .line 1540
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->Q(IJ)I

    .line 1541
    .line 1542
    .line 1543
    move-result v3

    .line 1544
    goto :goto_9

    .line 1545
    :pswitch_47
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v5

    .line 1549
    if-eqz v5, :cond_12

    .line 1550
    .line 1551
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 1552
    .line 1553
    .line 1554
    move-result v3

    .line 1555
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->U(II)I

    .line 1556
    .line 1557
    .line 1558
    move-result v3

    .line 1559
    goto :goto_9

    .line 1560
    :pswitch_48
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1561
    .line 1562
    .line 1563
    move-result v3

    .line 1564
    if-eqz v3, :cond_12

    .line 1565
    .line 1566
    shl-int/lit8 v3, v14, 0x3

    .line 1567
    .line 1568
    const/16 v4, 0x8

    .line 1569
    .line 1570
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 1571
    .line 1572
    .line 1573
    move-result v8

    .line 1574
    move v10, v4

    .line 1575
    move/from16 v5, v18

    .line 1576
    .line 1577
    const/4 v4, 0x4

    .line 1578
    goto/16 :goto_18

    .line 1579
    .line 1580
    :pswitch_49
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1581
    .line 1582
    .line 1583
    move-result v3

    .line 1584
    if-eqz v3, :cond_12

    .line 1585
    .line 1586
    shl-int/lit8 v3, v14, 0x3

    .line 1587
    .line 1588
    const/4 v4, 0x4

    .line 1589
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 1590
    .line 1591
    .line 1592
    move-result v8

    .line 1593
    move/from16 v5, v18

    .line 1594
    .line 1595
    goto :goto_c

    .line 1596
    :pswitch_4a
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v5

    .line 1600
    if-eqz v5, :cond_12

    .line 1601
    .line 1602
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 1603
    .line 1604
    .line 1605
    move-result v3

    .line 1606
    shl-int/lit8 v4, v14, 0x3

    .line 1607
    .line 1608
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1609
    .line 1610
    .line 1611
    move-result v4

    .line 1612
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 1613
    .line 1614
    .line 1615
    move-result v3

    .line 1616
    :goto_d
    add-int/2addr v3, v4

    .line 1617
    goto :goto_9

    .line 1618
    :pswitch_4b
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v5

    .line 1622
    if-eqz v5, :cond_12

    .line 1623
    .line 1624
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 1625
    .line 1626
    .line 1627
    move-result v3

    .line 1628
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->S(II)I

    .line 1629
    .line 1630
    .line 1631
    move-result v3

    .line 1632
    goto :goto_9

    .line 1633
    :pswitch_4c
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result v5

    .line 1637
    if-eqz v5, :cond_12

    .line 1638
    .line 1639
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v3

    .line 1643
    check-cast v3, Lcom/google/android/gms/internal/vision/P;

    .line 1644
    .line 1645
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 1646
    .line 1647
    .line 1648
    move-result v3

    .line 1649
    goto :goto_9

    .line 1650
    :pswitch_4d
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v5

    .line 1654
    if-eqz v5, :cond_12

    .line 1655
    .line 1656
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v3

    .line 1660
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v4

    .line 1664
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/M0;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)I

    .line 1665
    .line 1666
    .line 1667
    move-result v3

    .line 1668
    goto/16 :goto_9

    .line 1669
    .line 1670
    :pswitch_4e
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v5

    .line 1674
    if-eqz v5, :cond_12

    .line 1675
    .line 1676
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v3

    .line 1680
    instance-of v4, v3, Lcom/google/android/gms/internal/vision/P;

    .line 1681
    .line 1682
    if-eqz v4, :cond_15

    .line 1683
    .line 1684
    check-cast v3, Lcom/google/android/gms/internal/vision/P;

    .line 1685
    .line 1686
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 1687
    .line 1688
    .line 1689
    move-result v3

    .line 1690
    goto/16 :goto_9

    .line 1691
    .line 1692
    :cond_15
    check-cast v3, Ljava/lang/String;

    .line 1693
    .line 1694
    shl-int/lit8 v4, v14, 0x3

    .line 1695
    .line 1696
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1697
    .line 1698
    .line 1699
    move-result v4

    .line 1700
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->G(Ljava/lang/String;)I

    .line 1701
    .line 1702
    .line 1703
    move-result v3

    .line 1704
    goto :goto_d

    .line 1705
    :pswitch_4f
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v3

    .line 1709
    if-eqz v3, :cond_16

    .line 1710
    .line 1711
    shl-int/lit8 v3, v14, 0x3

    .line 1712
    .line 1713
    move/from16 v4, v18

    .line 1714
    .line 1715
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 1716
    .line 1717
    .line 1718
    move-result v8

    .line 1719
    move v5, v4

    .line 1720
    goto/16 :goto_b

    .line 1721
    .line 1722
    :pswitch_50
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v3

    .line 1726
    if-eqz v3, :cond_16

    .line 1727
    .line 1728
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->V(I)I

    .line 1729
    .line 1730
    .line 1731
    move-result v3

    .line 1732
    :goto_e
    add-int/2addr v8, v3

    .line 1733
    :cond_16
    :goto_f
    const/4 v4, 0x4

    .line 1734
    :goto_10
    const/4 v5, 0x1

    .line 1735
    goto/16 :goto_c

    .line 1736
    .line 1737
    :pswitch_51
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1738
    .line 1739
    .line 1740
    move-result v3

    .line 1741
    if-eqz v3, :cond_16

    .line 1742
    .line 1743
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->R(I)I

    .line 1744
    .line 1745
    .line 1746
    move-result v3

    .line 1747
    goto :goto_e

    .line 1748
    :pswitch_52
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    move-result v5

    .line 1752
    if-eqz v5, :cond_16

    .line 1753
    .line 1754
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 1755
    .line 1756
    .line 1757
    move-result v3

    .line 1758
    shl-int/lit8 v4, v14, 0x3

    .line 1759
    .line 1760
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1761
    .line 1762
    .line 1763
    move-result v4

    .line 1764
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 1765
    .line 1766
    .line 1767
    move-result v3

    .line 1768
    :goto_11
    add-int/2addr v3, v4

    .line 1769
    goto :goto_e

    .line 1770
    :pswitch_53
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v5

    .line 1774
    if-eqz v5, :cond_16

    .line 1775
    .line 1776
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 1777
    .line 1778
    .line 1779
    move-result-wide v3

    .line 1780
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->N(IJ)I

    .line 1781
    .line 1782
    .line 1783
    move-result v3

    .line 1784
    goto :goto_e

    .line 1785
    :pswitch_54
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v5

    .line 1789
    if-eqz v5, :cond_16

    .line 1790
    .line 1791
    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 1792
    .line 1793
    .line 1794
    move-result-wide v3

    .line 1795
    shl-int/lit8 v5, v14, 0x3

    .line 1796
    .line 1797
    invoke-static {v5}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 1798
    .line 1799
    .line 1800
    move-result v5

    .line 1801
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/vision/Q;->O(J)I

    .line 1802
    .line 1803
    .line 1804
    move-result v3

    .line 1805
    add-int/2addr v3, v5

    .line 1806
    goto :goto_e

    .line 1807
    :pswitch_55
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v3

    .line 1811
    if-eqz v3, :cond_16

    .line 1812
    .line 1813
    shl-int/lit8 v3, v14, 0x3

    .line 1814
    .line 1815
    const/4 v4, 0x4

    .line 1816
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 1817
    .line 1818
    .line 1819
    move-result v8

    .line 1820
    goto :goto_10

    .line 1821
    :pswitch_56
    invoke-virtual {v0, v14, v7, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v3

    .line 1825
    if-eqz v3, :cond_16

    .line 1826
    .line 1827
    shl-int/lit8 v3, v14, 0x3

    .line 1828
    .line 1829
    const/16 v4, 0x8

    .line 1830
    .line 1831
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 1832
    .line 1833
    .line 1834
    move-result v8

    .line 1835
    :goto_12
    move v10, v4

    .line 1836
    const/4 v4, 0x4

    .line 1837
    const/4 v5, 0x1

    .line 1838
    goto/16 :goto_18

    .line 1839
    .line 1840
    :pswitch_57
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v3

    .line 1844
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v4

    .line 1848
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1849
    .line 1850
    .line 1851
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/vision/z0;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1852
    .line 1853
    .line 1854
    goto :goto_f

    .line 1855
    :pswitch_58
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v3

    .line 1859
    check-cast v3, Ljava/util/List;

    .line 1860
    .line 1861
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v4

    .line 1865
    sget-object v5, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 1866
    .line 1867
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1868
    .line 1869
    .line 1870
    move-result v5

    .line 1871
    if-nez v5, :cond_17

    .line 1872
    .line 1873
    const/4 v13, 0x0

    .line 1874
    goto :goto_14

    .line 1875
    :cond_17
    const/4 v10, 0x0

    .line 1876
    const/4 v13, 0x0

    .line 1877
    :goto_13
    if-ge v10, v5, :cond_18

    .line 1878
    .line 1879
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v15

    .line 1883
    check-cast v15, Lcom/google/android/gms/internal/vision/K;

    .line 1884
    .line 1885
    invoke-static {v14, v15, v4}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 1886
    .line 1887
    .line 1888
    move-result v15

    .line 1889
    add-int/2addr v13, v15

    .line 1890
    add-int/lit8 v10, v10, 0x1

    .line 1891
    .line 1892
    goto :goto_13

    .line 1893
    :cond_18
    :goto_14
    add-int/2addr v8, v13

    .line 1894
    goto/16 :goto_f

    .line 1895
    .line 1896
    :pswitch_59
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v3

    .line 1900
    check-cast v3, Ljava/util/List;

    .line 1901
    .line 1902
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->p(Ljava/util/List;)I

    .line 1903
    .line 1904
    .line 1905
    move-result v3

    .line 1906
    if-lez v3, :cond_16

    .line 1907
    .line 1908
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 1909
    .line 1910
    .line 1911
    move-result v4

    .line 1912
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 1913
    .line 1914
    .line 1915
    move-result v8

    .line 1916
    goto/16 :goto_f

    .line 1917
    .line 1918
    :pswitch_5a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v3

    .line 1922
    check-cast v3, Ljava/util/List;

    .line 1923
    .line 1924
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->x(Ljava/util/List;)I

    .line 1925
    .line 1926
    .line 1927
    move-result v3

    .line 1928
    if-lez v3, :cond_16

    .line 1929
    .line 1930
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 1931
    .line 1932
    .line 1933
    move-result v4

    .line 1934
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 1935
    .line 1936
    .line 1937
    move-result v8

    .line 1938
    goto/16 :goto_f

    .line 1939
    .line 1940
    :pswitch_5b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v3

    .line 1944
    check-cast v3, Ljava/util/List;

    .line 1945
    .line 1946
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 1947
    .line 1948
    .line 1949
    move-result v3

    .line 1950
    if-lez v3, :cond_16

    .line 1951
    .line 1952
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 1953
    .line 1954
    .line 1955
    move-result v4

    .line 1956
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 1957
    .line 1958
    .line 1959
    move-result v8

    .line 1960
    goto/16 :goto_f

    .line 1961
    .line 1962
    :pswitch_5c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v3

    .line 1966
    check-cast v3, Ljava/util/List;

    .line 1967
    .line 1968
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 1969
    .line 1970
    .line 1971
    move-result v3

    .line 1972
    if-lez v3, :cond_16

    .line 1973
    .line 1974
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 1975
    .line 1976
    .line 1977
    move-result v4

    .line 1978
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 1979
    .line 1980
    .line 1981
    move-result v8

    .line 1982
    goto/16 :goto_f

    .line 1983
    .line 1984
    :pswitch_5d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v3

    .line 1988
    check-cast v3, Ljava/util/List;

    .line 1989
    .line 1990
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->r(Ljava/util/List;)I

    .line 1991
    .line 1992
    .line 1993
    move-result v3

    .line 1994
    if-lez v3, :cond_16

    .line 1995
    .line 1996
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 1997
    .line 1998
    .line 1999
    move-result v4

    .line 2000
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2001
    .line 2002
    .line 2003
    move-result v8

    .line 2004
    goto/16 :goto_f

    .line 2005
    .line 2006
    :pswitch_5e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v3

    .line 2010
    check-cast v3, Ljava/util/List;

    .line 2011
    .line 2012
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->v(Ljava/util/List;)I

    .line 2013
    .line 2014
    .line 2015
    move-result v3

    .line 2016
    if-lez v3, :cond_16

    .line 2017
    .line 2018
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2019
    .line 2020
    .line 2021
    move-result v4

    .line 2022
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2023
    .line 2024
    .line 2025
    move-result v8

    .line 2026
    goto/16 :goto_f

    .line 2027
    .line 2028
    :pswitch_5f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v3

    .line 2032
    check-cast v3, Ljava/util/List;

    .line 2033
    .line 2034
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2035
    .line 2036
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2037
    .line 2038
    .line 2039
    move-result v3

    .line 2040
    if-lez v3, :cond_16

    .line 2041
    .line 2042
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2043
    .line 2044
    .line 2045
    move-result v4

    .line 2046
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2047
    .line 2048
    .line 2049
    move-result v8

    .line 2050
    goto/16 :goto_f

    .line 2051
    .line 2052
    :pswitch_60
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v3

    .line 2056
    check-cast v3, Ljava/util/List;

    .line 2057
    .line 2058
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 2059
    .line 2060
    .line 2061
    move-result v3

    .line 2062
    if-lez v3, :cond_16

    .line 2063
    .line 2064
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2065
    .line 2066
    .line 2067
    move-result v4

    .line 2068
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2069
    .line 2070
    .line 2071
    move-result v8

    .line 2072
    goto/16 :goto_f

    .line 2073
    .line 2074
    :pswitch_61
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v3

    .line 2078
    check-cast v3, Ljava/util/List;

    .line 2079
    .line 2080
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 2081
    .line 2082
    .line 2083
    move-result v3

    .line 2084
    if-lez v3, :cond_16

    .line 2085
    .line 2086
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2087
    .line 2088
    .line 2089
    move-result v4

    .line 2090
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2091
    .line 2092
    .line 2093
    move-result v8

    .line 2094
    goto/16 :goto_f

    .line 2095
    .line 2096
    :pswitch_62
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v3

    .line 2100
    check-cast v3, Ljava/util/List;

    .line 2101
    .line 2102
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->t(Ljava/util/List;)I

    .line 2103
    .line 2104
    .line 2105
    move-result v3

    .line 2106
    if-lez v3, :cond_16

    .line 2107
    .line 2108
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2109
    .line 2110
    .line 2111
    move-result v4

    .line 2112
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2113
    .line 2114
    .line 2115
    move-result v8

    .line 2116
    goto/16 :goto_f

    .line 2117
    .line 2118
    :pswitch_63
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v3

    .line 2122
    check-cast v3, Ljava/util/List;

    .line 2123
    .line 2124
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->k(Ljava/util/List;)I

    .line 2125
    .line 2126
    .line 2127
    move-result v3

    .line 2128
    if-lez v3, :cond_16

    .line 2129
    .line 2130
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2131
    .line 2132
    .line 2133
    move-result v4

    .line 2134
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2135
    .line 2136
    .line 2137
    move-result v8

    .line 2138
    goto/16 :goto_f

    .line 2139
    .line 2140
    :pswitch_64
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v3

    .line 2144
    check-cast v3, Ljava/util/List;

    .line 2145
    .line 2146
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->c(Ljava/util/List;)I

    .line 2147
    .line 2148
    .line 2149
    move-result v3

    .line 2150
    if-lez v3, :cond_16

    .line 2151
    .line 2152
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2153
    .line 2154
    .line 2155
    move-result v4

    .line 2156
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2157
    .line 2158
    .line 2159
    move-result v8

    .line 2160
    goto/16 :goto_f

    .line 2161
    .line 2162
    :pswitch_65
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v3

    .line 2166
    check-cast v3, Ljava/util/List;

    .line 2167
    .line 2168
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->A(Ljava/util/List;)I

    .line 2169
    .line 2170
    .line 2171
    move-result v3

    .line 2172
    if-lez v3, :cond_16

    .line 2173
    .line 2174
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2175
    .line 2176
    .line 2177
    move-result v4

    .line 2178
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2179
    .line 2180
    .line 2181
    move-result v8

    .line 2182
    goto/16 :goto_f

    .line 2183
    .line 2184
    :pswitch_66
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v3

    .line 2188
    check-cast v3, Ljava/util/List;

    .line 2189
    .line 2190
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->D(Ljava/util/List;)I

    .line 2191
    .line 2192
    .line 2193
    move-result v3

    .line 2194
    if-lez v3, :cond_16

    .line 2195
    .line 2196
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->y(I)I

    .line 2197
    .line 2198
    .line 2199
    move-result v4

    .line 2200
    invoke-static {v3, v4, v3, v8}, LC0/S;->v(IIII)I

    .line 2201
    .line 2202
    .line 2203
    move-result v8

    .line 2204
    goto/16 :goto_f

    .line 2205
    .line 2206
    :pswitch_67
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v3

    .line 2210
    check-cast v3, Ljava/util/List;

    .line 2211
    .line 2212
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2213
    .line 2214
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2215
    .line 2216
    .line 2217
    move-result v4

    .line 2218
    if-nez v4, :cond_19

    .line 2219
    .line 2220
    :goto_15
    const/4 v3, 0x0

    .line 2221
    goto/16 :goto_e

    .line 2222
    .line 2223
    :cond_19
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->p(Ljava/util/List;)I

    .line 2224
    .line 2225
    .line 2226
    move-result v3

    .line 2227
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2228
    .line 2229
    .line 2230
    move-result v3

    .line 2231
    goto/16 :goto_e

    .line 2232
    .line 2233
    :pswitch_68
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v3

    .line 2237
    check-cast v3, Ljava/util/List;

    .line 2238
    .line 2239
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2240
    .line 2241
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2242
    .line 2243
    .line 2244
    move-result v4

    .line 2245
    if-nez v4, :cond_1a

    .line 2246
    .line 2247
    goto :goto_15

    .line 2248
    :cond_1a
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->x(Ljava/util/List;)I

    .line 2249
    .line 2250
    .line 2251
    move-result v3

    .line 2252
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2253
    .line 2254
    .line 2255
    move-result v3

    .line 2256
    goto/16 :goto_e

    .line 2257
    .line 2258
    :pswitch_69
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v3

    .line 2262
    check-cast v3, Ljava/util/List;

    .line 2263
    .line 2264
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 2265
    .line 2266
    .line 2267
    move-result v3

    .line 2268
    goto/16 :goto_e

    .line 2269
    .line 2270
    :pswitch_6a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v3

    .line 2274
    check-cast v3, Ljava/util/List;

    .line 2275
    .line 2276
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 2277
    .line 2278
    .line 2279
    move-result v3

    .line 2280
    goto/16 :goto_e

    .line 2281
    .line 2282
    :pswitch_6b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v3

    .line 2286
    check-cast v3, Ljava/util/List;

    .line 2287
    .line 2288
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2289
    .line 2290
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2291
    .line 2292
    .line 2293
    move-result v4

    .line 2294
    if-nez v4, :cond_1b

    .line 2295
    .line 2296
    goto :goto_15

    .line 2297
    :cond_1b
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->r(Ljava/util/List;)I

    .line 2298
    .line 2299
    .line 2300
    move-result v3

    .line 2301
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2302
    .line 2303
    .line 2304
    move-result v3

    .line 2305
    goto/16 :goto_e

    .line 2306
    .line 2307
    :pswitch_6c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v3

    .line 2311
    check-cast v3, Ljava/util/List;

    .line 2312
    .line 2313
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2314
    .line 2315
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2316
    .line 2317
    .line 2318
    move-result v4

    .line 2319
    if-nez v4, :cond_1c

    .line 2320
    .line 2321
    goto :goto_15

    .line 2322
    :cond_1c
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->v(Ljava/util/List;)I

    .line 2323
    .line 2324
    .line 2325
    move-result v3

    .line 2326
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2327
    .line 2328
    .line 2329
    move-result v3

    .line 2330
    goto/16 :goto_e

    .line 2331
    .line 2332
    :pswitch_6d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v3

    .line 2336
    check-cast v3, Ljava/util/List;

    .line 2337
    .line 2338
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->o(ILjava/util/List;)I

    .line 2339
    .line 2340
    .line 2341
    move-result v3

    .line 2342
    goto/16 :goto_e

    .line 2343
    .line 2344
    :pswitch_6e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v3

    .line 2348
    check-cast v3, Ljava/util/List;

    .line 2349
    .line 2350
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v4

    .line 2354
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/M0;->b(ILjava/util/List;Lcom/google/android/gms/internal/vision/L0;)I

    .line 2355
    .line 2356
    .line 2357
    move-result v3

    .line 2358
    goto/16 :goto_e

    .line 2359
    .line 2360
    :pswitch_6f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v3

    .line 2364
    check-cast v3, Ljava/util/List;

    .line 2365
    .line 2366
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->j(ILjava/util/List;)I

    .line 2367
    .line 2368
    .line 2369
    move-result v3

    .line 2370
    goto/16 :goto_e

    .line 2371
    .line 2372
    :pswitch_70
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v3

    .line 2376
    check-cast v3, Ljava/util/List;

    .line 2377
    .line 2378
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2379
    .line 2380
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2381
    .line 2382
    .line 2383
    move-result v3

    .line 2384
    if-nez v3, :cond_1d

    .line 2385
    .line 2386
    const/4 v4, 0x0

    .line 2387
    goto :goto_16

    .line 2388
    :cond_1d
    shl-int/lit8 v4, v14, 0x3

    .line 2389
    .line 2390
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 2391
    .line 2392
    .line 2393
    move-result v4

    .line 2394
    const/16 v18, 0x1

    .line 2395
    .line 2396
    add-int/lit8 v4, v4, 0x1

    .line 2397
    .line 2398
    mul-int/2addr v4, v3

    .line 2399
    :goto_16
    add-int/2addr v8, v4

    .line 2400
    goto/16 :goto_f

    .line 2401
    .line 2402
    :pswitch_71
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v3

    .line 2406
    check-cast v3, Ljava/util/List;

    .line 2407
    .line 2408
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 2409
    .line 2410
    .line 2411
    move-result v3

    .line 2412
    goto/16 :goto_e

    .line 2413
    .line 2414
    :pswitch_72
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v3

    .line 2418
    check-cast v3, Ljava/util/List;

    .line 2419
    .line 2420
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 2421
    .line 2422
    .line 2423
    move-result v3

    .line 2424
    goto/16 :goto_e

    .line 2425
    .line 2426
    :pswitch_73
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v3

    .line 2430
    check-cast v3, Ljava/util/List;

    .line 2431
    .line 2432
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2433
    .line 2434
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2435
    .line 2436
    .line 2437
    move-result v4

    .line 2438
    if-nez v4, :cond_1e

    .line 2439
    .line 2440
    goto/16 :goto_15

    .line 2441
    .line 2442
    :cond_1e
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->t(Ljava/util/List;)I

    .line 2443
    .line 2444
    .line 2445
    move-result v3

    .line 2446
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2447
    .line 2448
    .line 2449
    move-result v3

    .line 2450
    goto/16 :goto_e

    .line 2451
    .line 2452
    :pswitch_74
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v3

    .line 2456
    check-cast v3, Ljava/util/List;

    .line 2457
    .line 2458
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2459
    .line 2460
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2461
    .line 2462
    .line 2463
    move-result v4

    .line 2464
    if-nez v4, :cond_1f

    .line 2465
    .line 2466
    goto/16 :goto_15

    .line 2467
    .line 2468
    :cond_1f
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->k(Ljava/util/List;)I

    .line 2469
    .line 2470
    .line 2471
    move-result v3

    .line 2472
    invoke-static {v14, v4, v3}, LC0/S;->x(III)I

    .line 2473
    .line 2474
    .line 2475
    move-result v3

    .line 2476
    goto/16 :goto_e

    .line 2477
    .line 2478
    :pswitch_75
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v3

    .line 2482
    check-cast v3, Ljava/util/List;

    .line 2483
    .line 2484
    sget-object v4, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    .line 2485
    .line 2486
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2487
    .line 2488
    .line 2489
    move-result v4

    .line 2490
    if-nez v4, :cond_20

    .line 2491
    .line 2492
    goto/16 :goto_15

    .line 2493
    .line 2494
    :cond_20
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/M0;->c(Ljava/util/List;)I

    .line 2495
    .line 2496
    .line 2497
    move-result v4

    .line 2498
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2499
    .line 2500
    .line 2501
    move-result v3

    .line 2502
    invoke-static {v14, v3, v4}, LC0/S;->x(III)I

    .line 2503
    .line 2504
    .line 2505
    move-result v3

    .line 2506
    goto/16 :goto_e

    .line 2507
    .line 2508
    :pswitch_76
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v3

    .line 2512
    check-cast v3, Ljava/util/List;

    .line 2513
    .line 2514
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->z(ILjava/util/List;)I

    .line 2515
    .line 2516
    .line 2517
    move-result v3

    .line 2518
    goto/16 :goto_e

    .line 2519
    .line 2520
    :pswitch_77
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v3

    .line 2524
    check-cast v3, Ljava/util/List;

    .line 2525
    .line 2526
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/M0;->C(ILjava/util/List;)I

    .line 2527
    .line 2528
    .line 2529
    move-result v3

    .line 2530
    goto/16 :goto_e

    .line 2531
    .line 2532
    :pswitch_78
    and-int v5, v11, v10

    .line 2533
    .line 2534
    if-eqz v5, :cond_16

    .line 2535
    .line 2536
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v3

    .line 2540
    check-cast v3, Lcom/google/android/gms/internal/vision/K;

    .line 2541
    .line 2542
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v4

    .line 2546
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->I(ILcom/google/android/gms/internal/vision/K;Lcom/google/android/gms/internal/vision/L0;)I

    .line 2547
    .line 2548
    .line 2549
    move-result v3

    .line 2550
    goto/16 :goto_e

    .line 2551
    .line 2552
    :pswitch_79
    and-int v5, v11, v10

    .line 2553
    .line 2554
    if-eqz v5, :cond_16

    .line 2555
    .line 2556
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2557
    .line 2558
    .line 2559
    move-result-wide v3

    .line 2560
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->Q(IJ)I

    .line 2561
    .line 2562
    .line 2563
    move-result v3

    .line 2564
    goto/16 :goto_e

    .line 2565
    .line 2566
    :pswitch_7a
    and-int v5, v11, v10

    .line 2567
    .line 2568
    if-eqz v5, :cond_16

    .line 2569
    .line 2570
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2571
    .line 2572
    .line 2573
    move-result v3

    .line 2574
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->U(II)I

    .line 2575
    .line 2576
    .line 2577
    move-result v3

    .line 2578
    goto/16 :goto_e

    .line 2579
    .line 2580
    :pswitch_7b
    and-int v3, v11, v10

    .line 2581
    .line 2582
    if-eqz v3, :cond_16

    .line 2583
    .line 2584
    shl-int/lit8 v3, v14, 0x3

    .line 2585
    .line 2586
    const/16 v4, 0x8

    .line 2587
    .line 2588
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 2589
    .line 2590
    .line 2591
    move-result v8

    .line 2592
    goto/16 :goto_12

    .line 2593
    .line 2594
    :pswitch_7c
    and-int v3, v11, v10

    .line 2595
    .line 2596
    if-eqz v3, :cond_16

    .line 2597
    .line 2598
    shl-int/lit8 v3, v14, 0x3

    .line 2599
    .line 2600
    const/4 v4, 0x4

    .line 2601
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 2602
    .line 2603
    .line 2604
    move-result v8

    .line 2605
    goto/16 :goto_10

    .line 2606
    .line 2607
    :pswitch_7d
    and-int v5, v11, v10

    .line 2608
    .line 2609
    if-eqz v5, :cond_16

    .line 2610
    .line 2611
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2612
    .line 2613
    .line 2614
    move-result v3

    .line 2615
    shl-int/lit8 v4, v14, 0x3

    .line 2616
    .line 2617
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 2618
    .line 2619
    .line 2620
    move-result v4

    .line 2621
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 2622
    .line 2623
    .line 2624
    move-result v3

    .line 2625
    goto/16 :goto_11

    .line 2626
    .line 2627
    :pswitch_7e
    and-int v5, v11, v10

    .line 2628
    .line 2629
    if-eqz v5, :cond_16

    .line 2630
    .line 2631
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2632
    .line 2633
    .line 2634
    move-result v3

    .line 2635
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->S(II)I

    .line 2636
    .line 2637
    .line 2638
    move-result v3

    .line 2639
    goto/16 :goto_e

    .line 2640
    .line 2641
    :pswitch_7f
    and-int v5, v11, v10

    .line 2642
    .line 2643
    if-eqz v5, :cond_16

    .line 2644
    .line 2645
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v3

    .line 2649
    check-cast v3, Lcom/google/android/gms/internal/vision/P;

    .line 2650
    .line 2651
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 2652
    .line 2653
    .line 2654
    move-result v3

    .line 2655
    goto/16 :goto_e

    .line 2656
    .line 2657
    :pswitch_80
    and-int v5, v11, v10

    .line 2658
    .line 2659
    if-eqz v5, :cond_16

    .line 2660
    .line 2661
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v3

    .line 2665
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 2666
    .line 2667
    .line 2668
    move-result-object v4

    .line 2669
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/M0;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)I

    .line 2670
    .line 2671
    .line 2672
    move-result v3

    .line 2673
    goto/16 :goto_e

    .line 2674
    .line 2675
    :pswitch_81
    and-int v5, v11, v10

    .line 2676
    .line 2677
    if-eqz v5, :cond_16

    .line 2678
    .line 2679
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2680
    .line 2681
    .line 2682
    move-result-object v3

    .line 2683
    instance-of v4, v3, Lcom/google/android/gms/internal/vision/P;

    .line 2684
    .line 2685
    if-eqz v4, :cond_21

    .line 2686
    .line 2687
    check-cast v3, Lcom/google/android/gms/internal/vision/P;

    .line 2688
    .line 2689
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/Q;->J(ILcom/google/android/gms/internal/vision/P;)I

    .line 2690
    .line 2691
    .line 2692
    move-result v3

    .line 2693
    goto/16 :goto_e

    .line 2694
    .line 2695
    :cond_21
    check-cast v3, Ljava/lang/String;

    .line 2696
    .line 2697
    shl-int/lit8 v4, v14, 0x3

    .line 2698
    .line 2699
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 2700
    .line 2701
    .line 2702
    move-result v4

    .line 2703
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->G(Ljava/lang/String;)I

    .line 2704
    .line 2705
    .line 2706
    move-result v3

    .line 2707
    goto/16 :goto_11

    .line 2708
    .line 2709
    :pswitch_82
    and-int v3, v11, v10

    .line 2710
    .line 2711
    if-eqz v3, :cond_22

    .line 2712
    .line 2713
    shl-int/lit8 v3, v14, 0x3

    .line 2714
    .line 2715
    const/4 v5, 0x1

    .line 2716
    invoke-static {v3, v5, v8}, LC0/S;->u(III)I

    .line 2717
    .line 2718
    .line 2719
    move-result v8

    .line 2720
    goto/16 :goto_b

    .line 2721
    .line 2722
    :cond_22
    const/4 v5, 0x1

    .line 2723
    goto/16 :goto_b

    .line 2724
    .line 2725
    :pswitch_83
    move/from16 v5, v18

    .line 2726
    .line 2727
    and-int v3, v11, v10

    .line 2728
    .line 2729
    if-eqz v3, :cond_13

    .line 2730
    .line 2731
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->V(I)I

    .line 2732
    .line 2733
    .line 2734
    move-result v3

    .line 2735
    :goto_17
    add-int/2addr v8, v3

    .line 2736
    goto/16 :goto_b

    .line 2737
    .line 2738
    :pswitch_84
    move/from16 v5, v18

    .line 2739
    .line 2740
    and-int v3, v11, v10

    .line 2741
    .line 2742
    if-eqz v3, :cond_13

    .line 2743
    .line 2744
    invoke-static {v14}, Lcom/google/android/gms/internal/vision/Q;->R(I)I

    .line 2745
    .line 2746
    .line 2747
    move-result v3

    .line 2748
    goto :goto_17

    .line 2749
    :pswitch_85
    move/from16 v5, v18

    .line 2750
    .line 2751
    and-int/2addr v10, v11

    .line 2752
    if-eqz v10, :cond_13

    .line 2753
    .line 2754
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2755
    .line 2756
    .line 2757
    move-result v3

    .line 2758
    shl-int/lit8 v4, v14, 0x3

    .line 2759
    .line 2760
    invoke-static {v4}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 2761
    .line 2762
    .line 2763
    move-result v4

    .line 2764
    invoke-static {v3}, Lcom/google/android/gms/internal/vision/Q;->P(I)I

    .line 2765
    .line 2766
    .line 2767
    move-result v3

    .line 2768
    add-int/2addr v3, v4

    .line 2769
    goto :goto_17

    .line 2770
    :pswitch_86
    move/from16 v5, v18

    .line 2771
    .line 2772
    and-int/2addr v10, v11

    .line 2773
    if-eqz v10, :cond_13

    .line 2774
    .line 2775
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2776
    .line 2777
    .line 2778
    move-result-wide v3

    .line 2779
    invoke-static {v14, v3, v4}, Lcom/google/android/gms/internal/vision/Q;->N(IJ)I

    .line 2780
    .line 2781
    .line 2782
    move-result v3

    .line 2783
    goto :goto_17

    .line 2784
    :pswitch_87
    move/from16 v5, v18

    .line 2785
    .line 2786
    and-int/2addr v10, v11

    .line 2787
    if-eqz v10, :cond_13

    .line 2788
    .line 2789
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2790
    .line 2791
    .line 2792
    move-result-wide v3

    .line 2793
    shl-int/lit8 v10, v14, 0x3

    .line 2794
    .line 2795
    invoke-static {v10}, Lcom/google/android/gms/internal/vision/Q;->T(I)I

    .line 2796
    .line 2797
    .line 2798
    move-result v10

    .line 2799
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/vision/Q;->O(J)I

    .line 2800
    .line 2801
    .line 2802
    move-result v3

    .line 2803
    add-int/2addr v3, v10

    .line 2804
    goto :goto_17

    .line 2805
    :pswitch_88
    move/from16 v5, v18

    .line 2806
    .line 2807
    and-int v3, v11, v10

    .line 2808
    .line 2809
    if-eqz v3, :cond_13

    .line 2810
    .line 2811
    shl-int/lit8 v3, v14, 0x3

    .line 2812
    .line 2813
    const/4 v4, 0x4

    .line 2814
    invoke-static {v3, v4, v8}, LC0/S;->u(III)I

    .line 2815
    .line 2816
    .line 2817
    move-result v8

    .line 2818
    goto/16 :goto_c

    .line 2819
    .line 2820
    :pswitch_89
    move/from16 v5, v18

    .line 2821
    .line 2822
    const/4 v4, 0x4

    .line 2823
    and-int v3, v11, v10

    .line 2824
    .line 2825
    if-eqz v3, :cond_14

    .line 2826
    .line 2827
    shl-int/lit8 v3, v14, 0x3

    .line 2828
    .line 2829
    const/16 v10, 0x8

    .line 2830
    .line 2831
    invoke-static {v3, v10, v8}, LC0/S;->u(III)I

    .line 2832
    .line 2833
    .line 2834
    move-result v8

    .line 2835
    :goto_18
    add-int/lit8 v7, v7, 0x3

    .line 2836
    .line 2837
    move v3, v4

    .line 2838
    move v4, v10

    .line 2839
    move v10, v5

    .line 2840
    move-object/from16 v5, v21

    .line 2841
    .line 2842
    goto/16 :goto_7

    .line 2843
    .line 2844
    :cond_23
    move-object/from16 v21, v5

    .line 2845
    .line 2846
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2847
    .line 2848
    .line 2849
    check-cast v1, Lcom/google/android/gms/internal/vision/e0;

    .line 2850
    .line 2851
    iget-object v1, v1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 2852
    .line 2853
    invoke-virtual {v1}, Lcom/google/android/gms/internal/vision/O0;->d()I

    .line 2854
    .line 2855
    .line 2856
    move-result v1

    .line 2857
    add-int/2addr v1, v8

    .line 2858
    return v1

    .line 2859
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v8, p6

    move/from16 v3, p7

    move-wide/from16 v9, p10

    move/from16 v4, p12

    .line 1
    sget-object v11, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    add-int/lit8 v5, v4, 0x2

    .line 2
    iget-object v6, v0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    aget v5, v6, v5

    const v6, 0xfffff

    and-int/2addr v5, v6

    int-to-long v12, v5

    const/4 v5, 0x5

    const/4 v14, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    packed-switch p9, :pswitch_data_0

    :cond_0
    move/from16 v15, p3

    goto/16 :goto_8

    :pswitch_0
    const/4 v5, 0x3

    if-ne v3, v5, :cond_0

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v6, v2, 0x4

    .line 3
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p13

    .line 4
    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/vision/d0;->f(Lcom/google/android/gms/internal/vision/L0;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    move-object v5, v7

    .line 5
    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_1

    .line 6
    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_1
    if-nez v14, :cond_2

    .line 7
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    .line 8
    :cond_2
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 9
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    move-result-object v3

    .line 10
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 11
    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 12
    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    ushr-long v5, v3, v6

    const-wide/16 v14, 0x1

    and-long/2addr v3, v14

    neg-long v3, v3

    xor-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 13
    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 14
    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-static {v3}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_3
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 15
    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    .line 16
    iget v5, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 17
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/vision/C0;->y(I)Lcom/google/android/gms/internal/vision/j0;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 18
    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/vision/j0;->a(I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 19
    :cond_3
    invoke-static {v1}, Lcom/google/android/gms/internal/vision/C0;->D(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/O0;

    move-result-object v1

    int-to-long v4, v5

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/internal/vision/O0;->a(ILjava/lang/Object;)V

    return v3

    .line 20
    :cond_4
    :goto_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v2, v3

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 21
    invoke-static {v14, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->z([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 22
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 23
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v3

    move/from16 v4, p4

    .line 24
    invoke-static {v3, v2, v15, v4, v5}, Lcom/google/android/gms/internal/vision/d0;->g(Lcom/google/android/gms/internal/vision/L0;[BIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 25
    invoke-virtual {v11, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    if-ne v3, v8, :cond_5

    .line 26
    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v14

    :cond_5
    if-nez v14, :cond_6

    .line 27
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    .line 28
    :cond_6
    iget-object v3, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 29
    invoke-static {v14, v3}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    move-result-object v3

    .line 30
    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 31
    :goto_1
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_6
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-ne v3, v7, :cond_b

    .line 32
    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    .line 33
    iget v4, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-nez v4, :cond_7

    .line 34
    const-string v2, ""

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_7
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_9

    add-int v5, v3, v4

    .line 35
    sget-object v6, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    invoke-virtual {v6, v2, v3, v5}, Lcom/google/android/gms/internal/vision/d0;->s([BII)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    .line 36
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    move-result-object v1

    throw v1

    .line 37
    :cond_9
    :goto_2
    new-instance v5, Ljava/lang/String;

    sget-object v6, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v5, v2, v3, v4, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 38
    invoke-virtual {v11, v1, v9, v10, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v3, v4

    .line 39
    :goto_3
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v3

    :pswitch_7
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 40
    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 41
    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    const-wide/16 v14, 0x0

    cmp-long v3, v3, v14

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const/4 v6, 0x0

    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_8
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_b

    .line 42
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_5
    add-int/lit8 v2, v15, 0x4

    goto/16 :goto_7

    :pswitch_9
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_b

    .line 43
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_6
    add-int/lit8 v2, v15, 0x8

    goto :goto_7

    :pswitch_a
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 44
    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 45
    iget v3, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_b
    move-object/from16 v2, p2

    move/from16 v15, p3

    move-object/from16 v5, p13

    if-nez v3, :cond_b

    .line 46
    invoke-static {v2, v15, v5}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 47
    iget-wide v3, v5, Lcom/google/android/gms/internal/clearcut/j;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v9, v10, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    :pswitch_c
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v5, :cond_b

    .line 48
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 49
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v15, p3

    if-ne v3, v6, :cond_b

    .line 50
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    .line 51
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v11, v1, v9, v10, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    .line 52
    :goto_7
    invoke-virtual {v11, v1, v12, v13, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_b
    :goto_8
    return v15

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I
    .locals 12

    move/from16 v0, p5

    move/from16 v1, p7

    move/from16 v6, p8

    move-wide/from16 v2, p12

    .line 1
    sget-object v4, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    invoke-virtual {v4, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/vision/n0;

    .line 2
    invoke-interface {v5}, Lcom/google/android/gms/internal/vision/n0;->zza()Z

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_1

    .line 3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_0

    const/16 v7, 0xa

    goto :goto_0

    :cond_0
    shl-int/2addr v7, v8

    .line 4
    :goto_0
    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/vision/n0;->a(I)Lcom/google/android/gms/internal/vision/n0;

    move-result-object v5

    .line 5
    invoke-virtual {v4, p1, v2, v3, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    move-object v4, v5

    const/4 v7, 0x3

    const/4 v2, 0x5

    const/4 v9, 0x0

    const/4 v3, 0x2

    packed-switch p11, :pswitch_data_0

    goto/16 :goto_14

    :pswitch_0
    if-ne v1, v7, :cond_47

    .line 6
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object p1

    and-int/lit8 v1, v0, -0x8

    or-int/lit8 v1, v1, 0x4

    move-object/from16 p6, p1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move-object/from16 p11, p14

    move/from16 p10, v1

    .line 7
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/vision/d0;->f(Lcom/google/android/gms/internal/vision/L0;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    move-object/from16 v2, p6

    move/from16 v3, p9

    move/from16 v6, p10

    move-object/from16 v5, p11

    .line 8
    iget-object v7, v5, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge p1, v3, :cond_2

    .line 9
    invoke-static {p2, p1, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    .line 10
    iget v8, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v8, :cond_2

    move-object/from16 p7, p2

    move-object/from16 p6, v2

    move/from16 p9, v3

    move-object/from16 p11, v5

    move/from16 p10, v6

    move/from16 p8, v7

    .line 11
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/vision/d0;->f(Lcom/google/android/gms/internal/vision/L0;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    move-object/from16 v1, p6

    move/from16 v5, p9

    move-object/from16 v8, p11

    .line 12
    iget-object v3, v8, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v1

    move v3, v5

    move-object v5, v8

    goto :goto_1

    :cond_2
    return p1

    :pswitch_1
    move-object/from16 v8, p14

    if-ne v1, v3, :cond_5

    .line 13
    check-cast v4, Lcom/google/android/gms/internal/vision/u0;

    .line 14
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    .line 15
    iget v0, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v0, p1

    if-lt p1, v0, :cond_4

    if-ne p1, v0, :cond_3

    return p1

    .line 16
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 17
    :cond_4
    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 18
    throw v9

    :cond_5
    if-eqz v1, :cond_6

    goto/16 :goto_14

    .line 19
    :cond_6
    check-cast v4, Lcom/google/android/gms/internal/vision/u0;

    .line 20
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 21
    throw v9

    :pswitch_2
    move/from16 v5, p4

    move-object/from16 v8, p14

    if-ne v1, v3, :cond_9

    .line 22
    check-cast v4, Lcom/google/android/gms/internal/vision/g0;

    .line 23
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    .line 24
    iget v0, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v0, p1

    :goto_2
    if-ge p1, v0, :cond_7

    .line 25
    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    .line 26
    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    move-result v1

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    goto :goto_2

    :cond_7
    if-ne p1, v0, :cond_8

    return p1

    .line 27
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_9
    if-nez v1, :cond_47

    .line 28
    check-cast v4, Lcom/google/android/gms/internal/vision/g0;

    .line 29
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    .line 30
    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    move-result v1

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    :goto_3
    if-ge p1, v5, :cond_a

    .line 31
    invoke-static {p2, p1, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 32
    iget v3, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v3, :cond_a

    .line 33
    invoke-static {p2, v1, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    .line 34
    iget v1, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    move-result v1

    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    goto :goto_3

    :cond_a
    return p1

    :pswitch_3
    move/from16 v5, p4

    move-object/from16 v8, p14

    if-ne v1, v3, :cond_d

    .line 35
    move-object v0, v4

    check-cast v0, Lcom/google/android/gms/internal/vision/g0;

    .line 36
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 37
    iget v3, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v3, v1

    :goto_4
    if-ge v1, v3, :cond_b

    .line 38
    invoke-static {p2, v1, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 39
    iget v5, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    goto :goto_4

    :cond_b
    if-ne v1, v3, :cond_c

    goto :goto_5

    .line 40
    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_d
    if-nez v1, :cond_47

    move-object v1, p2

    move v2, p3

    move v3, v5

    move-object v5, v8

    .line 41
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/vision/d0;->b(I[BIILcom/google/android/gms/internal/vision/n0;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 42
    :goto_5
    check-cast p1, Lcom/google/android/gms/internal/vision/e0;

    iget-object p2, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 43
    sget-object v0, Lcom/google/android/gms/internal/vision/O0;->f:Lcom/google/android/gms/internal/vision/O0;

    if-ne p2, v0, :cond_e

    goto :goto_6

    :cond_e
    move-object v9, p2

    .line 44
    :goto_6
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/vision/C0;->y(I)Lcom/google/android/gms/internal/vision/j0;

    move-result-object p2

    .line 45
    sget-object v0, Lcom/google/android/gms/internal/vision/M0;->a:Ljava/lang/Class;

    if-nez p2, :cond_f

    goto/16 :goto_a

    .line 46
    :cond_f
    instance-of v0, v4, Ljava/util/RandomAccess;

    iget-object v2, p0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    if-eqz v0, :cond_14

    .line 47
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x0

    move v5, v3

    :goto_7
    if-ge v3, v0, :cond_13

    .line 48
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 49
    invoke-interface {p2, v8}, Lcom/google/android/gms/internal/vision/j0;->a(I)Z

    move-result v10

    if-eqz v10, :cond_11

    if-eq v3, v5, :cond_10

    .line 50
    invoke-interface {v4, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_11
    if-nez v9, :cond_12

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    invoke-static {}, Lcom/google/android/gms/internal/vision/O0;->b()Lcom/google/android/gms/internal/vision/O0;

    move-result-object v9

    :cond_12
    int-to-long v10, v8

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v6, p6, 0x3

    .line 54
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v9, v6, v8}, Lcom/google/android/gms/internal/vision/O0;->a(ILjava/lang/Object;)V

    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_13
    if-eq v5, v0, :cond_17

    .line 55
    invoke-interface {v4, v5, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    goto :goto_a

    .line 56
    :cond_14
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 58
    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/vision/j0;->a(I)Z

    move-result v4

    if-nez v4, :cond_15

    if-nez v9, :cond_16

    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-static {}, Lcom/google/android/gms/internal/vision/O0;->b()Lcom/google/android/gms/internal/vision/O0;

    move-result-object v9

    :cond_16
    int-to-long v3, v3

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v5, p6, 0x3

    .line 62
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v9, v5, v3}, Lcom/google/android/gms/internal/vision/O0;->a(ILjava/lang/Object;)V

    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_9

    :cond_17
    :goto_a
    if-eqz v9, :cond_18

    .line 64
    iput-object v9, p1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    :cond_18
    return v1

    :pswitch_4
    move/from16 v5, p4

    move-object/from16 v8, p14

    if-ne v1, v3, :cond_47

    .line 65
    invoke-static {p2, p3, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 66
    iget v2, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v2, :cond_1f

    .line 67
    array-length v3, p2

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_1e

    if-nez v2, :cond_19

    .line 68
    sget-object v2, Lcom/google/android/gms/internal/vision/P;->s:Lcom/google/android/gms/internal/vision/P;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 69
    :cond_19
    invoke-static {p2, v1, v2}, Lcom/google/android/gms/internal/vision/P;->h([BII)Lcom/google/android/gms/internal/vision/P;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/2addr v1, v2

    :goto_c
    if-ge v1, v5, :cond_1d

    .line 70
    invoke-static {p2, v1, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    .line 71
    iget v3, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v3, :cond_1d

    .line 72
    invoke-static {p2, v2, v8}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 73
    iget v2, v8, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v2, :cond_1c

    .line 74
    array-length v3, p2

    sub-int/2addr v3, v1

    if-gt v2, v3, :cond_1b

    if-nez v2, :cond_1a

    .line 75
    sget-object v2, Lcom/google/android/gms/internal/vision/P;->s:Lcom/google/android/gms/internal/vision/P;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 76
    :cond_1a
    invoke-static {p2, v1, v2}, Lcom/google/android/gms/internal/vision/P;->h([BII)Lcom/google/android/gms/internal/vision/P;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 77
    :cond_1b
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 78
    :cond_1c
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_1d
    return v1

    .line 79
    :cond_1e
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 80
    :cond_1f
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :pswitch_5
    move/from16 v5, p4

    move-object/from16 v8, p14

    if-ne v1, v3, :cond_47

    .line 81
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v1

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p7, v0

    move-object/from16 p6, v1

    move-object/from16 p11, v4

    move/from16 p10, v5

    move-object/from16 p12, v8

    .line 82
    invoke-static/range {p6 .. p12}, Lcom/google/android/gms/internal/vision/d0;->e(Lcom/google/android/gms/internal/vision/L0;I[BIILcom/google/android/gms/internal/vision/n0;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    return p1

    :pswitch_6
    move/from16 v5, p4

    move-object v6, v4

    move-object/from16 v4, p14

    if-ne v1, v3, :cond_47

    const-wide/32 v1, 0x20000000

    and-long v1, p9, v1

    const-wide/16 v7, 0x0

    cmp-long v1, v1, v7

    .line 83
    const-string v2, ""

    if-nez v1, :cond_25

    .line 84
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 85
    iget v3, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v3, :cond_24

    if-nez v3, :cond_20

    .line 86
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 87
    :cond_20
    new-instance v7, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, p2, v1, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 88
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_d
    add-int/2addr v1, v3

    :goto_e
    if-ge v1, v5, :cond_23

    .line 89
    invoke-static {p2, v1, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    .line 90
    iget v7, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v7, :cond_23

    .line 91
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 92
    iget v3, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v3, :cond_22

    if-nez v3, :cond_21

    .line 93
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 94
    :cond_21
    new-instance v7, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v7, p2, v1, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 95
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 96
    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_23
    return v1

    .line 97
    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 98
    :cond_25
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 99
    iget v3, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v3, :cond_2c

    if-nez v3, :cond_26

    .line 100
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_26
    add-int v7, v1, v3

    .line 101
    sget-object v8, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    invoke-virtual {v8, p2, v1, v7}, Lcom/google/android/gms/internal/vision/d0;->s([BII)Z

    move-result v8

    if-eqz v8, :cond_2b

    .line 102
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v8, p2, v1, v3, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 103
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_f
    move v1, v7

    :goto_10
    if-ge v1, v5, :cond_2a

    .line 104
    invoke-static {p2, v1, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    .line 105
    iget v7, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v7, :cond_2a

    .line 106
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 107
    iget v3, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ltz v3, :cond_29

    if-nez v3, :cond_27

    .line 108
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_27
    add-int v7, v1, v3

    .line 109
    sget-object v8, Lcom/google/android/gms/internal/vision/X0;->a:Lcom/google/android/gms/internal/vision/d0;

    invoke-virtual {v8, p2, v1, v7}, Lcom/google/android/gms/internal/vision/d0;->s([BII)Z

    move-result v8

    if-eqz v8, :cond_28

    .line 110
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/vision/i0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v8, p2, v1, v3, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 111
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 112
    :cond_28
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 113
    :cond_29
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_2a
    return v1

    .line 114
    :cond_2b
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->c()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 115
    :cond_2c
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->b()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :pswitch_7
    move-object v6, v4

    move-object/from16 v4, p14

    if-ne v1, v3, :cond_2f

    .line 116
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/vision/N;

    .line 117
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    .line 118
    iget v1, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_2e

    if-ne v0, v1, :cond_2d

    return v0

    .line 119
    :cond_2d
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 120
    :cond_2e
    invoke-static {p2, v0, v4}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 121
    throw v9

    :cond_2f
    if-eqz v1, :cond_30

    goto/16 :goto_14

    .line 122
    :cond_30
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/vision/N;

    .line 123
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 124
    throw v9

    :pswitch_8
    move/from16 v5, p4

    move-object v6, v4

    move-object/from16 v4, p14

    if-ne v1, v3, :cond_33

    .line 125
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/vision/g0;

    .line 126
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 127
    iget v2, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v2, v1

    :goto_11
    if-ge v1, v2, :cond_31

    .line 128
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_11

    :cond_31
    if-ne v1, v2, :cond_32

    return v1

    .line 129
    :cond_32
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_33
    if-ne v1, v2, :cond_47

    .line 130
    move-object v1, v6

    check-cast v1, Lcom/google/android/gms/internal/vision/g0;

    .line 131
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    add-int/lit8 v2, p3, 0x4

    :goto_12
    if-ge v2, v5, :cond_34

    .line 132
    invoke-static {p2, v2, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    .line 133
    iget v6, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    if-ne v0, v6, :cond_34

    .line 134
    invoke-static {v3, p2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    add-int/lit8 v2, v3, 0x4

    goto :goto_12

    :cond_34
    return v2

    :pswitch_9
    move-object v6, v4

    move-object/from16 v4, p14

    if-ne v1, v3, :cond_37

    .line 135
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/vision/u0;

    .line 136
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    .line 137
    iget v1, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_36

    if-ne v0, v1, :cond_35

    return v0

    .line 138
    :cond_35
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 139
    :cond_36
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    throw v9

    :cond_37
    if-eq v1, v8, :cond_38

    goto/16 :goto_14

    .line 140
    :cond_38
    move-object v4, v6

    check-cast v4, Lcom/google/android/gms/internal/vision/u0;

    .line 141
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    throw v9

    :pswitch_a
    move/from16 v5, p4

    move-object v6, v4

    move-object/from16 v4, p14

    if-ne v1, v3, :cond_3b

    .line 142
    move-object v0, v6

    check-cast v0, Lcom/google/android/gms/internal/vision/g0;

    .line 143
    invoke-static {p2, p3, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 144
    iget v2, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v2, v1

    :goto_13
    if-ge v1, v2, :cond_39

    .line 145
    invoke-static {p2, v1, v4}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    .line 146
    iget v3, v4, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/vision/g0;->g(I)V

    goto :goto_13

    :cond_39
    if-ne v1, v2, :cond_3a

    return v1

    .line 147
    :cond_3a
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    :cond_3b
    if-nez v1, :cond_47

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p6, v0

    move-object/from16 p11, v4

    move/from16 p9, v5

    move-object/from16 p10, v6

    .line 148
    invoke-static/range {p6 .. p11}, Lcom/google/android/gms/internal/vision/d0;->b(I[BIILcom/google/android/gms/internal/vision/n0;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result p1

    return p1

    :pswitch_b
    move-object/from16 v5, p14

    if-ne v1, v3, :cond_3e

    .line 149
    check-cast v4, Lcom/google/android/gms/internal/vision/u0;

    .line 150
    invoke-static {p2, p3, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    .line 151
    iget v1, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_3d

    if-ne v0, v1, :cond_3c

    return v0

    .line 152
    :cond_3c
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 153
    :cond_3d
    invoke-static {p2, v0, v5}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 154
    throw v9

    :cond_3e
    if-eqz v1, :cond_3f

    goto :goto_14

    .line 155
    :cond_3f
    check-cast v4, Lcom/google/android/gms/internal/vision/u0;

    .line 156
    invoke-static {p2, p3, v5}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    .line 157
    throw v9

    :pswitch_c
    move-object/from16 v5, p14

    if-ne v1, v3, :cond_42

    .line 158
    check-cast v4, Lcom/google/android/gms/internal/vision/a0;

    .line 159
    invoke-static {p2, p3, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    .line 160
    iget v1, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_41

    if-ne v0, v1, :cond_40

    return v0

    .line 161
    :cond_40
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 162
    :cond_41
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    throw v9

    :cond_42
    if-eq v1, v2, :cond_43

    goto :goto_14

    .line 164
    :cond_43
    check-cast v4, Lcom/google/android/gms/internal/vision/a0;

    .line 165
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    throw v9

    :pswitch_d
    move-object/from16 v5, p14

    if-ne v1, v3, :cond_46

    .line 167
    check-cast v4, Lcom/google/android/gms/internal/vision/T;

    .line 168
    invoke-static {p2, p3, v5}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v0

    .line 169
    iget v1, v5, Lcom/google/android/gms/internal/clearcut/j;->a:I

    add-int/2addr v1, v0

    if-lt v0, v1, :cond_45

    if-ne v0, v1, :cond_44

    return v0

    .line 170
    :cond_44
    invoke-static {}, Lcom/google/android/gms/internal/vision/m0;->a()Lcom/google/android/gms/internal/vision/m0;

    move-result-object p1

    throw p1

    .line 171
    :cond_45
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 172
    throw v9

    :cond_46
    if-eq v1, v8, :cond_48

    :cond_47
    :goto_14
    return p3

    .line 173
    :cond_48
    check-cast v4, Lcom/google/android/gms/internal/vision/T;

    .line 174
    invoke-static {p3, p2}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 175
    throw v9

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/clearcut/j;)I
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    move/from16 v4, p4

    move/from16 v15, p5

    move-object/from16 v13, p6

    .line 1
    sget-object v9, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    move/from16 v3, p3

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0xfffff

    const/4 v14, 0x0

    :goto_0
    const v16, 0xfffff

    .line 2
    :goto_1
    iget-object v10, v0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    if-ge v3, v4, :cond_1e

    add-int/lit8 v7, v3, 0x1

    .line 3
    aget-byte v3, v1, v3

    if-gez v3, :cond_0

    .line 4
    invoke-static {v3, v1, v7, v13}, Lcom/google/android/gms/internal/vision/d0;->d(I[BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    .line 5
    iget v3, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    :cond_0
    move/from16 v26, v7

    move v7, v3

    move/from16 v3, v26

    ushr-int/lit8 v12, v7, 0x3

    move/from16 v18, v7

    and-int/lit8 v7, v18, 0x7

    .line 6
    iget v11, v0, Lcom/google/android/gms/internal/vision/C0;->d:I

    iget v1, v0, Lcom/google/android/gms/internal/vision/C0;->c:I

    move/from16 p3, v3

    const/4 v3, 0x3

    if-le v12, v5, :cond_2

    .line 7
    div-int/2addr v6, v3

    if-lt v12, v1, :cond_1

    if-gt v12, v11, :cond_1

    .line 8
    invoke-virtual {v0, v12, v6}, Lcom/google/android/gms/internal/vision/C0;->t(II)I

    move-result v1

    goto :goto_2

    :cond_1
    const/4 v1, -0x1

    :goto_2
    const/4 v11, 0x0

    :goto_3
    const/4 v5, -0x1

    goto :goto_4

    :cond_2
    if-lt v12, v1, :cond_3

    if-gt v12, v11, :cond_3

    const/4 v11, 0x0

    .line 9
    invoke-virtual {v0, v12, v11}, Lcom/google/android/gms/internal/vision/C0;->t(II)I

    move-result v1

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    const/4 v1, -0x1

    goto :goto_3

    :goto_4
    if-ne v1, v5, :cond_4

    move/from16 v16, v8

    move-object/from16 v25, v9

    move-object/from16 v24, v10

    move/from16 v19, v11

    move v6, v12

    move-object v8, v0

    move-object v9, v2

    move/from16 v12, v19

    move/from16 v11, v18

    move/from16 v2, p3

    move/from16 v18, v5

    goto/16 :goto_18

    :cond_4
    add-int/lit8 v6, v1, 0x1

    .line 10
    aget v6, v10, v6

    const/high16 v17, 0xff00000

    and-int v17, v6, v17

    ushr-int/lit8 v5, v17, 0x14

    and-int v11, v6, v16

    int-to-long v3, v11

    const/16 v11, 0x11

    move-wide/from16 v21, v3

    if-gt v5, v11, :cond_12

    add-int/lit8 v4, v1, 0x2

    .line 11
    aget v4, v10, v4

    ushr-int/lit8 v11, v4, 0x14

    const/4 v3, 0x1

    shl-int v11, v3, v11

    and-int v4, v4, v16

    move-object/from16 v24, v10

    if-eq v4, v8, :cond_6

    move/from16 v10, v16

    move/from16 v16, v11

    if-eq v8, v10, :cond_5

    int-to-long v10, v8

    .line 12
    invoke-virtual {v9, v2, v10, v11, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v10, v4

    .line 13
    invoke-virtual {v9, v2, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v10, v4

    move v14, v8

    goto :goto_5

    :cond_6
    move/from16 v16, v11

    move v10, v8

    :goto_5
    const/4 v4, 0x5

    packed-switch v5, :pswitch_data_0

    move-object/from16 v8, p2

    move-object v7, v9

    move/from16 v11, v18

    const/16 v19, -0x1

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    :goto_6
    move-object v1, v2

    goto/16 :goto_12

    :pswitch_0
    const/4 v3, 0x3

    if-ne v7, v3, :cond_8

    shl-int/lit8 v3, v12, 0x3

    or-int/lit8 v7, v3, 0x4

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v3

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 p3, v12

    move-object v8, v13

    move/from16 v11, v18

    move-wide/from16 v12, v21

    const/16 v19, -0x1

    .line 15
    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/vision/d0;->f(Lcom/google/android/gms/internal/vision/L0;[BIIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v3

    move-object/from16 v26, v8

    move-object v8, v4

    move-object/from16 v4, v26

    and-int v5, v14, v16

    if-nez v5, :cond_7

    .line 16
    iget-object v5, v4, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v9, v2, v12, v13, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_7

    .line 17
    :cond_7
    invoke-virtual {v9, v2, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v4, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 18
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    move-result-object v5

    .line 19
    invoke-virtual {v9, v2, v12, v13, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_7
    or-int v14, v14, v16

    move/from16 v5, p3

    move v6, v1

    move-object v13, v4

    move-object v1, v8

    move v8, v10

    move v7, v11

    const v16, 0xfffff

    move/from16 v4, p4

    goto/16 :goto_1

    :cond_8
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v2

    move-object v7, v9

    :goto_8
    move v9, v5

    goto/16 :goto_12

    :pswitch_1
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move-object v4, v13

    move/from16 v11, v18

    move-wide/from16 v12, v21

    const/16 v19, -0x1

    if-nez v7, :cond_9

    .line 20
    invoke-static {v8, v5, v4}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    .line 21
    iget-wide v5, v4, Lcom/google/android/gms/internal/clearcut/j;->b:J

    ushr-long v20, v5, v3

    const-wide/16 v22, 0x1

    and-long v5, v5, v22

    neg-long v5, v5

    xor-long v5, v20, v5

    move-wide/from16 v26, v12

    move-object v13, v4

    move-wide/from16 v3, v26

    move v12, v1

    move-object v1, v9

    move/from16 v9, p4

    .line 22
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v14, v14, v16

    move/from16 v5, p3

    move v3, v7

    move v4, v9

    move v7, v11

    move v6, v12

    const v16, 0xfffff

    :goto_9
    move-object v9, v1

    move-object v1, v8

    move v8, v10

    goto/16 :goto_1

    :cond_9
    move v12, v1

    move-object v13, v4

    move-object v1, v9

    move/from16 v9, p4

    :cond_a
    move-object v7, v1

    move-object v1, v2

    goto :goto_8

    :pswitch_2
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    move/from16 v9, p4

    if-nez v7, :cond_a

    .line 23
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 24
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 25
    invoke-static {v6}, Lcom/google/android/gms/internal/vision/d0;->y(I)I

    move-result v6

    .line 26
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_a
    or-int v14, v14, v16

    :goto_b
    move v3, v5

    move v4, v9

    move v7, v11

    move v6, v12

    const v16, 0xfffff

    move/from16 v5, p3

    goto :goto_9

    :pswitch_3
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    move/from16 v9, p4

    if-nez v7, :cond_a

    .line 27
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 28
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    .line 29
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->y(I)Lcom/google/android/gms/internal/vision/j0;

    move-result-object v7

    if-eqz v7, :cond_c

    .line 30
    invoke-interface {v7, v6}, Lcom/google/android/gms/internal/vision/j0;->a(I)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_c

    .line 31
    :cond_b
    invoke-static {v2}, Lcom/google/android/gms/internal/vision/C0;->D(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/O0;

    move-result-object v3

    int-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v11, v4}, Lcom/google/android/gms/internal/vision/O0;->a(ILjava/lang/Object;)V

    goto :goto_b

    .line 32
    :cond_c
    :goto_c
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_a

    :pswitch_4
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/4 v6, 0x2

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    move/from16 v9, p4

    if-ne v7, v6, :cond_a

    .line 33
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->z([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 34
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_a

    :pswitch_5
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/4 v6, 0x2

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    move/from16 v9, p4

    if-ne v7, v6, :cond_a

    .line 35
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v6

    .line 36
    invoke-static {v6, v8, v5, v9, v13}, Lcom/google/android/gms/internal/vision/d0;->g(Lcom/google/android/gms/internal/vision/L0;[BIILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    and-int v6, v14, v16

    if-nez v6, :cond_d

    .line 37
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_a

    .line 38
    :cond_d
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    .line 39
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    move-result-object v6

    .line 40
    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_6
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    const/4 v9, 0x2

    if-ne v7, v9, :cond_a

    const/high16 v7, 0x20000000

    and-int/2addr v6, v7

    if-nez v6, :cond_e

    .line 41
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->w([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    goto :goto_d

    .line 42
    :cond_e
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->x([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 43
    :goto_d
    iget-object v6, v13, Lcom/google/android/gms/internal/clearcut/j;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_e
    or-int v14, v14, v16

    move/from16 v4, p4

    move-object v9, v1

    move v3, v5

    move-object v1, v8

    move v8, v10

    move v7, v11

    move v6, v12

    const v16, 0xfffff

    move/from16 v5, p3

    goto/16 :goto_1

    :pswitch_7
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    if-nez v7, :cond_a

    .line 44
    invoke-static {v8, v5, v13}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 45
    iget-wide v6, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    const-wide/16 v20, 0x0

    cmp-long v6, v6, v20

    if-eqz v6, :cond_f

    const/4 v9, 0x1

    goto :goto_f

    :cond_f
    const/4 v9, 0x0

    .line 46
    :goto_f
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    invoke-virtual {v6, v2, v3, v4, v9}, Lcom/google/android/gms/internal/vision/T0;->g(Ljava/lang/Object;JZ)V

    goto :goto_e

    :pswitch_8
    move-object/from16 v8, p2

    move/from16 v5, p3

    move v6, v4

    move/from16 p3, v12

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    if-ne v7, v6, :cond_a

    .line 47
    invoke-static {v5, v8}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v6

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v3, v5, 0x4

    :goto_10
    or-int v14, v14, v16

    move/from16 v5, p3

    move/from16 v4, p4

    move-object v9, v1

    :goto_11
    move-object v1, v8

    move v8, v10

    move v7, v11

    move v6, v12

    goto/16 :goto_0

    :pswitch_9
    move-object/from16 v8, p2

    move/from16 v5, p3

    move/from16 p3, v12

    move/from16 v11, v18

    const/16 v19, -0x1

    move v12, v1

    move-object v1, v9

    move v9, v3

    move-wide/from16 v3, v21

    if-ne v7, v9, :cond_10

    move v7, v5

    .line 48
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide v5

    move v9, v7

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v3, v9, 0x8

    goto :goto_10

    :cond_10
    move v9, v5

    :cond_11
    move-object v7, v1

    goto/16 :goto_6

    :pswitch_a
    move-object v3, v9

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    if-nez v7, :cond_11

    .line 49
    invoke-static {v8, v9, v13}, Lcom/google/android/gms/internal/vision/d0;->j([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v5

    .line 50
    iget v6, v13, Lcom/google/android/gms/internal/clearcut/j;->a:I

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_e

    :pswitch_b
    move-object v3, v9

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    if-nez v7, :cond_11

    .line 51
    invoke-static {v8, v9, v13}, Lcom/google/android/gms/internal/vision/d0;->t([BILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    .line 52
    iget-wide v5, v13, Lcom/google/android/gms/internal/clearcut/j;->b:J

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v14, v14, v16

    move/from16 v5, p3

    move/from16 v4, p4

    move-object v9, v1

    move v3, v7

    goto :goto_11

    :pswitch_c
    move-object v3, v9

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    move-object v1, v3

    move-object/from16 v8, p2

    move v6, v4

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    if-ne v7, v6, :cond_11

    .line 53
    invoke-static {v9, v8}, Lcom/google/android/gms/internal/vision/d0;->a(I[B)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    .line 54
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    invoke-virtual {v6, v2, v3, v4, v5}, Lcom/google/android/gms/internal/vision/T0;->e(Ljava/lang/Object;JF)V

    add-int/lit8 v3, v9, 0x4

    goto/16 :goto_10

    :pswitch_d
    move-object v4, v9

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    move-object v1, v4

    move-object/from16 v8, p2

    move v5, v3

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    if-ne v7, v5, :cond_11

    .line 55
    invoke-static {v9, v8}, Lcom/google/android/gms/internal/vision/d0;->u(I[B)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v5

    move-object v7, v1

    .line 56
    sget-object v1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/vision/T0;->d(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v3, v9, 0x8

    or-int v14, v14, v16

    move/from16 v5, p3

    move/from16 v4, p4

    move-object v9, v7

    goto/16 :goto_11

    :goto_12
    move/from16 v6, p3

    move-object v8, v0

    move-object/from16 v25, v7

    move v2, v9

    move/from16 v16, v10

    move/from16 v18, v19

    const/16 v19, 0x0

    move-object v9, v1

    goto/16 :goto_18

    :cond_12
    move-object/from16 v24, v10

    move/from16 v11, v18

    move-wide/from16 v3, v21

    const/16 v19, -0x1

    move-object v10, v9

    move/from16 v9, p3

    move/from16 p3, v12

    move v12, v1

    move-object v1, v2

    const/16 v2, 0x1b

    if-ne v5, v2, :cond_16

    const/4 v2, 0x2

    if-ne v7, v2, :cond_15

    .line 57
    invoke-virtual {v10, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/vision/n0;

    .line 58
    invoke-interface {v2}, Lcom/google/android/gms/internal/vision/n0;->zza()Z

    move-result v5

    if-nez v5, :cond_14

    .line 59
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_13

    const/16 v5, 0xa

    goto :goto_13

    :cond_13
    shl-int/lit8 v5, v5, 0x1

    .line 60
    :goto_13
    invoke-interface {v2, v5}, Lcom/google/android/gms/internal/vision/n0;->a(I)Lcom/google/android/gms/internal/vision/n0;

    move-result-object v2

    .line 61
    invoke-virtual {v10, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_14
    move-object v6, v2

    .line 62
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    move-result-object v1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move v4, v9

    move v2, v11

    move-object v7, v13

    .line 63
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/d0;->e(Lcom/google/android/gms/internal/vision/L0;I[BIILcom/google/android/gms/internal/vision/n0;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result v1

    move-object/from16 v2, p1

    move/from16 v5, p3

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v3, v1

    move-object v9, v10

    move v7, v11

    move v6, v12

    const v16, 0xfffff

    move-object/from16 v1, p2

    goto/16 :goto_1

    :cond_15
    move-object/from16 v2, p1

    move/from16 v6, p3

    move/from16 v16, v8

    move v3, v9

    move-object/from16 v25, v10

    move v5, v11

    move/from16 v17, v14

    move/from16 v18, v19

    const/16 v19, 0x0

    goto/16 :goto_17

    :cond_16
    const/16 v1, 0x31

    if-gt v5, v1, :cond_18

    move-wide/from16 v21, v3

    move v3, v9

    move-object v1, v10

    int-to-long v9, v6

    move v2, v11

    move v11, v5

    move v5, v2

    move-object/from16 v2, p2

    move/from16 v6, p3

    move/from16 v4, p4

    move-object/from16 v25, v1

    move/from16 v16, v8

    move v8, v12

    move/from16 v17, v14

    move/from16 v18, v19

    move-wide/from16 v12, v21

    const/16 v19, 0x0

    move-object/from16 v1, p1

    move-object/from16 v14, p6

    .line 64
    invoke-virtual/range {v0 .. v14}, Lcom/google/android/gms/internal/vision/C0;->j(Ljava/lang/Object;[BIIIIIIJIJLcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    move-object v2, v1

    move v11, v5

    move v5, v6

    move v12, v8

    if-ne v7, v3, :cond_17

    move-object v8, v0

    move-object v9, v2

    move v6, v5

    :goto_14
    move v2, v7

    :goto_15
    move/from16 v14, v17

    goto/16 :goto_18

    :cond_17
    move-object/from16 v1, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v3, v7

    :goto_16
    move v7, v11

    move v6, v12

    move/from16 v8, v16

    move/from16 v14, v17

    move-object/from16 v9, v25

    goto/16 :goto_0

    :cond_18
    move-object/from16 v2, p1

    move/from16 v16, v8

    move-object/from16 v25, v10

    move/from16 v17, v14

    move/from16 v18, v19

    const/16 v19, 0x0

    move v8, v6

    move/from16 v6, p3

    move/from16 v26, v9

    move v9, v5

    move v5, v11

    move-wide v10, v3

    move/from16 v3, v26

    const/16 v1, 0x32

    if-ne v9, v1, :cond_1a

    const/4 v1, 0x2

    if-eq v7, v1, :cond_19

    :goto_17
    move-object v8, v0

    move-object v9, v2

    move v2, v3

    move v11, v5

    goto :goto_15

    .line 65
    :cond_19
    invoke-virtual {v0, v12, v10, v11, v2}, Lcom/google/android/gms/internal/vision/C0;->o(IJLjava/lang/Object;)V

    const/4 v1, 0x0

    throw v1

    :cond_1a
    move/from16 v4, p4

    move-object/from16 v13, p6

    move-object v1, v2

    move-object/from16 v2, p2

    .line 66
    invoke-virtual/range {v0 .. v13}, Lcom/google/android/gms/internal/vision/C0;->i(Ljava/lang/Object;[BIIIIIIIJILcom/google/android/gms/internal/clearcut/j;)I

    move-result v7

    move-object v8, v0

    move-object v9, v1

    move v11, v5

    if-ne v7, v3, :cond_1d

    goto :goto_14

    :goto_18
    if-ne v11, v15, :cond_1c

    if-nez v15, :cond_1b

    goto :goto_1a

    :cond_1b
    move/from16 v4, p4

    move v3, v2

    move v7, v11

    :goto_19
    move/from16 v0, v16

    const v10, 0xfffff

    goto :goto_1b

    .line 67
    :cond_1c
    :goto_1a
    invoke-static {v9}, Lcom/google/android/gms/internal/vision/C0;->D(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/O0;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    move v0, v11

    .line 68
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/vision/d0;->c(I[BIILcom/google/android/gms/internal/vision/O0;Lcom/google/android/gms/internal/clearcut/j;)I

    move-result v2

    move-object/from16 v13, p6

    move v4, v3

    move v5, v6

    move-object v0, v8

    move v7, v11

    move v6, v12

    move/from16 v8, v16

    const v16, 0xfffff

    move v3, v2

    move-object v2, v9

    move-object/from16 v9, v25

    goto/16 :goto_1

    :cond_1d
    move-object/from16 v1, p2

    move/from16 v4, p4

    move-object/from16 v13, p6

    move v5, v6

    move v3, v7

    move-object v0, v8

    move-object v2, v9

    goto :goto_16

    :cond_1e
    move/from16 v16, v8

    move-object/from16 v25, v9

    move-object/from16 v24, v10

    move/from16 v17, v14

    move-object v8, v0

    move-object v9, v2

    goto :goto_19

    :goto_1b
    if-eq v0, v10, :cond_1f

    int-to-long v0, v0

    move-object/from16 v2, v25

    .line 69
    invoke-virtual {v2, v9, v0, v1, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    .line 70
    :cond_1f
    iget v0, v8, Lcom/google/android/gms/internal/vision/C0;->h:I

    :goto_1c
    iget v1, v8, Lcom/google/android/gms/internal/vision/C0;->i:I

    if-ge v0, v1, :cond_23

    .line 71
    iget-object v1, v8, Lcom/google/android/gms/internal/vision/C0;->g:[I

    aget v1, v1, v0

    .line 72
    aget v2, v24, v1

    .line 73
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    move-result v2

    and-int/2addr v2, v10

    int-to-long v5, v2

    .line 74
    invoke-static {v5, v6, v9}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_20

    goto :goto_1d

    .line 75
    :cond_20
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/vision/C0;->y(I)Lcom/google/android/gms/internal/vision/j0;

    move-result-object v5

    if-nez v5, :cond_21

    :goto_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_1c

    .line 76
    :cond_21
    iget-object v0, v8, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    check-cast v2, Lcom/google/android/gms/internal/vision/y0;

    .line 78
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_22

    .line 79
    new-instance v0, Ljava/lang/NoSuchMethodError;

    invoke-direct {v0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw v0

    .line 80
    :cond_22
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    .line 81
    :cond_23
    const-string v0, "Failed to parse the message."

    if-nez v15, :cond_25

    if-ne v3, v4, :cond_24

    goto :goto_1e

    .line 82
    :cond_24
    new-instance v1, Lcom/google/android/gms/internal/vision/m0;

    .line 83
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 84
    throw v1

    :cond_25
    if-gt v3, v4, :cond_26

    if-ne v7, v15, :cond_26

    :goto_1e
    return v3

    .line 85
    :cond_26
    new-instance v1, Lcom/google/android/gms/internal/vision/m0;

    .line 86
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 87
    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(I)Lcom/google/android/gms/internal/vision/L0;
    .locals 3

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v0, p1

    .line 8
    .line 9
    check-cast v1, Lcom/google/android/gms/internal/vision/L0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/vision/I0;->c:Lcom/google/android/gms/internal/vision/I0;

    .line 15
    .line 16
    add-int/lit8 v2, p1, 0x1

    .line 17
    .line 18
    aget-object v2, v0, v2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/vision/I0;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/L0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    aput-object v1, v0, p1

    .line 27
    .line 28
    return-object v1
.end method

.method public final o(IJLjava/lang/Object;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p4, p2, p3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-object v2, v1

    .line 17
    check-cast v2, Lcom/google/android/gms/internal/vision/y0;

    .line 18
    .line 19
    iget-boolean v2, v2, Lcom/google/android/gms/internal/vision/y0;->q:Z

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/vision/y0;->r:Lcom/google/android/gms/internal/vision/y0;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    new-instance v2, Lcom/google/android/gms/internal/vision/y0;

    .line 32
    .line 33
    invoke-direct {v2}, Lcom/google/android/gms/internal/vision/y0;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v3, Lcom/google/android/gms/internal/vision/y0;

    .line 38
    .line 39
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    iput-boolean v2, v3, Lcom/google/android/gms/internal/vision/y0;->q:Z

    .line 44
    .line 45
    move-object v2, v3

    .line 46
    :goto_0
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/vision/z0;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/y0;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p4, p2, p3, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    if-nez p1, :cond_2

    .line 53
    .line 54
    new-instance p1, Ljava/lang/NoSuchMethodError;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public final q(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, v1

    .line 9
    int-to-long v0, v0

    .line 10
    invoke-virtual {p0, p1, p3}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v1, p3}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-static {v2, p3}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {v0, v1, p2, p3}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    if-eqz p3, :cond_2

    .line 41
    .line 42
    invoke-static {v0, v1, p2, p3}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->v(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final r(IILjava/lang/Object;)Z
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 4
    .line 5
    aget p2, v0, p2

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p2, v0

    .line 11
    int-to-long v0, p2

    .line 12
    sget-object p2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 13
    .line 14
    invoke-virtual {p2, v0, v1, p3}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-ne p2, p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final s(ILjava/lang/Object;)Z
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    and-int v0, p1, v1

    .line 26
    .line 27
    int-to-long v0, v0

    .line 28
    const/high16 v2, 0xff00000

    .line 29
    .line 30
    and-int/2addr p1, v2

    .line 31
    ushr-int/lit8 p1, p1, 0x14

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    packed-switch p1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :pswitch_0
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :pswitch_1
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 55
    .line 56
    .line 57
    move-result-wide p1

    .line 58
    cmp-long p1, p1, v2

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 75
    .line 76
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    cmp-long p1, p1, v2

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :pswitch_4
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 87
    .line 88
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :pswitch_5
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 97
    .line 98
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :pswitch_6
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 107
    .line 108
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_3

    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/vision/P;->s:Lcom/google/android/gms/internal/vision/P;

    .line 117
    .line 118
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/vision/P;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    goto/16 :goto_0

    .line 129
    .line 130
    :pswitch_8
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-eqz p1, :cond_3

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :pswitch_9
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    instance-of p2, p1, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz p2, :cond_0

    .line 145
    .line 146
    check-cast p1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_3

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_0
    instance-of p2, p1, Lcom/google/android/gms/internal/vision/P;

    .line 157
    .line 158
    if-eqz p2, :cond_1

    .line 159
    .line 160
    sget-object p2, Lcom/google/android/gms/internal/vision/P;->s:Lcom/google/android/gms/internal/vision/P;

    .line 161
    .line 162
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/vision/P;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_3

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :pswitch_a
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 176
    .line 177
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    return p1

    .line 182
    :pswitch_b
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 183
    .line 184
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_3

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :pswitch_c
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 192
    .line 193
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    cmp-long p1, p1, v2

    .line 198
    .line 199
    if-eqz p1, :cond_3

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :pswitch_d
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 203
    .line 204
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_3

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :pswitch_e
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 212
    .line 213
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 214
    .line 215
    .line 216
    move-result-wide p1

    .line 217
    cmp-long p1, p1, v2

    .line 218
    .line 219
    if-eqz p1, :cond_3

    .line 220
    .line 221
    goto :goto_0

    .line 222
    :pswitch_f
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 223
    .line 224
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->l(JLjava/lang/Object;)J

    .line 225
    .line 226
    .line 227
    move-result-wide p1

    .line 228
    cmp-long p1, p1, v2

    .line 229
    .line 230
    if-eqz p1, :cond_3

    .line 231
    .line 232
    goto :goto_0

    .line 233
    :pswitch_10
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 234
    .line 235
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    const/4 p2, 0x0

    .line 240
    cmpl-float p1, p1, p2

    .line 241
    .line 242
    if-eqz p1, :cond_3

    .line 243
    .line 244
    goto :goto_0

    .line 245
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 246
    .line 247
    invoke-virtual {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 248
    .line 249
    .line 250
    move-result-wide p1

    .line 251
    const-wide/16 v0, 0x0

    .line 252
    .line 253
    cmpl-double p1, p1, v0

    .line 254
    .line 255
    if-eqz p1, :cond_3

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    .line 259
    .line 260
    shl-int p1, v5, p1

    .line 261
    .line 262
    sget-object v0, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 263
    .line 264
    invoke-virtual {v0, v2, v3, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    and-int/2addr p1, p2

    .line 269
    if-eqz p1, :cond_3

    .line 270
    .line 271
    :goto_0
    return v5

    .line 272
    :cond_3
    const/4 p1, 0x0

    .line 273
    return p1

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
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

.method public final t(II)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    div-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    :goto_0
    if-gt p2, v1, :cond_2

    .line 9
    .line 10
    add-int v2, v1, p2

    .line 11
    .line 12
    ushr-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    mul-int/lit8 v3, v2, 0x3

    .line 15
    .line 16
    aget v4, v0, v3

    .line 17
    .line 18
    if-ne p1, v4, :cond_0

    .line 19
    .line 20
    return v3

    .line 21
    :cond_0
    if-ge p1, v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v2, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 p1, -0x1

    .line 30
    return p1
.end method

.method public final u(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object p1, v0, p1

    .line 8
    .line 9
    return-object p1
.end method

.method public final v(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    const v0, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v0, p1

    .line 11
    int-to-long v0, v0

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long v2, v0, v2

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    shl-int p1, v2, p1

    .line 24
    .line 25
    sget-object v2, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 26
    .line 27
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/internal/vision/T0;->k(JLjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    or-int/2addr p1, v2

    .line 32
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final w(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 6
    .line 7
    aget v2, v1, p1

    .line 8
    .line 9
    const v3, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v3

    .line 13
    int-to-long v4, v0

    .line 14
    invoke-virtual {p0, v2, p1, p3}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0, v2, p1, p2}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {v4, v5, p2}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    invoke-static {v4, v5, p3}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-static {v0, p3}, Lcom/google/android/gms/internal/vision/i0;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/e0;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    invoke-static {v4, v5, p2, p3}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x2

    .line 49
    .line 50
    aget p1, v1, p1

    .line 51
    .line 52
    and-int/2addr p1, v3

    .line 53
    int-to-long v0, p1

    .line 54
    invoke-static {v2, v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    if-eqz p3, :cond_3

    .line 59
    .line 60
    invoke-static {v4, v5, p2, p3}, Lcom/google/android/gms/internal/vision/U0;->d(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 p1, p1, 0x2

    .line 64
    .line 65
    aget p1, v1, p1

    .line 66
    .line 67
    and-int/2addr p1, v3

    .line 68
    int-to-long v0, p1

    .line 69
    invoke-static {v2, v0, v1, p2}, Lcom/google/android/gms/internal/vision/U0;->c(IJLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    return-void
.end method

.method public final x(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/gms/internal/vision/C0;->a:[I

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    sget-object v5, Lcom/google/android/gms/internal/vision/C0;->o:Lsun/misc/Unsafe;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const v9, 0xfffff

    .line 14
    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    :goto_0
    if-ge v8, v4, :cond_6

    .line 18
    .line 19
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/vision/C0;->A(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    aget v12, v3, v8

    .line 24
    .line 25
    const/high16 v13, 0xff00000

    .line 26
    .line 27
    and-int/2addr v13, v11

    .line 28
    ushr-int/lit8 v13, v13, 0x14

    .line 29
    .line 30
    const/16 v14, 0x11

    .line 31
    .line 32
    const/4 v15, 0x1

    .line 33
    if-gt v13, v14, :cond_1

    .line 34
    .line 35
    add-int/lit8 v14, v8, 0x2

    .line 36
    .line 37
    aget v14, v3, v14

    .line 38
    .line 39
    const v16, 0xfffff

    .line 40
    .line 41
    .line 42
    and-int v6, v14, v16

    .line 43
    .line 44
    if-eq v6, v9, :cond_0

    .line 45
    .line 46
    int-to-long v9, v6

    .line 47
    invoke-virtual {v5, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    move v9, v6

    .line 52
    :cond_0
    ushr-int/lit8 v6, v14, 0x14

    .line 53
    .line 54
    shl-int v6, v15, v6

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const v16, 0xfffff

    .line 58
    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    :goto_1
    and-int v11, v11, v16

    .line 62
    .line 63
    move/from16 v17, v8

    .line 64
    .line 65
    int-to-long v7, v11

    .line 66
    const/16 v18, 0x3f

    .line 67
    .line 68
    const/4 v11, 0x5

    .line 69
    packed-switch v13, :pswitch_data_0

    .line 70
    .line 71
    .line 72
    move/from16 v13, v17

    .line 73
    .line 74
    :cond_2
    :goto_2
    const/4 v14, 0x0

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :pswitch_0
    move/from16 v13, v17

    .line 78
    .line 79
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_2

    .line 84
    .line 85
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v2, v12, v6, v7}, Lcom/google/android/gms/internal/vision/w0;->c(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_1
    move/from16 v13, v17

    .line 98
    .line 99
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_2

    .line 104
    .line 105
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 112
    .line 113
    shl-long v19, v6, v15

    .line 114
    .line 115
    shr-long v6, v6, v18

    .line 116
    .line 117
    xor-long v6, v19, v6

    .line 118
    .line 119
    const/4 v14, 0x0

    .line 120
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :pswitch_2
    move/from16 v13, v17

    .line 128
    .line 129
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_2

    .line 134
    .line 135
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 142
    .line 143
    shl-int/lit8 v8, v6, 0x1

    .line 144
    .line 145
    shr-int/lit8 v6, v6, 0x1f

    .line 146
    .line 147
    xor-int/2addr v6, v8

    .line 148
    const/4 v14, 0x0

    .line 149
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_3
    move/from16 v13, v17

    .line 157
    .line 158
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_2

    .line 163
    .line 164
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 165
    .line 166
    .line 167
    move-result-wide v6

    .line 168
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 171
    .line 172
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :pswitch_4
    move/from16 v13, v17

    .line 180
    .line 181
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_2

    .line 186
    .line 187
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 194
    .line 195
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :pswitch_5
    move/from16 v13, v17

    .line 203
    .line 204
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_2

    .line 209
    .line 210
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_3

    .line 226
    .line 227
    :pswitch_6
    move/from16 v13, v17

    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_2

    .line 235
    .line 236
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 243
    .line 244
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_2

    .line 251
    .line 252
    :pswitch_7
    move/from16 v13, v17

    .line 253
    .line 254
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-eqz v6, :cond_2

    .line 259
    .line 260
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    check-cast v6, Lcom/google/android/gms/internal/vision/P;

    .line 265
    .line 266
    invoke-virtual {v2, v12, v6}, Lcom/google/android/gms/internal/vision/w0;->a(ILcom/google/android/gms/internal/vision/P;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :pswitch_8
    move/from16 v13, v17

    .line 272
    .line 273
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    if-eqz v6, :cond_2

    .line 278
    .line 279
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-virtual {v2, v12, v6, v7}, Lcom/google/android/gms/internal/vision/w0;->b(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :pswitch_9
    move/from16 v13, v17

    .line 293
    .line 294
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-eqz v6, :cond_2

    .line 299
    .line 300
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    invoke-static {v12, v6, v2}, Lcom/google/android/gms/internal/vision/C0;->p(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_2

    .line 308
    .line 309
    :pswitch_a
    move/from16 v13, v17

    .line 310
    .line 311
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-eqz v6, :cond_2

    .line 316
    .line 317
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    check-cast v6, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 333
    .line 334
    .line 335
    int-to-byte v6, v6

    .line 336
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->B(B)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_2

    .line 340
    .line 341
    :pswitch_b
    move/from16 v13, v17

    .line 342
    .line 343
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    if-eqz v6, :cond_2

    .line 348
    .line 349
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 356
    .line 357
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_2

    .line 364
    .line 365
    :pswitch_c
    move/from16 v13, v17

    .line 366
    .line 367
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_2

    .line 372
    .line 373
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 380
    .line 381
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :pswitch_d
    move/from16 v13, v17

    .line 390
    .line 391
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-eqz v6, :cond_2

    .line 396
    .line 397
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->B(JLjava/lang/Object;)I

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_3

    .line 413
    .line 414
    :pswitch_e
    move/from16 v13, v17

    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v6

    .line 421
    if-eqz v6, :cond_5

    .line 422
    .line 423
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 424
    .line 425
    .line 426
    move-result-wide v6

    .line 427
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 430
    .line 431
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_3

    .line 438
    .line 439
    :pswitch_f
    move/from16 v13, v17

    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_2

    .line 447
    .line 448
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/C0;->C(JLjava/lang/Object;)J

    .line 449
    .line 450
    .line 451
    move-result-wide v6

    .line 452
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 455
    .line 456
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_2

    .line 463
    .line 464
    :pswitch_10
    move/from16 v13, v17

    .line 465
    .line 466
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    if-eqz v6, :cond_2

    .line 471
    .line 472
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    check-cast v6, Ljava/lang/Float;

    .line 477
    .line 478
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 485
    .line 486
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 497
    .line 498
    .line 499
    goto/16 :goto_2

    .line 500
    .line 501
    :pswitch_11
    move/from16 v13, v17

    .line 502
    .line 503
    invoke-virtual {v0, v12, v13, v1}, Lcom/google/android/gms/internal/vision/C0;->r(IILjava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    if-eqz v6, :cond_2

    .line 508
    .line 509
    invoke-static {v7, v8, v1}, Lcom/google/android/gms/internal/vision/U0;->l(JLjava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    check-cast v6, Ljava/lang/Double;

    .line 514
    .line 515
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 522
    .line 523
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 527
    .line 528
    .line 529
    move-result-wide v6

    .line 530
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 534
    .line 535
    .line 536
    goto/16 :goto_2

    .line 537
    .line 538
    :pswitch_12
    move/from16 v13, v17

    .line 539
    .line 540
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    if-nez v6, :cond_3

    .line 545
    .line 546
    goto/16 :goto_2

    .line 547
    .line 548
    :cond_3
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->u(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    iget-object v2, v0, Lcom/google/android/gms/internal/vision/C0;->m:Lcom/google/android/gms/internal/vision/z0;

    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    if-nez v1, :cond_4

    .line 558
    .line 559
    new-instance v1, Ljava/lang/NoSuchMethodError;

    .line 560
    .line 561
    invoke-direct {v1}, Ljava/lang/NoSuchMethodError;-><init>()V

    .line 562
    .line 563
    .line 564
    throw v1

    .line 565
    :cond_4
    new-instance v1, Ljava/lang/ClassCastException;

    .line 566
    .line 567
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 568
    .line 569
    .line 570
    throw v1

    .line 571
    :pswitch_13
    move/from16 v13, v17

    .line 572
    .line 573
    aget v6, v3, v13

    .line 574
    .line 575
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    check-cast v7, Ljava/util/List;

    .line 580
    .line 581
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 582
    .line 583
    .line 584
    move-result-object v8

    .line 585
    invoke-static {v6, v7, v2, v8}, Lcom/google/android/gms/internal/vision/M0;->m(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Lcom/google/android/gms/internal/vision/L0;)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_2

    .line 589
    .line 590
    :pswitch_14
    move/from16 v13, v17

    .line 591
    .line 592
    aget v6, v3, v13

    .line 593
    .line 594
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    check-cast v7, Ljava/util/List;

    .line 599
    .line 600
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->u(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_2

    .line 604
    .line 605
    :pswitch_15
    move/from16 v13, v17

    .line 606
    .line 607
    aget v6, v3, v13

    .line 608
    .line 609
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v7

    .line 613
    check-cast v7, Ljava/util/List;

    .line 614
    .line 615
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->F(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_2

    .line 619
    .line 620
    :pswitch_16
    move/from16 v13, v17

    .line 621
    .line 622
    aget v6, v3, v13

    .line 623
    .line 624
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    check-cast v7, Ljava/util/List;

    .line 629
    .line 630
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->y(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_2

    .line 634
    .line 635
    :pswitch_17
    move/from16 v13, v17

    .line 636
    .line 637
    aget v6, v3, v13

    .line 638
    .line 639
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    check-cast v7, Ljava/util/List;

    .line 644
    .line 645
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->H(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 646
    .line 647
    .line 648
    goto/16 :goto_2

    .line 649
    .line 650
    :pswitch_18
    move/from16 v13, v17

    .line 651
    .line 652
    aget v6, v3, v13

    .line 653
    .line 654
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    check-cast v7, Ljava/util/List;

    .line 659
    .line 660
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->I(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_2

    .line 664
    .line 665
    :pswitch_19
    move/from16 v13, v17

    .line 666
    .line 667
    aget v6, v3, v13

    .line 668
    .line 669
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    check-cast v7, Ljava/util/List;

    .line 674
    .line 675
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->E(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 676
    .line 677
    .line 678
    goto/16 :goto_2

    .line 679
    .line 680
    :pswitch_1a
    move/from16 v13, v17

    .line 681
    .line 682
    aget v6, v3, v13

    .line 683
    .line 684
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v7

    .line 688
    check-cast v7, Ljava/util/List;

    .line 689
    .line 690
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->J(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 691
    .line 692
    .line 693
    goto/16 :goto_2

    .line 694
    .line 695
    :pswitch_1b
    move/from16 v13, v17

    .line 696
    .line 697
    aget v6, v3, v13

    .line 698
    .line 699
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    check-cast v7, Ljava/util/List;

    .line 704
    .line 705
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->G(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_2

    .line 709
    .line 710
    :pswitch_1c
    move/from16 v13, v17

    .line 711
    .line 712
    aget v6, v3, v13

    .line 713
    .line 714
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    check-cast v7, Ljava/util/List;

    .line 719
    .line 720
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->w(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_2

    .line 724
    .line 725
    :pswitch_1d
    move/from16 v13, v17

    .line 726
    .line 727
    aget v6, v3, v13

    .line 728
    .line 729
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    check-cast v7, Ljava/util/List;

    .line 734
    .line 735
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->B(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 736
    .line 737
    .line 738
    goto/16 :goto_2

    .line 739
    .line 740
    :pswitch_1e
    move/from16 v13, v17

    .line 741
    .line 742
    aget v6, v3, v13

    .line 743
    .line 744
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    check-cast v7, Ljava/util/List;

    .line 749
    .line 750
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->s(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 751
    .line 752
    .line 753
    goto/16 :goto_2

    .line 754
    .line 755
    :pswitch_1f
    move/from16 v13, v17

    .line 756
    .line 757
    aget v6, v3, v13

    .line 758
    .line 759
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v7

    .line 763
    check-cast v7, Ljava/util/List;

    .line 764
    .line 765
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->q(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_2

    .line 769
    .line 770
    :pswitch_20
    move/from16 v13, v17

    .line 771
    .line 772
    aget v6, v3, v13

    .line 773
    .line 774
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v7

    .line 778
    check-cast v7, Ljava/util/List;

    .line 779
    .line 780
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->n(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 781
    .line 782
    .line 783
    goto/16 :goto_2

    .line 784
    .line 785
    :pswitch_21
    move/from16 v13, v17

    .line 786
    .line 787
    aget v6, v3, v13

    .line 788
    .line 789
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v7

    .line 793
    check-cast v7, Ljava/util/List;

    .line 794
    .line 795
    invoke-static {v6, v7, v2, v15}, Lcom/google/android/gms/internal/vision/M0;->g(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_2

    .line 799
    .line 800
    :pswitch_22
    move/from16 v13, v17

    .line 801
    .line 802
    aget v6, v3, v13

    .line 803
    .line 804
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v7

    .line 808
    check-cast v7, Ljava/util/List;

    .line 809
    .line 810
    const/4 v14, 0x0

    .line 811
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->u(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 812
    .line 813
    .line 814
    goto/16 :goto_3

    .line 815
    .line 816
    :pswitch_23
    move/from16 v13, v17

    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    aget v6, v3, v13

    .line 820
    .line 821
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v7

    .line 825
    check-cast v7, Ljava/util/List;

    .line 826
    .line 827
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->F(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_3

    .line 831
    .line 832
    :pswitch_24
    move/from16 v13, v17

    .line 833
    .line 834
    const/4 v14, 0x0

    .line 835
    aget v6, v3, v13

    .line 836
    .line 837
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    check-cast v7, Ljava/util/List;

    .line 842
    .line 843
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->y(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 844
    .line 845
    .line 846
    goto/16 :goto_3

    .line 847
    .line 848
    :pswitch_25
    move/from16 v13, v17

    .line 849
    .line 850
    const/4 v14, 0x0

    .line 851
    aget v6, v3, v13

    .line 852
    .line 853
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    check-cast v7, Ljava/util/List;

    .line 858
    .line 859
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->H(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 860
    .line 861
    .line 862
    goto/16 :goto_3

    .line 863
    .line 864
    :pswitch_26
    move/from16 v13, v17

    .line 865
    .line 866
    const/4 v14, 0x0

    .line 867
    aget v6, v3, v13

    .line 868
    .line 869
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v7

    .line 873
    check-cast v7, Ljava/util/List;

    .line 874
    .line 875
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->I(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 876
    .line 877
    .line 878
    goto/16 :goto_3

    .line 879
    .line 880
    :pswitch_27
    move/from16 v13, v17

    .line 881
    .line 882
    const/4 v14, 0x0

    .line 883
    aget v6, v3, v13

    .line 884
    .line 885
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v7

    .line 889
    check-cast v7, Ljava/util/List;

    .line 890
    .line 891
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->E(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 892
    .line 893
    .line 894
    goto/16 :goto_2

    .line 895
    .line 896
    :pswitch_28
    move/from16 v13, v17

    .line 897
    .line 898
    aget v6, v3, v13

    .line 899
    .line 900
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v7

    .line 904
    check-cast v7, Ljava/util/List;

    .line 905
    .line 906
    invoke-static {v6, v7, v2}, Lcom/google/android/gms/internal/vision/M0;->l(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;)V

    .line 907
    .line 908
    .line 909
    goto/16 :goto_2

    .line 910
    .line 911
    :pswitch_29
    move/from16 v13, v17

    .line 912
    .line 913
    aget v6, v3, v13

    .line 914
    .line 915
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v7

    .line 919
    check-cast v7, Ljava/util/List;

    .line 920
    .line 921
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    invoke-static {v6, v7, v2, v8}, Lcom/google/android/gms/internal/vision/M0;->f(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Lcom/google/android/gms/internal/vision/L0;)V

    .line 926
    .line 927
    .line 928
    goto/16 :goto_2

    .line 929
    .line 930
    :pswitch_2a
    move/from16 v13, v17

    .line 931
    .line 932
    aget v6, v3, v13

    .line 933
    .line 934
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v7

    .line 938
    check-cast v7, Ljava/util/List;

    .line 939
    .line 940
    invoke-static {v6, v7, v2}, Lcom/google/android/gms/internal/vision/M0;->e(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_2

    .line 944
    .line 945
    :pswitch_2b
    move/from16 v13, v17

    .line 946
    .line 947
    aget v6, v3, v13

    .line 948
    .line 949
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v7

    .line 953
    check-cast v7, Ljava/util/List;

    .line 954
    .line 955
    const/4 v14, 0x0

    .line 956
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->J(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_3

    .line 960
    .line 961
    :pswitch_2c
    move/from16 v13, v17

    .line 962
    .line 963
    const/4 v14, 0x0

    .line 964
    aget v6, v3, v13

    .line 965
    .line 966
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v7

    .line 970
    check-cast v7, Ljava/util/List;

    .line 971
    .line 972
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->G(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 973
    .line 974
    .line 975
    goto/16 :goto_3

    .line 976
    .line 977
    :pswitch_2d
    move/from16 v13, v17

    .line 978
    .line 979
    const/4 v14, 0x0

    .line 980
    aget v6, v3, v13

    .line 981
    .line 982
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v7

    .line 986
    check-cast v7, Ljava/util/List;

    .line 987
    .line 988
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->w(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 989
    .line 990
    .line 991
    goto/16 :goto_3

    .line 992
    .line 993
    :pswitch_2e
    move/from16 v13, v17

    .line 994
    .line 995
    const/4 v14, 0x0

    .line 996
    aget v6, v3, v13

    .line 997
    .line 998
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v7

    .line 1002
    check-cast v7, Ljava/util/List;

    .line 1003
    .line 1004
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->B(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_3

    .line 1008
    .line 1009
    :pswitch_2f
    move/from16 v13, v17

    .line 1010
    .line 1011
    const/4 v14, 0x0

    .line 1012
    aget v6, v3, v13

    .line 1013
    .line 1014
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v7

    .line 1018
    check-cast v7, Ljava/util/List;

    .line 1019
    .line 1020
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->s(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 1021
    .line 1022
    .line 1023
    goto/16 :goto_3

    .line 1024
    .line 1025
    :pswitch_30
    move/from16 v13, v17

    .line 1026
    .line 1027
    const/4 v14, 0x0

    .line 1028
    aget v6, v3, v13

    .line 1029
    .line 1030
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v7

    .line 1034
    check-cast v7, Ljava/util/List;

    .line 1035
    .line 1036
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->q(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 1037
    .line 1038
    .line 1039
    goto/16 :goto_3

    .line 1040
    .line 1041
    :pswitch_31
    move/from16 v13, v17

    .line 1042
    .line 1043
    const/4 v14, 0x0

    .line 1044
    aget v6, v3, v13

    .line 1045
    .line 1046
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v7

    .line 1050
    check-cast v7, Ljava/util/List;

    .line 1051
    .line 1052
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->n(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 1053
    .line 1054
    .line 1055
    goto/16 :goto_3

    .line 1056
    .line 1057
    :pswitch_32
    move/from16 v13, v17

    .line 1058
    .line 1059
    const/4 v14, 0x0

    .line 1060
    aget v6, v3, v13

    .line 1061
    .line 1062
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v7

    .line 1066
    check-cast v7, Ljava/util/List;

    .line 1067
    .line 1068
    invoke-static {v6, v7, v2, v14}, Lcom/google/android/gms/internal/vision/M0;->g(ILjava/util/List;Lcom/google/android/gms/internal/vision/w0;Z)V

    .line 1069
    .line 1070
    .line 1071
    goto/16 :goto_2

    .line 1072
    .line 1073
    :pswitch_33
    move/from16 v13, v17

    .line 1074
    .line 1075
    and-int/2addr v6, v10

    .line 1076
    if-eqz v6, :cond_2

    .line 1077
    .line 1078
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v6

    .line 1082
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v7

    .line 1086
    invoke-virtual {v2, v12, v6, v7}, Lcom/google/android/gms/internal/vision/w0;->c(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_2

    .line 1090
    .line 1091
    :pswitch_34
    move/from16 v13, v17

    .line 1092
    .line 1093
    and-int/2addr v6, v10

    .line 1094
    if-eqz v6, :cond_2

    .line 1095
    .line 1096
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v6

    .line 1100
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1103
    .line 1104
    shl-long v19, v6, v15

    .line 1105
    .line 1106
    shr-long v6, v6, v18

    .line 1107
    .line 1108
    xor-long v6, v19, v6

    .line 1109
    .line 1110
    const/4 v14, 0x0

    .line 1111
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 1115
    .line 1116
    .line 1117
    goto/16 :goto_2

    .line 1118
    .line 1119
    :pswitch_35
    move/from16 v13, v17

    .line 1120
    .line 1121
    and-int/2addr v6, v10

    .line 1122
    if-eqz v6, :cond_2

    .line 1123
    .line 1124
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1125
    .line 1126
    .line 1127
    move-result v6

    .line 1128
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1131
    .line 1132
    shl-int/lit8 v8, v6, 0x1

    .line 1133
    .line 1134
    shr-int/lit8 v6, v6, 0x1f

    .line 1135
    .line 1136
    xor-int/2addr v6, v8

    .line 1137
    const/4 v14, 0x0

    .line 1138
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 1142
    .line 1143
    .line 1144
    goto/16 :goto_2

    .line 1145
    .line 1146
    :pswitch_36
    move/from16 v13, v17

    .line 1147
    .line 1148
    and-int/2addr v6, v10

    .line 1149
    if-eqz v6, :cond_2

    .line 1150
    .line 1151
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1152
    .line 1153
    .line 1154
    move-result-wide v6

    .line 1155
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1158
    .line 1159
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 1163
    .line 1164
    .line 1165
    goto/16 :goto_2

    .line 1166
    .line 1167
    :pswitch_37
    move/from16 v13, v17

    .line 1168
    .line 1169
    and-int/2addr v6, v10

    .line 1170
    if-eqz v6, :cond_2

    .line 1171
    .line 1172
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1173
    .line 1174
    .line 1175
    move-result v6

    .line 1176
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1179
    .line 1180
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1184
    .line 1185
    .line 1186
    goto/16 :goto_2

    .line 1187
    .line 1188
    :pswitch_38
    move/from16 v13, v17

    .line 1189
    .line 1190
    and-int/2addr v6, v10

    .line 1191
    if-eqz v6, :cond_2

    .line 1192
    .line 1193
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1194
    .line 1195
    .line 1196
    move-result v6

    .line 1197
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1200
    .line 1201
    const/4 v14, 0x0

    .line 1202
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 1206
    .line 1207
    .line 1208
    goto/16 :goto_3

    .line 1209
    .line 1210
    :pswitch_39
    move/from16 v13, v17

    .line 1211
    .line 1212
    const/4 v14, 0x0

    .line 1213
    and-int/2addr v6, v10

    .line 1214
    if-eqz v6, :cond_2

    .line 1215
    .line 1216
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1223
    .line 1224
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->H(I)V

    .line 1228
    .line 1229
    .line 1230
    goto/16 :goto_2

    .line 1231
    .line 1232
    :pswitch_3a
    move/from16 v13, v17

    .line 1233
    .line 1234
    and-int/2addr v6, v10

    .line 1235
    if-eqz v6, :cond_2

    .line 1236
    .line 1237
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v6

    .line 1241
    check-cast v6, Lcom/google/android/gms/internal/vision/P;

    .line 1242
    .line 1243
    invoke-virtual {v2, v12, v6}, Lcom/google/android/gms/internal/vision/w0;->a(ILcom/google/android/gms/internal/vision/P;)V

    .line 1244
    .line 1245
    .line 1246
    goto/16 :goto_2

    .line 1247
    .line 1248
    :pswitch_3b
    move/from16 v13, v17

    .line 1249
    .line 1250
    and-int/2addr v6, v10

    .line 1251
    if-eqz v6, :cond_2

    .line 1252
    .line 1253
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v6

    .line 1257
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/vision/C0;->m(I)Lcom/google/android/gms/internal/vision/L0;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v7

    .line 1261
    invoke-virtual {v2, v12, v6, v7}, Lcom/google/android/gms/internal/vision/w0;->b(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/L0;)V

    .line 1262
    .line 1263
    .line 1264
    goto/16 :goto_2

    .line 1265
    .line 1266
    :pswitch_3c
    move/from16 v13, v17

    .line 1267
    .line 1268
    and-int/2addr v6, v10

    .line 1269
    if-eqz v6, :cond_2

    .line 1270
    .line 1271
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v6

    .line 1275
    invoke-static {v12, v6, v2}, Lcom/google/android/gms/internal/vision/C0;->p(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/w0;)V

    .line 1276
    .line 1277
    .line 1278
    goto/16 :goto_2

    .line 1279
    .line 1280
    :pswitch_3d
    move/from16 v13, v17

    .line 1281
    .line 1282
    and-int/2addr v6, v10

    .line 1283
    if-eqz v6, :cond_2

    .line 1284
    .line 1285
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1286
    .line 1287
    invoke-virtual {v6, v7, v8, v1}, Lcom/google/android/gms/internal/vision/T0;->h(JLjava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    move-result v6

    .line 1291
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1292
    .line 1293
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1294
    .line 1295
    const/4 v14, 0x0

    .line 1296
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1297
    .line 1298
    .line 1299
    int-to-byte v6, v6

    .line 1300
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->B(B)V

    .line 1301
    .line 1302
    .line 1303
    goto/16 :goto_2

    .line 1304
    .line 1305
    :pswitch_3e
    move/from16 v13, v17

    .line 1306
    .line 1307
    and-int/2addr v6, v10

    .line 1308
    if-eqz v6, :cond_2

    .line 1309
    .line 1310
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1311
    .line 1312
    .line 1313
    move-result v6

    .line 1314
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1317
    .line 1318
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1322
    .line 1323
    .line 1324
    goto/16 :goto_2

    .line 1325
    .line 1326
    :pswitch_3f
    move/from16 v13, v17

    .line 1327
    .line 1328
    and-int/2addr v6, v10

    .line 1329
    if-eqz v6, :cond_2

    .line 1330
    .line 1331
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1332
    .line 1333
    .line 1334
    move-result-wide v6

    .line 1335
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1336
    .line 1337
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1338
    .line 1339
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 1343
    .line 1344
    .line 1345
    goto/16 :goto_2

    .line 1346
    .line 1347
    :pswitch_40
    move/from16 v13, v17

    .line 1348
    .line 1349
    and-int/2addr v6, v10

    .line 1350
    if-eqz v6, :cond_2

    .line 1351
    .line 1352
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1353
    .line 1354
    .line 1355
    move-result v6

    .line 1356
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1359
    .line 1360
    const/4 v14, 0x0

    .line 1361
    invoke-virtual {v7, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->C(I)V

    .line 1365
    .line 1366
    .line 1367
    goto :goto_3

    .line 1368
    :pswitch_41
    move/from16 v13, v17

    .line 1369
    .line 1370
    const/4 v14, 0x0

    .line 1371
    and-int/2addr v6, v10

    .line 1372
    if-eqz v6, :cond_5

    .line 1373
    .line 1374
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1375
    .line 1376
    .line 1377
    move-result-wide v6

    .line 1378
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1379
    .line 1380
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1381
    .line 1382
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 1386
    .line 1387
    .line 1388
    goto :goto_3

    .line 1389
    :pswitch_42
    move/from16 v13, v17

    .line 1390
    .line 1391
    const/4 v14, 0x0

    .line 1392
    and-int/2addr v6, v10

    .line 1393
    if-eqz v6, :cond_5

    .line 1394
    .line 1395
    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1396
    .line 1397
    .line 1398
    move-result-wide v6

    .line 1399
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1402
    .line 1403
    invoke-virtual {v8, v12, v14}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->E(J)V

    .line 1407
    .line 1408
    .line 1409
    goto :goto_3

    .line 1410
    :pswitch_43
    move/from16 v13, v17

    .line 1411
    .line 1412
    const/4 v14, 0x0

    .line 1413
    and-int/2addr v6, v10

    .line 1414
    if-eqz v6, :cond_5

    .line 1415
    .line 1416
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1417
    .line 1418
    invoke-virtual {v6, v7, v8, v1}, Lcom/google/android/gms/internal/vision/T0;->i(JLjava/lang/Object;)F

    .line 1419
    .line 1420
    .line 1421
    move-result v6

    .line 1422
    iget-object v7, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v7, Lcom/google/android/gms/internal/vision/Q;

    .line 1425
    .line 1426
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1430
    .line 1431
    .line 1432
    move-result v6

    .line 1433
    invoke-virtual {v7, v12, v11}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/vision/Q;->M(I)V

    .line 1437
    .line 1438
    .line 1439
    goto :goto_3

    .line 1440
    :pswitch_44
    move/from16 v13, v17

    .line 1441
    .line 1442
    const/4 v14, 0x0

    .line 1443
    and-int/2addr v6, v10

    .line 1444
    if-eqz v6, :cond_5

    .line 1445
    .line 1446
    sget-object v6, Lcom/google/android/gms/internal/vision/U0;->c:Lcom/google/android/gms/internal/vision/T0;

    .line 1447
    .line 1448
    invoke-virtual {v6, v7, v8, v1}, Lcom/google/android/gms/internal/vision/T0;->j(JLjava/lang/Object;)D

    .line 1449
    .line 1450
    .line 1451
    move-result-wide v6

    .line 1452
    iget-object v8, v2, Lcom/google/android/gms/internal/vision/w0;->a:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v8, Lcom/google/android/gms/internal/vision/Q;

    .line 1455
    .line 1456
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1457
    .line 1458
    .line 1459
    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v6

    .line 1463
    invoke-virtual {v8, v12, v15}, Lcom/google/android/gms/internal/vision/Q;->D(II)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v8, v6, v7}, Lcom/google/android/gms/internal/vision/Q;->K(J)V

    .line 1467
    .line 1468
    .line 1469
    :cond_5
    :goto_3
    add-int/lit8 v8, v13, 0x3

    .line 1470
    .line 1471
    goto/16 :goto_0

    .line 1472
    .line 1473
    :cond_6
    iget-object v3, v0, Lcom/google/android/gms/internal/vision/C0;->l:Lcom/google/android/gms/internal/vision/N0;

    .line 1474
    .line 1475
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1476
    .line 1477
    .line 1478
    check-cast v1, Lcom/google/android/gms/internal/vision/e0;

    .line 1479
    .line 1480
    iget-object v1, v1, Lcom/google/android/gms/internal/vision/e0;->zzb:Lcom/google/android/gms/internal/vision/O0;

    .line 1481
    .line 1482
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/vision/O0;->c(Lcom/google/android/gms/internal/vision/w0;)V

    .line 1483
    .line 1484
    .line 1485
    return-void

    .line 1486
    nop

    .line 1487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

.method public final y(I)Lcom/google/android/gms/internal/vision/j0;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aget-object p1, v0, p1

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/gms/internal/vision/j0;

    .line 12
    .line 13
    return-object p1
.end method

.method public final z(Lcom/google/android/gms/internal/vision/e0;Lcom/google/android/gms/internal/vision/e0;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/internal/vision/C0;->s(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->j:Lcom/google/android/gms/internal/vision/F0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/C0;->e:Lcom/google/android/gms/internal/vision/K;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/vision/e0;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/vision/e0;->e(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
