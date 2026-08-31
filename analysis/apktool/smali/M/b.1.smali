.class public final LM/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lc0/m;

.field public final synthetic s:Lj0/E;

.field public final synthetic t:J

.field public final synthetic u:F

.field public final synthetic v:F

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM/c;Lc0/m;FFLj0/E;JI)V
    .locals 0

    const/4 p8, 0x0

    iput p8, p0, LM/b;->q:I

    .line 1
    iput-object p1, p0, LM/b;->w:Ljava/lang/Object;

    iput-object p2, p0, LM/b;->r:Lc0/m;

    iput p3, p0, LM/b;->u:F

    iput p4, p0, LM/b;->v:F

    iput-object p5, p0, LM/b;->s:Lj0/E;

    iput-wide p6, p0, LM/b;->t:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lc0/m;Lj0/E;JFFLX/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM/b;->q:I

    .line 2
    iput-object p1, p0, LM/b;->r:Lc0/m;

    iput-object p2, p0, LM/b;->s:Lj0/E;

    iput-wide p3, p0, LM/b;->t:J

    iput p5, p0, LM/b;->u:F

    iput p6, p0, LM/b;->v:F

    iput-object p7, p0, LM/b;->w:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LM/b;->q:I

    .line 4
    .line 5
    iget-object v2, v0, LM/b;->w:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, LP/o;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    and-int/lit8 v4, v4, 0x3

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-ne v4, v5, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, LP/o;->x()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1}, LP/o;->N()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    :goto_0
    sget-object v4, LM/k;->a:LP/T0;

    .line 42
    .line 43
    invoke-virtual {v1, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, LM/i;

    .line 48
    .line 49
    sget-object v6, LM/k;->b:LP/T0;

    .line 50
    .line 51
    invoke-virtual {v1, v6}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    iget-wide v7, v4, LM/i;->p:J

    .line 62
    .line 63
    iget-wide v9, v0, LM/b;->t:J

    .line 64
    .line 65
    invoke-static {v9, v10, v7, v8}, Lj0/o;->c(JJ)Z

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const/4 v12, 0x1

    .line 70
    const/4 v13, 0x0

    .line 71
    if-eqz v11, :cond_3

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    int-to-float v6, v13

    .line 76
    iget v9, v0, LM/b;->u:F

    .line 77
    .line 78
    invoke-static {v9, v6}, LW0/f;->a(FF)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    int-to-float v6, v12

    .line 86
    add-float/2addr v9, v6

    .line 87
    float-to-double v9, v9

    .line 88
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    double-to-float v6, v9

    .line 93
    const/high16 v9, 0x40900000    # 4.5f

    .line 94
    .line 95
    mul-float/2addr v6, v9

    .line 96
    const/high16 v9, 0x40000000    # 2.0f

    .line 97
    .line 98
    add-float/2addr v6, v9

    .line 99
    const/high16 v9, 0x42c80000    # 100.0f

    .line 100
    .line 101
    div-float/2addr v6, v9

    .line 102
    iget-wide v9, v4, LM/i;->t:J

    .line 103
    .line 104
    invoke-static {v9, v10, v6}, Lj0/o;->b(JF)J

    .line 105
    .line 106
    .line 107
    move-result-wide v9

    .line 108
    invoke-static {v9, v10, v7, v8}, Lj0/B;->i(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move-wide v7, v9

    .line 114
    :goto_1
    sget-object v4, LC0/t0;->h:LP/T0;

    .line 115
    .line 116
    invoke-virtual {v1, v4}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    iget v6, v0, LM/b;->v:F

    .line 121
    .line 122
    check-cast v4, LW0/c;

    .line 123
    .line 124
    invoke-interface {v4, v6}, LW0/c;->u(F)F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    const/4 v6, 0x0

    .line 129
    cmpl-float v6, v4, v6

    .line 130
    .line 131
    sget-object v9, Lc0/j;->q:Lc0/j;

    .line 132
    .line 133
    iget-object v10, v0, LM/b;->s:Lj0/E;

    .line 134
    .line 135
    if-lez v6, :cond_4

    .line 136
    .line 137
    const v6, 0x1e7df

    .line 138
    .line 139
    .line 140
    invoke-static {v9, v4, v10, v13, v6}, Landroidx/compose/ui/graphics/a;->b(Lc0/m;FLj0/E;ZI)Lc0/m;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move-object v4, v9

    .line 146
    :goto_2
    iget-object v6, v0, LM/b;->r:Lc0/m;

    .line 147
    .line 148
    invoke-interface {v6, v4}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-interface {v4, v9}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v4, v7, v8, v10}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v4, v10}, La/a;->n(Lc0/m;Lj0/E;)Lc0/m;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    sget-object v6, LM/d;->v:LM/d;

    .line 165
    .line 166
    invoke-static {v4, v13, v6}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    new-instance v6, LM/K0;

    .line 171
    .line 172
    const/4 v7, 0x0

    .line 173
    invoke-direct {v6, v5, v7}, Ls5/i;-><init>(ILq5/c;)V

    .line 174
    .line 175
    .line 176
    sget-object v5, Lv0/u;->a:Lv0/f;

    .line 177
    .line 178
    new-instance v5, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 179
    .line 180
    new-instance v8, Lv0/t;

    .line 181
    .line 182
    invoke-direct {v8, v6}, Lv0/t;-><init>(LB5/e;)V

    .line 183
    .line 184
    .line 185
    const/4 v6, 0x6

    .line 186
    invoke-direct {v5, v3, v7, v8, v6}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ll6/d;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v4, v5}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    check-cast v2, LX/e;

    .line 194
    .line 195
    sget-object v5, Lc0/b;->q:Lc0/e;

    .line 196
    .line 197
    invoke-static {v5, v12}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    iget v6, v1, LP/o;->P:I

    .line 202
    .line 203
    invoke-virtual {v1}, LP/o;->m()LP/i0;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-static {v1, v4}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    sget-object v8, LB0/k;->a:LB0/j;

    .line 212
    .line 213
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object v8, LB0/j;->b:LB0/D;

    .line 217
    .line 218
    invoke-virtual {v1}, LP/o;->W()V

    .line 219
    .line 220
    .line 221
    iget-boolean v9, v1, LP/o;->O:Z

    .line 222
    .line 223
    if-eqz v9, :cond_5

    .line 224
    .line 225
    invoke-virtual {v1, v8}, LP/o;->l(LB5/a;)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    invoke-virtual {v1}, LP/o;->g0()V

    .line 230
    .line 231
    .line 232
    :goto_3
    sget-object v8, LB0/j;->e:LB0/i;

    .line 233
    .line 234
    invoke-static {v8, v1, v5}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    sget-object v5, LB0/j;->d:LB0/i;

    .line 238
    .line 239
    invoke-static {v5, v1, v7}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object v5, LB0/j;->f:LB0/i;

    .line 243
    .line 244
    iget-boolean v7, v1, LP/o;->O:Z

    .line 245
    .line 246
    if-nez v7, :cond_6

    .line 247
    .line 248
    invoke-virtual {v1}, LP/o;->H()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-nez v7, :cond_7

    .line 261
    .line 262
    :cond_6
    invoke-static {v6, v1, v6, v5}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 263
    .line 264
    .line 265
    :cond_7
    sget-object v5, LB0/j;->c:LB0/i;

    .line 266
    .line 267
    invoke-static {v5, v1, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v2, v1, v4}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v12}, LP/o;->p(Z)V

    .line 278
    .line 279
    .line 280
    :goto_4
    return-object v3

    .line 281
    :pswitch_0
    move-object/from16 v20, p1

    .line 282
    .line 283
    check-cast v20, LP/o;

    .line 284
    .line 285
    move-object/from16 v1, p2

    .line 286
    .line 287
    check-cast v1, Ljava/lang/Number;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 290
    .line 291
    .line 292
    move-object v13, v2

    .line 293
    check-cast v13, LM/c;

    .line 294
    .line 295
    const v1, 0x30001

    .line 296
    .line 297
    .line 298
    invoke-static {v1}, LP/b;->w(I)I

    .line 299
    .line 300
    .line 301
    move-result v21

    .line 302
    iget-object v14, v0, LM/b;->r:Lc0/m;

    .line 303
    .line 304
    iget v15, v0, LM/b;->u:F

    .line 305
    .line 306
    iget v1, v0, LM/b;->v:F

    .line 307
    .line 308
    iget-object v2, v0, LM/b;->s:Lj0/E;

    .line 309
    .line 310
    iget-wide v4, v0, LM/b;->t:J

    .line 311
    .line 312
    move/from16 v16, v1

    .line 313
    .line 314
    move-object/from16 v17, v2

    .line 315
    .line 316
    move-wide/from16 v18, v4

    .line 317
    .line 318
    invoke-virtual/range {v13 .. v21}, LM/c;->a(Lc0/m;FFLj0/E;JLP/o;I)V

    .line 319
    .line 320
    .line 321
    return-object v3

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
