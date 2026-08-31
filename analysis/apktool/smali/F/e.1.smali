.class public final LF/e;
.super LF/N;
.source "SourceFile"


# static fields
.field public static final I:LZ/m;


# instance fields
.field public final H:LP/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LF/b;->q:LF/b;

    .line 2
    .line 3
    sget-object v1, LF/d;->r:LF/d;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/K1;->y(LB5/e;LB5/c;)LZ/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LF/e;->I:LZ/m;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(IFLB5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF/N;-><init>(IF)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LF/e;->H:LP/f0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final l()I
    .locals 1

    .line 1
    iget-object v0, p0, LF/e;->H:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LB5/a;

    .line 8
    .line 9
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method
