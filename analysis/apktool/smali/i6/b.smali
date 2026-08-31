.class public final Li6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/o;


# virtual methods
.method public final a(Li6/f;)Ld6/u;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "Connection"

    .line 4
    .line 5
    const-string v2, "close"

    .line 6
    .line 7
    const-string v3, "HTTP "

    .line 8
    .line 9
    iget-object v4, v0, Li6/f;->d:LL/s;

    .line 10
    .line 11
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, LL/s;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v5, Lh6/h;

    .line 17
    .line 18
    iget-object v6, v4, LL/s;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v6, Li6/d;

    .line 21
    .line 22
    iget-object v7, v4, LL/s;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v7, Lh6/j;

    .line 25
    .line 26
    iget-object v8, v0, Li6/f;->e:Ld6/s;

    .line 27
    .line 28
    iget-object v0, v8, Ld6/s;->d:Lk3/c;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v9

    .line 34
    const/4 v12, 0x0

    .line 35
    :try_start_0
    invoke-interface {v6, v8}, Li6/d;->c(Ld6/s;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 36
    .line 37
    .line 38
    :try_start_1
    iget-object v13, v8, Ld6/s;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v13}, LD5/a;->A(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    const/4 v14, 0x1

    .line 45
    if-eqz v13, :cond_3

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const-string v13, "100-continue"

    .line 50
    .line 51
    const-string v15, "Expect"

    .line 52
    .line 53
    iget-object v11, v8, Ld6/s;->c:Ld6/l;

    .line 54
    .line 55
    invoke-virtual {v11, v15}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual {v13, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v11
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    :try_start_2
    invoke-interface {v6}, Li6/d;->d()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 66
    .line 67
    .line 68
    :try_start_3
    invoke-virtual {v4, v14}, LL/s;->f(Z)Ld6/t;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move-object v11, v12

    .line 75
    goto :goto_3

    .line 76
    :catch_1
    move-exception v0

    .line 77
    invoke-virtual {v4, v0}, LL/s;->g(Ljava/io/IOException;)V

    .line 78
    .line 79
    .line 80
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 81
    :cond_0
    move-object v11, v12

    .line 82
    :goto_0
    if-nez v11, :cond_1

    .line 83
    .line 84
    :try_start_4
    iget-object v5, v8, Ld6/s;->d:Lk3/c;

    .line 85
    .line 86
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Lk3/c;->c()J

    .line 90
    .line 91
    .line 92
    move-result-wide v13

    .line 93
    invoke-interface {v6, v8, v13, v14}, Li6/d;->a(Ld6/s;J)Lq6/E;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    new-instance v15, Lh6/b;

    .line 98
    .line 99
    invoke-direct {v15, v4, v5, v13, v14}, Lh6/b;-><init>(LL/s;Lq6/E;J)V

    .line 100
    .line 101
    .line 102
    invoke-static {v15}, La/a;->i(Lq6/E;)Lq6/z;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lq6/j;

    .line 109
    .line 110
    invoke-virtual {v5, v0}, Lq6/z;->i(Lq6/j;)Lq6/h;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Lq6/z;->close()V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catch_2
    move-exception v0

    .line 118
    goto :goto_3

    .line 119
    :cond_1
    const/4 v13, 0x0

    .line 120
    invoke-virtual {v5, v4, v14, v13, v12}, Lh6/h;->h(LL/s;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 121
    .line 122
    .line 123
    iget-object v0, v7, Lh6/j;->g:Lk6/n;

    .line 124
    .line 125
    if-eqz v0, :cond_2

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    const/4 v14, 0x0

    .line 129
    :goto_1
    if-nez v14, :cond_4

    .line 130
    .line 131
    invoke-interface {v6}, Li6/d;->g()Lh6/j;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lh6/j;->k()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    const/4 v13, 0x0

    .line 140
    :try_start_5
    invoke-virtual {v5, v4, v14, v13, v12}, Lh6/h;->h(LL/s;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 141
    .line 142
    .line 143
    move-object v11, v12

    .line 144
    :cond_4
    :goto_2
    :try_start_6
    invoke-interface {v6}, Li6/d;->b()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 145
    .line 146
    .line 147
    move-object v5, v12

    .line 148
    goto :goto_4

    .line 149
    :catch_3
    move-exception v0

    .line 150
    :try_start_7
    invoke-virtual {v4, v0}, LL/s;->g(Ljava/io/IOException;)V

    .line 151
    .line 152
    .line 153
    throw v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 154
    :catch_4
    move-exception v0

    .line 155
    :try_start_8
    invoke-virtual {v4, v0}, LL/s;->g(Ljava/io/IOException;)V

    .line 156
    .line 157
    .line 158
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 159
    :goto_3
    instance-of v5, v0, Lk6/a;

    .line 160
    .line 161
    if-nez v5, :cond_10

    .line 162
    .line 163
    iget-boolean v5, v4, LL/s;->a:Z

    .line 164
    .line 165
    if-eqz v5, :cond_f

    .line 166
    .line 167
    move-object v5, v0

    .line 168
    :goto_4
    if-nez v11, :cond_5

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    :try_start_9
    invoke-virtual {v4, v13}, LL/s;->f(Z)Ld6/t;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-static {v11}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :catch_5
    move-exception v0

    .line 180
    goto/16 :goto_9

    .line 181
    .line 182
    :cond_5
    :goto_5
    iput-object v8, v11, Ld6/t;->a:Ld6/s;

    .line 183
    .line 184
    iget-object v0, v7, Lh6/j;->e:Ld6/k;

    .line 185
    .line 186
    iput-object v0, v11, Ld6/t;->e:Ld6/k;

    .line 187
    .line 188
    iput-wide v9, v11, Ld6/t;->k:J

    .line 189
    .line 190
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 191
    .line 192
    .line 193
    move-result-wide v13

    .line 194
    iput-wide v13, v11, Ld6/t;->l:J

    .line 195
    .line 196
    invoke-virtual {v11}, Ld6/t;->a()Ld6/u;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget v11, v0, Ld6/u;->t:I

    .line 201
    .line 202
    const/16 v13, 0x64

    .line 203
    .line 204
    if-ne v11, v13, :cond_6

    .line 205
    .line 206
    :goto_6
    const/4 v13, 0x0

    .line 207
    goto :goto_7

    .line 208
    :cond_6
    const/16 v13, 0x66

    .line 209
    .line 210
    if-gt v13, v11, :cond_7

    .line 211
    .line 212
    const/16 v13, 0xc8

    .line 213
    .line 214
    if-ge v11, v13, :cond_7

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :goto_7
    invoke-virtual {v4, v13}, LL/s;->f(Z)Ld6/t;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iput-object v8, v0, Ld6/t;->a:Ld6/s;

    .line 225
    .line 226
    iget-object v7, v7, Lh6/j;->e:Ld6/k;

    .line 227
    .line 228
    iput-object v7, v0, Ld6/t;->e:Ld6/k;

    .line 229
    .line 230
    iput-wide v9, v0, Ld6/t;->k:J

    .line 231
    .line 232
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 233
    .line 234
    .line 235
    move-result-wide v7

    .line 236
    iput-wide v7, v0, Ld6/t;->l:J

    .line 237
    .line 238
    invoke-virtual {v0}, Ld6/t;->a()Ld6/u;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget v11, v0, Ld6/u;->t:I

    .line 243
    .line 244
    :cond_7
    invoke-virtual {v0}, Ld6/u;->b()Ld6/t;

    .line 245
    .line 246
    .line 247
    move-result-object v7
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 248
    :try_start_a
    const-string v8, "Content-Type"

    .line 249
    .line 250
    invoke-static {v0, v8}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-interface {v6, v0}, Li6/d;->h(Ld6/u;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    invoke-interface {v6, v0}, Li6/d;->e(Ld6/u;)Lq6/G;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v13, Lh6/c;

    .line 263
    .line 264
    invoke-direct {v13, v4, v0, v9, v10}, Lh6/c;-><init>(LL/s;Lq6/G;J)V

    .line 265
    .line 266
    .line 267
    new-instance v0, Li6/g;

    .line 268
    .line 269
    invoke-static {v13}, La/a;->j(Lq6/G;)Lq6/A;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    invoke-direct {v0, v8, v9, v10, v13}, Li6/g;-><init>(Ljava/lang/String;JLq6/A;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_6

    .line 274
    .line 275
    .line 276
    :try_start_b
    iput-object v0, v7, Ld6/t;->g:Ld6/w;

    .line 277
    .line 278
    invoke-virtual {v7}, Ld6/t;->a()Ld6/u;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    iget-object v4, v0, Ld6/u;->q:Ld6/s;

    .line 283
    .line 284
    iget-object v4, v4, Ld6/s;->c:Ld6/l;

    .line 285
    .line 286
    invoke-virtual {v4, v1}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    if-nez v4, :cond_8

    .line 295
    .line 296
    invoke-static {v0, v1}, Ld6/u;->a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-eqz v1, :cond_9

    .line 305
    .line 306
    :cond_8
    invoke-interface {v6}, Li6/d;->g()Lh6/j;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v1}, Lh6/j;->k()V

    .line 311
    .line 312
    .line 313
    :cond_9
    const/16 v1, 0xcc

    .line 314
    .line 315
    if-eq v11, v1, :cond_a

    .line 316
    .line 317
    const/16 v1, 0xcd

    .line 318
    .line 319
    if-ne v11, v1, :cond_d

    .line 320
    .line 321
    :cond_a
    iget-object v1, v0, Ld6/u;->w:Ld6/w;

    .line 322
    .line 323
    if-eqz v1, :cond_b

    .line 324
    .line 325
    invoke-virtual {v1}, Ld6/w;->a()J

    .line 326
    .line 327
    .line 328
    move-result-wide v1

    .line 329
    goto :goto_8

    .line 330
    :cond_b
    const-wide/16 v1, -0x1

    .line 331
    .line 332
    :goto_8
    const-wide/16 v6, 0x0

    .line 333
    .line 334
    cmp-long v1, v1, v6

    .line 335
    .line 336
    if-lez v1, :cond_d

    .line 337
    .line 338
    new-instance v1, Ljava/net/ProtocolException;

    .line 339
    .line 340
    new-instance v2, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string v3, " had non-zero Content-Length: "

    .line 349
    .line 350
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    iget-object v0, v0, Ld6/u;->w:Ld6/w;

    .line 354
    .line 355
    if-eqz v0, :cond_c

    .line 356
    .line 357
    invoke-virtual {v0}, Ld6/w;->a()J

    .line 358
    .line 359
    .line 360
    move-result-wide v3

    .line 361
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    :cond_c
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    throw v1

    .line 376
    :cond_d
    return-object v0

    .line 377
    :catch_6
    move-exception v0

    .line 378
    invoke-virtual {v4, v0}, LL/s;->g(Ljava/io/IOException;)V

    .line 379
    .line 380
    .line 381
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 382
    :goto_9
    if-eqz v5, :cond_e

    .line 383
    .line 384
    invoke-static {v5, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    throw v5

    .line 388
    :cond_e
    throw v0

    .line 389
    :cond_f
    throw v0

    .line 390
    :cond_10
    throw v0
.end method
