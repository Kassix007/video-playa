.class public abstract Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public q:LW1/d;

.field public r:Z

.field public s:Lj0/j;

.field public t:F

.field public u:LW0/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lo0/b;->t:F

    .line 7
    .line 8
    sget-object v0, LW0/l;->q:LW0/l;

    .line 9
    .line 10
    iput-object v0, p0, Lo0/b;->u:LW0/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(F)Z
.end method

.method public abstract d(Lj0/j;)Z
.end method

.method public f(LW0/l;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(LB0/N;JFLj0/j;)V
    .locals 9

    .line 1
    iget-object v0, p1, LB0/N;->q:Ll0/b;

    .line 2
    .line 3
    iget v1, p0, Lo0/b;->t:F

    .line 4
    .line 5
    cmpg-float v1, v1, p4

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p0, p4}, Lo0/b;->a(F)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_4

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    cmpg-float v1, p4, v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lo0/b;->q:LW1/d;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v1, p4}, LW1/d;->c(F)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iput-boolean v3, p0, Lo0/b;->r:Z

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget-object v1, p0, Lo0/b;->q:LW1/d;

    .line 36
    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lo0/b;->q:LW1/d;

    .line 44
    .line 45
    :cond_3
    invoke-virtual {v1, p4}, LW1/d;->c(F)V

    .line 46
    .line 47
    .line 48
    iput-boolean v2, p0, Lo0/b;->r:Z

    .line 49
    .line 50
    :cond_4
    :goto_1
    iput p4, p0, Lo0/b;->t:F

    .line 51
    .line 52
    :goto_2
    iget-object v1, p0, Lo0/b;->s:Lj0/j;

    .line 53
    .line 54
    invoke-static {v1, p5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_9

    .line 59
    .line 60
    invoke-virtual {p0, p5}, Lo0/b;->d(Lj0/j;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_8

    .line 65
    .line 66
    if-nez p5, :cond_6

    .line 67
    .line 68
    iget-object v1, p0, Lo0/b;->q:LW1/d;

    .line 69
    .line 70
    if-nez v1, :cond_5

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v1, v2}, LW1/d;->f(Lj0/j;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    iput-boolean v3, p0, Lo0/b;->r:Z

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    iget-object v1, p0, Lo0/b;->q:LW1/d;

    .line 81
    .line 82
    if-nez v1, :cond_7

    .line 83
    .line 84
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lo0/b;->q:LW1/d;

    .line 89
    .line 90
    :cond_7
    invoke-virtual {v1, p5}, LW1/d;->f(Lj0/j;)V

    .line 91
    .line 92
    .line 93
    iput-boolean v2, p0, Lo0/b;->r:Z

    .line 94
    .line 95
    :cond_8
    :goto_4
    iput-object p5, p0, Lo0/b;->s:Lj0/j;

    .line 96
    .line 97
    :cond_9
    invoke-virtual {p1}, LB0/N;->getLayoutDirection()LW0/l;

    .line 98
    .line 99
    .line 100
    move-result-object p5

    .line 101
    iget-object v1, p0, Lo0/b;->u:LW0/l;

    .line 102
    .line 103
    if-eq v1, p5, :cond_a

    .line 104
    .line 105
    invoke-virtual {p0, p5}, Lo0/b;->f(LW0/l;)V

    .line 106
    .line 107
    .line 108
    iput-object p5, p0, Lo0/b;->u:LW0/l;

    .line 109
    .line 110
    :cond_a
    invoke-interface {v0}, Ll0/d;->d()J

    .line 111
    .line 112
    .line 113
    move-result-wide v1

    .line 114
    const/16 p5, 0x20

    .line 115
    .line 116
    shr-long/2addr v1, p5

    .line 117
    long-to-int v1, v1

    .line 118
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    shr-long v2, p2, p5

    .line 123
    .line 124
    long-to-int v2, v2

    .line 125
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    sub-float/2addr v1, v3

    .line 130
    invoke-interface {v0}, Ll0/d;->d()J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    const-wide v5, 0xffffffffL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    and-long/2addr v3, v5

    .line 140
    long-to-int v3, v3

    .line 141
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    and-long/2addr p2, v5

    .line 146
    long-to-int p2, p2

    .line 147
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    sub-float/2addr v3, p3

    .line 152
    iget-object p3, v0, Ll0/b;->r:LB0/G0;

    .line 153
    .line 154
    iget-object p3, p3, LB0/G0;->r:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p3, Li1/a;

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-virtual {p3, v4, v4, v1, v3}, Li1/a;->v(FFFF)V

    .line 160
    .line 161
    .line 162
    cmpl-float p3, p4, v4

    .line 163
    .line 164
    const/high16 p4, -0x80000000

    .line 165
    .line 166
    if-lez p3, :cond_d

    .line 167
    .line 168
    :try_start_0
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    cmpl-float p3, p3, v4

    .line 173
    .line 174
    if-lez p3, :cond_d

    .line 175
    .line 176
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    cmpl-float p3, p3, v4

    .line 181
    .line 182
    if-lez p3, :cond_d

    .line 183
    .line 184
    iget-boolean p3, p0, Lo0/b;->r:Z

    .line 185
    .line 186
    if-eqz p3, :cond_c

    .line 187
    .line 188
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    int-to-long v7, p3

    .line 201
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    int-to-long p2, p2

    .line 206
    shl-long/2addr v7, p5

    .line 207
    and-long/2addr p2, v5

    .line 208
    or-long/2addr p2, v7

    .line 209
    const-wide/16 v4, 0x0

    .line 210
    .line 211
    invoke-static {v4, v5, p2, p3}, Lcom/google/android/gms/internal/measurement/n2;->c(JJ)Li0/c;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    iget-object p3, v0, Ll0/b;->r:LB0/G0;

    .line 216
    .line 217
    invoke-virtual {p3}, LB0/G0;->t()Lj0/m;

    .line 218
    .line 219
    .line 220
    move-result-object p3

    .line 221
    iget-object p5, p0, Lo0/b;->q:LW1/d;

    .line 222
    .line 223
    if-nez p5, :cond_b

    .line 224
    .line 225
    invoke-static {}, Lj0/B;->f()LW1/d;

    .line 226
    .line 227
    .line 228
    move-result-object p5

    .line 229
    iput-object p5, p0, Lo0/b;->q:LW1/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    .line 231
    :cond_b
    :try_start_1
    invoke-interface {p3, p2, p5}, Lj0/m;->l(Li0/c;LW1/d;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, p1}, Lo0/b;->i(LB0/N;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    .line 236
    .line 237
    :try_start_2
    invoke-interface {p3}, Lj0/m;->i()V

    .line 238
    .line 239
    .line 240
    goto :goto_6

    .line 241
    :catchall_0
    move-exception p1

    .line 242
    goto :goto_5

    .line 243
    :catchall_1
    move-exception p1

    .line 244
    invoke-interface {p3}, Lj0/m;->i()V

    .line 245
    .line 246
    .line 247
    throw p1

    .line 248
    :cond_c
    invoke-virtual {p0, p1}, Lo0/b;->i(LB0/N;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :goto_5
    iget-object p2, v0, Ll0/b;->r:LB0/G0;

    .line 253
    .line 254
    iget-object p2, p2, LB0/G0;->r:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p2, Li1/a;

    .line 257
    .line 258
    neg-float p3, v1

    .line 259
    neg-float p5, v3

    .line 260
    invoke-virtual {p2, p4, p4, p3, p5}, Li1/a;->v(FFFF)V

    .line 261
    .line 262
    .line 263
    throw p1

    .line 264
    :cond_d
    :goto_6
    iget-object p1, v0, Ll0/b;->r:LB0/G0;

    .line 265
    .line 266
    iget-object p1, p1, LB0/G0;->r:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p1, Li1/a;

    .line 269
    .line 270
    neg-float p2, v1

    .line 271
    neg-float p3, v3

    .line 272
    invoke-virtual {p1, p4, p4, p2, p3}, Li1/a;->v(FFFF)V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public abstract h()J
.end method

.method public abstract i(LB0/N;)V
.end method
