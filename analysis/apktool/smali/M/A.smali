.class public abstract LM/A;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LM/j;->w:LM/j;

    .line 2
    .line 3
    new-instance v1, LP/Q;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/Q;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final a(LM/i;LM/C0;LM/O0;LX/e;LP/o;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const v2, -0x7ec9fb7e

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, LP/o;->U(I)LP/o;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v2, v5, 0x6

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x2

    .line 30
    :goto_0
    or-int/2addr v2, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v5

    .line 33
    :goto_1
    and-int/lit8 v6, v5, 0x30

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    or-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    :cond_2
    and-int/lit16 v6, v5, 0x180

    .line 40
    .line 41
    if-nez v6, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const/16 v6, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v6

    .line 55
    :cond_4
    and-int/lit16 v6, v5, 0xc00

    .line 56
    .line 57
    if-nez v6, :cond_6

    .line 58
    .line 59
    invoke-virtual {v0, v4}, LP/o;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_5

    .line 64
    .line 65
    const/16 v6, 0x800

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_5
    const/16 v6, 0x400

    .line 69
    .line 70
    :goto_3
    or-int/2addr v2, v6

    .line 71
    :cond_6
    and-int/lit16 v2, v2, 0x493

    .line 72
    .line 73
    const/16 v6, 0x492

    .line 74
    .line 75
    if-ne v2, v6, :cond_8

    .line 76
    .line 77
    invoke-virtual {v0}, LP/o;->x()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_7

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_7
    invoke-virtual {v0}, LP/o;->N()V

    .line 85
    .line 86
    .line 87
    move-object/from16 v2, p1

    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_8
    :goto_4
    invoke-virtual {v0}, LP/o;->P()V

    .line 92
    .line 93
    .line 94
    and-int/lit8 v2, v5, 0x1

    .line 95
    .line 96
    if-eqz v2, :cond_a

    .line 97
    .line 98
    invoke-virtual {v0}, LP/o;->w()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_9

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_9
    invoke-virtual {v0}, LP/o;->N()V

    .line 106
    .line 107
    .line 108
    move-object/from16 v2, p1

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_a
    :goto_5
    sget-object v2, LM/D0;->a:LP/T0;

    .line 112
    .line 113
    invoke-virtual {v0, v2}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, LM/C0;

    .line 118
    .line 119
    :goto_6
    invoke-virtual {v0}, LP/o;->q()V

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x7

    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-static {v8, v0, v6, v7}, LM/t0;->a(FLP/o;II)Lv/P;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iget-wide v7, v1, LM/i;->a:J

    .line 130
    .line 131
    invoke-virtual {v0, v7, v8}, LP/o;->f(J)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    invoke-virtual {v0}, LP/o;->H()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    if-nez v9, :cond_b

    .line 140
    .line 141
    sget-object v9, LP/k;->a:LP/S;

    .line 142
    .line 143
    if-ne v10, v9, :cond_c

    .line 144
    .line 145
    :cond_b
    new-instance v10, LK/c;

    .line 146
    .line 147
    const v9, 0x3ecccccd    # 0.4f

    .line 148
    .line 149
    .line 150
    invoke-static {v7, v8, v9}, Lj0/o;->b(JF)J

    .line 151
    .line 152
    .line 153
    move-result-wide v11

    .line 154
    invoke-direct {v10, v7, v8, v11, v12}, LK/c;-><init>(JJ)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v10}, LP/o;->d0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    check-cast v10, LK/c;

    .line 161
    .line 162
    sget-object v7, LM/k;->a:LP/T0;

    .line 163
    .line 164
    invoke-virtual {v7, v1}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    sget-object v7, Landroidx/compose/foundation/c;->a:LP/T0;

    .line 169
    .line 170
    invoke-virtual {v7, v6}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    sget-object v6, LL/p;->a:LP/T0;

    .line 175
    .line 176
    sget-object v7, LM/l;->a:LM/l;

    .line 177
    .line 178
    invoke-virtual {v6, v7}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    sget-object v6, LM/D0;->a:LP/T0;

    .line 183
    .line 184
    invoke-virtual {v6, v2}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    sget-object v6, LK/d;->a:LP/z;

    .line 189
    .line 190
    invoke-virtual {v6, v10}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    sget-object v6, LM/P0;->a:LP/T0;

    .line 195
    .line 196
    invoke-virtual {v6, v3}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 197
    .line 198
    .line 199
    move-result-object v16

    .line 200
    filled-new-array/range {v11 .. v16}, [LP/m0;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    new-instance v7, LB0/j0;

    .line 205
    .line 206
    const/4 v8, 0x7

    .line 207
    invoke-direct {v7, v8, v3, v4}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const v8, -0x3f9276be

    .line 211
    .line 212
    .line 213
    invoke-static {v8, v7, v0}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    const/16 v8, 0x38

    .line 218
    .line 219
    invoke-static {v6, v7, v0, v8}, LP/b;->b([LP/m0;LB5/e;LP/o;I)V

    .line 220
    .line 221
    .line 222
    :goto_7
    invoke-virtual {v0}, LP/o;->r()LP/o0;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    if-eqz v7, :cond_d

    .line 227
    .line 228
    new-instance v0, LM/z;

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    invoke-direct/range {v0 .. v6}, LM/z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LX/e;II)V

    .line 232
    .line 233
    .line 234
    iput-object v0, v7, LP/o0;->d:LB5/e;

    .line 235
    .line 236
    :cond_d
    return-void
.end method
