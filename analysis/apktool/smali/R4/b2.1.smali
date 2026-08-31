.class public final synthetic LR4/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LR4/b2;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LZ5/M;)V
    .locals 0

    .line 2
    const/16 p1, 0x10

    iput p1, p0, LR4/b2;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LR4/b2;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0

    .line 8
    :pswitch_0
    new-instance v0, Ld6/q;

    .line 9
    .line 10
    invoke-direct {v0}, Ld6/q;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_1
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :pswitch_3
    sget-object v0, La6/g;->b:La6/f;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_4
    sget-object v0, La6/z;->b:La6/y;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_5
    sget-object v0, La6/s;->a:LZ5/U;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_6
    sget-object v0, La6/v;->b:LX5/g;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_7
    sget-object v0, La6/C;->b:LX5/g;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_8
    new-instance v0, LZ5/c;

    .line 48
    .line 49
    sget-object v1, La5/d;->a:La5/d;

    .line 50
    .line 51
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_9
    new-instance v0, LZ5/c;

    .line 60
    .line 61
    sget-object v1, La5/a;->a:La5/a;

    .line 62
    .line 63
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_a
    sget-object v4, LX5/i;->f:LX5/i;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    new-array v0, v0, [LX5/f;

    .line 71
    .line 72
    const-string v3, "kotlin.Unit"

    .line 73
    .line 74
    invoke-static {v3}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    sget-object v1, LX5/i;->c:LX5/i;

    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_0

    .line 87
    .line 88
    new-instance v7, LX5/a;

    .line 89
    .line 90
    invoke-direct {v7, v3}, LX5/a;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, LX5/g;

    .line 94
    .line 95
    iget-object v1, v7, LX5/a;->b:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    invoke-static {v0}, Ln5/k;->R0([Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-direct/range {v2 .. v7}, LX5/g;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/I1;ILjava/util/List;LX5/a;)V

    .line 106
    .line 107
    .line 108
    return-object v2

    .line 109
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    const-string v1, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    const-string v1, "Blank serial names are prohibited"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :pswitch_b
    :try_start_0
    new-instance v0, LX2/a;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    filled-new-array {v0}, [LX2/a;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    invoke-static {v0}, LI5/k;->Q(Ljava/util/Iterator;)LI5/i;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, LI5/k;->S(LI5/i;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v0}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :pswitch_c
    :try_start_1
    new-instance v0, LT2/c;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    filled-new-array {v0}, [LT2/c;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    invoke-static {v0}, LI5/k;->Q(Ljava/util/Iterator;)LI5/i;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, LI5/k;->S(LI5/i;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    return-object v0

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    throw v1

    .line 207
    :pswitch_d
    new-instance v0, LD2/o;

    .line 208
    .line 209
    const/4 v1, 0x1

    .line 210
    invoke-direct {v0, v1}, LD2/o;-><init>(I)V

    .line 211
    .line 212
    .line 213
    new-instance v1, LI5/m;

    .line 214
    .line 215
    const/16 v2, 0x17

    .line 216
    .line 217
    invoke-direct {v1, v2}, LI5/m;-><init>(I)V

    .line 218
    .line 219
    .line 220
    const-class v2, LW1/b;

    .line 221
    .line 222
    invoke-static {v2}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v0, v2, v1}, LD2/o;->a(Lkotlin/jvm/internal/f;LB5/c;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, LD2/o;->c()LP1/d;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    return-object v0

    .line 234
    :pswitch_e
    new-instance v0, Landroidx/lifecycle/a0;

    .line 235
    .line 236
    invoke-direct {v0}, Landroidx/lifecycle/a0;-><init>()V

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_f
    invoke-static {}, LV4/b;->a()Ljava/util/HashMap;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    return-object v0

    .line 245
    :pswitch_10
    new-instance v0, Ld6/q;

    .line 246
    .line 247
    invoke-direct {v0}, Ld6/q;-><init>()V

    .line 248
    .line 249
    .line 250
    new-instance v1, LT2/b;

    .line 251
    .line 252
    invoke-direct {v1, v0}, LT2/b;-><init>(Ld6/q;)V

    .line 253
    .line 254
    .line 255
    return-object v1

    .line 256
    :pswitch_11
    new-instance v0, LZ5/c;

    .line 257
    .line 258
    sget-object v1, LR4/Z2;->a:LR4/Z2;

    .line 259
    .line 260
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_12
    new-instance v0, LZ5/c;

    .line 269
    .line 270
    sget-object v1, LR4/W2;->a:LR4/W2;

    .line 271
    .line 272
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 273
    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_13
    new-instance v0, LZ5/c;

    .line 277
    .line 278
    sget-object v1, LR4/Q2;->a:LR4/Q2;

    .line 279
    .line 280
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_14
    new-instance v0, LZ5/c;

    .line 289
    .line 290
    sget-object v1, LR4/l1;->a:LR4/l1;

    .line 291
    .line 292
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 297
    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_15
    new-instance v0, LZ5/c;

    .line 301
    .line 302
    sget-object v1, LR4/K2;->a:LR4/K2;

    .line 303
    .line 304
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 309
    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_16
    new-instance v0, LZ5/c;

    .line 313
    .line 314
    sget-object v1, LR4/r1;->a:LR4/r1;

    .line 315
    .line 316
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_17
    new-instance v0, LZ5/c;

    .line 325
    .line 326
    sget-object v1, LR4/f2;->a:LR4/f2;

    .line 327
    .line 328
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_18
    new-instance v0, LZ5/c;

    .line 337
    .line 338
    sget-object v1, LR4/c2;->a:LR4/c2;

    .line 339
    .line 340
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 341
    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_19
    new-instance v0, LZ5/c;

    .line 345
    .line 346
    sget-object v1, LR4/o2;->a:LR4/o2;

    .line 347
    .line 348
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_1a
    new-instance v0, LZ5/c;

    .line 353
    .line 354
    sget-object v1, LR4/l2;->a:LR4/l2;

    .line 355
    .line 356
    invoke-static {v1}, LC3/a;->A(LV5/a;)LV5/a;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-direct {v0, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 361
    .line 362
    .line 363
    return-object v0

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
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
