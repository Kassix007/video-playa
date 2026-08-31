.class public final LF/I;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LF/N;


# direct methods
.method public synthetic constructor <init>(LF/N;I)V
    .locals 0

    .line 1
    iput p2, p0, LF/I;->q:I

    iput-object p1, p0, LF/I;->r:LF/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LF/I;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, LF/I;->r:LF/N;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/I1;->R(LF/N;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iget v3, v0, LF/N;->i:F

    .line 19
    .line 20
    add-float/2addr v3, p1

    .line 21
    float-to-double v4, v3

    .line 22
    invoke-static {v4, v5}, LD5/a;->H(D)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    long-to-float v6, v4

    .line 27
    sub-float/2addr v3, v6

    .line 28
    iput v3, v0, LF/N;->i:F

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const v6, 0x38d1b717    # 1.0E-4f

    .line 35
    .line 36
    .line 37
    cmpg-float v3, v3, v6

    .line 38
    .line 39
    if-gez v3, :cond_0

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_0
    add-long v6, v1, v4

    .line 44
    .line 45
    iget-wide v8, v0, LF/N;->h:J

    .line 46
    .line 47
    iget-wide v10, v0, LF/N;->g:J

    .line 48
    .line 49
    invoke-static/range {v6 .. v11}, LD5/a;->r(JJJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    cmp-long v5, v6, v3

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x1

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    move v5, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v5, v6

    .line 62
    :goto_0
    sub-long/2addr v3, v1

    .line 63
    long-to-float v1, v3

    .line 64
    iput v1, v0, LF/N;->j:F

    .line 65
    .line 66
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    const-wide/16 v10, 0x0

    .line 71
    .line 72
    cmp-long v2, v8, v10

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    iget-object v2, v0, LF/N;->F:LP/f0;

    .line 78
    .line 79
    cmpl-float v9, v1, v8

    .line 80
    .line 81
    if-lez v9, :cond_2

    .line 82
    .line 83
    move v9, v7

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v9, v6

    .line 86
    :goto_1
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {v2, v9}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v0, LF/N;->G:LP/f0;

    .line 94
    .line 95
    cmpg-float v1, v1, v8

    .line 96
    .line 97
    if-gez v1, :cond_3

    .line 98
    .line 99
    move v6, v7

    .line 100
    :cond_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v2, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v1, v0, LF/N;->p:LP/f0;

    .line 108
    .line 109
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, LF/B;

    .line 114
    .line 115
    long-to-int v2, v3

    .line 116
    neg-int v6, v2

    .line 117
    invoke-virtual {v1, v6}, LF/B;->f(I)LF/B;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget-object v9, v0, LF/N;->b:LF/B;

    .line 124
    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    invoke-virtual {v9, v6}, LF/B;->f(I)LF/B;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    if-eqz v6, :cond_5

    .line 132
    .line 133
    iput-object v6, v0, LF/N;->b:LF/B;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/4 v1, 0x0

    .line 137
    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    .line 138
    .line 139
    iget-boolean v2, v0, LF/N;->a:Z

    .line 140
    .line 141
    invoke-virtual {v0, v1, v2, v7}, LF/N;->h(LF/B;ZZ)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, LF/N;->B:LP/W;

    .line 145
    .line 146
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 147
    .line 148
    invoke-interface {v0, v1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    iget-object v1, v0, LF/N;->d:LF/D;

    .line 153
    .line 154
    iget-object v6, v1, LF/D;->r:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v6, LF/N;

    .line 157
    .line 158
    iget-object v1, v1, LF/D;->t:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, LP/b0;

    .line 161
    .line 162
    invoke-virtual {v6}, LF/N;->n()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-nez v7, :cond_8

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_8
    int-to-float v2, v2

    .line 170
    invoke-virtual {v6}, LF/N;->n()I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    int-to-float v6, v6

    .line 175
    div-float v8, v2, v6

    .line 176
    .line 177
    :goto_3
    invoke-virtual {v1}, LP/b0;->e()F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    add-float/2addr v2, v8

    .line 182
    invoke-virtual {v1, v2}, LP/b0;->f(F)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v0, LF/N;->x:LP/f0;

    .line 186
    .line 187
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, LB0/L;

    .line 192
    .line 193
    if-eqz v0, :cond_9

    .line 194
    .line 195
    invoke-virtual {v0}, LB0/L;->l()V

    .line 196
    .line 197
    .line 198
    :cond_9
    :goto_4
    if-eqz v5, :cond_a

    .line 199
    .line 200
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    goto :goto_5

    .line 205
    :cond_a
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    :goto_6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    return-object p1

    .line 218
    :pswitch_0
    check-cast p1, LE/I;

    .line 219
    .line 220
    iget-object v0, p0, LF/I;->r:LF/N;

    .line 221
    .line 222
    invoke-static {}, La0/r;->c()La0/h;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    if-eqz v1, :cond_b

    .line 227
    .line 228
    invoke-virtual {v1}, La0/h;->e()LB5/c;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    goto :goto_7

    .line 233
    :cond_b
    const/4 v2, 0x0

    .line 234
    :goto_7
    invoke-static {v1}, La0/r;->d(La0/h;)La0/h;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    :try_start_0
    iget v0, v0, LF/N;->e:I

    .line 239
    .line 240
    invoke-virtual {p1, v0}, LE/I;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    .line 243
    invoke-static {v1, v3, v2}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 244
    .line 245
    .line 246
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 247
    .line 248
    return-object p1

    .line 249
    :catchall_0
    move-exception v0

    .line 250
    move-object p1, v0

    .line 251
    invoke-static {v1, v3, v2}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
