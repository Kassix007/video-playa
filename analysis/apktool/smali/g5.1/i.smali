.class public final synthetic Lg5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;


# direct methods
.method public synthetic constructor <init>(LR4/k1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg5/i;->q:I

    iput-object p1, p0, Lg5/i;->r:LR4/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lg5/i;->q:I

    .line 2
    .line 3
    check-cast p1, Lt/g;

    .line 4
    .line 5
    check-cast p2, LT1/d;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v4, p3

    .line 11
    check-cast v4, LP/o;

    .line 12
    .line 13
    check-cast p4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string p3, "$this$composable"

    .line 19
    .line 20
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "it"

    .line 24
    .line 25
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lg5/i;->r:LR4/k1;

    .line 29
    .line 30
    iget-object p1, v0, LR4/k1;->d:LR4/i;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iget-object p1, p1, LR4/i;->b:LR4/F1;

    .line 35
    .line 36
    :goto_0
    move-object v1, p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    goto :goto_0

    .line 40
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 44
    .line 45
    invoke-virtual {v4, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    sget-object p1, LP/k;->a:LP/S;

    .line 56
    .line 57
    if-ne p2, p1, :cond_2

    .line 58
    .line 59
    :cond_1
    new-instance p2, LU4/o;

    .line 60
    .line 61
    const/16 p1, 0x8

    .line 62
    .line 63
    invoke-direct {p2, v0, p1}, LU4/o;-><init>(LR4/k1;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v3, p2

    .line 70
    check-cast v3, LB5/c;

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-static/range {v0 .. v5}, LU4/a;->n(LR4/k1;LR4/F1;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 74
    .line 75
    .line 76
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_0
    move-object v4, p3

    .line 80
    check-cast v4, LP/o;

    .line 81
    .line 82
    check-cast p4, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const-string p3, "$this$composable"

    .line 88
    .line 89
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string p1, "it"

    .line 93
    .line 94
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lg5/i;->r:LR4/k1;

    .line 98
    .line 99
    iget-object p1, v0, LR4/k1;->d:LR4/i;

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    iget-object p1, p1, LR4/i;->a:LR4/O1;

    .line 104
    .line 105
    :goto_3
    move-object v1, p1

    .line 106
    goto :goto_4

    .line 107
    :cond_3
    const/4 p1, 0x0

    .line 108
    goto :goto_3

    .line 109
    :goto_4
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 113
    .line 114
    invoke-virtual {v4, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    if-nez p1, :cond_4

    .line 123
    .line 124
    sget-object p1, LP/k;->a:LP/S;

    .line 125
    .line 126
    if-ne p2, p1, :cond_5

    .line 127
    .line 128
    :cond_4
    new-instance p2, LU4/o;

    .line 129
    .line 130
    const/4 p1, 0x7

    .line 131
    invoke-direct {p2, v0, p1}, LU4/o;-><init>(LR4/k1;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    move-object v3, p2

    .line 138
    check-cast v3, LB5/c;

    .line 139
    .line 140
    const/4 v5, 0x0

    .line 141
    invoke-static/range {v0 .. v5}, LE3/h;->f(LR4/k1;LR4/O1;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :pswitch_1
    check-cast p3, LP/o;

    .line 146
    .line 147
    check-cast p4, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    const-string p4, "$this$composable"

    .line 153
    .line 154
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string p1, "backStackEntry"

    .line 158
    .line 159
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p2, LT1/d;->x:LW1/c;

    .line 163
    .line 164
    invoke-virtual {p1}, LW1/c;->a()Landroid/os/Bundle;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iget-object p4, p0, Lg5/i;->r:LR4/k1;

    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    if-eqz p2, :cond_6

    .line 172
    .line 173
    invoke-virtual {p1}, LW1/c;->a()Landroid/os/Bundle;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-eqz p1, :cond_7

    .line 178
    .line 179
    const-string p2, "url"

    .line 180
    .line 181
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    goto :goto_5

    .line 186
    :cond_6
    iget-object p1, p4, LR4/k1;->i:Ljava/lang/String;

    .line 187
    .line 188
    const-string p2, ""

    .line 189
    .line 190
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-nez p1, :cond_7

    .line 195
    .line 196
    iget-object v0, p4, LR4/k1;->i:Ljava/lang/String;

    .line 197
    .line 198
    :cond_7
    :goto_5
    const/4 p1, 0x0

    .line 199
    invoke-static {p4, v0, p3, p1}, LQ2/g;->g(LR4/k1;Ljava/lang/String;LP/o;I)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :pswitch_2
    check-cast p3, LP/o;

    .line 204
    .line 205
    check-cast p4, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    const-string p4, "$this$composable"

    .line 211
    .line 212
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const-string p1, "it"

    .line 216
    .line 217
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const/4 p1, 0x0

    .line 221
    iget-object p2, p0, Lg5/i;->r:LR4/k1;

    .line 222
    .line 223
    invoke-static {p2, p3, p1}, LU4/a;->k(LR4/k1;LP/o;I)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :pswitch_3
    check-cast p3, LP/o;

    .line 229
    .line 230
    check-cast p4, Ljava/lang/Integer;

    .line 231
    .line 232
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    const-string p4, "$this$composable"

    .line 236
    .line 237
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const-string p1, "it"

    .line 241
    .line 242
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const/4 p1, 0x0

    .line 246
    iget-object p2, p0, Lg5/i;->r:LR4/k1;

    .line 247
    .line 248
    invoke-static {p2, p3, p1}, LU4/a;->s(LR4/k1;LP/o;I)V

    .line 249
    .line 250
    .line 251
    goto/16 :goto_2

    .line 252
    .line 253
    :pswitch_4
    check-cast p3, LP/o;

    .line 254
    .line 255
    check-cast p4, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    const-string p4, "$this$composable"

    .line 261
    .line 262
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const-string p1, "backStackEntry"

    .line 266
    .line 267
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object p1, p2, LT1/d;->x:LW1/c;

    .line 271
    .line 272
    invoke-virtual {p1}, LW1/c;->a()Landroid/os/Bundle;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    iget-object p4, p0, Lg5/i;->r:LR4/k1;

    .line 277
    .line 278
    const/4 v0, 0x0

    .line 279
    if-eqz p2, :cond_8

    .line 280
    .line 281
    invoke-virtual {p1}, LW1/c;->a()Landroid/os/Bundle;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    if-eqz p1, :cond_9

    .line 286
    .line 287
    const-string p2, "url"

    .line 288
    .line 289
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    goto :goto_6

    .line 294
    :cond_8
    iget-object p1, p4, LR4/k1;->i:Ljava/lang/String;

    .line 295
    .line 296
    const-string p2, ""

    .line 297
    .line 298
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-nez p1, :cond_9

    .line 303
    .line 304
    iget-object v0, p4, LR4/k1;->i:Ljava/lang/String;

    .line 305
    .line 306
    :cond_9
    :goto_6
    iget-object p1, p4, LR4/k1;->G:LR4/V;

    .line 307
    .line 308
    const/4 p2, 0x0

    .line 309
    if-nez p1, :cond_a

    .line 310
    .line 311
    const p1, 0x54187c65

    .line 312
    .line 313
    .line 314
    invoke-virtual {p3, p1}, LP/o;->S(I)V

    .line 315
    .line 316
    .line 317
    :goto_7
    invoke-virtual {p3, p2}, LP/o;->p(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_a
    const p4, -0x58b98e4

    .line 322
    .line 323
    .line 324
    invoke-virtual {p3, p4}, LP/o;->S(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v0, p3, p2}, LR4/V;->a(Ljava/lang/String;LP/o;I)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :goto_8
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 332
    .line 333
    return-object p1

    .line 334
    :pswitch_5
    check-cast p3, LP/o;

    .line 335
    .line 336
    check-cast p4, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 339
    .line 340
    .line 341
    const-string p4, "$this$composable"

    .line 342
    .line 343
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string p1, "it"

    .line 347
    .line 348
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    const/4 p1, 0x0

    .line 352
    iget-object p2, p0, Lg5/i;->r:LR4/k1;

    .line 353
    .line 354
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/n2;->b(LR4/k1;LP/o;I)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :pswitch_6
    check-cast p3, LP/o;

    .line 360
    .line 361
    check-cast p4, Ljava/lang/Integer;

    .line 362
    .line 363
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 364
    .line 365
    .line 366
    const-string p4, "$this$composable"

    .line 367
    .line 368
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    const-string p1, "it"

    .line 372
    .line 373
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const/4 p1, 0x0

    .line 377
    iget-object p2, p0, Lg5/i;->r:LR4/k1;

    .line 378
    .line 379
    invoke-static {p2, p3, p1}, LU4/a;->h(LR4/k1;LP/o;I)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_2

    .line 383
    .line 384
    :pswitch_7
    check-cast p3, LP/o;

    .line 385
    .line 386
    check-cast p4, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 389
    .line 390
    .line 391
    const-string p4, "$this$composable"

    .line 392
    .line 393
    invoke-static {p1, p4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    const-string p1, "it"

    .line 397
    .line 398
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    const/4 p1, 0x0

    .line 402
    iget-object p2, p0, Lg5/i;->r:LR4/k1;

    .line 403
    .line 404
    invoke-static {p2, p3, p1}, LU4/a;->p(LR4/k1;LP/o;I)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_2

    .line 408
    .line 409
    :pswitch_data_0
    .packed-switch 0x0
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
