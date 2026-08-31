.class public final Ld6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ld6/d;


# static fields
.field public static final P:Ljava/util/List;

.field public static final Q:Ljava/util/List;


# instance fields
.field public final A:Ld6/b;

.field public final B:Ljava/net/ProxySelector;

.field public final C:Ld6/b;

.field public final D:Ljavax/net/SocketFactory;

.field public final E:Ljavax/net/ssl/SSLSocketFactory;

.field public final F:Ljavax/net/ssl/X509TrustManager;

.field public final G:Ljava/util/List;

.field public final H:Ljava/util/List;

.field public final I:Lp6/c;

.field public final J:Ld6/e;

.field public final K:Ll6/d;

.field public final L:I

.field public final M:I

.field public final N:I

.field public final O:Lk3/d;

.field public final q:LE/c0;

.field public final r:Lk3/c;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public final u:LC0/Z0;

.field public final v:Z

.field public final w:Ld6/b;

.field public final x:Z

.field public final y:Z

.field public final z:Ld6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ld6/r;->u:Ld6/r;

    .line 2
    .line 3
    sget-object v1, Ld6/r;->s:Ld6/r;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ld6/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Le6/b;->i([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ld6/q;->P:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, Ld6/i;->e:Ld6/i;

    .line 16
    .line 17
    sget-object v1, Ld6/i;->f:Ld6/i;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ld6/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Le6/b;->i([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Ld6/q;->Q:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    new-instance v0, LE/c0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LE/c0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lk3/c;

    .line 9
    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lk3/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v4, LC0/Z0;

    .line 26
    .line 27
    const/16 v5, 0x8

    .line 28
    .line 29
    invoke-direct {v4, v5}, LC0/Z0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sget-object v5, Ld6/b;->a:Ld6/b;

    .line 33
    .line 34
    sget-object v6, Ld6/b;->b:Ld6/b;

    .line 35
    .line 36
    sget-object v7, Ld6/b;->c:Ld6/b;

    .line 37
    .line 38
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    const-string v9, "getDefault()"

    .line 43
    .line 44
    invoke-static {v8, v9}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object v9, Ld6/q;->Q:Ljava/util/List;

    .line 48
    .line 49
    sget-object v10, Ld6/q;->P:Ljava/util/List;

    .line 50
    .line 51
    sget-object v11, Lp6/c;->a:Lp6/c;

    .line 52
    .line 53
    sget-object v12, Ld6/e;->c:Ld6/e;

    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Ld6/q;->q:LE/c0;

    .line 59
    .line 60
    iput-object v1, p0, Ld6/q;->r:Lk3/c;

    .line 61
    .line 62
    invoke-static {v2}, Le6/b;->t(Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Ld6/q;->s:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v3}, Le6/b;->t(Ljava/util/List;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Ld6/q;->t:Ljava/util/List;

    .line 73
    .line 74
    iput-object v4, p0, Ld6/q;->u:LC0/Z0;

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    iput-boolean v0, p0, Ld6/q;->v:Z

    .line 78
    .line 79
    iput-object v5, p0, Ld6/q;->w:Ld6/b;

    .line 80
    .line 81
    iput-boolean v0, p0, Ld6/q;->x:Z

    .line 82
    .line 83
    iput-boolean v0, p0, Ld6/q;->y:Z

    .line 84
    .line 85
    iput-object v6, p0, Ld6/q;->z:Ld6/b;

    .line 86
    .line 87
    iput-object v7, p0, Ld6/q;->A:Ld6/b;

    .line 88
    .line 89
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-nez v0, :cond_0

    .line 94
    .line 95
    sget-object v0, Ln6/a;->a:Ln6/a;

    .line 96
    .line 97
    :cond_0
    iput-object v0, p0, Ld6/q;->B:Ljava/net/ProxySelector;

    .line 98
    .line 99
    iput-object v5, p0, Ld6/q;->C:Ld6/b;

    .line 100
    .line 101
    iput-object v8, p0, Ld6/q;->D:Ljavax/net/SocketFactory;

    .line 102
    .line 103
    iput-object v9, p0, Ld6/q;->G:Ljava/util/List;

    .line 104
    .line 105
    iput-object v10, p0, Ld6/q;->H:Ljava/util/List;

    .line 106
    .line 107
    iput-object v11, p0, Ld6/q;->I:Lp6/c;

    .line 108
    .line 109
    const/16 v0, 0x2710

    .line 110
    .line 111
    iput v0, p0, Ld6/q;->L:I

    .line 112
    .line 113
    iput v0, p0, Ld6/q;->M:I

    .line 114
    .line 115
    iput v0, p0, Ld6/q;->N:I

    .line 116
    .line 117
    new-instance v0, Lk3/d;

    .line 118
    .line 119
    const/16 v1, 0x1d

    .line 120
    .line 121
    invoke-direct {v0, v1}, Lk3/d;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, Ld6/q;->O:Lk3/d;

    .line 125
    .line 126
    check-cast v9, Ljava/lang/Iterable;

    .line 127
    .line 128
    instance-of v0, v9, Ljava/util/Collection;

    .line 129
    .line 130
    const/4 v1, 0x0

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    move-object v0, v9

    .line 134
    check-cast v0, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_1
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Ld6/i;

    .line 158
    .line 159
    iget-boolean v2, v2, Ld6/i;->a:Z

    .line 160
    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    sget-object v0, Ll6/m;->a:Ll6/m;

    .line 164
    .line 165
    sget-object v0, Ll6/m;->a:Ll6/m;

    .line 166
    .line 167
    invoke-virtual {v0}, Ll6/m;->m()Ljavax/net/ssl/X509TrustManager;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Ld6/q;->F:Ljavax/net/ssl/X509TrustManager;

    .line 172
    .line 173
    sget-object v2, Ll6/m;->a:Ll6/m;

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ll6/m;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iput-object v2, p0, Ld6/q;->E:Ljavax/net/ssl/SSLSocketFactory;

    .line 180
    .line 181
    sget-object v2, Ll6/m;->a:Ll6/m;

    .line 182
    .line 183
    invoke-virtual {v2, v0}, Ll6/m;->b(Ljavax/net/ssl/X509TrustManager;)Ll6/d;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iput-object v0, p0, Ld6/q;->K:Ll6/d;

    .line 188
    .line 189
    iget-object v2, v12, Ld6/e;->b:Ll6/d;

    .line 190
    .line 191
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_3

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_3
    new-instance v2, Ld6/e;

    .line 199
    .line 200
    iget-object v3, v12, Ld6/e;->a:Ljava/util/Set;

    .line 201
    .line 202
    invoke-direct {v2, v3, v0}, Ld6/e;-><init>(Ljava/util/Set;Ll6/d;)V

    .line 203
    .line 204
    .line 205
    move-object v12, v2

    .line 206
    :goto_0
    iput-object v12, p0, Ld6/q;->J:Ld6/e;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_4
    :goto_1
    iput-object v1, p0, Ld6/q;->E:Ljavax/net/ssl/SSLSocketFactory;

    .line 210
    .line 211
    iput-object v1, p0, Ld6/q;->K:Ll6/d;

    .line 212
    .line 213
    iput-object v1, p0, Ld6/q;->F:Ljavax/net/ssl/X509TrustManager;

    .line 214
    .line 215
    sget-object v0, Ld6/e;->c:Ld6/e;

    .line 216
    .line 217
    iput-object v0, p0, Ld6/q;->J:Ld6/e;

    .line 218
    .line 219
    :goto_2
    iget-object v0, p0, Ld6/q;->F:Ljavax/net/ssl/X509TrustManager;

    .line 220
    .line 221
    iget-object v2, p0, Ld6/q;->K:Ll6/d;

    .line 222
    .line 223
    iget-object v3, p0, Ld6/q;->E:Ljavax/net/ssl/SSLSocketFactory;

    .line 224
    .line 225
    iget-object v4, p0, Ld6/q;->t:Ljava/util/List;

    .line 226
    .line 227
    iget-object v5, p0, Ld6/q;->s:Ljava/util/List;

    .line 228
    .line 229
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    .line 230
    .line 231
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-nez v7, :cond_10

    .line 239
    .line 240
    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_f

    .line 248
    .line 249
    iget-object v1, p0, Ld6/q;->G:Ljava/util/List;

    .line 250
    .line 251
    check-cast v1, Ljava/lang/Iterable;

    .line 252
    .line 253
    instance-of v4, v1, Ljava/util/Collection;

    .line 254
    .line 255
    if-eqz v4, :cond_5

    .line 256
    .line 257
    move-object v4, v1

    .line 258
    check-cast v4, Ljava/util/Collection;

    .line 259
    .line 260
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_5

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_a

    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    check-cast v4, Ld6/i;

    .line 282
    .line 283
    iget-boolean v4, v4, Ld6/i;->a:Z

    .line 284
    .line 285
    if-eqz v4, :cond_6

    .line 286
    .line 287
    if-eqz v3, :cond_9

    .line 288
    .line 289
    if-eqz v2, :cond_8

    .line 290
    .line 291
    if-eqz v0, :cond_7

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 295
    .line 296
    const-string v1, "x509TrustManager == null"

    .line 297
    .line 298
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    const-string v1, "certificateChainCleaner == null"

    .line 305
    .line 306
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 311
    .line 312
    const-string v1, "sslSocketFactory == null"

    .line 313
    .line 314
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw v0

    .line 318
    :cond_a
    :goto_3
    const-string v1, "Check failed."

    .line 319
    .line 320
    if-nez v3, :cond_e

    .line 321
    .line 322
    if-nez v2, :cond_d

    .line 323
    .line 324
    if-nez v0, :cond_c

    .line 325
    .line 326
    iget-object v0, p0, Ld6/q;->J:Ld6/e;

    .line 327
    .line 328
    sget-object v2, Ld6/e;->c:Ld6/e;

    .line 329
    .line 330
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_b

    .line 335
    .line 336
    :goto_4
    return-void

    .line 337
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 338
    .line 339
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v0

    .line 343
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 344
    .line 345
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 356
    .line 357
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    const-string v1, "Null network interceptor: "

    .line 364
    .line 365
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v1

    .line 385
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v1, "Null interceptor: "

    .line 388
    .line 389
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
