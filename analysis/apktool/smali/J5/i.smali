.class public final synthetic LJ5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LJ5/i;->q:I

    iput-object p2, p0, LJ5/i;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LJ5/i;->q:I

    iput-object p2, p0, LJ5/i;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LJ5/i;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw2/e;

    .line 9
    .line 10
    check-cast p1, Ljava/io/IOException;

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, v0, Lw2/e;->A:Z

    .line 14
    .line 15
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, LI0/i;

    .line 23
    .line 24
    invoke-static {p1, v0}, LI0/r;->c(LI0/i;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x5

    .line 28
    invoke-static {p1, v0}, LI0/r;->d(LI0/i;I)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_1
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ln5/e;

    .line 37
    .line 38
    check-cast p1, Ljava/util/Map$Entry;

    .line 39
    .line 40
    const-string v1, "it"

    .line 41
    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "(this Map)"

    .line 55
    .line 56
    if-ne v2, v0, :cond_0

    .line 57
    .line 58
    move-object v2, v3

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 v2, 0x3d

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v0, :cond_1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_2
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ln5/a;

    .line 94
    .line 95
    if-ne p1, v0, :cond_2

    .line 96
    .line 97
    const-string p1, "(this Collection)"

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_2
    return-object p1

    .line 105
    :pswitch_3
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Landroidx/lifecycle/I;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-static {p1}, Landroidx/work/impl/utils/PreferenceUtils;->a(Ljava/lang/Long;)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v0, p1}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 119
    .line 120
    return-object p1

    .line 121
    :pswitch_4
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La5/y;

    .line 124
    .line 125
    check-cast p1, Li0/b;

    .line 126
    .line 127
    const/4 p1, 0x1

    .line 128
    invoke-virtual {v0, p1}, La5/y;->c(Z)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 132
    .line 133
    return-object p1

    .line 134
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-interface {v1, p1}, LX5/f;->e(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v2, ": "

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-interface {v1, p1}, LX5/f;->i(I)LX5/f;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-interface {p1}, LX5/f;->b()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    return-object p1

    .line 175
    :pswitch_6
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Landroid/widget/VideoView;

    .line 178
    .line 179
    check-cast p1, Landroid/content/Context;

    .line 180
    .line 181
    const-string v1, "it"

    .line 182
    .line 183
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_7
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, LU5/c;

    .line 190
    .line 191
    check-cast p1, Ljava/lang/Throwable;

    .line 192
    .line 193
    const/4 p1, 0x0

    .line 194
    invoke-virtual {v0, p1}, LU5/c;->g(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 198
    .line 199
    return-object p1

    .line 200
    :pswitch_8
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Landroid/content/Context;

    .line 203
    .line 204
    check-cast p1, Landroid/os/Bundle;

    .line 205
    .line 206
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->l(Landroid/content/Context;)LT1/u;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0, p1}, LT1/u;->d(Landroid/os/Bundle;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_9
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, LT1/z;

    .line 217
    .line 218
    check-cast p1, LT1/d;

    .line 219
    .line 220
    const-string v1, "backStackEntry"

    .line 221
    .line 222
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, p1, LT1/d;->x:LW1/c;

    .line 226
    .line 227
    iget-object v2, p1, LT1/d;->r:LT1/p;

    .line 228
    .line 229
    const/4 v3, 0x0

    .line 230
    if-eqz v2, :cond_3

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_3
    move-object v2, v3

    .line 234
    :goto_3
    if-nez v2, :cond_4

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_4
    invoke-virtual {v1}, LW1/c;->a()Landroid/os/Bundle;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2}, LT1/z;->c(LT1/p;)LT1/p;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-nez v4, :cond_5

    .line 245
    .line 246
    :goto_4
    move-object p1, v3

    .line 247
    goto :goto_5

    .line 248
    :cond_5
    invoke-virtual {v4, v2}, LT1/p;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_6

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_6
    invoke-virtual {v0}, LT1/z;->b()LT1/h;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {v1}, LW1/c;->a()Landroid/os/Bundle;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v4, v0}, LT1/p;->d(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {p1, v4, v0}, LT1/h;->b(LT1/p;Landroid/os/Bundle;)LT1/d;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :goto_5
    return-object p1

    .line 272
    :pswitch_a
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Lkotlin/jvm/internal/y;

    .line 275
    .line 276
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    const-string v1, "key"

    .line 279
    .line 280
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    iget-object v0, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 284
    .line 285
    if-nez v0, :cond_7

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_7
    check-cast v0, Landroid/os/Bundle;

    .line 289
    .line 290
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-nez p1, :cond_8

    .line 295
    .line 296
    :goto_6
    const/4 p1, 0x1

    .line 297
    goto :goto_7

    .line 298
    :cond_8
    const/4 p1, 0x0

    .line 299
    :goto_7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    return-object p1

    .line 304
    :pswitch_b
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, LR4/l3;

    .line 307
    .line 308
    check-cast p1, Lorg/json/JSONObject;

    .line 309
    .line 310
    const-string v1, "jsonObject"

    .line 311
    .line 312
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, p1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 316
    .line 317
    .line 318
    new-instance v1, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    const-string v2, "javascript:console.log("

    .line 321
    .line 322
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string p1, ");"

    .line 329
    .line 330
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    iget-object v1, v0, LR4/l3;->m:Landroid/webkit/WebView;

    .line 338
    .line 339
    if-eqz v1, :cond_9

    .line 340
    .line 341
    iget-object v1, v0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 342
    .line 343
    new-instance v2, LR4/i3;

    .line 344
    .line 345
    const/4 v3, 0x1

    .line 346
    invoke-direct {v2, v0, p1, v3}, LR4/i3;-><init>(LR4/l3;Ljava/lang/String;I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 350
    .line 351
    .line 352
    :cond_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 353
    .line 354
    return-object p1

    .line 355
    :pswitch_c
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, LK2/f;

    .line 358
    .line 359
    check-cast p1, Ljava/io/IOException;

    .line 360
    .line 361
    const/4 p1, 0x1

    .line 362
    iput-boolean p1, v0, LK2/f;->B:Z

    .line 363
    .line 364
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 365
    .line 366
    return-object p1

    .line 367
    :pswitch_d
    iget-object v0, p0, LJ5/i;->r:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, LJ5/j;

    .line 370
    .line 371
    check-cast p1, Ljava/lang/Integer;

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    invoke-virtual {v0, p1}, LJ5/j;->g(I)LJ5/h;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    return-object p1

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
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
