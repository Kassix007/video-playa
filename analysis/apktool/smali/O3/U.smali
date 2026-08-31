.class public final LO3/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final r:I

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/Object;

.field public final u:Ljava/lang/Object;

.field public final v:Ljava/lang/Object;

.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO3/X;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LO3/U;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LO3/U;->r:I

    iput-object p3, p0, LO3/U;->s:Ljava/lang/String;

    iput-object p4, p0, LO3/U;->t:Ljava/lang/Object;

    iput-object p5, p0, LO3/U;->u:Ljava/lang/Object;

    iput-object p6, p0, LO3/U;->v:Ljava/lang/Object;

    iput-object p1, p0, LO3/U;->w:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LO3/Z;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LO3/U;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lx3/A;->g(Ljava/lang/Object;)V

    iput-object p2, p0, LO3/U;->t:Ljava/lang/Object;

    iput p3, p0, LO3/U;->r:I

    iput-object p4, p0, LO3/U;->u:Ljava/lang/Object;

    iput-object p5, p0, LO3/U;->v:Ljava/lang/Object;

    iput-object p1, p0, LO3/U;->s:Ljava/lang/String;

    iput-object p6, p0, LO3/U;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, LO3/U;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/U;->t:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, LO3/Z;

    .line 10
    .line 11
    iget-object v2, p0, LO3/U;->s:Ljava/lang/String;

    .line 12
    .line 13
    iget v3, p0, LO3/U;->r:I

    .line 14
    .line 15
    iget-object v0, p0, LO3/U;->u:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    check-cast v4, Ljava/lang/Throwable;

    .line 19
    .line 20
    iget-object v0, p0, LO3/U;->v:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v0

    .line 23
    check-cast v5, [B

    .line 24
    .line 25
    iget-object v0, p0, LO3/U;->w:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface/range {v1 .. v6}, LO3/Z;->e(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, LO3/U;->w:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LO3/X;

    .line 37
    .line 38
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LO3/t0;

    .line 41
    .line 42
    iget-object v1, v1, LO3/t0;->u:LO3/h0;

    .line 43
    .line 44
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v2, v1, LO3/E0;->s:Z

    .line 48
    .line 49
    if-eqz v2, :cond_c

    .line 50
    .line 51
    iget-char v2, v0, LO3/X;->t:C

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x1

    .line 55
    if-nez v2, :cond_5

    .line 56
    .line 57
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, LO3/t0;

    .line 60
    .line 61
    iget-object v2, v2, LO3/t0;->t:LO3/g;

    .line 62
    .line 63
    iget-object v5, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 64
    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_0
    iget-object v5, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 69
    .line 70
    if-nez v5, :cond_2

    .line 71
    .line 72
    iget-object v5, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, LO3/t0;

    .line 75
    .line 76
    iget-object v6, v5, LO3/t0;->q:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {}, LB3/b;->a()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-eqz v6, :cond_1

    .line 87
    .line 88
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v6, :cond_0

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_0

    .line 97
    .line 98
    move v6, v4

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v6, v3

    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_1

    .line 104
    :goto_0
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iput-object v6, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 109
    .line 110
    :cond_1
    iget-object v6, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 111
    .line 112
    if-nez v6, :cond_2

    .line 113
    .line 114
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    iput-object v6, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 117
    .line 118
    iget-object v5, v5, LO3/t0;->v:LO3/X;

    .line 119
    .line 120
    invoke-static {v5}, LO3/t0;->l(LO3/E0;)V

    .line 121
    .line 122
    .line 123
    iget-object v5, v5, LO3/X;->w:LO3/V;

    .line 124
    .line 125
    const-string v6, "My process not in the list of running processes"

    .line 126
    .line 127
    invoke-virtual {v5, v6}, LO3/V;->b(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    monitor-exit v2

    .line 131
    goto :goto_2

    .line 132
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    throw v0

    .line 134
    :cond_3
    :goto_2
    iget-object v2, v2, LO3/g;->v:Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_4

    .line 141
    .line 142
    const/16 v2, 0x43

    .line 143
    .line 144
    iput-char v2, v0, LO3/X;->t:C

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    const/16 v2, 0x63

    .line 148
    .line 149
    iput-char v2, v0, LO3/X;->t:C

    .line 150
    .line 151
    :cond_5
    :goto_3
    iget-wide v5, v0, LO3/X;->u:J

    .line 152
    .line 153
    const-wide/16 v7, 0x0

    .line 154
    .line 155
    cmp-long v2, v5, v7

    .line 156
    .line 157
    if-gez v2, :cond_6

    .line 158
    .line 159
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, LO3/t0;

    .line 162
    .line 163
    iget-object v2, v2, LO3/t0;->t:LO3/g;

    .line 164
    .line 165
    invoke-virtual {v2}, LO3/g;->t()V

    .line 166
    .line 167
    .line 168
    const-wide/32 v5, 0x1fbd0

    .line 169
    .line 170
    .line 171
    iput-wide v5, v0, LO3/X;->u:J

    .line 172
    .line 173
    :cond_6
    iget v2, p0, LO3/U;->r:I

    .line 174
    .line 175
    iget-char v5, v0, LO3/X;->t:C

    .line 176
    .line 177
    iget-wide v9, v0, LO3/X;->u:J

    .line 178
    .line 179
    iget-object v0, p0, LO3/U;->s:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v6, p0, LO3/U;->t:Ljava/lang/Object;

    .line 182
    .line 183
    iget-object v11, p0, LO3/U;->u:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object v12, p0, LO3/U;->v:Ljava/lang/Object;

    .line 186
    .line 187
    const-string v13, "01VDIWEA?"

    .line 188
    .line 189
    invoke-virtual {v13, v2}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-static {v4, v0, v6, v11, v12}, LO3/X;->z(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    add-int/2addr v11, v4

    .line 210
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    add-int/2addr v11, v12

    .line 223
    add-int/2addr v11, v13

    .line 224
    add-int/2addr v11, v4

    .line 225
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    new-instance v12, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    add-int/2addr v11, v4

    .line 232
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 233
    .line 234
    .line 235
    const-string v4, "2"

    .line 236
    .line 237
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    const-string v2, ":"

    .line 250
    .line 251
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    const/16 v5, 0x400

    .line 266
    .line 267
    if-le v4, v5, :cond_7

    .line 268
    .line 269
    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    :cond_7
    iget-object v0, v1, LO3/h0;->v:LO3/g0;

    .line 274
    .line 275
    if-eqz v0, :cond_d

    .line 276
    .line 277
    iget-object v1, v0, LO3/g0;->d:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, Ljava/lang/String;

    .line 280
    .line 281
    iget-object v3, v0, LO3/g0;->e:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v3, LO3/h0;

    .line 284
    .line 285
    invoke-virtual {v3}, LO3/D0;->o()V

    .line 286
    .line 287
    .line 288
    iget-object v4, v0, LO3/g0;->e:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v4, LO3/h0;

    .line 291
    .line 292
    invoke-virtual {v4}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    iget-object v5, v0, LO3/g0;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v5, Ljava/lang/String;

    .line 299
    .line 300
    invoke-interface {v4, v5, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v4

    .line 304
    cmp-long v4, v4, v7

    .line 305
    .line 306
    if-nez v4, :cond_8

    .line 307
    .line 308
    invoke-virtual {v0}, LO3/g0;->d()V

    .line 309
    .line 310
    .line 311
    :cond_8
    if-nez v2, :cond_9

    .line 312
    .line 313
    const-string v2, ""

    .line 314
    .line 315
    :cond_9
    invoke-virtual {v3}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iget-object v0, v0, LO3/g0;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Ljava/lang/String;

    .line 322
    .line 323
    invoke-interface {v4, v0, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 324
    .line 325
    .line 326
    move-result-wide v4

    .line 327
    cmp-long v6, v4, v7

    .line 328
    .line 329
    const-wide/16 v7, 0x1

    .line 330
    .line 331
    if-gtz v6, :cond_a

    .line 332
    .line 333
    invoke-virtual {v3}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 342
    .line 343
    .line 344
    invoke-interface {v3, v0, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 345
    .line 346
    .line 347
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_a
    iget-object v6, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v6, LO3/t0;

    .line 354
    .line 355
    iget-object v6, v6, LO3/t0;->y:LO3/Y1;

    .line 356
    .line 357
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v6}, LO3/Y1;->l0()Ljava/security/SecureRandom;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-virtual {v6}, Ljava/util/Random;->nextLong()J

    .line 365
    .line 366
    .line 367
    move-result-wide v9

    .line 368
    const-wide v11, 0x7fffffffffffffffL

    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    and-long/2addr v9, v11

    .line 374
    add-long/2addr v4, v7

    .line 375
    div-long/2addr v11, v4

    .line 376
    invoke-virtual {v3}, LO3/h0;->s()Landroid/content/SharedPreferences;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    cmp-long v6, v9, v11

    .line 385
    .line 386
    if-gez v6, :cond_b

    .line 387
    .line 388
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 389
    .line 390
    .line 391
    :cond_b
    invoke-interface {v3, v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 392
    .line 393
    .line 394
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_c
    invoke-virtual {v0}, LO3/X;->y()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    const-string v1, "Persisted config not initialized. Not logging error/warn"

    .line 403
    .line 404
    const/4 v2, 0x6

    .line 405
    invoke-static {v2, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 406
    .line 407
    .line 408
    :cond_d
    :goto_4
    return-void

    .line 409
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
