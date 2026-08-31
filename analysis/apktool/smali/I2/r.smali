.class public abstract LI2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI2/l;

.field public static final b:LI2/l;

.field public static final c:LI2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI2/l;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LI2/r;->a:LI2/l;

    .line 12
    .line 13
    new-instance v0, LI2/l;

    .line 14
    .line 15
    sget-object v1, LJ2/n;->a:LJ2/n;

    .line 16
    .line 17
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LI2/r;->b:LI2/l;

    .line 21
    .line 22
    new-instance v0, LI2/l;

    .line 23
    .line 24
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LI2/r;->c:LI2/l;

    .line 30
    .line 31
    return-void
.end method
