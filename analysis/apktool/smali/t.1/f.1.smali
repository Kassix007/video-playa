.class public final Lt/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# instance fields
.field public final a:Lt/l;


# direct methods
.method public constructor <init>(Lt/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt/f;->a:Lt/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    new-array v5, v4, [Lz0/J;

    .line 12
    .line 13
    move-object v6, v1

    .line 14
    check-cast v6, Ljava/util/Collection;

    .line 15
    .line 16
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const-wide/16 v8, 0x0

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    :goto_0
    const/4 v15, 0x0

    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const/4 v10, 0x1

    .line 27
    if-ge v11, v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v17

    .line 33
    const-wide v18, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    move-object/from16 v12, v17

    .line 39
    .line 40
    check-cast v12, Lz0/B;

    .line 41
    .line 42
    invoke-interface {v12}, Lz0/B;->g()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v13

    .line 46
    const/16 v17, 0x20

    .line 47
    .line 48
    instance-of v14, v13, Lt/h;

    .line 49
    .line 50
    if-eqz v14, :cond_0

    .line 51
    .line 52
    move-object v15, v13

    .line 53
    check-cast v15, Lt/h;

    .line 54
    .line 55
    :cond_0
    if-eqz v15, :cond_1

    .line 56
    .line 57
    iget-object v13, v15, Lt/h;->q:LP/f0;

    .line 58
    .line 59
    invoke-virtual {v13}, LP/f0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    check-cast v13, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-ne v13, v10, :cond_1

    .line 70
    .line 71
    invoke-interface {v12, v2, v3}, Lz0/B;->a(J)Lz0/J;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget v9, v8, Lz0/J;->q:I

    .line 76
    .line 77
    iget v10, v8, Lz0/J;->r:I

    .line 78
    .line 79
    int-to-long v12, v9

    .line 80
    shl-long v12, v12, v17

    .line 81
    .line 82
    int-to-long v9, v10

    .line 83
    and-long v9, v9, v18

    .line 84
    .line 85
    or-long/2addr v9, v12

    .line 86
    aput-object v8, v5, v11

    .line 87
    .line 88
    move-wide v8, v9

    .line 89
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/16 v17, 0x20

    .line 93
    .line 94
    const-wide v18, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    move/from16 v7, v16

    .line 104
    .line 105
    :goto_1
    if-ge v7, v6, :cond_4

    .line 106
    .line 107
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    check-cast v11, Lz0/B;

    .line 112
    .line 113
    aget-object v12, v5, v7

    .line 114
    .line 115
    if-nez v12, :cond_3

    .line 116
    .line 117
    invoke-interface {v11, v2, v3}, Lz0/B;->a(J)Lz0/J;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    aput-object v11, v5, v7

    .line 122
    .line 123
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    invoke-interface/range {p1 .. p1}, Lz0/E;->r()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    shr-long v1, v8, v17

    .line 133
    .line 134
    long-to-int v1, v1

    .line 135
    goto/16 :goto_9

    .line 136
    .line 137
    :cond_5
    if-nez v4, :cond_6

    .line 138
    .line 139
    move-object v1, v15

    .line 140
    goto/16 :goto_8

    .line 141
    .line 142
    :cond_6
    aget-object v1, v5, v16

    .line 143
    .line 144
    add-int/lit8 v2, v4, -0x1

    .line 145
    .line 146
    if-nez v2, :cond_7

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_7
    if-eqz v1, :cond_8

    .line 150
    .line 151
    iget v3, v1, Lz0/J;->q:I

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_8
    move/from16 v3, v16

    .line 155
    .line 156
    :goto_2
    new-instance v6, LG5/d;

    .line 157
    .line 158
    invoke-direct {v6, v10, v2, v10}, LG5/b;-><init>(III)V

    .line 159
    .line 160
    .line 161
    iget v2, v6, LG5/b;->r:I

    .line 162
    .line 163
    iget v6, v6, LG5/b;->s:I

    .line 164
    .line 165
    if-lez v6, :cond_a

    .line 166
    .line 167
    if-gt v10, v2, :cond_9

    .line 168
    .line 169
    :goto_3
    move v7, v10

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move/from16 v7, v16

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_a
    if-lt v10, v2, :cond_9

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :goto_4
    if-eqz v7, :cond_b

    .line 178
    .line 179
    move v11, v10

    .line 180
    goto :goto_5

    .line 181
    :cond_b
    move v11, v2

    .line 182
    :goto_5
    if-eqz v7, :cond_10

    .line 183
    .line 184
    if-ne v11, v2, :cond_d

    .line 185
    .line 186
    if-eqz v7, :cond_c

    .line 187
    .line 188
    move v12, v11

    .line 189
    move/from16 v7, v16

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_c
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 195
    .line 196
    .line 197
    throw v1

    .line 198
    :cond_d
    add-int v12, v11, v6

    .line 199
    .line 200
    :goto_6
    aget-object v11, v5, v11

    .line 201
    .line 202
    if-eqz v11, :cond_e

    .line 203
    .line 204
    iget v13, v11, Lz0/J;->q:I

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_e
    move/from16 v13, v16

    .line 208
    .line 209
    :goto_7
    if-ge v3, v13, :cond_f

    .line 210
    .line 211
    move-object v1, v11

    .line 212
    move v11, v12

    .line 213
    move v3, v13

    .line 214
    goto :goto_5

    .line 215
    :cond_f
    move v11, v12

    .line 216
    goto :goto_5

    .line 217
    :cond_10
    :goto_8
    if-eqz v1, :cond_11

    .line 218
    .line 219
    iget v1, v1, Lz0/J;->q:I

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_11
    move/from16 v1, v16

    .line 223
    .line 224
    :goto_9
    invoke-interface/range {p1 .. p1}, Lz0/E;->r()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_12

    .line 229
    .line 230
    and-long v2, v8, v18

    .line 231
    .line 232
    long-to-int v10, v2

    .line 233
    goto/16 :goto_11

    .line 234
    .line 235
    :cond_12
    if-nez v4, :cond_13

    .line 236
    .line 237
    goto :goto_10

    .line 238
    :cond_13
    aget-object v15, v5, v16

    .line 239
    .line 240
    sub-int/2addr v4, v10

    .line 241
    if-nez v4, :cond_14

    .line 242
    .line 243
    goto :goto_10

    .line 244
    :cond_14
    if-eqz v15, :cond_15

    .line 245
    .line 246
    iget v2, v15, Lz0/J;->r:I

    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_15
    move/from16 v2, v16

    .line 250
    .line 251
    :goto_a
    new-instance v3, LG5/d;

    .line 252
    .line 253
    invoke-direct {v3, v10, v4, v10}, LG5/b;-><init>(III)V

    .line 254
    .line 255
    .line 256
    iget v4, v3, LG5/b;->r:I

    .line 257
    .line 258
    iget v3, v3, LG5/b;->s:I

    .line 259
    .line 260
    if-lez v3, :cond_17

    .line 261
    .line 262
    if-gt v10, v4, :cond_16

    .line 263
    .line 264
    :goto_b
    move v6, v10

    .line 265
    goto :goto_c

    .line 266
    :cond_16
    move/from16 v6, v16

    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_17
    if-lt v10, v4, :cond_16

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :goto_c
    if-eqz v6, :cond_18

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_18
    move v10, v4

    .line 276
    :cond_19
    :goto_d
    if-eqz v6, :cond_1d

    .line 277
    .line 278
    if-ne v10, v4, :cond_1b

    .line 279
    .line 280
    if-eqz v6, :cond_1a

    .line 281
    .line 282
    move v7, v10

    .line 283
    move/from16 v6, v16

    .line 284
    .line 285
    goto :goto_e

    .line 286
    :cond_1a
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 287
    .line 288
    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    .line 289
    .line 290
    .line 291
    throw v1

    .line 292
    :cond_1b
    add-int v7, v10, v3

    .line 293
    .line 294
    :goto_e
    aget-object v8, v5, v10

    .line 295
    .line 296
    if-eqz v8, :cond_1c

    .line 297
    .line 298
    iget v9, v8, Lz0/J;->r:I

    .line 299
    .line 300
    goto :goto_f

    .line 301
    :cond_1c
    move/from16 v9, v16

    .line 302
    .line 303
    :goto_f
    move v10, v7

    .line 304
    if-ge v2, v9, :cond_19

    .line 305
    .line 306
    move-object v15, v8

    .line 307
    move v2, v9

    .line 308
    goto :goto_d

    .line 309
    :cond_1d
    :goto_10
    if-eqz v15, :cond_1e

    .line 310
    .line 311
    iget v10, v15, Lz0/J;->r:I

    .line 312
    .line 313
    goto :goto_11

    .line 314
    :cond_1e
    move/from16 v10, v16

    .line 315
    .line 316
    :goto_11
    invoke-interface/range {p1 .. p1}, Lz0/E;->r()Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-nez v2, :cond_1f

    .line 321
    .line 322
    int-to-long v2, v1

    .line 323
    shl-long v2, v2, v17

    .line 324
    .line 325
    int-to-long v6, v10

    .line 326
    and-long v6, v6, v18

    .line 327
    .line 328
    or-long/2addr v2, v6

    .line 329
    iget-object v4, v0, Lt/f;->a:Lt/l;

    .line 330
    .line 331
    iget-object v4, v4, Lt/l;->c:LP/f0;

    .line 332
    .line 333
    new-instance v6, LW0/k;

    .line 334
    .line 335
    invoke-direct {v6, v2, v3}, LW0/k;-><init>(J)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_1f
    new-instance v2, LE/Z;

    .line 342
    .line 343
    invoke-direct {v2, v5, v0, v1, v10}, LE/Z;-><init>([Lz0/J;Lt/f;II)V

    .line 344
    .line 345
    .line 346
    sget-object v3, Ln5/t;->q:Ln5/t;

    .line 347
    .line 348
    move-object/from16 v4, p1

    .line 349
    .line 350
    invoke-interface {v4, v1, v10, v3, v2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    return-object v1
.end method
