.class public abstract Lj0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lk0/c;)Landroid/graphics/ColorSpace;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lk0/d;->e:Lk0/q;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v1, Lk0/d;->q:Lk0/q;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    .line 27
    .line 28
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    sget-object v1, Lk0/d;->r:Lk0/q;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    .line 42
    .line 43
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_2
    sget-object v1, Lk0/d;->o:Lk0/q;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    .line 57
    .line 58
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :cond_3
    sget-object v1, Lk0/d;->j:Lk0/q;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    .line 72
    .line 73
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :cond_4
    sget-object v1, Lk0/d;->i:Lk0/q;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    .line 87
    .line 88
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :cond_5
    sget-object v1, Lk0/d;->t:Lk0/k;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    .line 102
    .line 103
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :cond_6
    sget-object v1, Lk0/d;->s:Lk0/k;

    .line 109
    .line 110
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    .line 117
    .line 118
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_7
    sget-object v1, Lk0/d;->k:Lk0/q;

    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    .line 132
    .line 133
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :cond_8
    sget-object v1, Lk0/d;->l:Lk0/q;

    .line 139
    .line 140
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_9

    .line 145
    .line 146
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 147
    .line 148
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :cond_9
    sget-object v1, Lk0/d;->g:Lk0/q;

    .line 154
    .line 155
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_a

    .line 160
    .line 161
    sget-object v0, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 162
    .line 163
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :cond_a
    sget-object v1, Lk0/d;->h:Lk0/q;

    .line 169
    .line 170
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_b

    .line 175
    .line 176
    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 177
    .line 178
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :cond_b
    sget-object v1, Lk0/d;->f:Lk0/q;

    .line 184
    .line 185
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_c

    .line 190
    .line 191
    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 192
    .line 193
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :cond_c
    sget-object v1, Lk0/d;->m:Lk0/q;

    .line 199
    .line 200
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_d

    .line 205
    .line 206
    sget-object v0, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    .line 207
    .line 208
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :cond_d
    sget-object v1, Lk0/d;->p:Lk0/q;

    .line 214
    .line 215
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-eqz v1, :cond_e

    .line 220
    .line 221
    sget-object v0, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    .line 222
    .line 223
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :cond_e
    sget-object v1, Lk0/d;->n:Lk0/q;

    .line 229
    .line 230
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_f

    .line 235
    .line 236
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    .line 237
    .line 238
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :cond_f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 244
    .line 245
    const/16 v2, 0x22

    .line 246
    .line 247
    const/4 v3, 0x0

    .line 248
    if-lt v1, v2, :cond_12

    .line 249
    .line 250
    sget-object v1, Lk0/d;->v:Lk0/q;

    .line 251
    .line 252
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_10

    .line 257
    .line 258
    invoke-static {}, LO3/s0;->g()Landroid/graphics/ColorSpace$Named;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v1}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    goto :goto_0

    .line 267
    :cond_10
    sget-object v1, Lk0/d;->w:Lk0/q;

    .line 268
    .line 269
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_11

    .line 274
    .line 275
    invoke-static {}, LO3/s0;->n()Landroid/graphics/ColorSpace$Named;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v1}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    goto :goto_0

    .line 284
    :cond_11
    move-object v1, v3

    .line 285
    :goto_0
    if-eqz v1, :cond_12

    .line 286
    .line 287
    return-object v1

    .line 288
    :cond_12
    instance-of v1, v0, Lk0/q;

    .line 289
    .line 290
    if-eqz v1, :cond_15

    .line 291
    .line 292
    move-object v1, v0

    .line 293
    check-cast v1, Lk0/q;

    .line 294
    .line 295
    iget-object v2, v1, Lk0/q;->d:Lk0/s;

    .line 296
    .line 297
    invoke-virtual {v2}, Lk0/s;->a()[F

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    iget-object v2, v1, Lk0/q;->g:Lk0/r;

    .line 302
    .line 303
    if-eqz v2, :cond_13

    .line 304
    .line 305
    new-instance v3, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 306
    .line 307
    iget-wide v9, v2, Lk0/r;->b:D

    .line 308
    .line 309
    iget-wide v11, v2, Lk0/r;->c:D

    .line 310
    .line 311
    iget-wide v13, v2, Lk0/r;->d:D

    .line 312
    .line 313
    iget-wide v3, v2, Lk0/r;->e:D

    .line 314
    .line 315
    iget-wide v5, v2, Lk0/r;->f:D

    .line 316
    .line 317
    move-wide v15, v3

    .line 318
    iget-wide v3, v2, Lk0/r;->g:D

    .line 319
    .line 320
    move-wide/from16 v19, v3

    .line 321
    .line 322
    iget-wide v2, v2, Lk0/r;->a:D

    .line 323
    .line 324
    new-instance v8, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 325
    .line 326
    move-wide/from16 v21, v2

    .line 327
    .line 328
    move-wide/from16 v17, v5

    .line 329
    .line 330
    invoke-direct/range {v8 .. v22}, Landroid/graphics/ColorSpace$Rgb$TransferParameters;-><init>(DDDDDDD)V

    .line 331
    .line 332
    .line 333
    move-object v3, v8

    .line 334
    :cond_13
    if-eqz v3, :cond_14

    .line 335
    .line 336
    new-instance v2, Landroid/graphics/ColorSpace$Rgb;

    .line 337
    .line 338
    iget-object v0, v0, Lk0/c;->a:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v1, v1, Lk0/q;->h:[F

    .line 341
    .line 342
    new-instance v2, Landroid/graphics/ColorSpace$Rgb;

    .line 343
    .line 344
    invoke-direct {v2, v0, v1, v7, v3}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    .line 345
    .line 346
    .line 347
    return-object v2

    .line 348
    :cond_14
    new-instance v2, Landroid/graphics/ColorSpace$Rgb;

    .line 349
    .line 350
    iget-object v5, v0, Lk0/c;->a:Ljava/lang/String;

    .line 351
    .line 352
    iget-object v6, v1, Lk0/q;->h:[F

    .line 353
    .line 354
    iget-object v2, v1, Lk0/q;->l:Lk0/p;

    .line 355
    .line 356
    new-instance v8, Lj0/q;

    .line 357
    .line 358
    const/4 v3, 0x0

    .line 359
    invoke-direct {v8, v2, v3}, Lj0/q;-><init>(LB5/c;I)V

    .line 360
    .line 361
    .line 362
    iget-object v1, v1, Lk0/q;->o:Lk0/p;

    .line 363
    .line 364
    new-instance v9, Lj0/q;

    .line 365
    .line 366
    const/4 v2, 0x1

    .line 367
    invoke-direct {v9, v1, v2}, Lj0/q;-><init>(LB5/c;I)V

    .line 368
    .line 369
    .line 370
    check-cast v0, Lk0/q;

    .line 371
    .line 372
    iget v10, v0, Lk0/q;->e:F

    .line 373
    .line 374
    iget v11, v0, Lk0/q;->f:F

    .line 375
    .line 376
    new-instance v4, Landroid/graphics/ColorSpace$Rgb;

    .line 377
    .line 378
    invoke-direct/range {v4 .. v11}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)V

    .line 379
    .line 380
    .line 381
    return-object v4

    .line 382
    :cond_15
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 383
    .line 384
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    return-object v0
.end method
