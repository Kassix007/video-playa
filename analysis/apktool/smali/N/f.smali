.class public final LN/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:I

.field public final r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;

.field public final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP5/i;Lq5/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LN/f;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LN/f;->r:Ljava/lang/Object;

    .line 4
    invoke-static {p2}, LR5/b;->m(Lq5/h;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LN/f;->s:Ljava/lang/Object;

    .line 5
    new-instance p2, LQ5/E;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LQ5/E;-><init>(LP5/i;Lq5/c;)V

    iput-object p2, p0, LN/f;->t:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LN/f;->q:I

    iput-object p1, p0, LN/f;->r:Ljava/lang/Object;

    iput-object p2, p0, LN/f;->s:Ljava/lang/Object;

    iput-object p3, p0, LN/f;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LN/f;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p2, p0, LN/f;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lu/v0;

    .line 15
    .line 16
    iget-object v0, p0, LN/f;->r:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LP/k0;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, LN/f;->t:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, LP/W;

    .line 25
    .line 26
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LB5/e;

    .line 31
    .line 32
    iget-object v1, p2, Lu/v0;->a:LO3/D0;

    .line 33
    .line 34
    invoke-virtual {v1}, LO3/D0;->j()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object p2, p2, Lu/v0;->d:LP/f0;

    .line 39
    .line 40
    invoke-virtual {p2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p1, v1, p2}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, LP/k0;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    check-cast p1, Lb/a;

    .line 67
    .line 68
    iget-object p2, p0, LN/f;->r:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, LP/W;

    .line 71
    .line 72
    invoke-interface {p2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    check-cast p2, Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/4 v0, 0x1

    .line 83
    if-le p2, v0, :cond_1

    .line 84
    .line 85
    iget-object p2, p0, LN/f;->s:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, LP/W;

    .line 88
    .line 89
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-interface {p2, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, LN/f;->t:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p2, LP/b0;

    .line 97
    .line 98
    iget p1, p1, Lb/a;->c:F

    .line 99
    .line 100
    invoke-virtual {p2, p1}, LP/b0;->f(F)V

    .line 101
    .line 102
    .line 103
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_1
    iget-object v0, p0, LN/f;->r:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lq5/h;

    .line 109
    .line 110
    iget-object v1, p0, LN/f;->t:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, LQ5/E;

    .line 113
    .line 114
    iget-object v2, p0, LN/f;->s:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v0, p1, v2, v1, p2}, LQ5/c;->b(Lq5/h;Ljava/lang/Object;Ljava/lang/Object;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 121
    .line 122
    if-ne p1, p2, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 126
    .line 127
    :goto_1
    return-object p1

    .line 128
    :pswitch_2
    instance-of v0, p2, LP5/s;

    .line 129
    .line 130
    if-eqz v0, :cond_3

    .line 131
    .line 132
    move-object v0, p2

    .line 133
    check-cast v0, LP5/s;

    .line 134
    .line 135
    iget v1, v0, LP5/s;->u:I

    .line 136
    .line 137
    const/high16 v2, -0x80000000

    .line 138
    .line 139
    and-int v3, v1, v2

    .line 140
    .line 141
    if-eqz v3, :cond_3

    .line 142
    .line 143
    sub-int/2addr v1, v2

    .line 144
    iput v1, v0, LP5/s;->u:I

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    new-instance v0, LP5/s;

    .line 148
    .line 149
    invoke-direct {v0, p0, p2}, LP5/s;-><init>(LN/f;Lq5/c;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    iget-object p2, v0, LP5/s;->s:Ljava/lang/Object;

    .line 153
    .line 154
    iget v1, v0, LP5/s;->u:I

    .line 155
    .line 156
    const/4 v2, 0x3

    .line 157
    const/4 v3, 0x2

    .line 158
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 159
    .line 160
    const/4 v5, 0x1

    .line 161
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 162
    .line 163
    if-eqz v1, :cond_7

    .line 164
    .line 165
    if-eq v1, v5, :cond_4

    .line 166
    .line 167
    if-eq v1, v3, :cond_6

    .line 168
    .line 169
    if-ne v1, v2, :cond_5

    .line 170
    .line 171
    :cond_4
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 176
    .line 177
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_6
    iget-object p1, v0, LP5/s;->r:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object v1, v0, LP5/s;->q:LN/f;

    .line 186
    .line 187
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_7
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object p2, p0, LN/f;->r:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p2, Lkotlin/jvm/internal/u;

    .line 197
    .line 198
    iget-boolean p2, p2, Lkotlin/jvm/internal/u;->q:Z

    .line 199
    .line 200
    if-eqz p2, :cond_8

    .line 201
    .line 202
    iget-object p2, p0, LN/f;->s:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p2, LP5/i;

    .line 205
    .line 206
    iput v5, v0, LP5/s;->u:I

    .line 207
    .line 208
    invoke-interface {p2, p1, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-ne p1, v6, :cond_a

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_8
    iget-object p2, p0, LN/f;->t:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p2, LP5/N;

    .line 218
    .line 219
    iput-object p0, v0, LP5/s;->q:LN/f;

    .line 220
    .line 221
    iput-object p1, v0, LP5/s;->r:Ljava/lang/Object;

    .line 222
    .line 223
    iput v3, v0, LP5/s;->u:I

    .line 224
    .line 225
    invoke-virtual {p2, p1, v0}, LP5/N;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    if-ne p2, v6, :cond_9

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_9
    move-object v1, p0

    .line 233
    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-nez p2, :cond_a

    .line 240
    .line 241
    iget-object p2, v1, LN/f;->r:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p2, Lkotlin/jvm/internal/u;

    .line 244
    .line 245
    iput-boolean v5, p2, Lkotlin/jvm/internal/u;->q:Z

    .line 246
    .line 247
    iget-object p2, v1, LN/f;->s:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p2, LP5/i;

    .line 250
    .line 251
    const/4 v1, 0x0

    .line 252
    iput-object v1, v0, LP5/s;->q:LN/f;

    .line 253
    .line 254
    iput-object v1, v0, LP5/s;->r:Ljava/lang/Object;

    .line 255
    .line 256
    iput v2, v0, LP5/s;->u:I

    .line 257
    .line 258
    invoke-interface {p2, p1, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    if-ne p1, v6, :cond_a

    .line 263
    .line 264
    :goto_4
    move-object v4, v6

    .line 265
    :cond_a
    :goto_5
    return-object v4

    .line 266
    :pswitch_3
    instance-of v0, p2, LN/e;

    .line 267
    .line 268
    if-eqz v0, :cond_b

    .line 269
    .line 270
    move-object v0, p2

    .line 271
    check-cast v0, LN/e;

    .line 272
    .line 273
    iget v1, v0, LN/e;->u:I

    .line 274
    .line 275
    const/high16 v2, -0x80000000

    .line 276
    .line 277
    and-int v3, v1, v2

    .line 278
    .line 279
    if-eqz v3, :cond_b

    .line 280
    .line 281
    sub-int/2addr v1, v2

    .line 282
    iput v1, v0, LN/e;->u:I

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_b
    new-instance v0, LN/e;

    .line 286
    .line 287
    invoke-direct {v0, p0, p2}, LN/e;-><init>(LN/f;Lq5/c;)V

    .line 288
    .line 289
    .line 290
    :goto_6
    iget-object p2, v0, LN/e;->s:Ljava/lang/Object;

    .line 291
    .line 292
    iget v1, v0, LN/e;->u:I

    .line 293
    .line 294
    const/4 v2, 0x1

    .line 295
    if-eqz v1, :cond_d

    .line 296
    .line 297
    if-ne v1, v2, :cond_c

    .line 298
    .line 299
    iget-object p1, v0, LN/e;->r:Ljava/lang/Object;

    .line 300
    .line 301
    iget-object v0, v0, LN/e;->q:LN/f;

    .line 302
    .line 303
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 308
    .line 309
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 310
    .line 311
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw p1

    .line 315
    :cond_d
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    iget-object p2, p0, LN/f;->r:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast p2, Lkotlin/jvm/internal/y;

    .line 321
    .line 322
    iget-object p2, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast p2, LM5/b0;

    .line 325
    .line 326
    if-eqz p2, :cond_e

    .line 327
    .line 328
    new-instance v1, LN/a;

    .line 329
    .line 330
    invoke-direct {v1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-interface {p2, v1}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 334
    .line 335
    .line 336
    iput-object p0, v0, LN/e;->q:LN/f;

    .line 337
    .line 338
    iput-object p1, v0, LN/e;->r:Ljava/lang/Object;

    .line 339
    .line 340
    iput v2, v0, LN/e;->u:I

    .line 341
    .line 342
    invoke-interface {p2, v0}, LM5/b0;->f(Ls5/c;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 347
    .line 348
    if-ne p2, v0, :cond_e

    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_e
    move-object v0, p0

    .line 352
    :goto_7
    iget-object p2, v0, LN/f;->r:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p2, Lkotlin/jvm/internal/y;

    .line 355
    .line 356
    iget-object v1, v0, LN/f;->s:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v1, LM5/w;

    .line 359
    .line 360
    new-instance v3, LN/d;

    .line 361
    .line 362
    iget-object v0, v0, LN/f;->t:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, LB5/e;

    .line 365
    .line 366
    const/4 v4, 0x0

    .line 367
    invoke-direct {v3, v0, p1, v1, v4}, LN/d;-><init>(LB5/e;Ljava/lang/Object;LM5/w;Lq5/c;)V

    .line 368
    .line 369
    .line 370
    sget-object p1, LM5/x;->t:LM5/x;

    .line 371
    .line 372
    invoke-static {v1, v4, p1, v3, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iput-object p1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 377
    .line 378
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 379
    .line 380
    :goto_8
    return-object v0

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
