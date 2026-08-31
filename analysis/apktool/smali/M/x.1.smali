.class public abstract LM/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lc0/j;->q:Lc0/j;

    .line 2
    .line 3
    sget v1, LO/g;->a:F

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LM/x;->a:Lc0/m;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lo0/b;Lc0/m;JLP/o;I)V
    .locals 10

    .line 1
    const v0, -0x7faffaf9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LP/o;->U(I)LP/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p5

    .line 17
    and-int/lit16 v1, p5, 0xc00

    .line 18
    .line 19
    const/16 v2, 0x800

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {p4, p2, p3}, LP/o;->f(J)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move v1, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/16 v1, 0x400

    .line 32
    .line 33
    :goto_1
    or-int/2addr v0, v1

    .line 34
    :cond_2
    and-int/lit16 v1, v0, 0x493

    .line 35
    .line 36
    const/16 v3, 0x492

    .line 37
    .line 38
    if-ne v1, v3, :cond_4

    .line 39
    .line 40
    invoke-virtual {p4}, LP/o;->x()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    invoke-virtual {p4}, LP/o;->N()V

    .line 48
    .line 49
    .line 50
    move-object v5, p0

    .line 51
    goto/16 :goto_9

    .line 52
    .line 53
    :cond_4
    :goto_2
    invoke-virtual {p4}, LP/o;->P()V

    .line 54
    .line 55
    .line 56
    and-int/lit8 v1, p5, 0x1

    .line 57
    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    invoke-virtual {p4}, LP/o;->w()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_5
    invoke-virtual {p4}, LP/o;->N()V

    .line 68
    .line 69
    .line 70
    :cond_6
    :goto_3
    invoke-virtual {p4}, LP/o;->q()V

    .line 71
    .line 72
    .line 73
    and-int/lit16 v1, v0, 0x1c00

    .line 74
    .line 75
    xor-int/lit16 v1, v1, 0xc00

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    if-le v1, v2, :cond_7

    .line 79
    .line 80
    invoke-virtual {p4, p2, p3}, LP/o;->f(J)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_8

    .line 85
    .line 86
    :cond_7
    and-int/lit16 v0, v0, 0xc00

    .line 87
    .line 88
    if-ne v0, v2, :cond_9

    .line 89
    .line 90
    :cond_8
    const/4 v0, 0x1

    .line 91
    goto :goto_4

    .line 92
    :cond_9
    move v0, v3

    .line 93
    :goto_4
    invoke-virtual {p4}, LP/o;->H()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    sget-object v0, LP/k;->a:LP/S;

    .line 100
    .line 101
    if-ne v1, v0, :cond_c

    .line 102
    .line 103
    :cond_a
    sget-wide v0, Lj0/o;->g:J

    .line 104
    .line 105
    invoke-static {p2, p3, v0, v1}, Lj0/o;->c(JJ)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_b

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    :goto_5
    move-object v1, v0

    .line 113
    goto :goto_6

    .line 114
    :cond_b
    new-instance v0, Lj0/j;

    .line 115
    .line 116
    const/4 v1, 0x5

    .line 117
    invoke-direct {v0, p2, p3, v1}, Lj0/j;-><init>(JI)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :goto_6
    invoke-virtual {p4, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_c
    move-object v8, v1

    .line 125
    check-cast v8, Lj0/j;

    .line 126
    .line 127
    const v0, -0x7fd87200

    .line 128
    .line 129
    .line 130
    invoke-virtual {p4, v0}, LP/o;->S(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4, v3}, LP/o;->p(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Lo0/b;->h()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1, v4, v5}, Li0/e;->a(JJ)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    sget-object v1, Lc0/j;->q:Lc0/j;

    .line 150
    .line 151
    if-nez v0, :cond_e

    .line 152
    .line 153
    invoke-virtual {p0}, Lo0/b;->h()J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    invoke-static {v4, v5}, Li0/e;->d(J)F

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_d

    .line 166
    .line 167
    invoke-static {v4, v5}, Li0/e;->b(J)F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_d

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_d
    move-object v0, v1

    .line 179
    goto :goto_8

    .line 180
    :cond_e
    :goto_7
    sget-object v0, LM/x;->a:Lc0/m;

    .line 181
    .line 182
    :goto_8
    invoke-interface {p1, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const/4 v7, 0x0

    .line 187
    const/16 v9, 0x16

    .line 188
    .line 189
    sget-object v6, Lz0/i;->a:Lz0/F;

    .line 190
    .line 191
    move-object v5, p0

    .line 192
    invoke-static/range {v4 .. v9}, Landroidx/compose/ui/draw/a;->b(Lc0/m;Lo0/b;Lz0/j;FLj0/j;I)Lc0/m;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-interface {p0, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0, p4, v3}, LA/n;->a(Lc0/m;LP/o;I)V

    .line 201
    .line 202
    .line 203
    :goto_9
    invoke-virtual {p4}, LP/o;->r()LP/o0;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    if-eqz p0, :cond_f

    .line 208
    .line 209
    new-instance v4, LM/w;

    .line 210
    .line 211
    move-object v6, p1

    .line 212
    move-wide v7, p2

    .line 213
    move v9, p5

    .line 214
    invoke-direct/range {v4 .. v9}, LM/w;-><init>(Lo0/b;Lc0/m;JI)V

    .line 215
    .line 216
    .line 217
    iput-object v4, p0, LP/o0;->d:LB5/e;

    .line 218
    .line 219
    :cond_f
    return-void
.end method
