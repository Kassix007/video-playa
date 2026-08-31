.class public final Lu/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/S0;


# instance fields
.field public final q:Lu/s0;

.field public r:LB5/c;

.field public s:Lkotlin/jvm/internal/n;

.field public final synthetic t:Lu/p0;


# direct methods
.method public constructor <init>(Lu/p0;Lu/s0;LB5/c;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/o0;->t:Lu/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lu/o0;->q:Lu/s0;

    .line 7
    .line 8
    iput-object p3, p0, Lu/o0;->r:LB5/c;

    .line 9
    .line 10
    check-cast p4, Lkotlin/jvm/internal/n;

    .line 11
    .line 12
    iput-object p4, p0, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Lu/q0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lu/o0;->q:Lu/s0;

    .line 2
    .line 3
    iget-object v1, v0, Lu/s0;->w:LP/f0;

    .line 4
    .line 5
    iget-object v2, v0, Lu/s0;->r:LP/f0;

    .line 6
    .line 7
    iget-object v3, v0, Lu/s0;->x:LP/b0;

    .line 8
    .line 9
    iget-object v4, p0, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 10
    .line 11
    invoke-interface {p1}, Lu/q0;->c()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-interface {v4, v5}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, p0, Lu/o0;->t:Lu/p0;

    .line 20
    .line 21
    iget-object v5, v5, Lu/p0;->c:Lu/v0;

    .line 22
    .line 23
    invoke-virtual {v5}, Lu/v0;->g()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 30
    .line 31
    invoke-interface {p1}, Lu/q0;->a()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v1, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Lu/o0;->r:LB5/c;

    .line 40
    .line 41
    invoke-interface {v2, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lu/z;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v4, p1}, Lu/s0;->f(Ljava/lang/Object;Ljava/lang/Object;Lu/z;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    iget-object v5, p0, Lu/o0;->r:LB5/c;

    .line 52
    .line 53
    invoke-interface {v5, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lu/z;

    .line 58
    .line 59
    iget-boolean v5, v0, Lu/s0;->y:Z

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    iget-object v5, v0, Lu/s0;->v:Lu/n0;

    .line 64
    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    iget-object v5, v5, Lu/n0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 v5, 0x0

    .line 71
    :goto_0
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v5, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const/high16 v6, -0x40800000    # -1.0f

    .line 87
    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    invoke-virtual {v3}, LP/b0;->e()F

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    cmpg-float v5, v5, v6

    .line 95
    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    :goto_1
    return-void

    .line 99
    :cond_3
    invoke-virtual {v2, v4}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, Lu/s0;->s:LP/f0;

    .line 103
    .line 104
    invoke-virtual {v2, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, LP/b0;->e()F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 112
    .line 113
    cmpg-float p1, p1, v2

    .line 114
    .line 115
    if-nez p1, :cond_4

    .line 116
    .line 117
    move-object p1, v4

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    iget-object p1, v0, Lu/s0;->z:LP/f0;

    .line 120
    .line 121
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_2
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    const/4 v7, 0x1

    .line 136
    xor-int/2addr v5, v7

    .line 137
    invoke-virtual {v0, p1, v5}, Lu/s0;->e(Ljava/lang/Object;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, LP/b0;->e()F

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    cmpg-float p1, p1, v2

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    if-nez p1, :cond_5

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    move v7, v5

    .line 151
    :goto_3
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {v1, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, LP/b0;->e()F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    const/4 v1, 0x0

    .line 163
    cmpl-float p1, p1, v1

    .line 164
    .line 165
    if-ltz p1, :cond_6

    .line 166
    .line 167
    invoke-virtual {v0}, Lu/s0;->b()Lu/n0;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1}, Lu/n0;->c()J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    invoke-virtual {v0}, Lu/s0;->b()Lu/n0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    long-to-float v1, v1

    .line 180
    invoke-virtual {v3}, LP/b0;->e()F

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    mul-float/2addr v2, v1

    .line 185
    float-to-long v1, v2

    .line 186
    invoke-virtual {p1, v1, v2}, Lu/n0;->b(J)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {v0, p1}, Lu/s0;->d(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_6
    invoke-virtual {v3}, LP/b0;->e()F

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    cmpg-float p1, p1, v2

    .line 199
    .line 200
    if-nez p1, :cond_7

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Lu/s0;->d(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_7
    :goto_4
    iput-boolean v5, v0, Lu/s0;->y:Z

    .line 206
    .line 207
    invoke-virtual {v3, v6}, LP/b0;->f(F)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu/o0;->t:Lu/p0;

    .line 2
    .line 3
    iget-object v0, v0, Lu/p0;->c:Lu/v0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lu/v0;->f()Lu/q0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lu/o0;->b(Lu/q0;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lu/o0;->q:Lu/s0;

    .line 13
    .line 14
    iget-object v0, v0, Lu/s0;->z:LP/f0;

    .line 15
    .line 16
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
