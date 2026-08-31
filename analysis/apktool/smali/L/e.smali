.class public final LL/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LL/e;->q:I

    iput-object p2, p0, LL/e;->s:Ljava/lang/Object;

    iput-object p3, p0, LL/e;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LP5/i;LB5/e;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LL/e;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL/e;->s:Ljava/lang/Object;

    check-cast p2, Ls5/i;

    iput-object p2, p0, LL/e;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, LL/e;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LP5/B;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LP5/B;

    .line 12
    .line 13
    iget v1, v0, LP5/B;->r:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LP5/B;->r:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LP5/B;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LP5/B;-><init>(LL/e;Lq5/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LP5/B;->q:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, LP5/B;->r:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, LP5/B;->u:LP5/i;

    .line 57
    .line 58
    iget-object v1, v0, LP5/B;->t:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, LL/e;->s:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, LP5/i;

    .line 70
    .line 71
    iget-object v1, p0, LL/e;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ls5/i;

    .line 74
    .line 75
    iput-object p1, v0, LP5/B;->t:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p2, v0, LP5/B;->u:LP5/i;

    .line 78
    .line 79
    iput v3, v0, LP5/B;->r:I

    .line 80
    .line 81
    invoke-interface {v1, p1, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-ne v1, v4, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-object v1, p1

    .line 89
    move-object p1, p2

    .line 90
    :goto_1
    const/4 p2, 0x0

    .line 91
    iput-object p2, v0, LP5/B;->t:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p2, v0, LP5/B;->u:LP5/i;

    .line 94
    .line 95
    iput v2, v0, LP5/B;->r:I

    .line 96
    .line 97
    invoke-interface {p1, v1, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v4, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 105
    .line 106
    :goto_3
    return-object v4

    .line 107
    :pswitch_0
    instance-of v0, p2, LP5/v;

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    move-object v0, p2

    .line 112
    check-cast v0, LP5/v;

    .line 113
    .line 114
    iget v1, v0, LP5/v;->s:I

    .line 115
    .line 116
    const/high16 v2, -0x80000000

    .line 117
    .line 118
    and-int v3, v1, v2

    .line 119
    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    sub-int/2addr v1, v2

    .line 123
    iput v1, v0, LP5/v;->s:I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    new-instance v0, LP5/v;

    .line 127
    .line 128
    invoke-direct {v0, p0, p2}, LP5/v;-><init>(LL/e;Lq5/c;)V

    .line 129
    .line 130
    .line 131
    :goto_4
    iget-object p2, v0, LP5/v;->r:Ljava/lang/Object;

    .line 132
    .line 133
    iget v1, v0, LP5/v;->s:I

    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    if-ne v1, v2, :cond_7

    .line 139
    .line 140
    iget-object p1, v0, LP5/v;->u:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v0, v0, LP5/v;->q:LL/e;

    .line 143
    .line 144
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 151
    .line 152
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_8
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object p2, p0, LL/e;->s:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p2, LB5/e;

    .line 162
    .line 163
    iput-object p0, v0, LP5/v;->q:LL/e;

    .line 164
    .line 165
    iput-object p1, v0, LP5/v;->u:Ljava/lang/Object;

    .line 166
    .line 167
    iput v2, v0, LP5/v;->s:I

    .line 168
    .line 169
    invoke-interface {p2, p1, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 174
    .line 175
    if-ne p2, v0, :cond_9

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    move-object v0, p0

    .line 179
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_a

    .line 186
    .line 187
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 188
    .line 189
    :goto_6
    return-object v0

    .line 190
    :cond_a
    iget-object p2, v0, LL/e;->r:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p2, Lkotlin/jvm/internal/y;

    .line 193
    .line 194
    iput-object p1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 195
    .line 196
    new-instance p1, LQ5/a;

    .line 197
    .line 198
    invoke-direct {p1, v0}, LQ5/a;-><init>(LP5/i;)V

    .line 199
    .line 200
    .line 201
    throw p1

    .line 202
    :pswitch_1
    check-cast p1, Ly/h;

    .line 203
    .line 204
    iget-object p2, p0, LL/e;->s:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p2, LL/b;

    .line 207
    .line 208
    instance-of v0, p1, Ly/m;

    .line 209
    .line 210
    if-eqz v0, :cond_c

    .line 211
    .line 212
    iget-boolean v0, p2, LL/b;->M:Z

    .line 213
    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    check-cast p1, Ly/m;

    .line 217
    .line 218
    invoke-virtual {p2, p1}, LL/b;->x0(Ly/m;)V

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_b
    iget-object p2, p2, LL/b;->N:Lr/C;

    .line 223
    .line 224
    invoke-virtual {p2, p1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_c
    iget-object v0, p0, LL/e;->r:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, LM5/w;

    .line 231
    .line 232
    iget-object v1, p2, LL/b;->J:LL/s;

    .line 233
    .line 234
    if-nez v1, :cond_d

    .line 235
    .line 236
    new-instance v1, LL/s;

    .line 237
    .line 238
    iget-boolean v2, p2, LL/b;->F:Z

    .line 239
    .line 240
    iget-object v3, p2, LL/b;->I:LM/r;

    .line 241
    .line 242
    invoke-direct {v1, v2, v3}, LL/s;-><init>(ZLB5/a;)V

    .line 243
    .line 244
    .line 245
    invoke-static {p2}, LB0/g;->l(LB0/p;)V

    .line 246
    .line 247
    .line 248
    iput-object v1, p2, LL/b;->J:LL/s;

    .line 249
    .line 250
    :cond_d
    invoke-virtual {v1, p1, v0}, LL/s;->d(Ly/h;LM5/w;)V

    .line 251
    .line 252
    .line 253
    :goto_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 254
    .line 255
    return-object p1

    .line 256
    :pswitch_2
    check-cast p1, Ly/h;

    .line 257
    .line 258
    iget-object p2, p0, LL/e;->s:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p2, LL/a;

    .line 261
    .line 262
    instance-of v0, p1, Ly/k;

    .line 263
    .line 264
    if-eqz v0, :cond_f

    .line 265
    .line 266
    move-object v2, p1

    .line 267
    check-cast v2, Ly/k;

    .line 268
    .line 269
    iget-object p1, p2, LL/a;->x:LL/i;

    .line 270
    .line 271
    if-eqz p1, :cond_e

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_e
    iget-object p1, p2, LL/a;->w:Landroid/view/ViewGroup;

    .line 275
    .line 276
    invoke-static {p1}, Ln5/A;->j(Landroid/view/ViewGroup;)LL/i;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iput-object p1, p2, LL/a;->x:LL/i;

    .line 281
    .line 282
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :goto_8
    invoke-virtual {p1, p2}, LL/i;->a(LL/j;)LL/k;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    iget-boolean v3, p2, LL/a;->s:Z

    .line 290
    .line 291
    iget-wide v4, p2, LL/a;->A:J

    .line 292
    .line 293
    iget v6, p2, LL/a;->B:I

    .line 294
    .line 295
    iget-object p1, p2, LL/a;->u:LP/W;

    .line 296
    .line 297
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    check-cast p1, Lj0/o;

    .line 302
    .line 303
    iget-wide v7, p1, Lj0/o;->a:J

    .line 304
    .line 305
    iget-object p1, p2, LL/a;->v:LP/W;

    .line 306
    .line 307
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, LL/g;

    .line 312
    .line 313
    iget v9, p1, LL/g;->d:F

    .line 314
    .line 315
    iget-object v10, p2, LL/a;->C:LA0/d;

    .line 316
    .line 317
    invoke-virtual/range {v1 .. v10}, LL/k;->b(Ly/k;ZJIJFLB5/a;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p2, LL/a;->y:LP/f0;

    .line 321
    .line 322
    invoke-virtual {p1, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_f
    instance-of v0, p1, Ly/l;

    .line 327
    .line 328
    if-eqz v0, :cond_10

    .line 329
    .line 330
    check-cast p1, Ly/l;

    .line 331
    .line 332
    iget-object p1, p1, Ly/l;->a:Ly/k;

    .line 333
    .line 334
    iget-object p1, p2, LL/a;->y:LP/f0;

    .line 335
    .line 336
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    check-cast p1, LL/k;

    .line 341
    .line 342
    if-eqz p1, :cond_12

    .line 343
    .line 344
    invoke-virtual {p1}, LL/k;->d()V

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_10
    instance-of v0, p1, Ly/j;

    .line 349
    .line 350
    if-eqz v0, :cond_11

    .line 351
    .line 352
    check-cast p1, Ly/j;

    .line 353
    .line 354
    iget-object p1, p1, Ly/j;->a:Ly/k;

    .line 355
    .line 356
    iget-object p1, p2, LL/a;->y:LP/f0;

    .line 357
    .line 358
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    check-cast p1, LL/k;

    .line 363
    .line 364
    if-eqz p1, :cond_12

    .line 365
    .line 366
    invoke-virtual {p1}, LL/k;->d()V

    .line 367
    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_11
    iget-object v0, p0, LL/e;->r:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, LM5/w;

    .line 373
    .line 374
    iget-object p2, p2, LL/a;->r:LL/s;

    .line 375
    .line 376
    invoke-virtual {p2, p1, v0}, LL/s;->d(Ly/h;LM5/w;)V

    .line 377
    .line 378
    .line 379
    :cond_12
    :goto_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 380
    .line 381
    return-object p1

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
