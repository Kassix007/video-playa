.class public final LO3/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    iput v0, p0, LO3/x0;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LO3/C0;Ly3/a;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LO3/x0;->q:I

    iput-object p2, p0, LO3/x0;->t:Ljava/lang/Object;

    iput-object p3, p0, LO3/x0;->r:Ljava/lang/Object;

    iput-object p1, p0, LO3/x0;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/w1;Ljava/util/concurrent/atomic/AtomicReference;LO3/a2;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LO3/x0;->q:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/x0;->t:Ljava/lang/Object;

    iput-object p3, p0, LO3/x0;->r:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/x0;->s:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;LO3/a2;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LO3/x0;->q:I

    iput-object p1, p0, LO3/x0;->s:Ljava/lang/Object;

    iput-object p2, p0, LO3/x0;->r:Ljava/lang/Object;

    iput-object p3, p0, LO3/x0;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;I)V
    .locals 0

    .line 4
    iput p4, p0, LO3/x0;->q:I

    iput-object p1, p0, LO3/x0;->t:Ljava/lang/Object;

    iput-object p2, p0, LO3/x0;->r:Ljava/lang/Object;

    iput-object p3, p0, LO3/x0;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 39

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LO3/x0;->q:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls1/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Ls1/d;->call()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget-object v2, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ls1/e;

    .line 21
    .line 22
    iget-object v3, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Landroid/os/Handler;

    .line 25
    .line 26
    new-instance v4, LI4/a;

    .line 27
    .line 28
    const/16 v5, 0x1d

    .line 29
    .line 30
    invoke-direct {v4, v5, v2, v0}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lk3/d;

    .line 40
    .line 41
    iget-object v2, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LO3/X;

    .line 44
    .line 45
    iget-object v3, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Landroid/app/job/JobParameters;

    .line 48
    .line 49
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 50
    .line 51
    const-string v4, "AppMeasurementJobService processed last upload request."

    .line 52
    .line 53
    invoke-virtual {v2, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Landroid/app/Service;

    .line 59
    .line 60
    check-cast v0, LO3/z1;

    .line 61
    .line 62
    invoke-interface {v0, v3}, LO3/z1;->c(Landroid/app/job/JobParameters;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LO3/w1;

    .line 69
    .line 70
    iget-object v2, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, LO3/a2;

    .line 73
    .line 74
    iget-object v3, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, LO3/d;

    .line 77
    .line 78
    iget-object v4, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, LO3/t0;

    .line 81
    .line 82
    iget-object v5, v0, LO3/w1;->u:LO3/I;

    .line 83
    .line 84
    if-nez v5, :cond_0

    .line 85
    .line 86
    iget-object v0, v4, LO3/t0;->v:LO3/X;

    .line 87
    .line 88
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 92
    .line 93
    const-string v2, "[sgtm] Discarding data. Failed to update batch upload status."

    .line 94
    .line 95
    invoke-virtual {v0, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    :try_start_1
    invoke-interface {v5, v2, v3}, LO3/I;->p(LO3/a2;LO3/d;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catch_1
    move-exception v0

    .line 107
    iget-object v2, v4, LO3/t0;->v:LO3/X;

    .line 108
    .line 109
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 113
    .line 114
    iget-wide v3, v3, LO3/d;->q:J

    .line 115
    .line 116
    const-string v5, "[sgtm] Failed to update batch upload status, rowId, exception"

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v2, v3, v0, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-void

    .line 126
    :pswitch_2
    const-string v2, "Failed to get app instance id"

    .line 127
    .line 128
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v3, v0

    .line 131
    check-cast v3, Lcom/google/android/gms/internal/measurement/L;

    .line 132
    .line 133
    iget-object v0, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v4, v0

    .line 136
    check-cast v4, LO3/w1;

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    :try_start_2
    iget-object v0, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, LO3/t0;

    .line 142
    .line 143
    iget-object v6, v0, LO3/t0;->u:LO3/h0;

    .line 144
    .line 145
    iget-object v7, v0, LO3/t0;->v:LO3/X;

    .line 146
    .line 147
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6}, LO3/h0;->v()LO3/J0;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    sget-object v9, LO3/I0;->s:LO3/I0;

    .line 155
    .line 156
    invoke-virtual {v8, v9}, LO3/J0;->i(LO3/I0;)Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-nez v8, :cond_1

    .line 161
    .line 162
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 163
    .line 164
    .line 165
    iget-object v7, v7, LO3/X;->B:LO3/V;

    .line 166
    .line 167
    const-string v8, "Analytics storage consent denied; will not get app instance id"

    .line 168
    .line 169
    invoke-virtual {v7, v8}, LO3/V;->b(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v7, v0, LO3/t0;->C:LO3/b1;

    .line 173
    .line 174
    invoke-static {v7}, LO3/t0;->k(LO3/H;)V

    .line 175
    .line 176
    .line 177
    iget-object v7, v7, LO3/b1;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 178
    .line 179
    invoke-virtual {v7, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 183
    .line 184
    .line 185
    iget-object v6, v6, LO3/h0;->x:LK2/a;

    .line 186
    .line 187
    invoke-virtual {v6, v5}, LK2/a;->f(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    goto :goto_7

    .line 193
    :catch_2
    move-exception v0

    .line 194
    goto :goto_4

    .line 195
    :cond_1
    iget-object v8, v4, LO3/w1;->u:LO3/I;

    .line 196
    .line 197
    if-nez v8, :cond_2

    .line 198
    .line 199
    invoke-static {v7}, LO3/t0;->l(LO3/E0;)V

    .line 200
    .line 201
    .line 202
    iget-object v6, v7, LO3/X;->w:LO3/V;

    .line 203
    .line 204
    invoke-virtual {v6, v2}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    .line 206
    .line 207
    :goto_2
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 208
    .line 209
    :goto_3
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v5, v3}, LO3/Y1;->W(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_2
    :try_start_3
    iget-object v7, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v7, LO3/a2;

    .line 219
    .line 220
    invoke-interface {v8, v7}, LO3/I;->x(LO3/a2;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    if-eqz v5, :cond_3

    .line 225
    .line 226
    iget-object v0, v0, LO3/t0;->C:LO3/b1;

    .line 227
    .line 228
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, LO3/b1;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 232
    .line 233
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v6}, LO3/t0;->j(LO3/D0;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, v6, LO3/h0;->x:LK2/a;

    .line 240
    .line 241
    invoke-virtual {v0, v5}, LK2/a;->f(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_3
    invoke-virtual {v4}, LO3/w1;->B()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :goto_4
    :try_start_4
    iget-object v6, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v6, LO3/t0;

    .line 251
    .line 252
    iget-object v6, v6, LO3/t0;->v:LO3/X;

    .line 253
    .line 254
    invoke-static {v6}, LO3/t0;->l(LO3/E0;)V

    .line 255
    .line 256
    .line 257
    iget-object v6, v6, LO3/X;->w:LO3/V;

    .line 258
    .line 259
    invoke-virtual {v6, v0, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 260
    .line 261
    .line 262
    :goto_5
    iget-object v0, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, LO3/t0;

    .line 265
    .line 266
    iget-object v0, v0, LO3/t0;->y:LO3/Y1;

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :goto_6
    return-void

    .line 270
    :goto_7
    iget-object v2, v4, LO3/D0;->r:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, LO3/t0;

    .line 273
    .line 274
    iget-object v2, v2, LO3/t0;->y:LO3/Y1;

    .line 275
    .line 276
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v5, v3}, LO3/Y1;->W(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/L;)V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :pswitch_3
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 284
    .line 285
    move-object v2, v0

    .line 286
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 287
    .line 288
    monitor-enter v2

    .line 289
    :try_start_5
    iget-object v0, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, LO3/w1;

    .line 292
    .line 293
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v3, LO3/t0;

    .line 296
    .line 297
    iget-object v4, v3, LO3/t0;->u:LO3/h0;

    .line 298
    .line 299
    invoke-static {v4}, LO3/t0;->j(LO3/D0;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4}, LO3/h0;->v()LO3/J0;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    sget-object v5, LO3/I0;->s:LO3/I0;

    .line 307
    .line 308
    invoke-virtual {v4, v5}, LO3/J0;->i(LO3/I0;)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-nez v4, :cond_4

    .line 313
    .line 314
    iget-object v4, v3, LO3/t0;->v:LO3/X;

    .line 315
    .line 316
    invoke-static {v4}, LO3/t0;->l(LO3/E0;)V

    .line 317
    .line 318
    .line 319
    iget-object v4, v4, LO3/X;->B:LO3/V;

    .line 320
    .line 321
    const-string v5, "Analytics storage consent denied; will not get app instance id"

    .line 322
    .line 323
    invoke-virtual {v4, v5}, LO3/V;->b(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, LO3/t0;

    .line 329
    .line 330
    iget-object v0, v0, LO3/t0;->C:LO3/b1;

    .line 331
    .line 332
    invoke-static {v0}, LO3/t0;->k(LO3/H;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, v0, LO3/b1;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iget-object v0, v3, LO3/t0;->u:LO3/h0;

    .line 342
    .line 343
    invoke-static {v0}, LO3/t0;->j(LO3/D0;)V

    .line 344
    .line 345
    .line 346
    iget-object v0, v0, LO3/h0;->x:LK2/a;

    .line 347
    .line 348
    invoke-virtual {v0, v4}, LK2/a;->f(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 352
    .line 353
    .line 354
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 355
    .line 356
    .line 357
    :goto_8
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 358
    goto :goto_c

    .line 359
    :catchall_1
    move-exception v0

    .line 360
    goto/16 :goto_e

    .line 361
    .line 362
    :catchall_2
    move-exception v0

    .line 363
    goto :goto_d

    .line 364
    :catch_3
    move-exception v0

    .line 365
    goto :goto_a

    .line 366
    :cond_4
    :try_start_7
    iget-object v4, v0, LO3/w1;->u:LO3/I;

    .line 367
    .line 368
    if-nez v4, :cond_5

    .line 369
    .line 370
    iget-object v0, v3, LO3/t0;->v:LO3/X;

    .line 371
    .line 372
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 373
    .line 374
    .line 375
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 376
    .line 377
    const-string v3, "Failed to get app instance id"

    .line 378
    .line 379
    invoke-virtual {v0, v3}, LO3/V;->b(Ljava/lang/String;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 380
    .line 381
    .line 382
    :try_start_8
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 383
    .line 384
    .line 385
    goto :goto_8

    .line 386
    :cond_5
    :try_start_9
    iget-object v5, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v5, LO3/a2;

    .line 389
    .line 390
    invoke-interface {v4, v5}, LO3/I;->x(LO3/a2;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    check-cast v4, Ljava/lang/String;

    .line 402
    .line 403
    if-eqz v4, :cond_6

    .line 404
    .line 405
    iget-object v5, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v5, LO3/t0;

    .line 408
    .line 409
    iget-object v5, v5, LO3/t0;->C:LO3/b1;

    .line 410
    .line 411
    invoke-static {v5}, LO3/t0;->k(LO3/H;)V

    .line 412
    .line 413
    .line 414
    iget-object v5, v5, LO3/b1;->x:Ljava/util/concurrent/atomic/AtomicReference;

    .line 415
    .line 416
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iget-object v3, v3, LO3/t0;->u:LO3/h0;

    .line 420
    .line 421
    invoke-static {v3}, LO3/t0;->j(LO3/D0;)V

    .line 422
    .line 423
    .line 424
    iget-object v3, v3, LO3/h0;->x:LK2/a;

    .line 425
    .line 426
    invoke-virtual {v3, v4}, LK2/a;->f(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    :cond_6
    invoke-virtual {v0}, LO3/w1;->B()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 430
    .line 431
    .line 432
    :try_start_a
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 435
    .line 436
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 437
    .line 438
    .line 439
    goto :goto_b

    .line 440
    :goto_a
    :try_start_b
    iget-object v3, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v3, LO3/w1;

    .line 443
    .line 444
    iget-object v3, v3, LO3/D0;->r:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v3, LO3/t0;

    .line 447
    .line 448
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 449
    .line 450
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 451
    .line 452
    .line 453
    iget-object v3, v3, LO3/X;->w:LO3/V;

    .line 454
    .line 455
    const-string v4, "Failed to get app instance id"

    .line 456
    .line 457
    invoke-virtual {v3, v0, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 458
    .line 459
    .line 460
    :try_start_c
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :goto_b
    monitor-exit v2

    .line 466
    :goto_c
    return-void

    .line 467
    :goto_d
    iget-object v3, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V

    .line 472
    .line 473
    .line 474
    throw v0

    .line 475
    :goto_e
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 476
    throw v0

    .line 477
    :pswitch_4
    iget-object v0, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, LO3/C0;

    .line 480
    .line 481
    iget-object v2, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v2, LO3/a2;

    .line 484
    .line 485
    iget-object v3, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v3, LO3/d;

    .line 488
    .line 489
    iget-object v4, v0, LO3/C0;->c:LO3/T1;

    .line 490
    .line 491
    invoke-virtual {v4}, LO3/T1;->A()V

    .line 492
    .line 493
    .line 494
    iget-object v2, v2, LO3/a2;->q:Ljava/lang/String;

    .line 495
    .line 496
    invoke-static {v2}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    iget-object v5, v4, LO3/T1;->U:Ljava/util/HashMap;

    .line 500
    .line 501
    invoke-virtual {v4}, LO3/T1;->c()LO3/p0;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v0}, LO3/p0;->o()V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4}, LO3/T1;->k0()V

    .line 509
    .line 510
    .line 511
    iget-object v6, v4, LO3/T1;->s:LO3/n;

    .line 512
    .line 513
    invoke-static {v6}, LO3/T1;->S(LO3/O1;)V

    .line 514
    .line 515
    .line 516
    iget-wide v8, v3, LO3/d;->q:J

    .line 517
    .line 518
    iget-wide v10, v3, LO3/d;->s:J

    .line 519
    .line 520
    invoke-virtual {v6}, LO3/D0;->o()V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v6}, LO3/O1;->p()V

    .line 524
    .line 525
    .line 526
    const/4 v7, 0x4

    .line 527
    const/4 v12, 0x3

    .line 528
    const/4 v13, 0x1

    .line 529
    const/16 v21, 0x0

    .line 530
    .line 531
    :try_start_d
    invoke-virtual {v6}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 532
    .line 533
    .line 534
    move-result-object v22

    .line 535
    const-string v23, "upload_queue"

    .line 536
    .line 537
    const-string v24, "rowId"

    .line 538
    .line 539
    const-string v25, "app_id"

    .line 540
    .line 541
    const-string v26, "measurement_batch"

    .line 542
    .line 543
    const-string v27, "upload_uri"

    .line 544
    .line 545
    const-string v28, "upload_headers"

    .line 546
    .line 547
    const-string v29, "upload_type"

    .line 548
    .line 549
    const-string v30, "retry_count"

    .line 550
    .line 551
    const-string v31, "creation_timestamp"

    .line 552
    .line 553
    const-string v32, "associated_row_id"

    .line 554
    .line 555
    const-string v33, "last_upload_timestamp"

    .line 556
    .line 557
    filled-new-array/range {v24 .. v33}, [Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v24

    .line 561
    const-string v25, "rowId=?"

    .line 562
    .line 563
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    filled-new-array {v0}, [Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v26

    .line 571
    const-string v30, "1"

    .line 572
    .line 573
    const/16 v27, 0x0

    .line 574
    .line 575
    const/16 v28, 0x0

    .line 576
    .line 577
    const/16 v29, 0x0

    .line 578
    .line 579
    invoke-virtual/range {v22 .. v30}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 580
    .line 581
    .line 582
    move-result-object v14
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 583
    :try_start_e
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_7

    .line 588
    .line 589
    move/from16 v25, v7

    .line 590
    .line 591
    move-wide/from16 v23, v10

    .line 592
    .line 593
    move v1, v13

    .line 594
    goto/16 :goto_14

    .line 595
    .line 596
    :cond_7
    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-static {v0}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    const/4 v15, 0x2

    .line 604
    invoke-interface {v14, v15}, Landroid/database/Cursor;->getBlob(I)[B

    .line 605
    .line 606
    .line 607
    move-result-object v15
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_8
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 608
    move-wide/from16 v16, v10

    .line 609
    .line 610
    :try_start_f
    invoke-interface {v14, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v11

    .line 614
    move v10, v12

    .line 615
    invoke-interface {v14, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v12
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 619
    const/4 v7, 0x5

    .line 620
    :try_start_10
    invoke-interface {v14, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 621
    .line 622
    .line 623
    move-result v7

    .line 624
    const/4 v10, 0x6

    .line 625
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 626
    .line 627
    .line 628
    move-result v10
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 629
    const/4 v13, 0x7

    .line 630
    :try_start_11
    invoke-interface {v14, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 631
    .line 632
    .line 633
    move-result-wide v22

    .line 634
    const/16 v13, 0x8

    .line 635
    .line 636
    invoke-interface {v14, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 637
    .line 638
    .line 639
    move-result-wide v24

    .line 640
    const/16 v13, 0x9

    .line 641
    .line 642
    invoke-interface {v14, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 643
    .line 644
    .line 645
    move-result-wide v26
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 646
    move v13, v7

    .line 647
    move-wide/from16 v19, v26

    .line 648
    .line 649
    const/4 v1, 0x1

    .line 650
    move-object v7, v0

    .line 651
    move-object/from16 v34, v14

    .line 652
    .line 653
    move v14, v10

    .line 654
    move-object v10, v15

    .line 655
    move-wide/from16 v35, v22

    .line 656
    .line 657
    move-object/from16 v22, v34

    .line 658
    .line 659
    move-wide/from16 v37, v24

    .line 660
    .line 661
    const/16 v25, 0x4

    .line 662
    .line 663
    move-wide/from16 v23, v16

    .line 664
    .line 665
    move-wide/from16 v15, v35

    .line 666
    .line 667
    move-wide/from16 v17, v37

    .line 668
    .line 669
    :try_start_12
    invoke-virtual/range {v6 .. v20}, LO3/n;->R(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJJ)LO3/U1;

    .line 670
    .line 671
    .line 672
    move-result-object v21
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 673
    invoke-interface/range {v22 .. v22}, Landroid/database/Cursor;->close()V

    .line 674
    .line 675
    .line 676
    :cond_8
    :goto_f
    move-object/from16 v0, v21

    .line 677
    .line 678
    goto/16 :goto_15

    .line 679
    .line 680
    :catchall_3
    move-exception v0

    .line 681
    goto :goto_11

    .line 682
    :catch_4
    move-exception v0

    .line 683
    goto :goto_12

    .line 684
    :catchall_4
    move-exception v0

    .line 685
    move-object/from16 v22, v14

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :catch_5
    move-exception v0

    .line 689
    move-object/from16 v22, v14

    .line 690
    .line 691
    move-wide/from16 v23, v16

    .line 692
    .line 693
    const/4 v1, 0x1

    .line 694
    :goto_10
    const/16 v25, 0x4

    .line 695
    .line 696
    goto :goto_12

    .line 697
    :catch_6
    move-exception v0

    .line 698
    move v1, v13

    .line 699
    move-object/from16 v22, v14

    .line 700
    .line 701
    move-wide/from16 v23, v16

    .line 702
    .line 703
    goto :goto_10

    .line 704
    :catch_7
    move-exception v0

    .line 705
    move/from16 v25, v7

    .line 706
    .line 707
    move v1, v13

    .line 708
    move-object/from16 v22, v14

    .line 709
    .line 710
    move-wide/from16 v23, v16

    .line 711
    .line 712
    goto :goto_12

    .line 713
    :catch_8
    move-exception v0

    .line 714
    move/from16 v25, v7

    .line 715
    .line 716
    move-wide/from16 v23, v10

    .line 717
    .line 718
    move v1, v13

    .line 719
    move-object/from16 v22, v14

    .line 720
    .line 721
    goto :goto_12

    .line 722
    :goto_11
    move-object/from16 v21, v22

    .line 723
    .line 724
    goto/16 :goto_1a

    .line 725
    .line 726
    :goto_12
    move-object/from16 v14, v22

    .line 727
    .line 728
    goto :goto_13

    .line 729
    :catchall_5
    move-exception v0

    .line 730
    goto/16 :goto_1a

    .line 731
    .line 732
    :catch_9
    move-exception v0

    .line 733
    move/from16 v25, v7

    .line 734
    .line 735
    move-wide/from16 v23, v10

    .line 736
    .line 737
    move v1, v13

    .line 738
    move-object/from16 v14, v21

    .line 739
    .line 740
    :goto_13
    :try_start_13
    iget-object v6, v6, LO3/D0;->r:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v6, LO3/t0;

    .line 743
    .line 744
    iget-object v6, v6, LO3/t0;->v:LO3/X;

    .line 745
    .line 746
    invoke-static {v6}, LO3/t0;->l(LO3/E0;)V

    .line 747
    .line 748
    .line 749
    iget-object v6, v6, LO3/X;->w:LO3/V;

    .line 750
    .line 751
    const-string v7, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 752
    .line 753
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 754
    .line 755
    .line 756
    move-result-object v10

    .line 757
    invoke-virtual {v6, v10, v0, v7}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 758
    .line 759
    .line 760
    :goto_14
    if-eqz v14, :cond_8

    .line 761
    .line 762
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 763
    .line 764
    .line 765
    goto :goto_f

    .line 766
    :goto_15
    if-nez v0, :cond_9

    .line 767
    .line 768
    invoke-virtual {v4}, LO3/T1;->b()LO3/X;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    iget-object v0, v0, LO3/X;->z:LO3/V;

    .line 773
    .line 774
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    const-string v3, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    .line 779
    .line 780
    invoke-virtual {v0, v2, v1, v3}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    goto/16 :goto_19

    .line 784
    .line 785
    :cond_9
    iget-object v0, v0, LO3/U1;->c:Ljava/lang/String;

    .line 786
    .line 787
    iget v6, v3, LO3/d;->r:I

    .line 788
    .line 789
    if-ne v6, v1, :cond_c

    .line 790
    .line 791
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v3

    .line 795
    if-eqz v3, :cond_a

    .line 796
    .line 797
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    :cond_a
    iget-object v0, v4, LO3/T1;->s:LO3/n;

    .line 801
    .line 802
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 803
    .line 804
    .line 805
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    invoke-virtual {v0, v3}, LO3/n;->v(Ljava/lang/Long;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4}, LO3/T1;->b()LO3/X;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 817
    .line 818
    const-string v5, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    .line 819
    .line 820
    invoke-virtual {v0, v2, v3, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    const-wide/16 v5, 0x0

    .line 824
    .line 825
    cmp-long v0, v23, v5

    .line 826
    .line 827
    if-lez v0, :cond_f

    .line 828
    .line 829
    iget-object v0, v4, LO3/T1;->s:LO3/n;

    .line 830
    .line 831
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 832
    .line 833
    .line 834
    iget-object v3, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v3, LO3/t0;

    .line 837
    .line 838
    invoke-virtual {v0}, LO3/D0;->o()V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0}, LO3/O1;->p()V

    .line 842
    .line 843
    .line 844
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 845
    .line 846
    .line 847
    move-result-object v5

    .line 848
    new-instance v6, Landroid/content/ContentValues;

    .line 849
    .line 850
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 851
    .line 852
    .line 853
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    const-string v7, "upload_type"

    .line 858
    .line 859
    invoke-virtual {v6, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 860
    .line 861
    .line 862
    iget-object v1, v3, LO3/t0;->A:LB3/a;

    .line 863
    .line 864
    iget-object v3, v3, LO3/t0;->v:LO3/X;

    .line 865
    .line 866
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 870
    .line 871
    .line 872
    move-result-wide v7

    .line 873
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    const-string v7, "creation_timestamp"

    .line 878
    .line 879
    invoke-virtual {v6, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 880
    .line 881
    .line 882
    :try_start_14
    invoke-virtual {v0}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    const-string v1, "upload_queue"

    .line 887
    .line 888
    const-string v7, "rowid=? AND app_id=? AND upload_type=?"

    .line 889
    .line 890
    invoke-static/range {v23 .. v24}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v8

    .line 894
    invoke-static/range {v25 .. v25}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v9

    .line 898
    filled-new-array {v8, v2, v9}, [Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v8

    .line 902
    invoke-virtual {v0, v1, v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    int-to-long v0, v0

    .line 907
    const-wide/16 v6, 0x1

    .line 908
    .line 909
    cmp-long v0, v0, v6

    .line 910
    .line 911
    if-eqz v0, :cond_b

    .line 912
    .line 913
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 914
    .line 915
    .line 916
    iget-object v0, v3, LO3/X;->z:LO3/V;

    .line 917
    .line 918
    const-string v1, "Google Signal pending batch not updated. appId, rowId"

    .line 919
    .line 920
    invoke-virtual {v0, v2, v5, v1}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_a

    .line 921
    .line 922
    .line 923
    goto :goto_16

    .line 924
    :catch_a
    move-exception v0

    .line 925
    goto :goto_17

    .line 926
    :cond_b
    :goto_16
    invoke-virtual {v4}, LO3/T1;->b()LO3/X;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 931
    .line 932
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    const-string v3, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    .line 937
    .line 938
    invoke-virtual {v0, v2, v1, v3}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v4, v2}, LO3/T1;->t(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    goto :goto_19

    .line 945
    :goto_17
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 946
    .line 947
    .line 948
    iget-object v1, v3, LO3/X;->w:LO3/V;

    .line 949
    .line 950
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 951
    .line 952
    .line 953
    move-result-object v3

    .line 954
    const-string v4, "Failed to update google Signal pending batch. appid, rowId"

    .line 955
    .line 956
    invoke-virtual {v1, v4, v2, v3, v0}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    throw v0

    .line 960
    :cond_c
    const/4 v10, 0x3

    .line 961
    if-ne v6, v10, :cond_e

    .line 962
    .line 963
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    check-cast v6, LO3/S1;

    .line 968
    .line 969
    if-nez v6, :cond_d

    .line 970
    .line 971
    new-instance v6, LO3/S1;

    .line 972
    .line 973
    invoke-direct {v6, v4}, LO3/S1;-><init>(LO3/T1;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v5, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    goto :goto_18

    .line 980
    :cond_d
    iget v5, v6, LO3/S1;->b:I

    .line 981
    .line 982
    add-int/2addr v5, v1

    .line 983
    iput v5, v6, LO3/S1;->b:I

    .line 984
    .line 985
    invoke-virtual {v6}, LO3/S1;->a()J

    .line 986
    .line 987
    .line 988
    move-result-wide v7

    .line 989
    iput-wide v7, v6, LO3/S1;->c:J

    .line 990
    .line 991
    :goto_18
    invoke-virtual {v4}, LO3/T1;->e()LB3/a;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v7

    .line 1002
    iget-wide v5, v6, LO3/S1;->c:J

    .line 1003
    .line 1004
    sub-long/2addr v5, v7

    .line 1005
    invoke-virtual {v4}, LO3/T1;->b()LO3/X;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 1010
    .line 1011
    const-wide/16 v7, 0x3e8

    .line 1012
    .line 1013
    div-long/2addr v5, v7

    .line 1014
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v5

    .line 1018
    const-string v6, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    .line 1019
    .line 1020
    invoke-virtual {v1, v6, v2, v0, v5}, LO3/V;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    :cond_e
    iget-object v0, v4, LO3/T1;->s:LO3/n;

    .line 1024
    .line 1025
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 1026
    .line 1027
    .line 1028
    iget-wide v5, v3, LO3/d;->q:J

    .line 1029
    .line 1030
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    invoke-virtual {v0, v1}, LO3/n;->A(Ljava/lang/Long;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v4}, LO3/T1;->b()LO3/X;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 1042
    .line 1043
    const-string v3, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    .line 1044
    .line 1045
    invoke-virtual {v0, v2, v1, v3}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_f
    :goto_19
    return-void

    .line 1049
    :catchall_6
    move-exception v0

    .line 1050
    move-object/from16 v21, v14

    .line 1051
    .line 1052
    :goto_1a
    if-eqz v21, :cond_10

    .line 1053
    .line 1054
    invoke-interface/range {v21 .. v21}, Landroid/database/Cursor;->close()V

    .line 1055
    .line 1056
    .line 1057
    :cond_10
    throw v0

    .line 1058
    :pswitch_5
    iget-object v0, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v0, LO3/a2;

    .line 1061
    .line 1062
    iget-object v2, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v2, LO3/C0;

    .line 1065
    .line 1066
    iget-object v3, v2, LO3/C0;->c:LO3/T1;

    .line 1067
    .line 1068
    iget-object v2, v2, LO3/C0;->c:LO3/T1;

    .line 1069
    .line 1070
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1071
    .line 1072
    .line 1073
    iget-object v3, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v3, LO3/V1;

    .line 1076
    .line 1077
    invoke-virtual {v3}, LO3/V1;->W()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    if-nez v4, :cond_11

    .line 1082
    .line 1083
    iget-object v3, v3, LO3/V1;->r:Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-virtual {v2, v3, v0}, LO3/T1;->V(Ljava/lang/String;LO3/a2;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_1b

    .line 1089
    :cond_11
    invoke-virtual {v2, v3, v0}, LO3/T1;->U(LO3/V1;LO3/a2;)V

    .line 1090
    .line 1091
    .line 1092
    :goto_1b
    return-void

    .line 1093
    :pswitch_6
    iget-object v0, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v0, LO3/C0;

    .line 1096
    .line 1097
    iget-object v2, v0, LO3/C0;->c:LO3/T1;

    .line 1098
    .line 1099
    invoke-virtual {v2}, LO3/T1;->A()V

    .line 1100
    .line 1101
    .line 1102
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 1103
    .line 1104
    iget-object v2, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v2, LO3/v;

    .line 1107
    .line 1108
    iget-object v3, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v3, Ljava/lang/String;

    .line 1111
    .line 1112
    invoke-virtual {v0, v2, v3}, LO3/T1;->h(LO3/v;Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    return-void

    .line 1116
    :pswitch_7
    iget-object v0, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v0, LO3/v;

    .line 1119
    .line 1120
    iget-object v2, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v2, LO3/a2;

    .line 1123
    .line 1124
    iget-object v3, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 1125
    .line 1126
    check-cast v3, LO3/C0;

    .line 1127
    .line 1128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    iget-object v3, v3, LO3/C0;->c:LO3/T1;

    .line 1132
    .line 1133
    const-string v4, "_cmp"

    .line 1134
    .line 1135
    iget-object v5, v0, LO3/v;->q:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v4

    .line 1141
    if-eqz v4, :cond_14

    .line 1142
    .line 1143
    iget-object v7, v0, LO3/v;->r:LO3/u;

    .line 1144
    .line 1145
    if-eqz v7, :cond_14

    .line 1146
    .line 1147
    iget-object v4, v7, LO3/u;->q:Landroid/os/Bundle;

    .line 1148
    .line 1149
    invoke-virtual {v4}, Landroid/os/BaseBundle;->size()I

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-nez v5, :cond_12

    .line 1154
    .line 1155
    goto :goto_1c

    .line 1156
    :cond_12
    const-string v5, "_cis"

    .line 1157
    .line 1158
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v4

    .line 1162
    const-string v5, "referrer broadcast"

    .line 1163
    .line 1164
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v5

    .line 1168
    if-nez v5, :cond_13

    .line 1169
    .line 1170
    const-string v5, "referrer API"

    .line 1171
    .line 1172
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v4

    .line 1176
    if-eqz v4, :cond_14

    .line 1177
    .line 1178
    :cond_13
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v4

    .line 1182
    iget-object v4, v4, LO3/X;->C:LO3/V;

    .line 1183
    .line 1184
    invoke-virtual {v0}, LO3/v;->toString()Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v5

    .line 1188
    const-string v6, "Event has been filtered "

    .line 1189
    .line 1190
    invoke-virtual {v4, v5, v6}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    new-instance v5, LO3/v;

    .line 1194
    .line 1195
    iget-object v8, v0, LO3/v;->s:Ljava/lang/String;

    .line 1196
    .line 1197
    iget-wide v9, v0, LO3/v;->t:J

    .line 1198
    .line 1199
    const-string v6, "_cmpx"

    .line 1200
    .line 1201
    invoke-direct/range {v5 .. v10}, LO3/v;-><init>(Ljava/lang/String;LO3/u;Ljava/lang/String;J)V

    .line 1202
    .line 1203
    .line 1204
    move-object v0, v5

    .line 1205
    :cond_14
    :goto_1c
    iget-object v4, v0, LO3/v;->q:Ljava/lang/String;

    .line 1206
    .line 1207
    iget-object v5, v3, LO3/T1;->q:LO3/l0;

    .line 1208
    .line 1209
    iget-object v6, v3, LO3/T1;->w:LO3/b0;

    .line 1210
    .line 1211
    invoke-static {v5}, LO3/T1;->S(LO3/O1;)V

    .line 1212
    .line 1213
    .line 1214
    iget-object v7, v2, LO3/a2;->q:Ljava/lang/String;

    .line 1215
    .line 1216
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v8

    .line 1220
    if-eqz v8, :cond_15

    .line 1221
    .line 1222
    const/4 v5, 0x0

    .line 1223
    goto :goto_1d

    .line 1224
    :cond_15
    iget-object v5, v5, LO3/l0;->A:LB2/e;

    .line 1225
    .line 1226
    invoke-virtual {v5, v7}, Ld2/d0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v5

    .line 1230
    check-cast v5, Lcom/google/android/gms/internal/measurement/D;

    .line 1231
    .line 1232
    :goto_1d
    if-eqz v5, :cond_19

    .line 1233
    .line 1234
    :try_start_15
    iget-object v7, v5, Lcom/google/android/gms/internal/measurement/D;->c:LB0/G0;

    .line 1235
    .line 1236
    invoke-static {v6}, LO3/T1;->S(LO3/O1;)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v8, v0, LO3/v;->r:LO3/u;

    .line 1240
    .line 1241
    invoke-virtual {v8}, LO3/u;->c0()Landroid/os/Bundle;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v8

    .line 1245
    const/4 v9, 0x1

    .line 1246
    invoke-static {v8, v9}, LO3/b0;->e0(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v8

    .line 1250
    sget-object v9, LO3/K0;->c:[Ljava/lang/String;

    .line 1251
    .line 1252
    sget-object v10, LO3/K0;->a:[Ljava/lang/String;

    .line 1253
    .line 1254
    invoke-static {v4, v9, v10}, LO3/K0;->g(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v9

    .line 1258
    if-eqz v9, :cond_16

    .line 1259
    .line 1260
    goto :goto_1e

    .line 1261
    :cond_16
    move-object v9, v4

    .line 1262
    :goto_1e
    new-instance v10, Lcom/google/android/gms/internal/measurement/b;

    .line 1263
    .line 1264
    iget-wide v11, v0, LO3/v;->t:J

    .line 1265
    .line 1266
    invoke-direct {v10, v9, v11, v12, v8}, Lcom/google/android/gms/internal/measurement/b;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/measurement/D;->a(Lcom/google/android/gms/internal/measurement/b;)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v5
    :try_end_15
    .catch Lcom/google/android/gms/internal/measurement/Q; {:try_start_15 .. :try_end_15} :catch_b

    .line 1273
    if-nez v5, :cond_17

    .line 1274
    .line 1275
    goto/16 :goto_21

    .line 1276
    .line 1277
    :cond_17
    iget-object v5, v7, LB0/G0;->s:Ljava/lang/Object;

    .line 1278
    .line 1279
    check-cast v5, Lcom/google/android/gms/internal/measurement/b;

    .line 1280
    .line 1281
    iget-object v8, v7, LB0/G0;->r:Ljava/lang/Object;

    .line 1282
    .line 1283
    check-cast v8, Lcom/google/android/gms/internal/measurement/b;

    .line 1284
    .line 1285
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/measurement/b;->equals(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v5

    .line 1289
    if-nez v5, :cond_18

    .line 1290
    .line 1291
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 1296
    .line 1297
    const-string v5, "EES edited event"

    .line 1298
    .line 1299
    invoke-virtual {v0, v4, v5}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-static {v6}, LO3/T1;->S(LO3/O1;)V

    .line 1303
    .line 1304
    .line 1305
    iget-object v0, v7, LB0/G0;->s:Ljava/lang/Object;

    .line 1306
    .line 1307
    check-cast v0, Lcom/google/android/gms/internal/measurement/b;

    .line 1308
    .line 1309
    invoke-static {v0}, LO3/b0;->s(Lcom/google/android/gms/internal/measurement/b;)LO3/v;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v3, v0, v2}, LO3/T1;->j(LO3/v;LO3/a2;)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_1f

    .line 1320
    :cond_18
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v3, v0, v2}, LO3/T1;->j(LO3/v;LO3/a2;)V

    .line 1324
    .line 1325
    .line 1326
    :goto_1f
    iget-object v0, v7, LB0/G0;->t:Ljava/lang/Object;

    .line 1327
    .line 1328
    check-cast v0, Ljava/util/ArrayList;

    .line 1329
    .line 1330
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    if-nez v0, :cond_1a

    .line 1335
    .line 1336
    iget-object v0, v7, LB0/G0;->t:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v0, Ljava/util/ArrayList;

    .line 1339
    .line 1340
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1341
    .line 1342
    .line 1343
    move-result v4

    .line 1344
    const/4 v5, 0x0

    .line 1345
    :goto_20
    if-ge v5, v4, :cond_1a

    .line 1346
    .line 1347
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v7

    .line 1351
    add-int/lit8 v5, v5, 0x1

    .line 1352
    .line 1353
    check-cast v7, Lcom/google/android/gms/internal/measurement/b;

    .line 1354
    .line 1355
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v8

    .line 1359
    iget-object v8, v8, LO3/X;->E:LO3/V;

    .line 1360
    .line 1361
    iget-object v9, v7, Lcom/google/android/gms/internal/measurement/b;->a:Ljava/lang/String;

    .line 1362
    .line 1363
    const-string v10, "EES logging created event"

    .line 1364
    .line 1365
    invoke-virtual {v8, v9, v10}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    invoke-static {v6}, LO3/T1;->S(LO3/O1;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-static {v7}, LO3/b0;->s(Lcom/google/android/gms/internal/measurement/b;)LO3/v;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v7

    .line 1375
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v3, v7, v2}, LO3/T1;->j(LO3/v;LO3/a2;)V

    .line 1379
    .line 1380
    .line 1381
    goto :goto_20

    .line 1382
    :catch_b
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v5

    .line 1386
    iget-object v5, v5, LO3/X;->w:LO3/V;

    .line 1387
    .line 1388
    iget-object v6, v2, LO3/a2;->r:Ljava/lang/String;

    .line 1389
    .line 1390
    const-string v7, "EES error. appId, eventName"

    .line 1391
    .line 1392
    invoke-virtual {v5, v6, v4, v7}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1393
    .line 1394
    .line 1395
    :goto_21
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v5

    .line 1399
    iget-object v5, v5, LO3/X;->E:LO3/V;

    .line 1400
    .line 1401
    const-string v6, "EES was not applied to event"

    .line 1402
    .line 1403
    invoke-virtual {v5, v4, v6}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v3, v0, v2}, LO3/T1;->j(LO3/v;LO3/a2;)V

    .line 1410
    .line 1411
    .line 1412
    goto :goto_22

    .line 1413
    :cond_19
    invoke-virtual {v3}, LO3/T1;->b()LO3/X;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v4

    .line 1417
    iget-object v4, v4, LO3/X;->E:LO3/V;

    .line 1418
    .line 1419
    iget-object v5, v2, LO3/a2;->q:Ljava/lang/String;

    .line 1420
    .line 1421
    const-string v6, "EES not loaded for"

    .line 1422
    .line 1423
    invoke-virtual {v4, v5, v6}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v3, v0, v2}, LO3/T1;->j(LO3/v;LO3/a2;)V

    .line 1430
    .line 1431
    .line 1432
    :cond_1a
    :goto_22
    return-void

    .line 1433
    :pswitch_8
    iget-object v0, v1, LO3/x0;->r:Ljava/lang/Object;

    .line 1434
    .line 1435
    check-cast v0, LO3/a2;

    .line 1436
    .line 1437
    iget-object v2, v1, LO3/x0;->s:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v2, LO3/C0;

    .line 1440
    .line 1441
    iget-object v3, v2, LO3/C0;->c:LO3/T1;

    .line 1442
    .line 1443
    iget-object v2, v2, LO3/C0;->c:LO3/T1;

    .line 1444
    .line 1445
    invoke-virtual {v3}, LO3/T1;->A()V

    .line 1446
    .line 1447
    .line 1448
    iget-object v3, v1, LO3/x0;->t:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v3, LO3/e;

    .line 1451
    .line 1452
    iget-object v4, v3, LO3/e;->s:LO3/V1;

    .line 1453
    .line 1454
    invoke-virtual {v4}, LO3/V1;->W()Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v4

    .line 1458
    if-nez v4, :cond_1b

    .line 1459
    .line 1460
    invoke-virtual {v2, v3, v0}, LO3/T1;->Y(LO3/e;LO3/a2;)V

    .line 1461
    .line 1462
    .line 1463
    goto :goto_23

    .line 1464
    :cond_1b
    invoke-virtual {v2, v3, v0}, LO3/T1;->X(LO3/e;LO3/a2;)V

    .line 1465
    .line 1466
    .line 1467
    :goto_23
    return-void

    .line 1468
    nop

    .line 1469
    :pswitch_data_0
    .packed-switch 0x0
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
