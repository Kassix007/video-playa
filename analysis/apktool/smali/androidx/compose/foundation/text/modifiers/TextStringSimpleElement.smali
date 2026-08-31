.class public final Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:Ljava/lang/String;

.field public final r:LL0/F;

.field public final s:LO0/d;

.field public final t:I

.field public final u:Z

.field public final v:I

.field public final w:I


# direct methods
.method public constructor <init>(Ljava/lang/String;LL0/F;LO0/d;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 9
    .line 10
    iput p4, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 13
    .line 14
    iput p6, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 15
    .line 16
    iput p7, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 26
    .line 27
    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 37
    .line 38
    iget-object v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 48
    .line 49
    iget v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 50
    .line 51
    if-ne v0, v1, :cond_8

    .line 52
    .line 53
    iget-boolean v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 54
    .line 55
    iget-boolean v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_5

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_5
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 61
    .line 62
    iget v1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 63
    .line 64
    if-eq v0, v1, :cond_6

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_6
    iget v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 68
    .line 69
    iget p1, p1, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 70
    .line 71
    if-eq v0, p1, :cond_7

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_7
    :goto_0
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :cond_8
    :goto_1
    const/4 p1, 0x0

    .line 77
    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, LJ/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, LJ/g;->E:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 11
    .line 12
    iput-object v1, v0, LJ/g;->F:LL0/F;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 15
    .line 16
    iput-object v1, v0, LJ/g;->G:LO0/d;

    .line 17
    .line 18
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 19
    .line 20
    iput v1, v0, LJ/g;->H:I

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 23
    .line 24
    iput-boolean v1, v0, LJ/g;->I:Z

    .line 25
    .line 26
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 27
    .line 28
    iput v1, v0, LJ/g;->J:I

    .line 29
    .line 30
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 31
    .line 32
    iput v1, v0, LJ/g;->K:I

    .line 33
    .line 34
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 11

    .line 1
    check-cast p1, LJ/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LJ/g;->F:LL0/F;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 11
    .line 12
    if-eq v3, v0, :cond_1

    .line 13
    .line 14
    iget-object v4, v3, LL0/F;->a:LL0/y;

    .line 15
    .line 16
    iget-object v0, v0, LL0/F;->a:LL0/y;

    .line 17
    .line 18
    invoke-virtual {v4, v0}, LL0/y;->b(LL0/y;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :goto_0
    move v0, v1

    .line 31
    :goto_1
    iget-object v4, p1, LJ/g;->E:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iput-object v5, p1, LJ/g;->E:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    iput-object v1, p1, LJ/g;->O:LJ/e;

    .line 46
    .line 47
    move v1, v2

    .line 48
    :goto_2
    iget-object v4, p1, LJ/g;->F:LL0/F;

    .line 49
    .line 50
    if-eq v4, v3, :cond_4

    .line 51
    .line 52
    iget-object v5, v4, LL0/F;->b:LL0/q;

    .line 53
    .line 54
    iget-object v6, v3, LL0/F;->b:LL0/q;

    .line 55
    .line 56
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    iget-object v4, v4, LL0/F;->a:LL0/y;

    .line 63
    .line 64
    iget-object v5, v3, LL0/F;->a:LL0/y;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, LL0/y;->a(LL0/y;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    const/4 v4, 0x0

    .line 74
    goto :goto_4

    .line 75
    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :goto_3
    const/4 v4, 0x1

    .line 79
    :goto_4
    xor-int/2addr v4, v2

    .line 80
    iput-object v3, p1, LJ/g;->F:LL0/F;

    .line 81
    .line 82
    iget v3, p1, LJ/g;->K:I

    .line 83
    .line 84
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 85
    .line 86
    if-eq v3, v5, :cond_5

    .line 87
    .line 88
    iput v5, p1, LJ/g;->K:I

    .line 89
    .line 90
    move v4, v2

    .line 91
    :cond_5
    iget v3, p1, LJ/g;->J:I

    .line 92
    .line 93
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 94
    .line 95
    if-eq v3, v5, :cond_6

    .line 96
    .line 97
    iput v5, p1, LJ/g;->J:I

    .line 98
    .line 99
    move v4, v2

    .line 100
    :cond_6
    iget-boolean v3, p1, LJ/g;->I:Z

    .line 101
    .line 102
    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 103
    .line 104
    if-eq v3, v5, :cond_7

    .line 105
    .line 106
    iput-boolean v5, p1, LJ/g;->I:Z

    .line 107
    .line 108
    move v4, v2

    .line 109
    :cond_7
    iget-object v3, p1, LJ/g;->G:LO0/d;

    .line 110
    .line 111
    iget-object v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 112
    .line 113
    invoke-static {v3, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_8

    .line 118
    .line 119
    iput-object v5, p1, LJ/g;->G:LO0/d;

    .line 120
    .line 121
    move v4, v2

    .line 122
    :cond_8
    iget v3, p1, LJ/g;->H:I

    .line 123
    .line 124
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 125
    .line 126
    if-ne v3, v5, :cond_9

    .line 127
    .line 128
    move v2, v4

    .line 129
    goto :goto_5

    .line 130
    :cond_9
    iput v5, p1, LJ/g;->H:I

    .line 131
    .line 132
    :goto_5
    if-nez v1, :cond_a

    .line 133
    .line 134
    if-eqz v2, :cond_b

    .line 135
    .line 136
    :cond_a
    invoke-virtual {p1}, LJ/g;->x0()LJ/d;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget-object v4, p1, LJ/g;->E:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v5, p1, LJ/g;->F:LL0/F;

    .line 143
    .line 144
    iget-object v6, p1, LJ/g;->G:LO0/d;

    .line 145
    .line 146
    iget v7, p1, LJ/g;->H:I

    .line 147
    .line 148
    iget-boolean v8, p1, LJ/g;->I:Z

    .line 149
    .line 150
    iget v9, p1, LJ/g;->J:I

    .line 151
    .line 152
    iget v10, p1, LJ/g;->K:I

    .line 153
    .line 154
    iput-object v4, v3, LJ/d;->a:Ljava/lang/String;

    .line 155
    .line 156
    iput-object v5, v3, LJ/d;->b:LL0/F;

    .line 157
    .line 158
    iput-object v6, v3, LJ/d;->c:LO0/d;

    .line 159
    .line 160
    iput v7, v3, LJ/d;->d:I

    .line 161
    .line 162
    iput-boolean v8, v3, LJ/d;->e:Z

    .line 163
    .line 164
    iput v9, v3, LJ/d;->f:I

    .line 165
    .line 166
    iput v10, v3, LJ/d;->g:I

    .line 167
    .line 168
    invoke-virtual {v3}, LJ/d;->a()V

    .line 169
    .line 170
    .line 171
    :cond_b
    iget-boolean v3, p1, Lc0/l;->D:Z

    .line 172
    .line 173
    if-nez v3, :cond_c

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_c
    if-nez v1, :cond_d

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    iget-object v3, p1, LJ/g;->N:LJ/f;

    .line 181
    .line 182
    if-eqz v3, :cond_e

    .line 183
    .line 184
    :cond_d
    invoke-static {p1}, LB0/g;->n(LB0/A0;)V

    .line 185
    .line 186
    .line 187
    :cond_e
    if-nez v1, :cond_f

    .line 188
    .line 189
    if-eqz v2, :cond_10

    .line 190
    .line 191
    :cond_f
    invoke-static {p1}, LB0/g;->m(LB0/z;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, LB0/g;->l(LB0/p;)V

    .line 195
    .line 196
    .line 197
    :cond_10
    if-eqz v0, :cond_11

    .line 198
    .line 199
    invoke-static {p1}, LB0/g;->l(LB0/p;)V

    .line 200
    .line 201
    .line 202
    :cond_11
    :goto_6
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->r:LL0/F;

    .line 11
    .line 12
    invoke-virtual {v2}, LL0/F;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->s:LO0/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->t:I

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Lk1/i;->c(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-boolean v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->u:Z

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lk1/i;->e(IIZ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->v:I

    .line 39
    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget v2, p0, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;->w:I

    .line 43
    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    return v0
.end method
