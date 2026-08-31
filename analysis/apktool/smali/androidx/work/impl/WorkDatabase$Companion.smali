.class public final Landroidx/work/impl/WorkDatabase$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lj2/b;)Lj2/d;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$Companion;->create$lambda$0(Landroid/content/Context;Lj2/b;)Lj2/d;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Landroid/content/Context;Lj2/b;)Lj2/d;
    .locals 8

    .line 1
    const-string v0, "configuration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, p1, Lj2/b;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p1, Lj2/b;->c:LE/Y;

    .line 14
    .line 15
    const-string p1, "callback"

    .line 16
    .line 17
    invoke-static {v4, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lj2/b;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    move v6, v5

    .line 32
    move-object v2, p0

    .line 33
    invoke-direct/range {v1 .. v6}, Lj2/b;-><init>(Landroid/content/Context;Ljava/lang/String;LE/Y;ZZ)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Lk2/g;

    .line 37
    .line 38
    iget-boolean v6, v1, Lj2/b;->d:Z

    .line 39
    .line 40
    iget-boolean v7, v1, Lj2/b;->e:Z

    .line 41
    .line 42
    iget-object v3, v1, Lj2/b;->a:Landroid/content/Context;

    .line 43
    .line 44
    iget-object v4, v1, Lj2/b;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, v1, Lj2/b;->c:LE/Y;

    .line 47
    .line 48
    invoke-direct/range {v2 .. v7}, Lk2/g;-><init>(Landroid/content/Context;Ljava/lang/String;LE/Y;ZZ)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    const-string p1, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method


# virtual methods
.method public final create(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/work/Clock;Z)Landroidx/work/impl/WorkDatabase;
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "context"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "queryExecutor"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "clock"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eqz p4, :cond_0

    .line 25
    .line 26
    new-instance v5, Landroidx/room/t;

    .line 27
    .line 28
    invoke-direct {v5, v0, v3}, Landroidx/room/t;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-boolean v4, v5, Landroidx/room/t;->i:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v5, "androidx.work.workdb"

    .line 35
    .line 36
    invoke-static {v5}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_11

    .line 41
    .line 42
    new-instance v6, Landroidx/room/t;

    .line 43
    .line 44
    invoke-direct {v6, v0, v5}, Landroidx/room/t;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, La3/d;

    .line 48
    .line 49
    invoke-direct {v5, v0}, La3/d;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    iput-object v5, v6, Landroidx/room/t;->h:La3/d;

    .line 53
    .line 54
    move-object v5, v6

    .line 55
    :goto_0
    iput-object v1, v5, Landroidx/room/t;->f:Ljava/util/concurrent/Executor;

    .line 56
    .line 57
    new-instance v1, Landroidx/work/impl/CleanupCallback;

    .line 58
    .line 59
    invoke-direct {v1, v2}, Landroidx/work/impl/CleanupCallback;-><init>(Landroidx/work/Clock;)V

    .line 60
    .line 61
    .line 62
    iget-object v11, v5, Landroidx/room/t;->c:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-array v1, v4, [Le2/b;

    .line 68
    .line 69
    sget-object v2, Landroidx/work/impl/Migration_1_2;->INSTANCE:Landroidx/work/impl/Migration_1_2;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    aput-object v2, v1, v6

    .line 73
    .line 74
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Landroidx/work/impl/RescheduleMigration;

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    const/4 v7, 0x3

    .line 81
    invoke-direct {v1, v0, v2, v7}, Landroidx/work/impl/RescheduleMigration;-><init>(Landroid/content/Context;II)V

    .line 82
    .line 83
    .line 84
    new-array v8, v4, [Le2/b;

    .line 85
    .line 86
    aput-object v1, v8, v6

    .line 87
    .line 88
    invoke-virtual {v5, v8}, Landroidx/room/t;->a([Le2/b;)V

    .line 89
    .line 90
    .line 91
    new-array v1, v4, [Le2/b;

    .line 92
    .line 93
    sget-object v8, Landroidx/work/impl/Migration_3_4;->INSTANCE:Landroidx/work/impl/Migration_3_4;

    .line 94
    .line 95
    aput-object v8, v1, v6

    .line 96
    .line 97
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 98
    .line 99
    .line 100
    new-array v1, v4, [Le2/b;

    .line 101
    .line 102
    sget-object v8, Landroidx/work/impl/Migration_4_5;->INSTANCE:Landroidx/work/impl/Migration_4_5;

    .line 103
    .line 104
    aput-object v8, v1, v6

    .line 105
    .line 106
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Landroidx/work/impl/RescheduleMigration;

    .line 110
    .line 111
    const/4 v8, 0x5

    .line 112
    const/4 v9, 0x6

    .line 113
    invoke-direct {v1, v0, v8, v9}, Landroidx/work/impl/RescheduleMigration;-><init>(Landroid/content/Context;II)V

    .line 114
    .line 115
    .line 116
    new-array v8, v4, [Le2/b;

    .line 117
    .line 118
    aput-object v1, v8, v6

    .line 119
    .line 120
    invoke-virtual {v5, v8}, Landroidx/room/t;->a([Le2/b;)V

    .line 121
    .line 122
    .line 123
    new-array v1, v4, [Le2/b;

    .line 124
    .line 125
    sget-object v8, Landroidx/work/impl/Migration_6_7;->INSTANCE:Landroidx/work/impl/Migration_6_7;

    .line 126
    .line 127
    aput-object v8, v1, v6

    .line 128
    .line 129
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 130
    .line 131
    .line 132
    new-array v1, v4, [Le2/b;

    .line 133
    .line 134
    sget-object v8, Landroidx/work/impl/Migration_7_8;->INSTANCE:Landroidx/work/impl/Migration_7_8;

    .line 135
    .line 136
    aput-object v8, v1, v6

    .line 137
    .line 138
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 139
    .line 140
    .line 141
    new-array v1, v4, [Le2/b;

    .line 142
    .line 143
    sget-object v8, Landroidx/work/impl/Migration_8_9;->INSTANCE:Landroidx/work/impl/Migration_8_9;

    .line 144
    .line 145
    aput-object v8, v1, v6

    .line 146
    .line 147
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Landroidx/work/impl/WorkMigration9To10;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Landroidx/work/impl/WorkMigration9To10;-><init>(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    new-array v8, v4, [Le2/b;

    .line 156
    .line 157
    aput-object v1, v8, v6

    .line 158
    .line 159
    invoke-virtual {v5, v8}, Landroidx/room/t;->a([Le2/b;)V

    .line 160
    .line 161
    .line 162
    new-instance v1, Landroidx/work/impl/RescheduleMigration;

    .line 163
    .line 164
    const/16 v8, 0xa

    .line 165
    .line 166
    const/16 v9, 0xb

    .line 167
    .line 168
    invoke-direct {v1, v0, v8, v9}, Landroidx/work/impl/RescheduleMigration;-><init>(Landroid/content/Context;II)V

    .line 169
    .line 170
    .line 171
    new-array v8, v4, [Le2/b;

    .line 172
    .line 173
    aput-object v1, v8, v6

    .line 174
    .line 175
    invoke-virtual {v5, v8}, Landroidx/room/t;->a([Le2/b;)V

    .line 176
    .line 177
    .line 178
    new-array v1, v4, [Le2/b;

    .line 179
    .line 180
    sget-object v8, Landroidx/work/impl/Migration_11_12;->INSTANCE:Landroidx/work/impl/Migration_11_12;

    .line 181
    .line 182
    aput-object v8, v1, v6

    .line 183
    .line 184
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 185
    .line 186
    .line 187
    new-array v1, v4, [Le2/b;

    .line 188
    .line 189
    sget-object v8, Landroidx/work/impl/Migration_12_13;->INSTANCE:Landroidx/work/impl/Migration_12_13;

    .line 190
    .line 191
    aput-object v8, v1, v6

    .line 192
    .line 193
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 194
    .line 195
    .line 196
    new-array v1, v4, [Le2/b;

    .line 197
    .line 198
    sget-object v8, Landroidx/work/impl/Migration_15_16;->INSTANCE:Landroidx/work/impl/Migration_15_16;

    .line 199
    .line 200
    aput-object v8, v1, v6

    .line 201
    .line 202
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 203
    .line 204
    .line 205
    new-array v1, v4, [Le2/b;

    .line 206
    .line 207
    sget-object v8, Landroidx/work/impl/Migration_16_17;->INSTANCE:Landroidx/work/impl/Migration_16_17;

    .line 208
    .line 209
    aput-object v8, v1, v6

    .line 210
    .line 211
    invoke-virtual {v5, v1}, Landroidx/room/t;->a([Le2/b;)V

    .line 212
    .line 213
    .line 214
    new-instance v1, Landroidx/work/impl/RescheduleMigration;

    .line 215
    .line 216
    const/16 v8, 0x15

    .line 217
    .line 218
    const/16 v9, 0x16

    .line 219
    .line 220
    invoke-direct {v1, v0, v8, v9}, Landroidx/work/impl/RescheduleMigration;-><init>(Landroid/content/Context;II)V

    .line 221
    .line 222
    .line 223
    new-array v0, v4, [Le2/b;

    .line 224
    .line 225
    aput-object v1, v0, v6

    .line 226
    .line 227
    invoke-virtual {v5, v0}, Landroidx/room/t;->a([Le2/b;)V

    .line 228
    .line 229
    .line 230
    iput-boolean v6, v5, Landroidx/room/t;->k:Z

    .line 231
    .line 232
    iput-boolean v4, v5, Landroidx/room/t;->l:Z

    .line 233
    .line 234
    iget-object v0, v5, Landroidx/room/t;->f:Ljava/util/concurrent/Executor;

    .line 235
    .line 236
    if-nez v0, :cond_1

    .line 237
    .line 238
    iget-object v1, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 239
    .line 240
    if-nez v1, :cond_1

    .line 241
    .line 242
    sget-object v0, Ln/a;->f:La2/c;

    .line 243
    .line 244
    iput-object v0, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 245
    .line 246
    iput-object v0, v5, Landroidx/room/t;->f:Ljava/util/concurrent/Executor;

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_1
    if-eqz v0, :cond_2

    .line 250
    .line 251
    iget-object v1, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 252
    .line 253
    if-nez v1, :cond_2

    .line 254
    .line 255
    iput-object v0, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_2
    if-nez v0, :cond_3

    .line 259
    .line 260
    iget-object v0, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 261
    .line 262
    iput-object v0, v5, Landroidx/room/t;->f:Ljava/util/concurrent/Executor;

    .line 263
    .line 264
    :cond_3
    :goto_1
    iget-object v0, v5, Landroidx/room/t;->p:Ljava/util/HashSet;

    .line 265
    .line 266
    iget-object v1, v5, Landroidx/room/t;->o:Ljava/util/LinkedHashSet;

    .line 267
    .line 268
    if-eqz v0, :cond_5

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_5

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    check-cast v6, Ljava/lang/Number;

    .line 285
    .line 286
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    if-nez v8, :cond_4

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_4
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "

    .line 302
    .line 303
    invoke-static {v6, v0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v1

    .line 317
    :cond_5
    iget-object v0, v5, Landroidx/room/t;->h:La3/d;

    .line 318
    .line 319
    if-nez v0, :cond_6

    .line 320
    .line 321
    new-instance v0, LO3/B;

    .line 322
    .line 323
    const/16 v6, 0x17

    .line 324
    .line 325
    invoke-direct {v0, v6}, LO3/B;-><init>(I)V

    .line 326
    .line 327
    .line 328
    :cond_6
    move-object v9, v0

    .line 329
    iget-wide v12, v5, Landroidx/room/t;->m:J

    .line 330
    .line 331
    const-wide/16 v14, 0x0

    .line 332
    .line 333
    cmp-long v0, v12, v14

    .line 334
    .line 335
    const-string v6, "Required value was null."

    .line 336
    .line 337
    if-lez v0, :cond_8

    .line 338
    .line 339
    iget-object v0, v5, Landroidx/room/t;->b:Ljava/lang/String;

    .line 340
    .line 341
    if-eqz v0, :cond_7

    .line 342
    .line 343
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 344
    .line 345
    invoke-direct {v0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 350
    .line 351
    const-string v1, "Cannot create auto-closing database for an in-memory database."

    .line 352
    .line 353
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :cond_8
    move-object v0, v6

    .line 358
    new-instance v6, Landroidx/room/h;

    .line 359
    .line 360
    iget-boolean v12, v5, Landroidx/room/t;->i:Z

    .line 361
    .line 362
    iget v8, v5, Landroidx/room/t;->j:I

    .line 363
    .line 364
    if-eqz v8, :cond_10

    .line 365
    .line 366
    move v10, v7

    .line 367
    iget-object v7, v5, Landroidx/room/t;->a:Landroid/content/Context;

    .line 368
    .line 369
    if-eq v8, v4, :cond_9

    .line 370
    .line 371
    move v13, v8

    .line 372
    goto :goto_4

    .line 373
    :cond_9
    const-string v8, "activity"

    .line 374
    .line 375
    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    instance-of v13, v8, Landroid/app/ActivityManager;

    .line 380
    .line 381
    if-eqz v13, :cond_a

    .line 382
    .line 383
    check-cast v8, Landroid/app/ActivityManager;

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :cond_a
    move-object v8, v3

    .line 387
    :goto_3
    if-eqz v8, :cond_b

    .line 388
    .line 389
    invoke-virtual {v8}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    if-nez v8, :cond_b

    .line 394
    .line 395
    move v13, v10

    .line 396
    goto :goto_4

    .line 397
    :cond_b
    move v13, v2

    .line 398
    :goto_4
    iget-object v14, v5, Landroidx/room/t;->f:Ljava/util/concurrent/Executor;

    .line 399
    .line 400
    if-eqz v14, :cond_f

    .line 401
    .line 402
    iget-object v15, v5, Landroidx/room/t;->g:Ljava/util/concurrent/Executor;

    .line 403
    .line 404
    if-eqz v15, :cond_e

    .line 405
    .line 406
    iget-boolean v0, v5, Landroidx/room/t;->k:Z

    .line 407
    .line 408
    iget-boolean v2, v5, Landroidx/room/t;->l:Z

    .line 409
    .line 410
    iget-object v8, v5, Landroidx/room/t;->d:Ljava/util/ArrayList;

    .line 411
    .line 412
    iget-object v10, v5, Landroidx/room/t;->e:Ljava/util/ArrayList;

    .line 413
    .line 414
    move-object/from16 v19, v8

    .line 415
    .line 416
    iget-object v8, v5, Landroidx/room/t;->b:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v5, v5, Landroidx/room/t;->n:LD2/o;

    .line 419
    .line 420
    move/from16 v16, v0

    .line 421
    .line 422
    move-object/from16 v18, v1

    .line 423
    .line 424
    move/from16 v17, v2

    .line 425
    .line 426
    move-object/from16 v20, v10

    .line 427
    .line 428
    move-object v10, v5

    .line 429
    invoke-direct/range {v6 .. v20}, Landroidx/room/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lj2/c;LD2/o;Ljava/util/List;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/Set;Ljava/util/List;Ljava/util/List;)V

    .line 430
    .line 431
    .line 432
    const-class v0, Landroidx/work/impl/WorkDatabase;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    const-string v5, "fullPackage"

    .line 453
    .line 454
    invoke-static {v1, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    if-nez v5, :cond_c

    .line 462
    .line 463
    goto :goto_5

    .line 464
    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    add-int/2addr v5, v4

    .line 469
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const-string v5, "this as java.lang.String).substring(startIndex)"

    .line 474
    .line 475
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    :goto_5
    const/16 v5, 0x5f

    .line 479
    .line 480
    const/16 v7, 0x2e

    .line 481
    .line 482
    invoke-virtual {v2, v7, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const-string v5, "replace(...)"

    .line 487
    .line 488
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    const-string v5, "_Impl"

    .line 492
    .line 493
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-nez v5, :cond_d

    .line 502
    .line 503
    move-object v1, v2

    .line 504
    goto :goto_6

    .line 505
    :cond_d
    new-instance v5, Ljava/lang/StringBuilder;

    .line 506
    .line 507
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-static {v1, v4, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    const-string v4, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"

    .line 532
    .line 533
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 544
    check-cast v0, Landroidx/room/w;

    .line 545
    .line 546
    invoke-virtual {v0, v6}, Landroidx/room/w;->init(Landroidx/room/h;)V

    .line 547
    .line 548
    .line 549
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 550
    .line 551
    return-object v0

    .line 552
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 553
    .line 554
    new-instance v2, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    const-string v3, "Failed to create an instance of "

    .line 557
    .line 558
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v1

    .line 576
    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 577
    .line 578
    new-instance v2, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    const-string v3, "Cannot access the constructor "

    .line 581
    .line 582
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    throw v1

    .line 600
    :catch_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 601
    .line 602
    new-instance v3, Ljava/lang/StringBuilder;

    .line 603
    .line 604
    const-string v4, "Cannot find implementation for "

    .line 605
    .line 606
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    const-string v0, ". "

    .line 617
    .line 618
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    const-string v0, " does not exist"

    .line 625
    .line 626
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    throw v1

    .line 637
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 638
    .line 639
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    throw v1

    .line 643
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 644
    .line 645
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    throw v1

    .line 649
    :cond_10
    throw v3

    .line 650
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 651
    .line 652
    const-string v1, "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"

    .line 653
    .line 654
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v0
.end method
