.class public final LM/T;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:J

.field public final synthetic B:F

.field public final synthetic C:LB5/e;

.field public final synthetic D:LB5/e;

.field public final synthetic E:LX/e;

.field public final synthetic q:J

.field public final synthetic r:LB5/a;

.field public final synthetic s:LM/I0;

.field public final synthetic t:Lu/c;

.field public final synthetic u:LM5/w;

.field public final synthetic v:LB5/c;

.field public final synthetic w:Lc0/m;

.field public final synthetic x:F

.field public final synthetic y:Lj0/E;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(JLB5/a;LM/I0;Lu/c;LM5/w;LB5/c;Lc0/m;FLj0/E;JJFLB5/e;LB5/e;LX/e;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LM/T;->q:J

    .line 2
    .line 3
    iput-object p3, p0, LM/T;->r:LB5/a;

    .line 4
    .line 5
    iput-object p4, p0, LM/T;->s:LM/I0;

    .line 6
    .line 7
    iput-object p5, p0, LM/T;->t:Lu/c;

    .line 8
    .line 9
    iput-object p6, p0, LM/T;->u:LM5/w;

    .line 10
    .line 11
    iput-object p7, p0, LM/T;->v:LB5/c;

    .line 12
    .line 13
    iput-object p8, p0, LM/T;->w:Lc0/m;

    .line 14
    .line 15
    iput p9, p0, LM/T;->x:F

    .line 16
    .line 17
    iput-object p10, p0, LM/T;->y:Lj0/E;

    .line 18
    .line 19
    iput-wide p11, p0, LM/T;->z:J

    .line 20
    .line 21
    iput-wide p13, p0, LM/T;->A:J

    .line 22
    .line 23
    iput p15, p0, LM/T;->B:F

    .line 24
    .line 25
    move-object/from16 p1, p16

    .line 26
    .line 27
    iput-object p1, p0, LM/T;->C:LB5/e;

    .line 28
    .line 29
    move-object/from16 p1, p17

    .line 30
    .line 31
    iput-object p1, p0, LM/T;->D:LB5/e;

    .line 32
    .line 33
    move-object/from16 p1, p18

    .line 34
    .line 35
    iput-object p1, p0, LM/T;->E:LX/e;

    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, LP/o;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    and-int/2addr v1, v2

    .line 17
    const/4 v3, 0x2

    .line 18
    if-ne v1, v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v5}, LP/o;->x()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v5}, LP/o;->N()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    :goto_0
    sget-object v1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    new-instance v3, LA/d0;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-direct {v3, v2, v4}, LA/d0;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v3}, Lc0/o;->a(Lc0/m;LB5/f;)Lc0/m;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, LM/d;->s:LM/d;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-static {v1, v3, v2}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v2, Lc0/b;->q:Lc0/e;

    .line 52
    .line 53
    invoke-static {v2, v3}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v4, v5, LP/o;->P:I

    .line 58
    .line 59
    invoke-virtual {v5}, LP/o;->m()LP/i0;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-static {v5, v1}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v7, LB0/k;->a:LB0/j;

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v7, LB0/j;->b:LB0/D;

    .line 73
    .line 74
    invoke-virtual {v5}, LP/o;->W()V

    .line 75
    .line 76
    .line 77
    iget-boolean v8, v5, LP/o;->O:Z

    .line 78
    .line 79
    if-eqz v8, :cond_2

    .line 80
    .line 81
    invoke-virtual {v5, v7}, LP/o;->l(LB5/a;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {v5}, LP/o;->g0()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v7, LB0/j;->e:LB0/i;

    .line 89
    .line 90
    invoke-static {v7, v5, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, LB0/j;->d:LB0/i;

    .line 94
    .line 95
    invoke-static {v2, v5, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v2, LB0/j;->f:LB0/i;

    .line 99
    .line 100
    iget-boolean v6, v5, LP/o;->O:Z

    .line 101
    .line 102
    if-nez v6, :cond_3

    .line 103
    .line 104
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_4

    .line 117
    .line 118
    :cond_3
    invoke-static {v4, v5, v4, v2}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    sget-object v2, LB0/j;->c:LB0/i;

    .line 122
    .line 123
    invoke-static {v2, v5, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v0, LM/T;->s:LM/I0;

    .line 127
    .line 128
    iget-object v1, v7, LM/I0;->c:LN/r;

    .line 129
    .line 130
    iget-object v1, v1, LN/r;->h:LP/C;

    .line 131
    .line 132
    invoke-virtual {v1}, LP/C;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, LM/J0;

    .line 137
    .line 138
    sget-object v2, LM/J0;->q:LM/J0;

    .line 139
    .line 140
    const/4 v8, 0x1

    .line 141
    if-eq v1, v2, :cond_5

    .line 142
    .line 143
    move v4, v8

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    move v4, v3

    .line 146
    :goto_2
    const/4 v6, 0x0

    .line 147
    iget-wide v1, v0, LM/T;->q:J

    .line 148
    .line 149
    iget-object v3, v0, LM/T;->r:LB5/a;

    .line 150
    .line 151
    invoke-static/range {v1 .. v6}, LM/g0;->c(JLB5/a;ZLP/o;I)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v17, v5

    .line 155
    .line 156
    const/16 v18, 0x46

    .line 157
    .line 158
    iget-object v1, v0, LM/T;->t:Lu/c;

    .line 159
    .line 160
    iget-object v2, v0, LM/T;->u:LM5/w;

    .line 161
    .line 162
    iget-object v4, v0, LM/T;->v:LB5/c;

    .line 163
    .line 164
    iget-object v5, v0, LM/T;->w:Lc0/m;

    .line 165
    .line 166
    move-object v6, v7

    .line 167
    iget v7, v0, LM/T;->x:F

    .line 168
    .line 169
    move v9, v8

    .line 170
    iget-object v8, v0, LM/T;->y:Lj0/E;

    .line 171
    .line 172
    move v11, v9

    .line 173
    iget-wide v9, v0, LM/T;->z:J

    .line 174
    .line 175
    move v13, v11

    .line 176
    iget-wide v11, v0, LM/T;->A:J

    .line 177
    .line 178
    move v14, v13

    .line 179
    iget v13, v0, LM/T;->B:F

    .line 180
    .line 181
    move v15, v14

    .line 182
    iget-object v14, v0, LM/T;->C:LB5/e;

    .line 183
    .line 184
    move/from16 v16, v15

    .line 185
    .line 186
    iget-object v15, v0, LM/T;->D:LB5/e;

    .line 187
    .line 188
    move-object/from16 p1, v1

    .line 189
    .line 190
    iget-object v1, v0, LM/T;->E:LX/e;

    .line 191
    .line 192
    move/from16 v0, v16

    .line 193
    .line 194
    move-object/from16 v16, v1

    .line 195
    .line 196
    move-object/from16 v1, p1

    .line 197
    .line 198
    invoke-static/range {v1 .. v18}, LM/g0;->b(Lu/c;LM5/w;LB5/a;LB5/c;Lc0/m;LM/I0;FLj0/E;JJFLB5/e;LB5/e;LX/e;LP/o;I)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v5, v17

    .line 202
    .line 203
    invoke-virtual {v5, v0}, LP/o;->p(Z)V

    .line 204
    .line 205
    .line 206
    :goto_3
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 207
    .line 208
    return-object v0
.end method
