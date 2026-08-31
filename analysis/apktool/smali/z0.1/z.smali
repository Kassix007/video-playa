.class public final Lz0/z;
.super Lz0/I;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lz0/z;->b:I

    iput-object p2, p0, Lz0/z;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()LW0/l;
    .locals 1

    .line 1
    iget v0, p0, Lz0/z;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz0/z;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getLayoutDirection()LW0/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lz0/z;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LB0/T;

    .line 18
    .line 19
    invoke-interface {v0}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lz0/z;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz0/z;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getRoot()LB0/L;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 15
    .line 16
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 17
    .line 18
    iget v0, v0, Lz0/J;->q:I

    .line 19
    .line 20
    return v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lz0/z;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LB0/T;

    .line 24
    .line 25
    invoke-virtual {v0}, Lz0/J;->N()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
