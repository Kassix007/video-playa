.class public final synthetic LX/c;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LX/c;->x:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LX/c;->x:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LW0/p;

    .line 7
    .line 8
    iget-wide v0, p1, LW0/p;->a:J

    .line 9
    .line 10
    check-cast p2, Lq5/c;

    .line 11
    .line 12
    iget-object p1, p0, Lkotlin/jvm/internal/a;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lw/z0;

    .line 15
    .line 16
    iget-object p2, p1, Lw/z0;->Q:Lu0/d;

    .line 17
    .line 18
    invoke-virtual {p2}, Lu0/d;->c()LM5/w;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v2, Lw/w0;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v2, p1, v0, v1, v3}, Lw/w0;-><init>(Lw/z0;JLq5/c;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    invoke-static {p2, v3, v3, v2, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    check-cast p1, LP/o;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object v0, p0, Lkotlin/jvm/internal/a;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LX/e;

    .line 46
    .line 47
    invoke-virtual {v0, p2, p1}, LX/e;->a(ILP/o;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
