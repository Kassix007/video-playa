.class public final synthetic LR4/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/K;
.implements Lkotlin/jvm/internal/h;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/c;


# direct methods
.method public synthetic constructor <init>(LB5/c;I)V
    .locals 0

    .line 1
    iput p2, p0, LR4/J0;->q:I

    iput-object p1, p0, LR4/J0;->r:LB5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm5/e;
    .locals 1

    .line 1
    iget v0, p0, LR4/J0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 7
    .line 8
    check-cast v0, LU4/f;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 12
    .line 13
    check-cast v0, LZ4/G;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_1
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 17
    .line 18
    check-cast v0, LU4/o;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_2
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 22
    .line 23
    check-cast v0, LU4/o;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_3
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 27
    .line 28
    check-cast v0, LU4/o;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_4
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 32
    .line 33
    check-cast v0, LU4/f;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_5
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 37
    .line 38
    check-cast v0, LN5/d;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, LR4/J0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 15
    .line 16
    check-cast v0, LU4/f;

    .line 17
    .line 18
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 19
    .line 20
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1

    .line 31
    :pswitch_0
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 40
    .line 41
    check-cast v0, LZ4/G;

    .line 42
    .line 43
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 44
    .line 45
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    :goto_1
    return p1

    .line 56
    :pswitch_1
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 65
    .line 66
    check-cast v0, LU4/o;

    .line 67
    .line 68
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 69
    .line 70
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 p1, 0x0

    .line 80
    :goto_2
    return p1

    .line 81
    :pswitch_2
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 90
    .line 91
    check-cast v0, LU4/o;

    .line 92
    .line 93
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 94
    .line 95
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    const/4 p1, 0x0

    .line 105
    :goto_3
    return p1

    .line 106
    :pswitch_3
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 115
    .line 116
    check-cast v0, LU4/o;

    .line 117
    .line 118
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 119
    .line 120
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    goto :goto_4

    .line 129
    :cond_4
    const/4 p1, 0x0

    .line 130
    :goto_4
    return p1

    .line 131
    :pswitch_4
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 140
    .line 141
    check-cast v0, LU4/f;

    .line 142
    .line 143
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 144
    .line 145
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    goto :goto_5

    .line 154
    :cond_5
    const/4 p1, 0x0

    .line 155
    :goto_5
    return p1

    .line 156
    :pswitch_5
    instance-of v0, p1, Landroidx/lifecycle/K;

    .line 157
    .line 158
    if-eqz v0, :cond_6

    .line 159
    .line 160
    instance-of v0, p1, Lkotlin/jvm/internal/h;

    .line 161
    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 165
    .line 166
    check-cast v0, LN5/d;

    .line 167
    .line 168
    check-cast p1, Lkotlin/jvm/internal/h;

    .line 169
    .line 170
    invoke-interface {p1}, Lkotlin/jvm/internal/h;->a()Lm5/e;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    goto :goto_6

    .line 179
    :cond_6
    const/4 p1, 0x0

    .line 180
    :goto_6
    return p1

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, LR4/J0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 7
    .line 8
    check-cast v0, LU4/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 16
    .line 17
    check-cast v0, LZ4/G;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :pswitch_1
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 25
    .line 26
    check-cast v0, LU4/o;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0

    .line 33
    :pswitch_2
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 34
    .line 35
    check-cast v0, LU4/o;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0

    .line 42
    :pswitch_3
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 43
    .line 44
    check-cast v0, LU4/o;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    return v0

    .line 51
    :pswitch_4
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 52
    .line 53
    check-cast v0, LU4/f;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0

    .line 60
    :pswitch_5
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 61
    .line 62
    check-cast v0, LN5/d;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    return v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LR4/J0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 7
    .line 8
    check-cast v0, LU4/f;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LU4/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 18
    .line 19
    check-cast v0, LU4/o;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LU4/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 26
    .line 27
    check-cast v0, LU4/o;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, LU4/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 34
    .line 35
    check-cast v0, LU4/o;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, LU4/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_4
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 42
    .line 43
    check-cast v0, LU4/f;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LU4/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_5
    iget-object v0, p0, LR4/J0;->r:LB5/c;

    .line 50
    .line 51
    check-cast v0, LN5/d;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, LN5/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
