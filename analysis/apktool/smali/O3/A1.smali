.class public final LO3/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:LO3/E1;


# direct methods
.method public constructor <init>(LO3/E1;JI)V
    .locals 0

    .line 1
    iput p4, p0, LO3/A1;->q:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, LO3/A1;->r:J

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LO3/A1;->s:LO3/E1;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-wide p2, p0, LO3/A1;->r:J

    .line 21
    .line 22
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LO3/A1;->s:LO3/E1;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LO3/A1;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/A1;->s:LO3/E1;

    .line 7
    .line 8
    invoke-virtual {v0}, LO3/C;->o()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LO3/E1;->s()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LO3/t0;

    .line 17
    .line 18
    iget-object v2, v1, LO3/t0;->v:LO3/X;

    .line 19
    .line 20
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v2, LO3/X;->E:LO3/V;

    .line 24
    .line 25
    const-string v3, "Activity paused, time"

    .line 26
    .line 27
    iget-wide v8, p0, LO3/A1;->r:J

    .line 28
    .line 29
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v2, v4, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v0, LO3/E1;->x:LB0/o;

    .line 37
    .line 38
    new-instance v4, LO3/B1;

    .line 39
    .line 40
    iget-object v2, v5, LB0/o;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, LO3/E1;

    .line 43
    .line 44
    iget-object v3, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, LO3/t0;

    .line 47
    .line 48
    iget-object v3, v3, LO3/t0;->A:LB3/a;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v6

    .line 57
    invoke-direct/range {v4 .. v9}, LO3/B1;-><init>(LB0/o;JJ)V

    .line 58
    .line 59
    .line 60
    iput-object v4, v5, LB0/o;->q:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v2, v2, LO3/E1;->t:LI3/e;

    .line 63
    .line 64
    const-wide/16 v5, 0x7d0

    .line 65
    .line 66
    invoke-virtual {v2, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    iget-object v1, v1, LO3/t0;->t:LO3/g;

    .line 70
    .line 71
    invoke-virtual {v1}, LO3/g;->C()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v0, v0, LO3/E1;->w:LO3/D1;

    .line 78
    .line 79
    iget-object v0, v0, LO3/D1;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, LO3/C1;

    .line 82
    .line 83
    invoke-virtual {v0}, LO3/o;->c()V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void

    .line 87
    :pswitch_0
    iget-object v0, p0, LO3/A1;->s:LO3/E1;

    .line 88
    .line 89
    iget-object v1, v0, LO3/E1;->w:LO3/D1;

    .line 90
    .line 91
    invoke-virtual {v0}, LO3/C;->o()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, LO3/E1;->s()V

    .line 95
    .line 96
    .line 97
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, LO3/t0;

    .line 100
    .line 101
    iget-object v3, v2, LO3/t0;->v:LO3/X;

    .line 102
    .line 103
    invoke-static {v3}, LO3/t0;->l(LO3/E0;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v3, LO3/X;->E:LO3/V;

    .line 107
    .line 108
    const-string v4, "Activity resumed, time"

    .line 109
    .line 110
    iget-wide v5, p0, LO3/A1;->r:J

    .line 111
    .line 112
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v3, v7, v4}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v3, v2, LO3/t0;->t:LO3/g;

    .line 120
    .line 121
    sget-object v4, LO3/F;->U0:LO3/E;

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    invoke-virtual {v3, v7, v4}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_2

    .line 129
    .line 130
    invoke-virtual {v3}, LO3/g;->C()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-nez v2, :cond_1

    .line 135
    .line 136
    iget-boolean v2, v0, LO3/E1;->u:Z

    .line 137
    .line 138
    if-eqz v2, :cond_4

    .line 139
    .line 140
    :cond_1
    iget-object v2, v1, LO3/D1;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, LO3/E1;

    .line 143
    .line 144
    invoke-virtual {v2}, LO3/C;->o()V

    .line 145
    .line 146
    .line 147
    iget-object v2, v1, LO3/D1;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, LO3/C1;

    .line 150
    .line 151
    invoke-virtual {v2}, LO3/o;->c()V

    .line 152
    .line 153
    .line 154
    iput-wide v5, v1, LO3/D1;->a:J

    .line 155
    .line 156
    iput-wide v5, v1, LO3/D1;->b:J

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_2
    invoke-virtual {v3}, LO3/g;->C()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_3

    .line 164
    .line 165
    iget-object v2, v2, LO3/t0;->u:LO3/h0;

    .line 166
    .line 167
    invoke-static {v2}, LO3/t0;->j(LO3/D0;)V

    .line 168
    .line 169
    .line 170
    iget-object v2, v2, LO3/h0;->J:LO3/e0;

    .line 171
    .line 172
    invoke-virtual {v2}, LO3/e0;->d()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_4

    .line 177
    .line 178
    :cond_3
    iget-object v2, v1, LO3/D1;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, LO3/E1;

    .line 181
    .line 182
    invoke-virtual {v2}, LO3/C;->o()V

    .line 183
    .line 184
    .line 185
    iget-object v2, v1, LO3/D1;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, LO3/C1;

    .line 188
    .line 189
    invoke-virtual {v2}, LO3/o;->c()V

    .line 190
    .line 191
    .line 192
    iput-wide v5, v1, LO3/D1;->a:J

    .line 193
    .line 194
    iput-wide v5, v1, LO3/D1;->b:J

    .line 195
    .line 196
    :cond_4
    :goto_0
    iget-object v1, v0, LO3/E1;->x:LB0/o;

    .line 197
    .line 198
    iget-object v2, v1, LB0/o;->r:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, LO3/E1;

    .line 201
    .line 202
    invoke-virtual {v2}, LO3/C;->o()V

    .line 203
    .line 204
    .line 205
    iget-object v3, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, LO3/t0;

    .line 208
    .line 209
    iget-object v1, v1, LB0/o;->q:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, LO3/B1;

    .line 212
    .line 213
    if-eqz v1, :cond_5

    .line 214
    .line 215
    iget-object v4, v2, LO3/E1;->t:LI3/e;

    .line 216
    .line 217
    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 218
    .line 219
    .line 220
    :cond_5
    iget-object v1, v3, LO3/t0;->u:LO3/h0;

    .line 221
    .line 222
    iget-object v4, v3, LO3/t0;->C:LO3/b1;

    .line 223
    .line 224
    invoke-static {v1}, LO3/t0;->j(LO3/D0;)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v1, LO3/h0;->J:LO3/e0;

    .line 228
    .line 229
    const/4 v5, 0x0

    .line 230
    invoke-virtual {v1, v5}, LO3/e0;->e(Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, LO3/C;->o()V

    .line 234
    .line 235
    .line 236
    iput-boolean v5, v2, LO3/E1;->u:Z

    .line 237
    .line 238
    iget-object v1, v3, LO3/t0;->t:LO3/g;

    .line 239
    .line 240
    sget-object v2, LO3/F;->T0:LO3/E;

    .line 241
    .line 242
    invoke-virtual {v1, v7, v2}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_6

    .line 247
    .line 248
    invoke-static {v4}, LO3/t0;->k(LO3/H;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v1, v4, LO3/b1;->E:Z

    .line 252
    .line 253
    if-eqz v1, :cond_6

    .line 254
    .line 255
    iget-object v1, v3, LO3/t0;->v:LO3/X;

    .line 256
    .line 257
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 258
    .line 259
    .line 260
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 261
    .line 262
    const-string v2, "Retrying trigger URI registration in foreground"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, LO3/V;->b(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v4}, LO3/t0;->k(LO3/H;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, LO3/b1;->M()V

    .line 271
    .line 272
    .line 273
    :cond_6
    iget-object v0, v0, LO3/E1;->v:Lk3/c;

    .line 274
    .line 275
    iget-object v1, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, LO3/E1;

    .line 278
    .line 279
    invoke-virtual {v1}, LO3/C;->o()V

    .line 280
    .line 281
    .line 282
    iget-object v1, v1, LO3/D0;->r:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, LO3/t0;

    .line 285
    .line 286
    invoke-virtual {v1}, LO3/t0;->a()Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-nez v2, :cond_7

    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_7
    iget-object v1, v1, LO3/t0;->A:LB3/a;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 299
    .line 300
    .line 301
    move-result-wide v1

    .line 302
    invoke-virtual {v0, v1, v2}, Lk3/c;->u(J)V

    .line 303
    .line 304
    .line 305
    :goto_1
    return-void

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
