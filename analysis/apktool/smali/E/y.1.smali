.class public final LE/y;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, LE/y;->q:I

    iput-object p1, p0, LE/y;->r:Ljava/lang/Object;

    iput-object p2, p0, LE/y;->s:Ljava/lang/Object;

    iput-object p3, p0, LE/y;->t:Ljava/lang/Object;

    iput-object p4, p0, LE/y;->u:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LE/y;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/j;

    .line 7
    .line 8
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, LE/y;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lkotlin/jvm/internal/v;

    .line 23
    .line 24
    iget v2, v1, Lkotlin/jvm/internal/v;->q:F

    .line 25
    .line 26
    sub-float/2addr v0, v2

    .line 27
    invoke-static {v0}, Lw/P;->a(F)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, LE/y;->s:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lb2/a;

    .line 36
    .line 37
    iget-object v3, p0, LE/y;->t:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lw/E0;

    .line 40
    .line 41
    invoke-static {v2, v3, v0}, Lb2/a;->a(Lb2/a;Lw/E0;F)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sub-float v2, v0, v2

    .line 46
    .line 47
    invoke-static {v2}, Lw/P;->a(F)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1}, Lu/j;->a()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v2, v1, Lkotlin/jvm/internal/v;->q:F

    .line 58
    .line 59
    add-float/2addr v2, v0

    .line 60
    iput v2, v1, Lkotlin/jvm/internal/v;->q:F

    .line 61
    .line 62
    :cond_1
    iget-object v0, p0, LE/y;->u:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lw/V;

    .line 65
    .line 66
    iget v1, v1, Lkotlin/jvm/internal/v;->q:F

    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lw/V;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p1}, Lu/j;->a()V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    iget-object p1, p0, LE/y;->u:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, LM5/w;

    .line 99
    .line 100
    iget-object v2, p0, LE/y;->t:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, Lkotlin/jvm/internal/v;

    .line 103
    .line 104
    iget-object v3, p0, LE/y;->s:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Lu/H;

    .line 107
    .line 108
    iget-object v4, p0, LE/y;->r:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v4, LP/W;

    .line 111
    .line 112
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, LP/S0;

    .line 117
    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v4

    .line 130
    goto :goto_1

    .line 131
    :cond_3
    move-wide v4, v0

    .line 132
    :goto_1
    iget-wide v6, v3, Lu/H;->c:J

    .line 133
    .line 134
    iget-object v8, v3, Lu/H;->a:LR/e;

    .line 135
    .line 136
    const-wide/high16 v9, -0x8000000000000000L

    .line 137
    .line 138
    cmp-long v6, v6, v9

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v9, 0x1

    .line 142
    if-eqz v6, :cond_4

    .line 143
    .line 144
    iget v6, v2, Lkotlin/jvm/internal/v;->q:F

    .line 145
    .line 146
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-static {v10}, Lu/d;->m(Lq5/h;)F

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    cmpg-float v6, v6, v10

    .line 155
    .line 156
    if-nez v6, :cond_4

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    iput-wide v0, v3, Lu/H;->c:J

    .line 160
    .line 161
    iget-object v0, v8, LR/e;->q:[Ljava/lang/Object;

    .line 162
    .line 163
    iget v1, v8, LR/e;->s:I

    .line 164
    .line 165
    move v6, v7

    .line 166
    :goto_2
    if-ge v6, v1, :cond_5

    .line 167
    .line 168
    aget-object v10, v0, v6

    .line 169
    .line 170
    check-cast v10, Lu/E;

    .line 171
    .line 172
    iput-boolean v9, v10, Lu/E;->w:Z

    .line 173
    .line 174
    add-int/lit8 v6, v6, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, Lu/d;->m(Lq5/h;)F

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    iput p1, v2, Lkotlin/jvm/internal/v;->q:F

    .line 186
    .line 187
    :goto_3
    iget p1, v2, Lkotlin/jvm/internal/v;->q:F

    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    cmpg-float v0, p1, v0

    .line 191
    .line 192
    if-nez v0, :cond_6

    .line 193
    .line 194
    iget-object p1, v8, LR/e;->q:[Ljava/lang/Object;

    .line 195
    .line 196
    iget v0, v8, LR/e;->s:I

    .line 197
    .line 198
    :goto_4
    if-ge v7, v0, :cond_b

    .line 199
    .line 200
    aget-object v1, p1, v7

    .line 201
    .line 202
    check-cast v1, Lu/E;

    .line 203
    .line 204
    iget-object v2, v1, Lu/E;->u:Lu/n0;

    .line 205
    .line 206
    iget-object v2, v2, Lu/n0;->c:Ljava/lang/Object;

    .line 207
    .line 208
    iget-object v3, v1, Lu/E;->t:LP/f0;

    .line 209
    .line 210
    invoke-virtual {v3, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iput-boolean v9, v1, Lu/E;->w:Z

    .line 214
    .line 215
    add-int/lit8 v7, v7, 0x1

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_6
    iget-wide v0, v3, Lu/H;->c:J

    .line 219
    .line 220
    sub-long/2addr v4, v0

    .line 221
    long-to-float v0, v4

    .line 222
    div-float/2addr v0, p1

    .line 223
    float-to-long v0, v0

    .line 224
    iget-object p1, v8, LR/e;->q:[Ljava/lang/Object;

    .line 225
    .line 226
    iget v2, v8, LR/e;->s:I

    .line 227
    .line 228
    move v4, v7

    .line 229
    move v5, v9

    .line 230
    :goto_5
    if-ge v4, v2, :cond_a

    .line 231
    .line 232
    aget-object v6, p1, v4

    .line 233
    .line 234
    check-cast v6, Lu/E;

    .line 235
    .line 236
    iget-boolean v8, v6, Lu/E;->v:Z

    .line 237
    .line 238
    if-nez v8, :cond_8

    .line 239
    .line 240
    iget-object v8, v6, Lu/E;->y:Lu/H;

    .line 241
    .line 242
    iget-object v8, v8, Lu/H;->b:LP/f0;

    .line 243
    .line 244
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v8, v10}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget-boolean v8, v6, Lu/E;->w:Z

    .line 250
    .line 251
    if-eqz v8, :cond_7

    .line 252
    .line 253
    iput-boolean v7, v6, Lu/E;->w:Z

    .line 254
    .line 255
    iput-wide v0, v6, Lu/E;->x:J

    .line 256
    .line 257
    :cond_7
    iget-wide v10, v6, Lu/E;->x:J

    .line 258
    .line 259
    sub-long v10, v0, v10

    .line 260
    .line 261
    iget-object v8, v6, Lu/E;->u:Lu/n0;

    .line 262
    .line 263
    invoke-virtual {v8, v10, v11}, Lu/n0;->b(J)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    iget-object v12, v6, Lu/E;->t:LP/f0;

    .line 268
    .line 269
    invoke-virtual {v12, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v8, v6, Lu/E;->u:Lu/n0;

    .line 273
    .line 274
    invoke-interface {v8, v10, v11}, Lu/h;->g(J)Z

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    iput-boolean v8, v6, Lu/E;->v:Z

    .line 279
    .line 280
    :cond_8
    iget-boolean v6, v6, Lu/E;->v:Z

    .line 281
    .line 282
    if-nez v6, :cond_9

    .line 283
    .line 284
    move v5, v7

    .line 285
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_a
    xor-int/lit8 p1, v5, 0x1

    .line 289
    .line 290
    iget-object v0, v3, Lu/H;->d:LP/f0;

    .line 291
    .line 292
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_b
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 300
    .line 301
    return-object p1

    .line 302
    :pswitch_1
    check-cast p1, LP/F;

    .line 303
    .line 304
    iget-object p1, p0, LE/y;->r:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p1, LE/K;

    .line 307
    .line 308
    new-instance v0, LB0/G0;

    .line 309
    .line 310
    iget-object v1, p0, LE/y;->s:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v1, LE/u;

    .line 313
    .line 314
    iget-object v2, p0, LE/y;->t:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v2, Lz0/S;

    .line 317
    .line 318
    iget-object v3, p0, LE/y;->u:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v3, LE/d0;

    .line 321
    .line 322
    const/4 v4, 0x3

    .line 323
    invoke-direct {v0, v1, v2, v3, v4}, LB0/G0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 324
    .line 325
    .line 326
    iput-object v0, p1, LE/K;->c:LB0/G0;

    .line 327
    .line 328
    new-instance v0, LC0/Y;

    .line 329
    .line 330
    const/4 v1, 0x2

    .line 331
    invoke-direct {v0, v1, p1}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
