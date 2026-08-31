.class public final LX/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, LX/d;->q:I

    iput-object p1, p0, LX/d;->s:Ljava/lang/Object;

    iput-object p2, p0, LX/d;->t:Ljava/lang/Object;

    iput-object p3, p0, LX/d;->u:Ljava/lang/Object;

    iput p4, p0, LX/d;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LX/d;->q:I

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
    iget-object p2, p0, LX/d;->s:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lz0/S;

    .line 16
    .line 17
    iget-object v0, p0, LX/d;->t:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lc0/m;

    .line 20
    .line 21
    iget-object v1, p0, LX/d;->u:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LB5/e;

    .line 24
    .line 25
    iget v2, p0, LX/d;->r:I

    .line 26
    .line 27
    or-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    invoke-static {v2}, LP/b;->w(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p2, v0, v1, p1, v2}, Lz0/O;->b(Lz0/S;Lc0/m;LB5/e;LP/o;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    check-cast p1, LP/o;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, LX/d;->s:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p2, LB5/c;

    .line 49
    .line 50
    iget-object v0, p0, LX/d;->t:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lc0/m;

    .line 53
    .line 54
    iget-object v1, p0, LX/d;->u:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LB5/c;

    .line 57
    .line 58
    iget v2, p0, LX/d;->r:I

    .line 59
    .line 60
    or-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    invoke-static {v2}, LP/b;->w(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {p2, v0, v1, p1, v2}, Landroidx/compose/ui/viewinterop/a;->a(LB5/c;Lc0/m;LB5/c;LP/o;I)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_1
    check-cast p1, LP/o;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, LX/d;->s:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, LX/e;

    .line 82
    .line 83
    iget v0, p0, LX/d;->r:I

    .line 84
    .line 85
    invoke-static {v0}, LP/b;->w(I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    or-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    iget-object v1, p0, LX/d;->t:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v2, p0, LX/d;->u:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {p2, v1, v2, p1, v0}, LX/e;->c(Ljava/lang/Object;Ljava/lang/Object;LP/o;I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
