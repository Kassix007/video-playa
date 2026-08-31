.class public final synthetic LU1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LT1/u;

.field public final synthetic s:LT1/r;

.field public final synthetic t:Lc0/m;

.field public final synthetic u:Lc0/e;

.field public final synthetic v:LB5/c;

.field public final synthetic w:LB5/c;

.field public final synthetic x:LB5/c;

.field public final synthetic y:LB5/c;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(LT1/u;LT1/r;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;II)V
    .locals 0

    .line 1
    iput p10, p0, LU1/w;->q:I

    iput-object p1, p0, LU1/w;->r:LT1/u;

    iput-object p2, p0, LU1/w;->s:LT1/r;

    iput-object p3, p0, LU1/w;->t:Lc0/m;

    iput-object p4, p0, LU1/w;->u:Lc0/e;

    iput-object p5, p0, LU1/w;->v:LB5/c;

    iput-object p6, p0, LU1/w;->w:LB5/c;

    iput-object p7, p0, LU1/w;->x:LB5/c;

    iput-object p8, p0, LU1/w;->y:LB5/c;

    iput p9, p0, LU1/w;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, LU1/w;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v9, p1

    .line 7
    check-cast v9, LP/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, LU1/w;->z:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, LP/b;->w(I)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    iget-object v1, p0, LU1/w;->r:LT1/u;

    .line 23
    .line 24
    iget-object v2, p0, LU1/w;->s:LT1/r;

    .line 25
    .line 26
    iget-object v3, p0, LU1/w;->t:Lc0/m;

    .line 27
    .line 28
    iget-object v4, p0, LU1/w;->u:Lc0/e;

    .line 29
    .line 30
    iget-object v5, p0, LU1/w;->v:LB5/c;

    .line 31
    .line 32
    iget-object v6, p0, LU1/w;->w:LB5/c;

    .line 33
    .line 34
    iget-object v7, p0, LU1/w;->x:LB5/c;

    .line 35
    .line 36
    iget-object v8, p0, LU1/w;->y:LB5/c;

    .line 37
    .line 38
    invoke-static/range {v1 .. v10}, Ll6/d;->f(LT1/u;LT1/r;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LP/o;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    move-object v8, p1

    .line 45
    check-cast v8, LP/o;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget p1, p0, LU1/w;->z:I

    .line 53
    .line 54
    or-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    invoke-static {p1}, LP/b;->w(I)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    iget-object v0, p0, LU1/w;->r:LT1/u;

    .line 61
    .line 62
    iget-object v1, p0, LU1/w;->s:LT1/r;

    .line 63
    .line 64
    iget-object v2, p0, LU1/w;->t:Lc0/m;

    .line 65
    .line 66
    iget-object v3, p0, LU1/w;->u:Lc0/e;

    .line 67
    .line 68
    iget-object v4, p0, LU1/w;->v:LB5/c;

    .line 69
    .line 70
    iget-object v5, p0, LU1/w;->w:LB5/c;

    .line 71
    .line 72
    iget-object v6, p0, LU1/w;->x:LB5/c;

    .line 73
    .line 74
    iget-object v7, p0, LU1/w;->y:LB5/c;

    .line 75
    .line 76
    invoke-static/range {v0 .. v9}, Ll6/d;->f(LT1/u;LT1/r;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LP/o;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :pswitch_1
    move-object v8, p1

    .line 81
    check-cast v8, LP/o;

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget p1, p0, LU1/w;->z:I

    .line 89
    .line 90
    or-int/lit8 p1, p1, 0x1

    .line 91
    .line 92
    invoke-static {p1}, LP/b;->w(I)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    iget-object v0, p0, LU1/w;->r:LT1/u;

    .line 97
    .line 98
    iget-object v1, p0, LU1/w;->s:LT1/r;

    .line 99
    .line 100
    iget-object v2, p0, LU1/w;->t:Lc0/m;

    .line 101
    .line 102
    iget-object v3, p0, LU1/w;->u:Lc0/e;

    .line 103
    .line 104
    iget-object v4, p0, LU1/w;->v:LB5/c;

    .line 105
    .line 106
    iget-object v5, p0, LU1/w;->w:LB5/c;

    .line 107
    .line 108
    iget-object v6, p0, LU1/w;->x:LB5/c;

    .line 109
    .line 110
    iget-object v7, p0, LU1/w;->y:LB5/c;

    .line 111
    .line 112
    invoke-static/range {v0 .. v9}, Ll6/d;->f(LT1/u;LT1/r;Lc0/m;Lc0/e;LB5/c;LB5/c;LB5/c;LB5/c;LP/o;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
