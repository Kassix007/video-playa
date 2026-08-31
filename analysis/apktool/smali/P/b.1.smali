.class public final LP/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:LP/F;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP/b;->a:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, LP/F;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LP/b;->b:LP/F;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(LP/m0;LX/e;LP/o;I)V
    .locals 11

    .line 1
    const v0, -0x50862cb8

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LP/o;->w:LB0/w;

    .line 8
    .line 9
    invoke-virtual {p2}, LP/o;->m()LP/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0xc9

    .line 14
    .line 15
    sget-object v3, LP/p;->b:LP/Z;

    .line 16
    .line 17
    invoke-virtual {p2, v2, v3}, LP/o;->Q(ILP/Z;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v3, LP/k;->a:LP/S;

    .line 25
    .line 26
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move-object v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"

    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v2, LP/V0;

    .line 41
    .line 42
    :goto_0
    iget-object v3, p0, LP/m0;->a:LP/l0;

    .line 43
    .line 44
    invoke-virtual {v3, p0, v2}, LP/l0;->c(LP/m0;LP/V0;)LP/V0;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2, v5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-boolean v6, p2, LP/o;->O:Z

    .line 58
    .line 59
    const/4 v7, 0x1

    .line 60
    const/4 v8, 0x0

    .line 61
    if-eqz v6, :cond_6

    .line 62
    .line 63
    iget-boolean v2, p0, LP/m0;->f:Z

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    move-object v2, v1

    .line 68
    check-cast v2, LX/i;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, LX/i;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    :cond_2
    check-cast v1, LX/i;

    .line 77
    .line 78
    iget-object v2, v1, LU/c;->q:LU/m;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {v2, v6, v8, v3, v5}, LU/m;->u(IILjava/lang/Object;Ljava/lang/Object;)LU/l;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-nez v2, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    new-instance v3, LX/i;

    .line 92
    .line 93
    iget-object v5, v2, LU/l;->r:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, LU/m;

    .line 96
    .line 97
    iget v1, v1, LU/c;->r:I

    .line 98
    .line 99
    iget v2, v2, LU/l;->q:I

    .line 100
    .line 101
    add-int/2addr v1, v2

    .line 102
    invoke-direct {v3, v5, v1}, LU/c;-><init>(LU/m;I)V

    .line 103
    .line 104
    .line 105
    move-object v1, v3

    .line 106
    :cond_4
    :goto_1
    iput-boolean v7, p2, LP/o;->I:Z

    .line 107
    .line 108
    :cond_5
    move v2, v8

    .line 109
    goto :goto_5

    .line 110
    :cond_6
    iget-object v6, p2, LP/o;->F:LP/z0;

    .line 111
    .line 112
    iget v9, v6, LP/z0;->g:I

    .line 113
    .line 114
    iget-object v10, v6, LP/z0;->b:[I

    .line 115
    .line 116
    invoke-virtual {v6, v10, v9}, LP/z0;->b([II)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const-string v9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    .line 121
    .line 122
    invoke-static {v6, v9}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    check-cast v6, LP/i0;

    .line 126
    .line 127
    invoke-virtual {p2}, LP/o;->x()Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_7

    .line 132
    .line 133
    if-nez v2, :cond_8

    .line 134
    .line 135
    :cond_7
    iget-boolean v9, p0, LP/m0;->f:Z

    .line 136
    .line 137
    if-nez v9, :cond_b

    .line 138
    .line 139
    move-object v9, v1

    .line 140
    check-cast v9, LX/i;

    .line 141
    .line 142
    invoke-virtual {v9, v3}, LX/i;->containsKey(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_8

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_8
    if-eqz v2, :cond_9

    .line 150
    .line 151
    iget-boolean v2, p2, LP/o;->v:Z

    .line 152
    .line 153
    if-nez v2, :cond_9

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_9
    iget-boolean v2, p2, LP/o;->v:Z

    .line 157
    .line 158
    if-eqz v2, :cond_a

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    :goto_2
    move-object v1, v6

    .line 162
    goto :goto_4

    .line 163
    :cond_b
    :goto_3
    check-cast v1, LX/i;

    .line 164
    .line 165
    iget-object v2, v1, LU/c;->q:LU/m;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    invoke-virtual {v2, v9, v8, v3, v5}, LU/m;->u(IILjava/lang/Object;Ljava/lang/Object;)LU/l;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-nez v2, :cond_c

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_c
    new-instance v3, LX/i;

    .line 179
    .line 180
    iget-object v5, v2, LU/l;->r:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v5, LU/m;

    .line 183
    .line 184
    iget v1, v1, LU/c;->r:I

    .line 185
    .line 186
    iget v2, v2, LU/l;->q:I

    .line 187
    .line 188
    add-int/2addr v1, v2

    .line 189
    invoke-direct {v3, v5, v1}, LU/c;-><init>(LU/m;I)V

    .line 190
    .line 191
    .line 192
    move-object v1, v3

    .line 193
    :goto_4
    iget-boolean v2, p2, LP/o;->x:Z

    .line 194
    .line 195
    if-nez v2, :cond_d

    .line 196
    .line 197
    if-eq v6, v1, :cond_5

    .line 198
    .line 199
    :cond_d
    move v2, v7

    .line 200
    :goto_5
    if-eqz v2, :cond_e

    .line 201
    .line 202
    iget-boolean v3, p2, LP/o;->O:Z

    .line 203
    .line 204
    if-nez v3, :cond_e

    .line 205
    .line 206
    invoke-virtual {p2, v1}, LP/o;->F(LP/i0;)V

    .line 207
    .line 208
    .line 209
    :cond_e
    iget-boolean v3, p2, LP/o;->v:Z

    .line 210
    .line 211
    invoke-virtual {v0, v3}, LB0/w;->c(I)V

    .line 212
    .line 213
    .line 214
    iput-boolean v2, p2, LP/o;->v:Z

    .line 215
    .line 216
    iput-object v1, p2, LP/o;->J:LP/i0;

    .line 217
    .line 218
    const/16 v2, 0xca

    .line 219
    .line 220
    sget-object v3, LP/p;->c:LP/Z;

    .line 221
    .line 222
    invoke-virtual {p2, v2, v8, v3, v1}, LP/o;->O(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    shr-int/lit8 v1, p3, 0x3

    .line 226
    .line 227
    and-int/lit8 v1, v1, 0xe

    .line 228
    .line 229
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {p1, p2, v1}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2, v8}, LP/o;->p(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v8}, LP/o;->p(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, LB0/w;->b()I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_f

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_f
    move v7, v8

    .line 250
    :goto_6
    iput-boolean v7, p2, LP/o;->v:Z

    .line 251
    .line 252
    iput-object v4, p2, LP/o;->J:LP/i0;

    .line 253
    .line 254
    invoke-virtual {p2}, LP/o;->r()LP/o0;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    if-eqz p2, :cond_10

    .line 259
    .line 260
    new-instance v0, LE/v;

    .line 261
    .line 262
    const/4 v1, 0x2

    .line 263
    invoke-direct {v0, p3, v1, p0, p1}, LE/v;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iput-object v0, p2, LP/o0;->d:LB5/e;

    .line 267
    .line 268
    :cond_10
    return-void
.end method

.method public static final b([LP/m0;LB5/e;LP/o;I)V
    .locals 8

    .line 1
    const v0, -0x52e5dee3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LP/o;->w:LB0/w;

    .line 8
    .line 9
    invoke-virtual {p2}, LP/o;->m()LP/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0xc9

    .line 14
    .line 15
    sget-object v3, LP/p;->b:LP/Z;

    .line 16
    .line 17
    invoke-virtual {p2, v2, v3}, LP/o;->Q(ILP/Z;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v2, p2, LP/o;->O:Z

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-object v2, LX/i;->t:LX/i;

    .line 27
    .line 28
    invoke-static {p0, v1, v2}, LP/b;->x([LP/m0;LP/i0;LP/i0;)LX/i;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p2, v1, v2}, LP/o;->c0(LP/i0;LX/i;)LX/i;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-boolean v3, p2, LP/o;->I:Z

    .line 37
    .line 38
    :cond_0
    :goto_0
    move v2, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iget-object v2, p2, LP/o;->F:LP/z0;

    .line 41
    .line 42
    iget v5, v2, LP/z0;->g:I

    .line 43
    .line 44
    invoke-virtual {v2, v5, v4}, LP/z0;->g(II)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    .line 49
    .line 50
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast v2, LP/i0;

    .line 54
    .line 55
    iget-object v6, p2, LP/o;->F:LP/z0;

    .line 56
    .line 57
    iget v7, v6, LP/z0;->g:I

    .line 58
    .line 59
    invoke-virtual {v6, v7, v3}, LP/z0;->g(II)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-static {v6, v5}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v6, LP/i0;

    .line 67
    .line 68
    invoke-static {p0, v1, v6}, LP/b;->x([LP/m0;LP/i0;LP/i0;)LX/i;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {p2}, LP/o;->x()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    iget-boolean v7, p2, LP/o;->x:Z

    .line 79
    .line 80
    if-nez v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget v1, p2, LP/o;->k:I

    .line 90
    .line 91
    iget-object v5, p2, LP/o;->F:LP/z0;

    .line 92
    .line 93
    invoke-virtual {v5}, LP/z0;->p()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    add-int/2addr v5, v1

    .line 98
    iput v5, p2, LP/o;->k:I

    .line 99
    .line 100
    move-object v1, v2

    .line 101
    goto :goto_0

    .line 102
    :cond_3
    :goto_1
    invoke-virtual {p2, v1, v5}, LP/o;->c0(LP/i0;LX/i;)LX/i;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-boolean v5, p2, LP/o;->x:Z

    .line 107
    .line 108
    if-nez v5, :cond_4

    .line 109
    .line 110
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_0

    .line 115
    .line 116
    :cond_4
    move v2, v3

    .line 117
    :goto_2
    if-eqz v2, :cond_5

    .line 118
    .line 119
    iget-boolean v5, p2, LP/o;->O:Z

    .line 120
    .line 121
    if-nez v5, :cond_5

    .line 122
    .line 123
    invoke-virtual {p2, v1}, LP/o;->F(LP/i0;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    iget-boolean v5, p2, LP/o;->v:Z

    .line 127
    .line 128
    invoke-virtual {v0, v5}, LB0/w;->c(I)V

    .line 129
    .line 130
    .line 131
    iput-boolean v2, p2, LP/o;->v:Z

    .line 132
    .line 133
    iput-object v1, p2, LP/o;->J:LP/i0;

    .line 134
    .line 135
    const/16 v2, 0xca

    .line 136
    .line 137
    sget-object v5, LP/p;->c:LP/Z;

    .line 138
    .line 139
    invoke-virtual {p2, v2, v4, v5, v1}, LP/o;->O(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    shr-int/lit8 v1, p3, 0x3

    .line 143
    .line 144
    and-int/lit8 v1, v1, 0xe

    .line 145
    .line 146
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {p1, p2, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v4}, LP/o;->p(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v4}, LP/o;->p(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, LB0/w;->b()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move v3, v4

    .line 167
    :goto_3
    iput-boolean v3, p2, LP/o;->v:Z

    .line 168
    .line 169
    const/4 v0, 0x0

    .line 170
    iput-object v0, p2, LP/o;->J:LP/i0;

    .line 171
    .line 172
    invoke-virtual {p2}, LP/o;->r()LP/o0;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-eqz p2, :cond_7

    .line 177
    .line 178
    new-instance v0, LE/v;

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    invoke-direct {v0, p3, v1, p0, p1}, LE/v;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iput-object v0, p2, LP/o0;->d:LB5/e;

    .line 185
    .line 186
    :cond_7
    return-void
.end method

.method public static final c(Ljava/lang/Object;LB5/c;LP/o;)V
    .locals 1

    .line 1
    invoke-virtual {p2, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, LP/k;->a:LP/S;

    .line 12
    .line 13
    if-ne v0, p0, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, LP/D;

    .line 16
    .line 17
    invoke-direct {v0, p1}, LP/D;-><init>(LB5/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    check-cast v0, LP/D;

    .line 24
    .line 25
    return-void
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;LB5/c;LP/o;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p3, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    or-int/2addr p0, p1

    .line 10
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    sget-object p0, LP/k;->a:LP/S;

    .line 17
    .line 18
    if-ne p1, p0, :cond_1

    .line 19
    .line 20
    :cond_0
    new-instance p1, LP/D;

    .line 21
    .line 22
    invoke-direct {p1, p2}, LP/D;-><init>(LB5/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    check-cast p1, LP/D;

    .line 29
    .line 30
    return-void
.end method

.method public static final e(LB5/e;LP/o;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p1, LP/o;->b:LP/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/r;->h()Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, p2}, LP/o;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p2, LP/k;->a:LP/S;

    .line 18
    .line 19
    if-ne v1, p2, :cond_1

    .line 20
    .line 21
    :cond_0
    new-instance v1, LP/P;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0}, LP/P;-><init>(Lq5/h;LB5/e;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    check-cast v1, LP/P;

    .line 30
    .line 31
    return-void
.end method

.method public static final f(Ljava/lang/Object;Ljava/lang/Object;LB5/e;LP/o;)V
    .locals 1

    .line 1
    iget-object v0, p3, LP/o;->b:LP/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/r;->h()Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p3, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-virtual {p3, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    or-int/2addr p0, p1

    .line 16
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    sget-object p0, LP/k;->a:LP/S;

    .line 23
    .line 24
    if-ne p1, p0, :cond_1

    .line 25
    .line 26
    :cond_0
    new-instance p1, LP/P;

    .line 27
    .line 28
    invoke-direct {p1, v0, p2}, LP/P;-><init>(Lq5/h;LB5/e;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    check-cast p1, LP/P;

    .line 35
    .line 36
    return-void
.end method

.method public static final g(LB5/a;LP/o;)V
    .locals 1

    .line 1
    iget-object p1, p1, LP/o;->L:LQ/b;

    .line 2
    .line 3
    iget-object p1, p1, LQ/b;->b:LQ/a;

    .line 4
    .line 5
    iget-object p1, p1, LQ/a;->o:LQ/K;

    .line 6
    .line 7
    sget-object v0, LQ/A;->c:LQ/A;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LQ/K;->W(LQ/I;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, LD5/a;->I(LQ/K;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final h(Lr/u;I)V
    .locals 3

    .line 1
    iget v0, p0, Lr/u;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lr/u;->c(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lr/u;->b:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lr/u;->c(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    iget v0, p0, Lr/u;->b:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lr/u;->a(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    if-lez v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x1

    .line 31
    .line 32
    ushr-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lr/u;->c(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-le p1, v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v0, v2}, Lr/u;->e(II)V

    .line 43
    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0, v0, p1}, Lr/u;->e(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static i(LP/D0;Ljava/util/List;LP/u;)V
    .locals 5

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ljava/util/Collection;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_3

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LP/a;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, LP/D0;->c(LP/a;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0, v2}, LP/D0;->q(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, p0, LP/D0;->b:[I

    .line 32
    .line 33
    invoke-virtual {p0, v4, v3}, LP/D0;->K([II)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, LP/D0;->b:[I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    invoke-virtual {p0, v2}, LP/D0;->q(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p0, v4, v2}, LP/D0;->f([II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ge v3, v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0, v3}, LP/D0;->g(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object v3, p0, LP/D0;->c:[Ljava/lang/Object;

    .line 56
    .line 57
    aget-object v2, v3, v2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    sget-object v2, LP/k;->a:LP/S;

    .line 61
    .line 62
    :goto_1
    instance-of v3, v2, LP/o0;

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    check-cast v2, LP/o0;

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    const/4 v2, 0x0

    .line 70
    :goto_2
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iput-object p2, v2, LP/o0;->b:LP/u;

    .line 73
    .line 74
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-void
.end method

.method public static final j(LP5/P;LP/o;)LP/W;
    .locals 7

    .line 1
    invoke-interface {p0}, LP5/P;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lq5/i;->q:Lq5/i;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    or-int/2addr v2, v3

    .line 16
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    sget-object v5, LP/k;->a:LP/S;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    if-ne v3, v5, :cond_1

    .line 26
    .line 27
    :cond_0
    new-instance v3, LP/O0;

    .line 28
    .line 29
    invoke-direct {v3, v1, p0, v4}, LP/O0;-><init>(Lq5/h;LP5/h;Lq5/c;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast v3, LB5/e;

    .line 36
    .line 37
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-ne v2, v5, :cond_2

    .line 42
    .line 43
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    check-cast v2, LP/W;

    .line 51
    .line 52
    invoke-virtual {p1, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    if-ne v6, v5, :cond_4

    .line 63
    .line 64
    :cond_3
    new-instance v6, LP/L0;

    .line 65
    .line 66
    invoke-direct {v6, v3, v2, v4}, LP/L0;-><init>(LB5/e;LP/W;Lq5/c;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v6}, LP/o;->d0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    check-cast v6, LB5/e;

    .line 73
    .line 74
    invoke-static {p0, v1, v6, p1}, LP/b;->f(Ljava/lang/Object;Ljava/lang/Object;LB5/e;LP/o;)V

    .line 75
    .line 76
    .line 77
    return-object v2
.end method

.method public static final k(LP/o;)LM5/w;
    .locals 1

    .line 1
    iget-object p0, p0, LP/o;->b:LP/r;

    .line 2
    .line 3
    invoke-virtual {p0}, LP/r;->h()Lq5/h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, LP/y0;

    .line 8
    .line 9
    invoke-direct {v0, p0}, LP/y0;-><init>(Lq5/h;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final l()LR/e;
    .locals 3

    .line 1
    sget-object v0, LP/J0;->b:LB0/G0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/G0;->s()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LR/e;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, LR/e;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [LP/n;

    .line 15
    .line 16
    invoke-direct {v1, v2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, LB0/G0;->T(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final m(LB5/a;)LP/C;
    .locals 2

    .line 1
    sget-object v0, LP/J0;->a:LB0/G0;

    .line 2
    .line 3
    new-instance v0, LP/C;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, LP/C;-><init>(LB5/a;LP/I0;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final n(LB5/a;LP/I0;)LP/C;
    .locals 1

    .line 1
    sget-object v0, LP/J0;->a:LB0/G0;

    .line 2
    .line 3
    new-instance v0, LP/C;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, LP/C;-><init>(LB5/a;LP/I0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final o(Lq5/h;)LP/T;
    .locals 1

    .line 1
    sget-object v0, LP/S;->r:LP/S;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LP/T;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static p(LP/D0;ILP/D0;ZZZ)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, LP/D0;->s(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    iget-object v5, v0, LP/D0;->b:[I

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, LP/D0;->q(I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {v0, v5, v6}, LP/D0;->f([II)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iget-object v6, v0, LP/D0;->b:[I

    .line 24
    .line 25
    invoke-virtual {v0, v4}, LP/D0;->q(I)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {v0, v6, v7}, LP/D0;->f([II)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    sub-int v7, v6, v5

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    if-ltz v1, :cond_0

    .line 37
    .line 38
    iget-object v10, v0, LP/D0;->b:[I

    .line 39
    .line 40
    invoke-virtual/range {p0 .. p1}, LP/D0;->q(I)I

    .line 41
    .line 42
    .line 43
    move-result v11

    .line 44
    mul-int/lit8 v11, v11, 0x5

    .line 45
    .line 46
    add-int/2addr v11, v9

    .line 47
    aget v10, v10, v11

    .line 48
    .line 49
    const/high16 v11, 0xc000000

    .line 50
    .line 51
    and-int/2addr v10, v11

    .line 52
    if-eqz v10, :cond_0

    .line 53
    .line 54
    move v10, v9

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v10, 0x0

    .line 57
    :goto_0
    invoke-virtual {v2, v3}, LP/D0;->u(I)V

    .line 58
    .line 59
    .line 60
    iget v11, v2, LP/D0;->t:I

    .line 61
    .line 62
    invoke-virtual {v2, v7, v11}, LP/D0;->v(II)V

    .line 63
    .line 64
    .line 65
    iget v11, v0, LP/D0;->g:I

    .line 66
    .line 67
    if-ge v11, v4, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0, v4}, LP/D0;->z(I)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget v11, v0, LP/D0;->k:I

    .line 73
    .line 74
    if-ge v11, v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v6, v4}, LP/D0;->A(II)V

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v6, v2, LP/D0;->b:[I

    .line 80
    .line 81
    iget v11, v2, LP/D0;->t:I

    .line 82
    .line 83
    iget-object v12, v0, LP/D0;->b:[I

    .line 84
    .line 85
    mul-int/lit8 v13, v11, 0x5

    .line 86
    .line 87
    mul-int/lit8 v14, v1, 0x5

    .line 88
    .line 89
    mul-int/lit8 v15, v4, 0x5

    .line 90
    .line 91
    invoke-static {v13, v14, v15, v12, v6}, Ln5/k;->C0(III[I[I)V

    .line 92
    .line 93
    .line 94
    iget-object v12, v2, LP/D0;->c:[Ljava/lang/Object;

    .line 95
    .line 96
    iget v14, v2, LP/D0;->i:I

    .line 97
    .line 98
    iget-object v15, v0, LP/D0;->c:[Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    .line 102
    .line 103
    iget v15, v2, LP/D0;->v:I

    .line 104
    .line 105
    add-int/lit8 v16, v13, 0x2

    .line 106
    .line 107
    aput v15, v6, v16

    .line 108
    .line 109
    sub-int v16, v11, v1

    .line 110
    .line 111
    add-int v8, v11, v3

    .line 112
    .line 113
    invoke-virtual {v2, v6, v11}, LP/D0;->f([II)I

    .line 114
    .line 115
    .line 116
    move-result v18

    .line 117
    sub-int v18, v14, v18

    .line 118
    .line 119
    move/from16 v19, v9

    .line 120
    .line 121
    iget v9, v2, LP/D0;->m:I

    .line 122
    .line 123
    move/from16 v20, v9

    .line 124
    .line 125
    iget v9, v2, LP/D0;->l:I

    .line 126
    .line 127
    array-length v12, v12

    .line 128
    move/from16 v21, v10

    .line 129
    .line 130
    move/from16 v10, v20

    .line 131
    .line 132
    move/from16 v20, v13

    .line 133
    .line 134
    move v13, v11

    .line 135
    :goto_1
    if-ge v13, v8, :cond_6

    .line 136
    .line 137
    if-eq v13, v11, :cond_3

    .line 138
    .line 139
    mul-int/lit8 v22, v13, 0x5

    .line 140
    .line 141
    add-int/lit8 v22, v22, 0x2

    .line 142
    .line 143
    aget v23, v6, v22

    .line 144
    .line 145
    add-int v23, v23, v16

    .line 146
    .line 147
    aput v23, v6, v22

    .line 148
    .line 149
    :cond_3
    invoke-virtual {v2, v6, v13}, LP/D0;->f([II)I

    .line 150
    .line 151
    .line 152
    move-result v22

    .line 153
    move-object/from16 v23, v6

    .line 154
    .line 155
    add-int v6, v22, v18

    .line 156
    .line 157
    if-ge v10, v13, :cond_4

    .line 158
    .line 159
    move/from16 v22, v11

    .line 160
    .line 161
    const/4 v11, 0x0

    .line 162
    goto :goto_2

    .line 163
    :cond_4
    move/from16 v22, v11

    .line 164
    .line 165
    iget v11, v2, LP/D0;->k:I

    .line 166
    .line 167
    :goto_2
    invoke-static {v6, v11, v9, v12}, LP/D0;->h(IIII)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    mul-int/lit8 v11, v13, 0x5

    .line 172
    .line 173
    add-int/lit8 v11, v11, 0x4

    .line 174
    .line 175
    aput v6, v23, v11

    .line 176
    .line 177
    if-ne v13, v10, :cond_5

    .line 178
    .line 179
    add-int/lit8 v10, v10, 0x1

    .line 180
    .line 181
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 182
    .line 183
    move/from16 v11, v22

    .line 184
    .line 185
    move-object/from16 v6, v23

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_6
    move-object/from16 v23, v6

    .line 189
    .line 190
    iput v10, v2, LP/D0;->m:I

    .line 191
    .line 192
    iget-object v6, v0, LP/D0;->d:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v0}, LP/D0;->n()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    invoke-static {v6, v1, v9}, LP/C0;->b(Ljava/util/ArrayList;II)I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    iget-object v9, v0, LP/D0;->d:Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-virtual {v0}, LP/D0;->n()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-static {v9, v4, v10}, LP/C0;->b(Ljava/util/ArrayList;II)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-ge v6, v4, :cond_8

    .line 213
    .line 214
    iget-object v9, v0, LP/D0;->d:Ljava/util/ArrayList;

    .line 215
    .line 216
    new-instance v10, Ljava/util/ArrayList;

    .line 217
    .line 218
    sub-int v11, v4, v6

    .line 219
    .line 220
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 221
    .line 222
    .line 223
    move v11, v6

    .line 224
    :goto_3
    if-ge v11, v4, :cond_7

    .line 225
    .line 226
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    check-cast v12, LP/a;

    .line 231
    .line 232
    iget v13, v12, LP/a;->a:I

    .line 233
    .line 234
    add-int v13, v13, v16

    .line 235
    .line 236
    iput v13, v12, LP/a;->a:I

    .line 237
    .line 238
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    add-int/lit8 v11, v11, 0x1

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_7
    iget-object v11, v2, LP/D0;->d:Ljava/util/ArrayList;

    .line 245
    .line 246
    iget v12, v2, LP/D0;->t:I

    .line 247
    .line 248
    invoke-virtual {v2}, LP/D0;->n()I

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    invoke-static {v11, v12, v13}, LP/C0;->b(Ljava/util/ArrayList;II)I

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    iget-object v12, v2, LP/D0;->d:Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_8
    sget-object v10, Ln5/s;->q:Ln5/s;

    .line 270
    .line 271
    :goto_4
    move-object v4, v10

    .line 272
    check-cast v4, Ljava/util/Collection;

    .line 273
    .line 274
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-nez v6, :cond_9

    .line 279
    .line 280
    iget-object v6, v0, LP/D0;->e:Ljava/util/HashMap;

    .line 281
    .line 282
    iget-object v9, v2, LP/D0;->e:Ljava/util/HashMap;

    .line 283
    .line 284
    if-eqz v6, :cond_9

    .line 285
    .line 286
    if-eqz v9, :cond_9

    .line 287
    .line 288
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    const/4 v9, 0x0

    .line 293
    :goto_5
    if-ge v9, v4, :cond_9

    .line 294
    .line 295
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    check-cast v11, LP/a;

    .line 300
    .line 301
    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    check-cast v11, LP/K;

    .line 306
    .line 307
    add-int/lit8 v9, v9, 0x1

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_9
    iget v4, v2, LP/D0;->v:I

    .line 311
    .line 312
    iget-object v4, v2, LP/D0;->e:Ljava/util/HashMap;

    .line 313
    .line 314
    if-eqz v4, :cond_a

    .line 315
    .line 316
    invoke-virtual {v2, v15}, LP/D0;->P(I)LP/a;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    if-eqz v6, :cond_a

    .line 321
    .line 322
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    check-cast v4, LP/K;

    .line 327
    .line 328
    :cond_a
    iget-object v4, v0, LP/D0;->b:[I

    .line 329
    .line 330
    invoke-virtual {v0, v4, v1}, LP/D0;->C([II)I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-nez p5, :cond_b

    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_b
    if-eqz p3, :cond_f

    .line 340
    .line 341
    if-ltz v4, :cond_c

    .line 342
    .line 343
    move/from16 v17, v19

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_c
    const/16 v17, 0x0

    .line 347
    .line 348
    :goto_6
    if-eqz v17, :cond_d

    .line 349
    .line 350
    invoke-virtual {v0}, LP/D0;->N()V

    .line 351
    .line 352
    .line 353
    iget v3, v0, LP/D0;->t:I

    .line 354
    .line 355
    sub-int/2addr v4, v3

    .line 356
    invoke-virtual {v0, v4}, LP/D0;->a(I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, LP/D0;->N()V

    .line 360
    .line 361
    .line 362
    :cond_d
    iget v3, v0, LP/D0;->t:I

    .line 363
    .line 364
    sub-int/2addr v1, v3

    .line 365
    invoke-virtual {v0, v1}, LP/D0;->a(I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, LP/D0;->F()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v17, :cond_e

    .line 373
    .line 374
    invoke-virtual {v0}, LP/D0;->J()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, LP/D0;->i()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, LP/D0;->J()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0}, LP/D0;->i()V

    .line 384
    .line 385
    .line 386
    :cond_e
    move/from16 v17, v1

    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_f
    invoke-virtual {v0, v1, v3}, LP/D0;->G(II)Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    add-int/lit8 v1, v1, -0x1

    .line 394
    .line 395
    invoke-virtual {v0, v5, v7, v1}, LP/D0;->H(III)V

    .line 396
    .line 397
    .line 398
    move/from16 v17, v3

    .line 399
    .line 400
    :goto_7
    if-eqz v17, :cond_10

    .line 401
    .line 402
    const-string v0, "Unexpectedly removed anchors"

    .line 403
    .line 404
    invoke-static {v0}, LP/p;->c(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :cond_10
    iget v0, v2, LP/D0;->o:I

    .line 408
    .line 409
    add-int/lit8 v13, v20, 0x1

    .line 410
    .line 411
    aget v1, v23, v13

    .line 412
    .line 413
    const/high16 v3, 0x40000000    # 2.0f

    .line 414
    .line 415
    and-int/2addr v3, v1

    .line 416
    if-eqz v3, :cond_11

    .line 417
    .line 418
    move/from16 v9, v19

    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_11
    const v3, 0x3ffffff

    .line 422
    .line 423
    .line 424
    and-int v9, v1, v3

    .line 425
    .line 426
    :goto_8
    add-int/2addr v0, v9

    .line 427
    iput v0, v2, LP/D0;->o:I

    .line 428
    .line 429
    if-eqz p4, :cond_12

    .line 430
    .line 431
    iput v8, v2, LP/D0;->t:I

    .line 432
    .line 433
    add-int/2addr v14, v7

    .line 434
    iput v14, v2, LP/D0;->i:I

    .line 435
    .line 436
    :cond_12
    if-eqz v21, :cond_13

    .line 437
    .line 438
    invoke-virtual {v2, v15}, LP/D0;->R(I)V

    .line 439
    .line 440
    .line 441
    :cond_13
    return-object v10
.end method

.method public static q(Ljava/lang/Object;)LP/f0;
    .locals 2

    .line 1
    sget-object v0, LP/S;->v:LP/S;

    .line 2
    .line 3
    new-instance v1, LP/f0;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public static final r(LP/i0;LP/l0;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, LX/i;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LX/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LP/l0;->b()LP/V0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    check-cast v0, LP/V0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, LP/V0;->a(LP/i0;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final s(LP/o;)LP/m;
    .locals 7

    .line 1
    const/16 v0, 0xce

    .line 2
    .line 3
    sget-object v1, LP/p;->e:LP/Z;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LP/o;->Q(ILP/Z;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, LP/o;->O:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LP/o;->H:LP/D0;

    .line 13
    .line 14
    invoke-static {v0}, LP/D0;->x(LP/D0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, LP/o;->z()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, LP/l;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast v0, LP/l;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_2

    .line 30
    .line 31
    new-instance v0, LP/l;

    .line 32
    .line 33
    new-instance v1, LP/m;

    .line 34
    .line 35
    iget v3, p0, LP/o;->P:I

    .line 36
    .line 37
    iget-boolean v4, p0, LP/o;->p:Z

    .line 38
    .line 39
    iget-boolean v5, p0, LP/o;->B:Z

    .line 40
    .line 41
    iget-object v2, p0, LP/o;->g:LP/u;

    .line 42
    .line 43
    iget-object v6, v2, LP/u;->H:LP/S;

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    invoke-direct/range {v1 .. v6}, LP/m;-><init>(LP/o;IZZLP/S;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1}, LP/l;-><init>(LP/m;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, LP/o;->e0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move-object v2, p0

    .line 57
    :goto_1
    iget-object p0, v0, LP/l;->q:LP/m;

    .line 58
    .line 59
    invoke-virtual {v2}, LP/o;->m()LP/i0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v1, p0, LP/m;->f:LP/f0;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-virtual {v2, v0}, LP/o;->p(Z)V

    .line 70
    .line 71
    .line 72
    return-object p0
.end method

.method public static final t(Ljava/lang/Object;LP/o;)LP/W;
    .locals 2

    .line 1
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LP/k;->a:LP/S;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    check-cast v0, LP/W;

    .line 17
    .line 18
    invoke-interface {v0, p0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final u(LB5/e;LP/o;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, LP/o;->O:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2, p0}, LP/o;->c(Ljava/lang/Object;LB5/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static final v(Lr/u;)I
    .locals 10

    .line 1
    iget v0, p0, Lr/u;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lr/u;->c(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    :cond_0
    iget v2, p0, Lr/u;->b:I

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lr/u;->c(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v2, v1, :cond_3

    .line 17
    .line 18
    iget v2, p0, Lr/u;->b:I

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Lr/u;->a:[I

    .line 23
    .line 24
    add-int/lit8 v2, v2, -0x1

    .line 25
    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    invoke-virtual {p0, v0, v2}, Lr/u;->e(II)V

    .line 29
    .line 30
    .line 31
    iget v2, p0, Lr/u;->b:I

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lr/u;->d(I)I

    .line 36
    .line 37
    .line 38
    iget v2, p0, Lr/u;->b:I

    .line 39
    .line 40
    ushr-int/lit8 v3, v2, 0x1

    .line 41
    .line 42
    move v4, v0

    .line 43
    :goto_0
    if-ge v4, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0, v4}, Lr/u;->c(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/lit8 v6, v4, 0x1

    .line 50
    .line 51
    mul-int/lit8 v6, v6, 0x2

    .line 52
    .line 53
    add-int/lit8 v7, v6, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v7}, Lr/u;->c(I)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-ge v6, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v6}, Lr/u;->c(I)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-le v9, v8, :cond_1

    .line 66
    .line 67
    if-le v9, v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {p0, v4, v9}, Lr/u;->e(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v6, v5}, Lr/u;->e(II)V

    .line 73
    .line 74
    .line 75
    move v4, v6

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    if-le v8, v5, :cond_0

    .line 78
    .line 79
    invoke-virtual {p0, v4, v8}, Lr/u;->e(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7, v5}, Lr/u;->e(II)V

    .line 83
    .line 84
    .line 85
    move v4, v7

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    const-string p0, "IntList is empty."

    .line 88
    .line 89
    invoke-static {p0}, Ls/a;->e(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    throw p0

    .line 94
    :cond_3
    return v1
.end method

.method public static final w(I)I
    .locals 3

    .line 1
    const v0, 0x12492492

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p0

    .line 5
    const v1, 0x24924924

    .line 6
    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    const v2, -0x36db6db7

    .line 10
    .line 11
    .line 12
    and-int/2addr p0, v2

    .line 13
    shr-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    or-int/2addr v2, v0

    .line 16
    or-int/2addr p0, v2

    .line 17
    shl-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    or-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public static final x([LP/m0;LP/i0;LP/i0;)LX/i;
    .locals 6

    .line 1
    sget-object v0, LX/i;->t:LX/i;

    .line 2
    .line 3
    new-instance v1, LX/h;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LX/h;-><init>(LX/i;)V

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v0, :cond_2

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    iget-object v4, v3, LP/m0;->a:LP/l0;

    .line 15
    .line 16
    iget-boolean v5, v3, LP/m0;->f:Z

    .line 17
    .line 18
    if-nez v5, :cond_0

    .line 19
    .line 20
    move-object v5, p1

    .line 21
    check-cast v5, LX/i;

    .line 22
    .line 23
    invoke-virtual {v5, v4}, LX/i;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    :cond_0
    move-object v5, p2

    .line 30
    check-cast v5, LX/i;

    .line 31
    .line 32
    invoke-virtual {v5, v4}, LX/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, LP/V0;

    .line 37
    .line 38
    invoke-virtual {v4, v3, v5}, LP/l0;->c(LP/m0;LP/V0;)LP/V0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v4, v3}, LX/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v1}, LX/h;->a()LX/i;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
