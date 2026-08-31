.class public final synthetic LU4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LP/W;LR4/k1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LU4/e;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/e;->s:LP/W;

    iput-object p2, p0, LU4/e;->r:LR4/k1;

    return-void
.end method

.method public synthetic constructor <init>(LR4/k1;LP/W;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LU4/e;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/e;->r:LR4/k1;

    iput-object p2, p0, LU4/e;->s:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LU4/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    and-int/2addr p2, v2

    .line 25
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_6

    .line 30
    .line 31
    iget-object p2, p0, LU4/e;->r:LR4/k1;

    .line 32
    .line 33
    invoke-static {p2, p1, v3}, LU4/a;->v(LR4/k1;LP/o;I)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Landroidx/compose/foundation/layout/c;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 37
    .line 38
    sget-object v1, Lc0/b;->q:Lc0/e;

    .line 39
    .line 40
    invoke-static {v1, v3}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget v4, p1, LP/o;->P:I

    .line 45
    .line 46
    invoke-virtual {p1}, LP/o;->m()LP/i0;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {p1, v0}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v6, LB0/k;->a:LB0/j;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v6, LB0/j;->b:LB0/D;

    .line 60
    .line 61
    invoke-virtual {p1}, LP/o;->W()V

    .line 62
    .line 63
    .line 64
    iget-boolean v7, p1, LP/o;->O:Z

    .line 65
    .line 66
    if-eqz v7, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1, v6}, LP/o;->l(LB5/a;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p1}, LP/o;->g0()V

    .line 73
    .line 74
    .line 75
    :goto_1
    sget-object v6, LB0/j;->e:LB0/i;

    .line 76
    .line 77
    invoke-static {v6, p1, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v1, LB0/j;->d:LB0/i;

    .line 81
    .line 82
    invoke-static {v1, p1, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, LB0/j;->f:LB0/i;

    .line 86
    .line 87
    iget-boolean v5, p1, LP/o;->O:Z

    .line 88
    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-nez v5, :cond_3

    .line 104
    .line 105
    :cond_2
    invoke-static {v4, p1, v4, v1}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    sget-object v1, LB0/j;->c:LB0/i;

    .line 109
    .line 110
    invoke-static {v1, p1, v0}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p2, LR4/k1;->V:Lj5/b;

    .line 114
    .line 115
    invoke-static {p2, v0, p1, v3}, LU4/a;->i(LR4/k1;Lj5/b;LP/o;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v2}, LP/o;->p(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    sget-object v0, LP/k;->a:LP/S;

    .line 132
    .line 133
    if-ne v1, v0, :cond_5

    .line 134
    .line 135
    :cond_4
    new-instance v1, LU4/n;

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    iget-object v2, p0, LU4/e;->s:LP/W;

    .line 139
    .line 140
    invoke-direct {v1, p2, v2, v0}, LU4/n;-><init>(LR4/k1;LP/W;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    check-cast v1, LB5/a;

    .line 147
    .line 148
    invoke-static {v3, v1, p1, v3}, Ll6/d;->d(ZLB5/a;LP/o;I)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-virtual {p1}, LP/o;->N()V

    .line 153
    .line 154
    .line 155
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 156
    .line 157
    return-object p1

    .line 158
    :pswitch_0
    move-object v7, p1

    .line 159
    check-cast v7, LP/o;

    .line 160
    .line 161
    check-cast p2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    and-int/lit8 p2, p1, 0x3

    .line 168
    .line 169
    const/4 v0, 0x2

    .line 170
    const/4 v1, 0x0

    .line 171
    const/4 v2, 0x1

    .line 172
    if-eq p2, v0, :cond_7

    .line 173
    .line 174
    move p2, v2

    .line 175
    goto :goto_3

    .line 176
    :cond_7
    move p2, v1

    .line 177
    :goto_3
    and-int/2addr p1, v2

    .line 178
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_d

    .line 183
    .line 184
    iget-object p1, p0, LU4/e;->s:LP/W;

    .line 185
    .line 186
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    check-cast p2, Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v7, p2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {v7}, LP/o;->H()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-nez p2, :cond_8

    .line 201
    .line 202
    sget-object p2, LP/k;->a:LP/S;

    .line 203
    .line 204
    if-ne v0, p2, :cond_b

    .line 205
    .line 206
    :cond_8
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    check-cast p2, Ljava/lang/String;

    .line 211
    .line 212
    const/4 v2, 0x0

    .line 213
    if-eqz p2, :cond_a

    .line 214
    .line 215
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object p2, p0, LU4/e;->r:LR4/k1;

    .line 225
    .line 226
    iget-object p2, p2, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 227
    .line 228
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    const-string v0, "getAssets(...)"

    .line 233
    .line 234
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :try_start_0
    const-string v0, ""

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_9

    .line 244
    .line 245
    invoke-virtual {p2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    const-string p2, "open(...)"

    .line 250
    .line 251
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-static {p1, v2}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 255
    .line 256
    .line 257
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    goto :goto_6

    .line 259
    :catch_0
    move-exception v0

    .line 260
    move-object p1, v0

    .line 261
    goto :goto_5

    .line 262
    :cond_9
    :goto_4
    move-object p1, v2

    .line 263
    goto :goto_6

    .line 264
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :goto_6
    if-eqz p1, :cond_a

    .line 269
    .line 270
    new-instance p2, Lo0/a;

    .line 271
    .line 272
    invoke-static {p1}, LC3/a;->U(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    new-instance v0, Lj0/e;

    .line 277
    .line 278
    invoke-direct {v0, p1}, Lj0/e;-><init>(Landroid/graphics/Bitmap;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {p2, v0}, Lo0/a;-><init>(Lj0/e;)V

    .line 282
    .line 283
    .line 284
    move-object v0, p2

    .line 285
    goto :goto_7

    .line 286
    :cond_a
    move-object v0, v2

    .line 287
    :goto_7
    invoke-virtual {v7, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_b
    check-cast v0, Lo0/a;

    .line 291
    .line 292
    if-nez v0, :cond_c

    .line 293
    .line 294
    const p1, 0x12ba3c64

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7, p1}, LP/o;->S(I)V

    .line 298
    .line 299
    .line 300
    const p1, 0x7f07009f

    .line 301
    .line 302
    .line 303
    const/4 p2, 0x6

    .line 304
    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v7, v1}, LP/o;->p(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_c
    const p1, 0x12ba0efb

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7, p1}, LP/o;->S(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7, v1}, LP/o;->p(Z)V

    .line 319
    .line 320
    .line 321
    :goto_8
    sget-object p1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 322
    .line 323
    sget-wide v1, Lj0/o;->f:J

    .line 324
    .line 325
    sget-object p2, Lj0/B;->a:LO3/D;

    .line 326
    .line 327
    invoke-static {p1, v1, v2, p2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    const/4 p2, 0x3

    .line 332
    invoke-static {p2}, LH/e;->a(I)LH/d;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-static {p1, p2}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/16 v8, 0x6030

    .line 341
    .line 342
    const/16 v9, 0x68

    .line 343
    .line 344
    const/4 v1, 0x0

    .line 345
    const/4 v3, 0x0

    .line 346
    sget-object v4, Lz0/i;->d:Lz0/F;

    .line 347
    .line 348
    const/4 v5, 0x0

    .line 349
    const/4 v6, 0x0

    .line 350
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 351
    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_d
    invoke-virtual {v7}, LP/o;->N()V

    .line 355
    .line 356
    .line 357
    :goto_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 358
    .line 359
    return-object p1

    .line 360
    nop

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
