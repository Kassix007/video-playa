.class public final LZ0/a;
.super Lw1/Q;
.source "SourceFile"


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ0/a;->s:I

    iput-object p1, p0, LZ0/a;->t:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw1/Q;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Lw1/o0;Ljava/util/List;)Lw1/o0;
    .locals 6

    .line 1
    iget p2, p0, LZ0/a;->s:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LZ0/a;->t:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p2, La1/h;

    .line 9
    .line 10
    iget-boolean v0, p2, La1/h;->B:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    sub-int/2addr v4, v5

    .line 45
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    sub-int/2addr p2, v1

    .line 58
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object p1, p1, Lw1/o0;->a:Lw1/l0;

    .line 72
    .line 73
    invoke-virtual {p1, v2, v3, v4, p2}, Lw1/l0;->n(IIII)Lw1/o0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_0
    return-object p1

    .line 78
    :pswitch_0
    iget-object p2, p0, LZ0/a;->t:Landroid/view/ViewGroup;

    .line 79
    .line 80
    check-cast p2, LZ0/r;

    .line 81
    .line 82
    invoke-virtual {p2, p1}, LZ0/j;->n(Lw1/o0;)Lw1/o0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lv3/l;)Lv3/l;
    .locals 14

    .line 1
    iget v0, p0, LZ0/a;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ0/a;->t:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast v0, La1/h;

    .line 9
    .line 10
    iget-boolean v1, v0, La1/h;->B:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    sub-int/2addr v5, v6

    .line 45
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    sub-int/2addr v0, v2

    .line 58
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-static {v3, v4, v5, v0}, Ln1/b;->b(IIII)Ln1/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget v1, v0, Ln1/b;->a:I

    .line 76
    .line 77
    new-instance v2, Lv3/l;

    .line 78
    .line 79
    iget-object v3, p1, Lv3/l;->r:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ln1/b;

    .line 82
    .line 83
    iget v4, v0, Ln1/b;->b:I

    .line 84
    .line 85
    iget v5, v0, Ln1/b;->c:I

    .line 86
    .line 87
    iget v0, v0, Ln1/b;->d:I

    .line 88
    .line 89
    invoke-static {v3, v1, v4, v5, v0}, Lw1/o0;->e(Ln1/b;IIII)Ln1/b;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    iget-object p1, p1, Lv3/l;->s:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ln1/b;

    .line 96
    .line 97
    invoke-static {p1, v1, v4, v5, v0}, Lw1/o0;->e(Ln1/b;IIII)Ln1/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const/4 v0, 0x2

    .line 102
    invoke-direct {v2, v0, v3, p1}, Lv3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object p1, v2

    .line 106
    :goto_0
    return-object p1

    .line 107
    :pswitch_0
    iget-object v0, p0, LZ0/a;->t:Landroid/view/ViewGroup;

    .line 108
    .line 109
    check-cast v0, LZ0/r;

    .line 110
    .line 111
    iget-object v0, v0, LZ0/j;->O:LB0/L;

    .line 112
    .line 113
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 114
    .line 115
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 116
    .line 117
    iget-object v1, v0, LB0/v;->a0:LB0/B0;

    .line 118
    .line 119
    iget-boolean v1, v1, Lc0/l;->D:Z

    .line 120
    .line 121
    if-nez v1, :cond_2

    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_2
    const-wide/16 v1, 0x0

    .line 126
    .line 127
    invoke-virtual {v0, v1, v2}, LB0/n0;->F(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    const/16 v3, 0x20

    .line 136
    .line 137
    shr-long v4, v1, v3

    .line 138
    .line 139
    long-to-int v4, v4

    .line 140
    const/4 v5, 0x0

    .line 141
    if-gez v4, :cond_3

    .line 142
    .line 143
    move v4, v5

    .line 144
    :cond_3
    const-wide v6, 0xffffffffL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    and-long/2addr v1, v6

    .line 150
    long-to-int v1, v1

    .line 151
    if-gez v1, :cond_4

    .line 152
    .line 153
    move v1, v5

    .line 154
    :cond_4
    invoke-static {v0}, Lz0/O;->f(Lz0/m;)Lz0/m;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, Lz0/m;->E()J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    shr-long v10, v8, v3

    .line 163
    .line 164
    long-to-int v2, v10

    .line 165
    and-long/2addr v8, v6

    .line 166
    long-to-int v8, v8

    .line 167
    iget-wide v9, v0, Lz0/J;->s:J

    .line 168
    .line 169
    shr-long v11, v9, v3

    .line 170
    .line 171
    long-to-int v11, v11

    .line 172
    and-long/2addr v9, v6

    .line 173
    long-to-int v9, v9

    .line 174
    int-to-float v10, v11

    .line 175
    int-to-float v9, v9

    .line 176
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    int-to-long v10, v10

    .line 181
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    int-to-long v12, v9

    .line 186
    shl-long v9, v10, v3

    .line 187
    .line 188
    and-long v11, v12, v6

    .line 189
    .line 190
    or-long/2addr v9, v11

    .line 191
    invoke-virtual {v0, v9, v10}, LB0/n0;->F(J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v9

    .line 195
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/K1;->K(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v9

    .line 199
    shr-long v11, v9, v3

    .line 200
    .line 201
    long-to-int v0, v11

    .line 202
    sub-int/2addr v2, v0

    .line 203
    if-gez v2, :cond_5

    .line 204
    .line 205
    move v2, v5

    .line 206
    :cond_5
    and-long/2addr v6, v9

    .line 207
    long-to-int v0, v6

    .line 208
    sub-int/2addr v8, v0

    .line 209
    if-gez v8, :cond_6

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_6
    move v5, v8

    .line 213
    :goto_1
    if-nez v4, :cond_7

    .line 214
    .line 215
    if-nez v1, :cond_7

    .line 216
    .line 217
    if-nez v2, :cond_7

    .line 218
    .line 219
    if-nez v5, :cond_7

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_7
    new-instance v0, Lv3/l;

    .line 223
    .line 224
    iget-object v3, p1, Lv3/l;->r:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v3, Ln1/b;

    .line 227
    .line 228
    invoke-static {v3, v4, v1, v2, v5}, LZ0/j;->m(Ln1/b;IIII)Ln1/b;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    iget-object p1, p1, Lv3/l;->s:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p1, Ln1/b;

    .line 235
    .line 236
    invoke-static {p1, v4, v1, v2, v5}, LZ0/j;->m(Ln1/b;IIII)Ln1/b;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    const/4 v1, 0x2

    .line 241
    invoke-direct {v0, v1, v3, p1}, Lv3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    move-object p1, v0

    .line 245
    :goto_2
    return-object p1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
