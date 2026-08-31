.class public final LU1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LU1/m;->q:I

    iput-object p2, p0, LU1/m;->r:Ljava/lang/Object;

    iput-object p3, p0, LU1/m;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LT1/d;Lt/g;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LU1/m;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/m;->s:Ljava/lang/Object;

    iput-object p2, p0, LU1/m;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LU1/m;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget-object v0, p0, LU1/m;->s:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LT1/d;

    .line 17
    .line 18
    and-int/lit8 p2, p2, 0x3

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-ne p2, v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LP/o;->x()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, LP/o;->N()V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    iget-object p2, v0, LT1/d;->r:LT1/p;

    .line 35
    .line 36
    const-string v1, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"

    .line 37
    .line 38
    invoke-static {p2, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast p2, LU1/h;

    .line 42
    .line 43
    iget-object p2, p2, LU1/h;->v:LB5/g;

    .line 44
    .line 45
    iget-object v1, p0, LU1/m;->r:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lt/g;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {p2, v1, v0, p1, v2}, LB5/g;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_0
    check-cast p1, LP/o;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    and-int/lit8 p2, p2, 0x3

    .line 69
    .line 70
    const/4 v0, 0x2

    .line 71
    if-ne p2, v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1}, LP/o;->x()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {p1}, LP/o;->N()V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    :goto_2
    iget-object p2, p0, LU1/m;->r:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p2, LZ/c;

    .line 87
    .line 88
    iget-object v0, p0, LU1/m;->s:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LX/e;

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-static {p2, v0, p1, v1}, Lcom/google/android/gms/internal/measurement/K1;->b(LZ/c;LX/e;LP/o;I)V

    .line 94
    .line 95
    .line 96
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_1
    check-cast p1, LP/o;

    .line 100
    .line 101
    check-cast p2, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    and-int/lit8 p2, p2, 0x3

    .line 108
    .line 109
    const/4 v0, 0x2

    .line 110
    if-ne p2, v0, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1}, LP/o;->x()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-nez p2, :cond_4

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-virtual {p1}, LP/o;->N()V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_5
    :goto_4
    iget-object p2, p0, LU1/m;->r:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p2, LU1/q;

    .line 126
    .line 127
    iget-object p2, p2, LU1/q;->w:LX/e;

    .line 128
    .line 129
    iget-object v0, p0, LU1/m;->s:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, LT1/d;

    .line 132
    .line 133
    const/4 v1, 0x0

    .line 134
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p2, v0, p1, v1}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :goto_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 142
    .line 143
    return-object p1

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
