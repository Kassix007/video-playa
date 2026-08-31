.class public abstract LQ2/h;
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
    const-string v1, "GET"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LQ2/h;->a:LI2/l;

    .line 9
    .line 10
    new-instance v0, LI2/l;

    .line 11
    .line 12
    sget-object v1, LQ2/s;->b:LQ2/s;

    .line 13
    .line 14
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LQ2/h;->b:LI2/l;

    .line 18
    .line 19
    new-instance v0, LI2/l;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, LI2/l;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LQ2/h;->c:LI2/l;

    .line 26
    .line 27
    return-void
.end method
