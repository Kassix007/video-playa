.class public final LO3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:LO3/C;


# direct methods
.method public constructor <init>(LO3/A;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LO3/x;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LO3/x;->r:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/x;->s:LO3/C;

    return-void
.end method

.method public constructor <init>(LO3/m1;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LO3/x;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LO3/x;->r:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/x;->s:LO3/C;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LO3/x;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/x;->s:LO3/C;

    .line 7
    .line 8
    check-cast v0, LO3/m1;

    .line 9
    .line 10
    iget-object v1, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LO3/t0;

    .line 13
    .line 14
    iget-object v1, v1, LO3/t0;->D:LO3/A;

    .line 15
    .line 16
    invoke-static {v1}, LO3/t0;->i(LO3/C;)V

    .line 17
    .line 18
    .line 19
    iget-wide v2, p0, LO3/x;->r:J

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, LO3/A;->r(J)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-object v1, v0, LO3/m1;->v:LO3/j1;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, LO3/x;->s:LO3/C;

    .line 29
    .line 30
    check-cast v0, LO3/A;

    .line 31
    .line 32
    iget-wide v1, p0, LO3/x;->r:J

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, LO3/A;->u(J)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
