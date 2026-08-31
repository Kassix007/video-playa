.class public final LO3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:J

.field public final synthetic t:LO3/C;


# direct methods
.method public synthetic constructor <init>(LO3/A;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    iput p5, p0, LO3/a;->q:I

    iput-object p2, p0, LO3/a;->r:Ljava/lang/Object;

    iput-wide p3, p0, LO3/a;->s:J

    iput-object p1, p0, LO3/a;->t:LO3/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/m1;LO3/j1;J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO3/a;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/a;->r:Ljava/lang/Object;

    iput-wide p3, p0, LO3/a;->s:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/a;->t:LO3/C;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, LO3/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/a;->t:LO3/C;

    .line 7
    .line 8
    check-cast v0, LO3/m1;

    .line 9
    .line 10
    iget-object v1, p0, LO3/a;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LO3/j1;

    .line 13
    .line 14
    iget-wide v2, p0, LO3/a;->s:J

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v0, v1, v4, v2, v3}, LO3/m1;->s(LO3/j1;ZJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, LO3/m1;->v:LO3/j1;

    .line 22
    .line 23
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LO3/t0;

    .line 26
    .line 27
    invoke-virtual {v0}, LO3/t0;->o()LO3/w1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, LO3/C;->o()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LO3/H;->p()V

    .line 35
    .line 36
    .line 37
    new-instance v2, LI4/a;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, LI4/a;-><init>(LO3/w1;LO3/j1;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, LO3/w1;->C(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    iget-object v0, p0, LO3/a;->t:LO3/C;

    .line 47
    .line 48
    check-cast v0, LO3/A;

    .line 49
    .line 50
    iget-object v1, p0, LO3/a;->r:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v2, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, LO3/t0;

    .line 57
    .line 58
    invoke-virtual {v0}, LO3/C;->o()V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lx3/A;->d(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v0, LO3/A;->t:Lr/e;

    .line 65
    .line 66
    invoke-virtual {v3, v1}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    iget-object v5, v2, LO3/t0;->B:LO3/m1;

    .line 75
    .line 76
    iget-object v2, v2, LO3/t0;->v:LO3/X;

    .line 77
    .line 78
    invoke-static {v5}, LO3/t0;->k(LO3/H;)V

    .line 79
    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-virtual {v5, v6}, LO3/m1;->u(Z)LO3/j1;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    add-int/lit8 v4, v4, -0x1

    .line 91
    .line 92
    if-nez v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Lr/Q;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v4, v0, LO3/A;->s:Lr/e;

    .line 98
    .line 99
    invoke-virtual {v4, v1}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, Ljava/lang/Long;

    .line 104
    .line 105
    iget-wide v7, p0, LO3/a;->s:J

    .line 106
    .line 107
    if-nez v6, :cond_0

    .line 108
    .line 109
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v2, LO3/X;->w:LO3/V;

    .line 113
    .line 114
    const-string v4, "First ad unit exposure time was never set"

    .line 115
    .line 116
    invoke-virtual {v1, v4}, LO3/V;->b(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    sub-long v9, v7, v9

    .line 125
    .line 126
    invoke-virtual {v4, v1}, Lr/Q;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1, v9, v10, v5}, LO3/A;->t(Ljava/lang/String;JLO3/j1;)V

    .line 130
    .line 131
    .line 132
    :goto_0
    invoke-virtual {v3}, Lr/Q;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    iget-wide v3, v0, LO3/A;->u:J

    .line 139
    .line 140
    const-wide/16 v9, 0x0

    .line 141
    .line 142
    cmp-long v1, v3, v9

    .line 143
    .line 144
    if-nez v1, :cond_1

    .line 145
    .line 146
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v2, LO3/X;->w:LO3/V;

    .line 150
    .line 151
    const-string v1, "First ad exposure time was never set"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_1
    sub-long/2addr v7, v3

    .line 158
    invoke-virtual {v0, v7, v8, v5}, LO3/A;->s(JLO3/j1;)V

    .line 159
    .line 160
    .line 161
    iput-wide v9, v0, LO3/A;->u:J

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v3, v1, v0}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    iget-object v0, v2, LO3/t0;->v:LO3/X;

    .line 173
    .line 174
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, LO3/X;->w:LO3/V;

    .line 178
    .line 179
    const-string v2, "Call to endAdUnitExposure for unknown ad unit id"

    .line 180
    .line 181
    invoke-virtual {v0, v1, v2}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    :goto_1
    return-void

    .line 185
    :pswitch_1
    iget-object v0, p0, LO3/a;->t:LO3/C;

    .line 186
    .line 187
    check-cast v0, LO3/A;

    .line 188
    .line 189
    iget-object v1, p0, LO3/a;->r:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v0}, LO3/C;->o()V

    .line 194
    .line 195
    .line 196
    invoke-static {v1}, Lx3/A;->d(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v0, LO3/A;->t:Lr/e;

    .line 200
    .line 201
    invoke-virtual {v2}, Lr/Q;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iget-wide v4, p0, LO3/a;->s:J

    .line 206
    .line 207
    if-eqz v3, :cond_5

    .line 208
    .line 209
    iput-wide v4, v0, LO3/A;->u:J

    .line 210
    .line 211
    :cond_5
    invoke-virtual {v2, v1}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Ljava/lang/Integer;

    .line 216
    .line 217
    const/4 v6, 0x1

    .line 218
    if-eqz v3, :cond_6

    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    add-int/2addr v0, v6

    .line 225
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v2, v1, v0}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_6
    iget v3, v2, Lr/Q;->s:I

    .line 234
    .line 235
    const/16 v7, 0x64

    .line 236
    .line 237
    if-lt v3, v7, :cond_7

    .line 238
    .line 239
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, LO3/t0;

    .line 242
    .line 243
    iget-object v0, v0, LO3/t0;->v:LO3/X;

    .line 244
    .line 245
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, LO3/X;->z:LO3/V;

    .line 249
    .line 250
    const-string v1, "Too many ads visible"

    .line 251
    .line 252
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v2, v1, v3}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, LO3/A;->s:Lr/e;

    .line 264
    .line 265
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v0, v1, v2}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    :goto_2
    return-void

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
