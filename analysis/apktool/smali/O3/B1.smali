.class public final LO3/B1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final q:J

.field public final r:J

.field public final synthetic s:LB0/o;


# direct methods
.method public constructor <init>(LB0/o;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LO3/B1;->s:LB0/o;

    .line 8
    .line 9
    iput-wide p2, p0, LO3/B1;->q:J

    .line 10
    .line 11
    iput-wide p4, p0, LO3/B1;->r:J

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LO3/B1;->s:LB0/o;

    .line 2
    .line 3
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LO3/E1;

    .line 6
    .line 7
    iget-object v0, v0, LO3/D0;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LO3/t0;

    .line 10
    .line 11
    iget-object v0, v0, LO3/t0;->w:LO3/p0;

    .line 12
    .line 13
    invoke-static {v0}, LO3/t0;->l(LO3/E0;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LA1/b;

    .line 17
    .line 18
    const/16 v2, 0x9

    .line 19
    .line 20
    invoke-direct {v1, v2, p0}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
